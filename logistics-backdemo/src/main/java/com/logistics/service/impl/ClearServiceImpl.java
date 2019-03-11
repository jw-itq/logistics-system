package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.*;
import com.logistics.pojo.*;
import com.logistics.service.ClearService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "clearService")
@Transactional(propagation = Propagation.REQUIRED)
public class ClearServiceImpl implements ClearService {
    
    @Autowired
    private CargoreceiptMapper cargoreceiptMapper;
    
    @Autowired
    private DriverclearMapper driverclearMapper;
    
    @Autowired
    private GoodsbilleventMapper goodsbilleventMapper;
    
    @Autowired
    private CustomerbillclearMapper customerbillclearMapper;
    
    @Autowired
    private GoodsbillMapper goodsbillMapper;

    @Autowired
    private ProxyfeeclearMapper proxyfeeclearMapper;

    @Autowired
    private ExtraclearMapper extraclearMapper;
    
    
    @Override
    public Result selectDrclear(String eventName) {
        System.out.println("查询出结算历史");
        List<Driverclear> driverCleareds = new ArrayList(); // 已结
        List<Driverclear> driverUnClears = new ArrayList(); // 未结

        if (eventName.equals("已结合同")) {
            CargoreceiptExample cargoreceiptExample = new CargoreceiptExample();
            CargoreceiptExample.Criteria criteria = cargoreceiptExample.createCriteria();
            criteria.andBackBillStateEqualTo("已结合同");
            List<Cargoreceipt> cargoReceipts = cargoreceiptMapper.selectByExample(cargoreceiptExample);
            for (Cargoreceipt cargoReceipt : cargoReceipts) {
                Driverclear driverClear = driverclearMapper.selectByPrimaryKey(cargoReceipt.getGoodsRevertBillCode());
                driverCleareds.add(driverClear);
            }
            Result result = new Result(200,"SUCCESS",driverCleareds.size(),driverCleareds);
            return result;
        } else {
            CargoreceiptExample cargoreceiptExample = new CargoreceiptExample();
            CargoreceiptExample.Criteria criteria = cargoreceiptExample.createCriteria();
            criteria.andBackBillStateEqualTo("未结合同");
            List<Cargoreceipt> cargoReceipts = cargoreceiptMapper.selectByExample(cargoreceiptExample);
            for (Cargoreceipt cargoReceipt : cargoReceipts) {
                Driverclear temp = driverclearMapper.selectByPrimaryKey(cargoReceipt.getGoodsRevertBillCode());
                if (temp == null) {
                    Driverclear driverClear = new Driverclear();
                    driverClear.setBackBillCode(cargoReceipt.getGoodsRevertBillCode());
                    driverClear.setDriverCode(cargoReceipt.getDriverId());
                    driverClear.setBalanceType("结出");
                    driverClear.setPrepayMoney(cargoReceipt.getStartAdvance()); // 预付金额
                    driverClear.setBindInsurance(cargoReceipt.getCarryGoodsInsurance()); // 定装保证金
                    driverClear.setDispatchServiceFee(cargoReceipt.getDispatchServiceFee()); // 配载服务费
                    driverClear.setInsurance(cargoReceipt.getInsurance());

                    driverclearMapper.insert(driverClear);
                    driverUnClears.add(driverClear);
                } else {
                    driverUnClears.add(temp);
                }
            }
            Result result = new Result(200,"SUCCESS",driverUnClears.size(),driverUnClears);
            return result;
        }
    }

    @Override
    public Driverclear selectByCargoReceiptCode(String cargoReceiptCode) {
        return driverclearMapper.selectByPrimaryKey(cargoReceiptCode);
    }

    @Override
    public String driClear(Driverclear driverClear) {
        System.out.println("司机结算的信息--"+driverClear.toString());
        try {
            double carryFee = driverClear.getCarryFee(); // 承运费
            double bindInsurance = driverClear.getBindInsurance();// 定装保证金
            double addCarriage = driverClear.getAddCarriage(); // 加运费
            double allCarriage = cargoreceiptMapper.selectByPrimaryKey(driverClear.getBackBillCode())
                    .getAllCarriage();

            double balance = carryFee + bindInsurance + addCarriage - driverClear.getPayedMoney(); // 余额

            driverClear.setBalance(balance>0?balance:0);

            double money = allCarriage + bindInsurance + addCarriage;
            System.out.println(money+"输入的是："+driverClear.getPayedMoney());
            if (money!=driverClear.getPayedMoney()||driverClear.getPayedMoney()>money) {
                driverClear.setBalance(driverClear.getPayedMoney()-money);
                driverclearMapper.updateByPrimaryKey(driverClear);
            } else {
                driverclearMapper.updateByPrimaryKey(driverClear);
                Cargoreceipt cargoreceipt = cargoreceiptMapper.selectByPrimaryKey(driverClear.getBackBillCode());
                cargoreceipt.setBackBillState("已结合同");
                cargoreceiptMapper.updateByPrimaryKey(cargoreceipt);
            }
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("司机结算，插入失败");
            return "ERROR";
        }
    }

    @Override
    public Result selectCusclear(String eventName) {
        List<Customerbillclear> customerBillCleareds = new ArrayList(); // 已结
        List<Customerbillclear> customerBillUnClears = new ArrayList(); // 未结

        if (eventName.equals("已结运单")) {
            GoodsbilleventExample goodsbilleventExample = new GoodsbilleventExample();
            GoodsbilleventExample.Criteria criteria = goodsbilleventExample.createCriteria();
            criteria.andEventNameEqualTo("已结运单");
            List<Goodsbillevent> goodsBillEvents = goodsbilleventMapper.selectByExample(goodsbilleventExample);
            for (Goodsbillevent goodsBillEvent : goodsBillEvents) {
                Customerbillclear customerBillClear = customerbillclearMapper.selectByPrimaryKey(goodsBillEvent.getGoodsBillId());
                customerBillCleareds.add(customerBillClear);
            }
            Result result = new Result(200,"SUCCESS",customerBillCleareds.size(),customerBillCleareds);
            return result;
        } else {
            GoodsbilleventExample goodsbilleventExample = new GoodsbilleventExample();
            GoodsbilleventExample.Criteria criteria = goodsbilleventExample.createCriteria();
            criteria.andEventNameEqualTo("未结");
            List<Goodsbillevent> goodsBillEvents = goodsbilleventMapper.selectByExample(goodsbilleventExample);
            for (Goodsbillevent goodsBillEvent : goodsBillEvents) {
                Goodsbill goodsBill = goodsbillMapper.selectByPrimaryKey(goodsBillEvent.getGoodsBillId());
                Customerbillclear temp = customerbillclearMapper.selectByPrimaryKey(goodsBillEvent.getGoodsBillId());
                if (temp == null) {
                    Customerbillclear customerBillClear = new Customerbillclear();
                    customerBillClear.setCustomerCode(goodsBill.getSendGoodsCustomerNo()); // 客户编号
                    customerBillClear.setGoodsBillCode(goodsBillEvent.getGoodsBillId()); // 货运单编号
                    customerBillClear.setCarriageReduceFund(goodsBill.getReduceFund()); // 减款
                    customerBillClear.setInsurance(goodsBill.getInsurance()); // 保险费
                    customerBillClear.setPayKickback(goodsBill.getPayKickback()); // 付回扣
                    customerBillClear.setCarryGoodsFee(goodsBill.getCarryGoodsFee());// 送货费
                    customerBillClear.setBalanceType("结入"); // 结算类型

                    customerbillclearMapper.insert(customerBillClear);
                    customerBillUnClears.add(customerBillClear);
                } else {
                    customerBillUnClears.add(temp);
                }

            }
            Result result = new Result(200,"SUCCESS",customerBillUnClears.size(),customerBillUnClears);
            return result;
        }
    }

    @Override
    public Customerbillclear selectByBillCode(String goodsBillCode) {
        return customerbillclearMapper.selectByPrimaryKey(goodsBillCode);
    }

    @Override
    public String cusClear(Customerbillclear customerBillClear) {
        System.out.println(customerBillClear);
        try {
            double billMoney = customerBillClear.getBillMoney(); // 本单
            double insurance = customerBillClear.getInsurance(); // 保险费
            double carriageReduceFund = customerBillClear.getCarriageReduceFund(); // 减款
            double prepayMoney = customerBillClear.getPrepayMoney()==null?0:customerBillClear.getPrepayMoney(); // 预付金额
            double receivedMoney = customerBillClear.getReceivedMoney(); // 已收

            double moneyReceivable = billMoney + insurance - carriageReduceFund - prepayMoney; // 应收

            customerBillClear.setMoneyReceivable(moneyReceivable);

            double money = billMoney + insurance - carriageReduceFund;
            if (money != receivedMoney) {
                System.out.println(1);
                customerbillclearMapper.updateByPrimaryKey(customerBillClear);
            } else {
                System.out.println(2);
                customerbillclearMapper.updateByPrimaryKey(customerBillClear);
                Goodsbillevent goodsbillevent = goodsbilleventMapper.selectByPrimaryKey(customerBillClear.getGoodsBillCode());
                goodsbillevent.setEventName("已结运单");
                goodsbilleventMapper.updateByPrimaryKey(goodsbillevent);
            }
            return "SUCCESS";
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.err.println("客户结算 插入失败！");
            return "ERROR";
        }
    }

    @Override
    public Result selectHelpclear(String eventName) {
        List<Proxyfeeclear> proxyFeeCleareds = new ArrayList(); // 已结
        List<Proxyfeeclear> proxyFeeUnClears = new ArrayList(); // 未结

        if (eventName.equals("已结代收")) {
            GoodsbilleventExample goodsbilleventExample = new GoodsbilleventExample();
            GoodsbilleventExample.Criteria criteria = goodsbilleventExample.createCriteria();
            criteria.andEventNameEqualTo("已结运单");
            List<Goodsbillevent> goodsBillEvents = goodsbilleventMapper.selectByExample(goodsbilleventExample);
            for (Goodsbillevent goodsBillEvent : goodsBillEvents) {

                Goodsbill goodsBill = goodsbillMapper.selectByPrimaryKey(goodsBillEvent.getGoodsBillId()); // 找到货运单主表
                if (goodsBill.getHelpAcceptPayment() != 0) { // 是代收
                    Proxyfeeclear proxyFeeClear = proxyfeeclearMapper.selectByPrimaryKey(goodsBillEvent.getGoodsBillId());
                    proxyFeeCleareds.add(proxyFeeClear);
                }
            }
            Result result = new Result(200,"SUCCESS",proxyFeeCleareds.size(),proxyFeeCleareds);
            return result;
        } else {
            GoodsbilleventExample goodsbilleventExample = new GoodsbilleventExample();
            GoodsbilleventExample.Criteria criteria = goodsbilleventExample.createCriteria();
            criteria.andEventNameEqualTo("已结运单");
            List<Goodsbillevent> goodsBillEvents = goodsbilleventMapper.selectByExample(goodsbilleventExample);
            for (Goodsbillevent goodsBillEvent : goodsBillEvents) {

                Goodsbill goodsBill = goodsbillMapper.selectByPrimaryKey(goodsBillEvent.getGoodsBillId());// 找到货运单主表
                if (goodsBill.getHelpAcceptPayment() != 0) { // 是代收

                    Proxyfeeclear temp = proxyfeeclearMapper.selectByPrimaryKey(goodsBillEvent.getGoodsBillId());
                    if (temp == null) {
                        Proxyfeeclear proxyFeeClear = new Proxyfeeclear();
                        proxyFeeClear.setGoodsBillCode(goodsBillEvent.getGoodsBillId()); // 货运单编号
                        proxyFeeClear.setCustomerCode(goodsBill.getSendGoodsCustomerNo()); // 客户名称
                        // 应收货款 算
                        proxyFeeClear.setFactReceiveFund(goodsBill.getHelpAcceptPayment()); // 实收货款
                        double goodsPayChange = goodsBill.getMoneyOfChangePay() - goodsBill.getHelpAcceptPayment(); // 变更
                        proxyFeeClear.setGoodsPayChange(goodsPayChange); // 变更
                        proxyFeeClear.setCommisionRate(0.02f); // 佣金率
                        // 已收佣金 填
                        // 应收佣金 算
                        // 结算时间 填
                        proxyfeeclearMapper.insert(proxyFeeClear);
                        proxyFeeUnClears.add(proxyFeeClear);
                    } else {
                        proxyFeeUnClears.add(temp);
                    }
                }

            }
            Result result = new Result(200,"SUCCESS",proxyFeeUnClears.size(),proxyFeeUnClears);
            return result;
        }
    }

    @Override
    public Proxyfeeclear selectByGoodsBillCode(String goodsBillCode) {
        return proxyfeeclearMapper.selectByPrimaryKey(goodsBillCode);
    }

    @Override
    public String helpClear(Proxyfeeclear proxyFeeClear) {
        try {
            double factReceiveFund = proxyFeeClear.getFactReceiveFund(); // 实收
            double commisionRate = proxyFeeClear.getCommisionRate(); // 佣金率
            double receivedCommision = proxyFeeClear.getReceivedCommision(); // 已收佣金

            double commisionReceivable = factReceiveFund * commisionRate - receivedCommision; // 应收

            proxyFeeClear.setCommisionReceivable(commisionReceivable);

            if ((commisionRate * factReceiveFund > receivedCommision) || (commisionRate > 0 && factReceiveFund == 0)
                    || (commisionReceivable != 0)) {
                proxyfeeclearMapper.insert(proxyFeeClear);
            } else {
                proxyfeeclearMapper.insert(proxyFeeClear);
                Goodsbillevent goodsbillevent = goodsbilleventMapper.selectByPrimaryKey(proxyFeeClear.getGoodsBillCode());
                goodsbillevent.setEventName("已结运单");
                goodsbilleventMapper.updateByPrimaryKey(goodsbillevent);
            }
            return "SUCCESS";
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("代收结算 插入失败！");
            return "ERROR";
        }
    }

    @Override
    public String saveExtraClear(Extraclear extraClear) {
        try {
            extraclearMapper.insert(extraClear);
            return "SUCCESS";
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("杂费结算 插入失败！");
            return "ERROR";
        }
    }

    @Override
    public Result selectAllExtraClearByPage(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        ExtraclearExample extraclearExample = new ExtraclearExample();
        List<Extraclear> list = extraclearMapper.selectByExample(extraclearExample);
        PageInfo<Extraclear> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }
}

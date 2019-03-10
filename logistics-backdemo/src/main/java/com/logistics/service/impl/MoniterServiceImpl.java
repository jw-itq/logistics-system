package com.logistics.service.impl;

import com.logistics.dao.mapper.*;
import com.logistics.pojo.*;
import com.logistics.service.MoniterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service(value = "moniterService")
@Transactional(propagation = Propagation.REQUIRED)
public class MoniterServiceImpl implements MoniterService {

    @Autowired
    private GoodsbillMapper goodsbillMapper;

    @Autowired
    private CargoreceiptdetailMapper cargoreceiptdetailMapper;

    @Autowired
    private CargoreceiptMapper cargoreceiptMapper;

    @Autowired
    private CustomeramountMapper customeramountMapper;

    @Autowired
    private DriverclearMapper driverclearMapper;

    @Autowired
    private DriveramountMapper driveramountMapper;

    @Autowired
    private CustomerbillclearMapper customerbillclearMapper;

    @Autowired
    private ContactsserviceMapper contactsserviceMapper;

    @Autowired
    private LineoverallMapper lineoverallMapper;

    @Autowired
    private CarcostMapper carcostMapper;

    @Autowired
    private DriverinfoMapper driverinfoMapper;


    @Override
    public List<Goodsbill> selectAllUnArrive() {
        GoodsbillExample goodsbillExample = new GoodsbillExample();
        List<Goodsbill> goodsBills = goodsbillMapper.selectByExample(goodsbillExample);
        List<Goodsbill> goodsBillsUnArrive = new ArrayList<>();

        for(Goodsbill goodsBill:goodsBills) {
            System.out.println("goodsBill: " + goodsBill);
            CargoreceiptdetailExample cargoreceiptdetailExample = new CargoreceiptdetailExample();
            CargoreceiptdetailExample.Criteria criteria = cargoreceiptdetailExample.createCriteria();
            criteria.andGoodsBillDetailIdEqualTo(goodsBill.getGoodsBillCode());
            Cargoreceiptdetail cargoReceiptDetail = cargoreceiptdetailMapper.selectByExample(cargoreceiptdetailExample).get(0);//4.5
            System.out.println("cargoReceiptDetail:" + cargoReceiptDetail);
            Cargoreceipt cargoReceipt = cargoreceiptMapper.selectByPrimaryKey(cargoReceiptDetail.getGoodsRevertBillId());  //4.6
            System.out.println(cargoReceipt);
            if (cargoReceipt == null) {
                continue;
            }

            Date arriveTime = cargoReceipt.getArriveTime();  //到货时间
            Date startCarryTime = cargoReceipt.getStartCarryTime();

            if(arriveTime != null && startCarryTime != null) {
                long difference = arriveTime.getTime() - startCarryTime.getTime();
                int day = (int) difference/(3600*24*1000);  //实际中转天数
                int cishu = (int) (goodsBill.getTransferFee()/1.3) ;//中转次数
                if(day > (cishu+1) ) {
                    goodsBillsUnArrive.add(goodsBill);
                }
            }
        }
        return goodsBillsUnArrive;
    }

    @Override
    public List<Goodsbill> selectAllUnTake() {
        GoodsbillExample goodsbillExample = new GoodsbillExample();
        List<Goodsbill> goodsBills = goodsbillMapper.selectByExample(goodsbillExample);
        List<Goodsbill> goodsBillsUnTake = new ArrayList<>();

        for(Goodsbill goodsBill:goodsBills) {
            CargoreceiptdetailExample cargoreceiptdetailExample = new CargoreceiptdetailExample();
            CargoreceiptdetailExample.Criteria criteria = cargoreceiptdetailExample.createCriteria();
            criteria.andGoodsBillDetailIdEqualTo(goodsBill.getGoodsBillCode());
            Cargoreceiptdetail cargoReceiptDetail = cargoreceiptdetailMapper.selectByExample(cargoreceiptdetailExample).get(0); //4.5
            Cargoreceipt cargoReceipt = cargoreceiptMapper.selectByPrimaryKey(cargoReceiptDetail.getGoodsRevertBillId());   //4.6
            if (cargoReceipt == null) {
                continue;
            }

            Date arriveTime = cargoReceipt.getArriveTime();  //到货时间
            Date factDealDate = goodsBill.getFactDealDate();  //预计交货时间
            if(arriveTime != null && factDealDate != null) {
                long difference = arriveTime.getTime() - factDealDate.getTime();
                int day = (int) difference/(3600*24*1000);
                if(day>=3) {
                    goodsBillsUnTake.add(goodsBill);
                }
            }
        }

        return goodsBillsUnTake;
    }

    @Override
    public List<Customeramount> selectAllCusAcount() {
        List<Map<String,Object>> maps = goodsbillMapper.find();
        List<Customeramount> customerAmounts = new ArrayList<>();

        for(Map<String,Object> map : maps){
            Customeramount customeramount = new Customeramount();
            customeramount.setSendGoodsCustomer((String) map.get("sendGoodsCustomer"));
            customeramount.setCarriageTotal((Double) map.get("carriageTotal"));
            customeramount.setInsuranceTotal((Double) map.get("insuranceTotal"));
            customeramount.setPieceAmountTotal((Integer) map.get("pieceAmountTotal"));
            customeramountMapper.insert(customeramount);
            customerAmounts.add(customeramount);
        }
        return customerAmounts;
    }

    @Override
    public List<Driveramount> selectAllDriAcount() {
        List<Driveramount> driverAmounts = new ArrayList<>();

        List<Map<String,Object>> list = driverclearMapper.find();

        for(Map<String,Object> map : list){
            Driveramount driveramount = new Driveramount();
            driveramount.setAddCarriageTotal((Double) map.get("addCarriageTotal"));
            driveramount.setCarryFeeTotal((Double) map.get("carryFeeTotal"));
            driveramount.setTotal((Double) map.get("total"));
            driveramountMapper.insert(driveramount);
            driverAmounts.add(driveramount);
        }

        return driverAmounts;
    }

    @Override
    public List<Contactsservice> printAllContactsService() {
        GoodsbillExample goodsbillExample = new GoodsbillExample();
        List<Goodsbill> goodsBills = goodsbillMapper.selectByExample(goodsbillExample);
        List<Contactsservice> contactsServices = new ArrayList<>();

        for(Goodsbill goodsBill:goodsBills) {

            String goodsBillCode = goodsBill.getGoodsBillCode();
            System.out.println("1查询到"+goodsBillCode);
            Contactsservice contactsService = new Contactsservice();
            contactsService.setSendGoodsCustomer(goodsBill.getSendGoodsCustomer());
            contactsService.setGoodsBillCode(goodsBillCode);
            contactsService.setSendGoodsAddr(goodsBill.getSendGoodsAddr());
            contactsService.setReceiveGoodsAddr(goodsBill.getReceiveGoodsAddr());
            contactsService.setCarriage(goodsBill.getCarriage());
            contactsService.setInsurance(goodsBill.getInsurance());
            contactsService.setSendGoodsDate(goodsBill.getSendGoodsDate());
            Customerbillclear customerBillClear = customerbillclearMapper.selectByPrimaryKey(goodsBillCode);
            if(customerBillClear != null) {
                contactsService.setBillMoney(customerBillClear.getBillMoney());
                contactsService.setMoneyReceivable(customerBillClear.getMoneyReceivable());
                contactsService.setReceivedMoney(customerBillClear.getReceivedMoney());

                contactsserviceMapper.insert(contactsService);
                System.out.println("2查询到"+contactsService.getGoodsBillCode());
                contactsServices.add(contactsService);
            }

        }
        return contactsServices;
    }

    @Override
    public List<Lineoverall> printAllLineOverall() {

        lineoverallMapper.truncateTable();
        List<Map<String,Object>> list = cargoreceiptMapper.find();
        List<Lineoverall> lineOveralls = new ArrayList<>();

        for(Map<String,Object> map : list){
            Lineoverall lineoverall = new Lineoverall();
            lineoverall.setLoadStation((String) map.get("loadStation"));
            lineoverall.setAllCarriageTotal((Double) map.get("allCarriageTotal"));
            lineoverall.setDealGoodsStation((String) map.get("dealGoodsStation"));
            lineoverall.setInsuranceTotal((Double) map.get("insuranceTotal"));
            lineoverall.setTimes((Integer) map.get("times"));
            lineoverallMapper.insert(lineoverall);
            lineOveralls.add(lineoverall);
        }

        return lineOveralls;
    }

    @Override
    public List<Carcost> printAllCarCost() {
        List<Carcost> carCosts = new ArrayList<>();
        List<Driveramount> driverAmounts =  selectAllDriAcount();

        for(Driveramount driverAmount : driverAmounts) {
            String driverCode = driverAmount.getDriverCode();


            if(carcostMapper.selectByPrimaryKey(driverCode) == null) {
                Carcost carCost = new Carcost();
                carCost.setDriverCode(driverCode);

                Driverinfo driverInfo = driverinfoMapper.selectByPrimaryKey(driverCode);
                if(driverInfo!=null) {
                    carCost.setCarNo(driverInfo.getCarNo());
                    carCost.setCarType(driverInfo.getCarType());
                    carCost.setAllowCarryWeight(driverInfo.getAllowCarryWeight());
                    carCost.setCarWidth(driverInfo.getCarWidth());
                    carCost.setGoodsHeight(driverInfo.getGoodsHeight());
                    carCost.setCarryFeeTotal(driverAmount.getCarryFeeTotal());
                    carCost.setAddCarriageTotal(driverAmount.getAddCarriageTotal());
                    carcostMapper.insert(carCost);
                    carCosts.add(carCost);
                }

            }
            else {
                carCosts.add(carcostMapper.selectByPrimaryKey(driverCode));
            }
        }
        return carCosts;
    }

    @Override
    public Carcost selectByCode(String driverCode) {
        System.out.println(driverCode);
        return carcostMapper.selectByPrimaryKey(driverCode);
    }

    @Override
    public Contactsservice selectByGoodsBillCode(String goodsBillCode) {
        ContactsserviceExample contactsserviceExample = new ContactsserviceExample();
        ContactsserviceExample.Criteria criteria = contactsserviceExample.createCriteria();
        criteria.andGoodsBillCodeEqualTo(goodsBillCode);
        return contactsserviceMapper.selectByExample(contactsserviceExample).get(0);
    }
}

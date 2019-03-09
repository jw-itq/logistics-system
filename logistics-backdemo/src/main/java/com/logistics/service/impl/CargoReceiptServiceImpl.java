package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.*;
import com.logistics.pojo.*;
import com.logistics.service.CargoReceiptService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(value = "cargoReceiptService")
@Transactional(propagation = Propagation.REQUIRED)
public class CargoReceiptServiceImpl implements CargoReceiptService {

    @Autowired
    private CargoreceiptdetailMapper cargoreceiptdetailMapper;

    @Autowired
    private CargoreceiptMapper cargoreceiptMapper;

    @Autowired
    private GoodsbillMapper goodsbillMapper;

    @Autowired
    private RouteinfoMapper routeinfoMapper;

    @Autowired
    private BillinfoMapper billinfoMapper;

    @Autowired
    private GoodsbilleventMapper goodsbilleventMapper;

    /**
     * 查询未被安排的货运单的编号，也就是没有在货运单详细表中的货运单号
     * @return
     */
    @Override
    public List<?> selectLeftCodes() {

        CargoreceiptExample cargoreceiptExample = new CargoreceiptExample();
        List<Cargoreceipt> cargoreceipts = cargoreceiptMapper.selectByExample(cargoreceiptExample);

        CargoreceiptdetailExample cargoreceiptdetailExample = new CargoreceiptdetailExample();
        List<Cargoreceiptdetail> cargoreceiptdetails = cargoreceiptdetailMapper.selectByExample(cargoreceiptdetailExample);

        List<String> billId = new ArrayList<>();
        for(Cargoreceipt car : cargoreceipts){
            billId.add(car.getGoodsRevertBillCode());
        }

        List<String> result = new ArrayList<>();
        for(Cargoreceiptdetail c : cargoreceiptdetails){
            if(result.contains(c.getGoodsRevertBillId())){
                continue;
            }
            result.add(c.getGoodsRevertBillId());
        }
        return result;
    }

    /**
     * 根据上面的那个方法选择之后回得到一个HZ编号，根据这个编号查找对应的货运单
     * @param receiptCode 用户选择的HZ编号
     * @return
     */
    @Override
    public Goodsbill findGoodsBill(String receiptCode) {
        Cargoreceiptdetail cargoreceiptdetail = cargoreceiptdetailMapper.selectByPrimaryKey(receiptCode);
        String goodsBillCode = cargoreceiptdetail.getGoodsBillDetailId();
        Goodsbill goodsbill = goodsbillMapper.selectByPrimaryKey(goodsBillCode);
        return goodsbill;
    }

    /**
     * 保存货运单主表
     * 更新货运单中的中转地和中转费用
     * @param cargoreceipt 货运单信息
     * @return
     */
    @Override
    public String add(int routeInfoId,Cargoreceipt cargoreceipt) {

        try {
            //1，保存货运回执单cargoreceipt
            Routeinfo routeinfo = routeinfoMapper.selectByPrimaryKey(routeInfoId);
            cargoreceipt.setDealGoodsStation(routeinfo.getEndStation());
            cargoreceiptMapper.insert(cargoreceipt);
            //2，更新货运单中的中转费用和中转地goodsbill


            Cargoreceiptdetail cargoreceiptdetail = cargoreceiptdetailMapper.selectByPrimaryKey(cargoreceipt.getGoodsRevertBillCode());

            Goodsbill goodsbill = goodsbillMapper.selectByPrimaryKey(cargoreceiptdetail.getGoodsBillDetailId());
            double transfer_fee = routeinfo.getFetchTime()*1.34;
            goodsbill.setTransferFee(transfer_fee);
            goodsbill.setTransferStation(routeinfo.getPassStation());
            goodsbillMapper.updateByPrimaryKey(goodsbill);

            //3，保存一份单据明细表，这里叫“货运回执表”
            Billinfo billinfo = new Billinfo();
            billinfo.setBillType("货运回执表");
            billinfo.setAcceptStation(cargoreceipt.getAcceptStation());
            billinfo.setBillCode(cargoreceipt.getGoodsRevertBillCode());
            billinfo.setBillState("已填");
            billinfo.setWriteDate(new Date());
            System.out.println(billinfo.toString());
            billinfoMapper.insert(billinfo);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            return "ERROR";
        }
    }

    /**
     * 根据货运回执单的状态分页查询
     * @param pageNum 当前的页数
     * @param limit 每页显示的条数
     * @return
     */
    @Override
    public Result selectReceiptByState(String backbillState, int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        CargoreceiptExample cargoreceiptExample = new CargoreceiptExample();
        CargoreceiptExample.Criteria criteria = cargoreceiptExample.createCriteria();
        criteria.andBackBillStateEqualTo(backbillState);

        List<Cargoreceipt> list = cargoreceiptMapper.selectByExample(cargoreceiptExample);
        PageInfo<Cargoreceipt> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 根据货运回执单的编号来查询货运单
     * @param goodsRevertBillCode 货运回执单的编号
     * @return
     */
    @Override
    public Cargoreceipt selectReceiptByBillCode(String goodsRevertBillCode) {
        return cargoreceiptMapper.selectByPrimaryKey(goodsRevertBillCode);
    }

    /**
     * 修改货运单
     * @param cargoreceipt
     * @return
     */
    @Override
    public String updateReceiptByBillCode(Cargoreceipt cargoreceipt) {
        int result = cargoreceiptMapper.updateByPrimaryKey(cargoreceipt);
        if(result<0){
            return "ERROR";
        }
        return "SUCCESS";
    }

    /**
     * 提交发货，修改货运回执单的状态是“未到车辆”
     * 修改货运单事件表的状态是“未到”，并更新时间
     * @param cargoreceipt
     * @return
     */
    @Override
    public boolean submit(Cargoreceipt cargoreceipt) {
        try {
            cargoreceipt.setBackBillState("未到车辆");
            cargoreceiptMapper.updateByPrimaryKey(cargoreceipt);
            Cargoreceiptdetail cargoreceiptdetail = cargoreceiptdetailMapper.selectByPrimaryKey(cargoreceipt.getGoodsRevertBillCode());
            Goodsbillevent goodsbillevent = goodsbilleventMapper.selectByPrimaryKey(cargoreceiptdetail.getGoodsBillDetailId());
            goodsbillevent.setEventName("未到");
            goodsbillevent.setOccurTime(new Date());
            goodsbilleventMapper.updateByPrimaryKey(goodsbillevent);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("货运回执单提交失败");
            return false;
        }
    }

    /**
     * 查询所有的货运回执单
     * @return
     */
    @Override
    public Result selectRecetiptAll(int pageNum,int limit) {
        PageHelper.startPage(pageNum,limit);
        CargoreceiptExample cargoreceiptExample = new CargoreceiptExample();
        List<Cargoreceipt> list = cargoreceiptMapper.selectByExample(cargoreceiptExample);
        PageInfo<Cargoreceipt> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 根据货运回执单的编号删除,并且更新单据明细表的状态是“作废”
     * @param goodsRevertBillCode 货运回执单的编号
     * @return
     */
    @Override
    public String deleteReceiptByBillCode(String goodsRevertBillCode) {
        try {
            Cargoreceiptdetail cargoreceiptdetail = cargoreceiptdetailMapper.selectByPrimaryKey(goodsRevertBillCode);
            BillinfoExample billinfoExample = new BillinfoExample();
            BillinfoExample.Criteria criteria = billinfoExample.createCriteria();
            criteria.andBillCodeEqualTo(cargoreceiptdetail.getGoodsBillDetailId());
            List<Billinfo> list = billinfoMapper.selectByExample(billinfoExample);

            Billinfo billinfo = list.get(0);
            billinfo.setBillState("作废");
            billinfo.setWriteDate(new Date());
            billinfoMapper.updateByPrimaryKey(billinfo);

            cargoreceiptMapper.deleteByPrimaryKey(goodsRevertBillCode);
            return "SUCCESS";
        }catch (Exception e){
            System.out.println("货运回执单删除失败");
            return "ERROR";
        }
    }
}

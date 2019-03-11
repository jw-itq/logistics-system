package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.*;
import com.logistics.pojo.*;
import com.logistics.service.TransferService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service(value = "transferService")
@Transactional(propagation = Propagation.REQUIRED)
public class TransferServiceImpl implements TransferService {

    @Autowired
    private TransfercominfoMapper transfercominfoMapper;

    @Autowired
    private GoodsbillMapper goodsbillMapper;

    @Autowired
    private CallbackinfoMapper callbackinfoMapper;

    @Autowired
    private CustomerreceiptinfoMapper customerreceiptinfoMapper;

    @Autowired
    private TransferinfoMapper transferinfoMapper;

    @Autowired
    private GoodsreceiptinfoMapper goodsreceiptinfoMapper;

    @Autowired
    private CargoreceiptdetailMapper cargoreceiptdetailMapper;

    @Autowired
    private GoodsbilleventMapper goodsbilleventMapper;

    @Autowired
    private CargoreceiptMapper cargoreceiptMapper;

    /**
     * 添加中转公司信息
     * @param transfercominfo
     * @return
     */
    @Override
    public String add(Transfercominfo transfercominfo) {
        try {
            transfercominfoMapper.insert(transfercominfo);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("添加中转公司的时候出错");
            return "ERROR";
        }
    }

    /**
     * 分页查询中转公司信息
     * @param pageNum
     * @param limit
     * @return
     */
    @Override
    public Result findByPage(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        TransfercominfoExample transfercominfoExample = new TransfercominfoExample();
        List<Transfercominfo> list = transfercominfoMapper.selectByExample(transfercominfoExample);
        PageInfo<Transfercominfo> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 分页查询当前司机所对应的货运单；
     * 并且货运回执单的类型要是“未到车辆”
     * @param driverId
     * @param pageNum
     * @param limit
     * @return
     */
    @Override
    public Result arriveGoods(String driverId, int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        List<Goodsbill> list = goodsbillMapper.transferState("未到车辆",driverId);
        PageInfo<Goodsbill> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     *
     * @param customerCode
     * @param pageNum
     * @param limit
     * @return
     */
    @Override
    public Result findCusRes(String customerCode, int pageNum, int limit) {
        CustomerreceiptinfoExample customerreceiptinfoExample = new CustomerreceiptinfoExample();
        CustomerreceiptinfoExample.Criteria criteria = customerreceiptinfoExample.createCriteria();
        criteria.andGoodsBillCodeEqualTo(customerCode);
        List<Customerreceiptinfo> list = customerreceiptinfoMapper.selectByExample(customerreceiptinfoExample);
        PageHelper.startPage(pageNum,limit);
        PageInfo<Customerreceiptinfo> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 中转回告所需的数据
     * @return
     */
    @Override
    public Result findOnWayBills() {
        List<Goodsbill> list = goodsbillMapper.findOnWayBills();
        List<Goodsbill> result = new LinkedList<>();
        for(Goodsbill goodsbill : list){
            CallbackinfoExample callbackinfoExample = new CallbackinfoExample();
            CallbackinfoExample.Criteria criteria = callbackinfoExample.createCriteria();
            criteria.andTypeEqualTo("中转回告");
            criteria.andGoodsBillIdEqualTo(goodsbill.getGoodsBillCode());
            List<Callbackinfo> callbackinfos = callbackinfoMapper.selectByExample(callbackinfoExample);
            if(callbackinfos.get(0) == null){
                result.add(goodsbill);
            }
        }
        Result rs = new Result(200,"SUCCESS",result.size(),result);
        return rs;
    }

    /**
     * 添加顾客回执信息
     * @return
     */
    @Override
    public String addCusRes(Customerreceiptinfo customerreceiptinfo) {
        try {
            customerreceiptinfoMapper.insert(customerreceiptinfo);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("顾客回执信息添加失败");
            return "ERROR";
        }
    }

    /**
     * 添加中转信息
     * @param transferinfo
     * @return
     */
    @Override
    public boolean addTransferInfo(Transferinfo transferinfo) {
        try {
            Goodsbillevent goodsbillevent = goodsbilleventMapper.selectByPrimaryKey(transferinfo.getAfterTransferBill());
            goodsbillevent.setEventName("未结");
            goodsbillevent.setOccurTime(new Date());
            goodsbilleventMapper.updateByPrimaryKey(goodsbillevent);

            Goodsbill goodsbill = goodsbillMapper.selectByPrimaryKey(transferinfo.getAfterTransferBill());
            goodsbill.setFactDealDate(transferinfo.getCheckTime());
            goodsbillMapper.updateByPrimaryKey(goodsbill);


            CargoreceiptdetailExample cargoreceiptdetailExample = new CargoreceiptdetailExample();
            CargoreceiptdetailExample.Criteria criteria = cargoreceiptdetailExample.createCriteria();
            criteria.andGoodsBillDetailIdEqualTo(transferinfo.getAfterTransferBill());
            List<Cargoreceiptdetail> list = cargoreceiptdetailMapper.selectByExample(cargoreceiptdetailExample);

            Cargoreceipt cargoreceipt = cargoreceiptMapper.selectByPrimaryKey(list.get(0).getGoodsRevertBillId());
            cargoreceipt.setArriveTime(transferinfo.getCheckTime());
            cargoreceipt.setBackBillState("未结合同");
            cargoreceiptMapper.updateByPrimaryKey(cargoreceipt);

            transferinfoMapper.insert(transferinfo);
            return true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.err.println("中转信息表插入失败");
            return false;
        }
    }

    /**
     * 查询本司机所有的中转云单
     * @param driverId
     * @return
     */
    @Override
    public Result transferGoods(String type,String driverId) {
        List<Goodsbill> list = goodsbillMapper.transferState(type, driverId);
        Result result = new Result(200, "SUCCESS", list.size(), list);
        return result;
    }

    /**
     * 查询货运单中转详情
     * @param goodsBillCode
     * @return
     */
    @Override
    public Transfercominfo findByGoodsBillCode(String goodsBillCode) {
        Goodsbill goodsbill = goodsbillMapper.selectByPrimaryKey(goodsBillCode);
        String[] citys = goodsbill.getTransferStation().split(",");
        Transfercominfo transfercominfo = new Transfercominfo();
        for(String string : citys){
            TransferinfoExample transferinfoExample = new TransferinfoExample();
            TransferinfoExample.Criteria criteria = transferinfoExample.createCriteria();
            criteria.andGoodsBillCodeEqualTo(goodsBillCode);
            criteria.andTransferStationEqualTo(string);
            if(transferinfoMapper.selectByExample(transferinfoExample)==null){
                TransfercominfoExample transfercominfoExample = new TransfercominfoExample();
                TransfercominfoExample.Criteria ct = transfercominfoExample.createCriteria();
                ct.andCityEqualTo(string);
                transfercominfo = transfercominfoMapper.selectByExample(transfercominfoExample).get(0);
                break;
            }
        }
        return transfercominfo;
    }

    /**
     * 查询所有的中转信息
     * @param pageNum
     * @param limit
     * @return
     */
    @Override
    public Result findInfoByPage(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        TransferinfoExample transferinfoExample = new TransferinfoExample();
        List<Transferinfo> list = transferinfoMapper.selectByExample(transferinfoExample);
        PageInfo<Transferinfo> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }
}

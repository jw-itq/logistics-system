package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.*;
import com.logistics.pojo.*;
import com.logistics.service.BillService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service(value = "billService")
@Transactional(propagation = Propagation.REQUIRED)
public class BillReleaseImpl implements BillService {

    @Autowired
    private BillinfoMapper billinfoMapper;

    @Autowired
    private BillreleaseMapper billreleaseMapper;

    @Autowired
    private GoodsbilleventMapper goodsbilleventMapper;

    @Autowired
    private CargoreceiptdetailMapper cargoreceiptdetailMapper;

    @Autowired
    private CargoreceiptMapper cargoreceiptMapper;

    @Autowired
    private GoodsreceiptinfoMapper goodsreceiptinfoMapper;

    @Autowired
    private GoodsbillMapper goodsbillMapper;

    /**
     * 这里对应的页面是票据分发页面，首先这个票据一定要是货运单才能分发，在就是货运单的状态必须是已经填写，
     * 其实这个条件是多于的，最重要的是这个货运单的单号不能在单据分发表里面，
     * 因为分发票据的目的就是为了添加这个货运单到货运回执单里面去
     * @Query(value = "select * from billinfo where bill_state = '已填' and bill_type = '货运单' and bill_code not in (select b.bill_code from billrelease b)", nativeQuery = true)
     * select * from billinfo where bill_state like '%已%填%' and bill_type = '货运单' and bill_code not in (select b.bill_code from billrelease b);
     * @param pageNum 表示当前页
     * @param limit 表示当前显示的行数
     * @return
     */
    @Override
    public Result findNotRelease(int pageNum,int limit) {
        PageHelper.startPage(pageNum,limit);
        BillinfoExample example = new BillinfoExample();
        BillinfoExample.Criteria criteria = example.createCriteria();
        criteria.andBillTypeEqualTo("货运单");
        criteria.andBillStateLike("%已%填%");

        BillreleaseExample billreleaseExample = new BillreleaseExample();
        List<Billrelease> billreleases = billreleaseMapper.selectByExample(billreleaseExample);
        System.out.println(billreleases.toString());
        if(billreleases!=null&&billreleases.size()>0){
            List<String> notIn = new ArrayList<>();
            for(Billrelease b : billreleases){
                notIn.add(b.getBillCode());
            }
            criteria.andBillCodeNotIn(notIn);
        }

        List<Billinfo> list = billinfoMapper.selectByExample(example);

        PageInfo<Billinfo> pageInfo = new PageInfo<>(list);

        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 查询所有类行的单据
     * @param pageNum 表示当前页
     * @param limit 表示当前显示的页数
     * @return
     */
    @Override
    public Result findByPage(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);

        BillinfoExample example = new BillinfoExample();
        List<Billinfo> list = billinfoMapper.selectByExample(example);
        PageInfo<Billinfo> pageInfo = new PageInfo<>(list);

        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 添加到单据分发表
     * 更新单据事件表，将状态更新到城”未到“
     * 更新货运单回执表，主要是把司机给加上去,还有更新货运单的状态是未到车辆
     *
     * @param billCode 表示货运单的编号
     * @param billrelease 这是单据分发表的pojo
     * @return
     */
    @Override
    public String addRelease(String billCode, Billrelease billrelease) {
        billrelease.setBillType("货运单");
        billrelease.setBillCode(billCode);
        try {
            billreleaseMapper.insert(billrelease);
            Goodsbillevent goodsbillevent = goodsbilleventMapper.selectByPrimaryKey(billCode);
            goodsbillevent.setEventName("未到");
            goodsbillevent.setOccurTime(new Date());
            goodsbilleventMapper.updateByPrimaryKey(goodsbillevent);

            //跟新货运回执单
            CargoreceiptdetailExample cargoreceiptdetailExample = new CargoreceiptdetailExample();
            CargoreceiptdetailExample.Criteria criteria = cargoreceiptdetailExample.createCriteria();
            criteria.andGoodsBillDetailIdEqualTo(billCode);
            List<Cargoreceiptdetail> list = cargoreceiptdetailMapper.selectByExample(cargoreceiptdetailExample);
            Cargoreceipt cargoreceipt = cargoreceiptMapper.selectByPrimaryKey(list.get(0).getGoodsRevertBillId());

            System.out.println(list.get(0).toString() +"--------------单据分发的时候-------"+billrelease.toString());
            System.out.println(cargoreceipt.toString());
            cargoreceipt.setStartCarryTime(billrelease.getReceiveBillTime());
            cargoreceipt.setDriverId(billrelease.getReceiveBillPerson());
            cargoreceipt.setBackBillState("未到车辆");
            cargoreceiptMapper.updateByPrimaryKey(cargoreceipt);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("单据明细表插入失败 | 货运单 & 货运回执信息 更新失败");
            return "ERROR";
        }
    }

    /**
     * 添加一条到货回执信息
     * 跟新货运事件表状态是”未结“
     * 更新货运单里面的到货时间
     * 更新货运回执单的状态是未结合同，并更新时间
     * @param goodsRevertBillCode
     * @param goodsreceiptinfo
     * @return
     */
    @Override
    public String addArrived(String goodsRevertBillCode, Goodsreceiptinfo goodsreceiptinfo) {
        try {
            goodsreceiptinfoMapper.insert(goodsreceiptinfo);
            Cargoreceiptdetail cargoreceiptdetail = cargoreceiptdetailMapper.selectByPrimaryKey(goodsRevertBillCode);
            Goodsbillevent goodsbillevent = goodsbilleventMapper.selectByPrimaryKey(cargoreceiptdetail.getGoodsBillDetailId());
            goodsbillevent.setEventName("未结");
            goodsbillevent.setOccurTime(new Date());
            goodsbilleventMapper.updateByPrimaryKey(goodsbillevent);

            Goodsbill goodsbill = goodsbillMapper.selectByPrimaryKey(cargoreceiptdetail.getGoodsBillDetailId());
            goodsbill.setFactDealDate(goodsreceiptinfo.getRceiveGoodsDate());
            goodsbillMapper.updateByPrimaryKey(goodsbill);

            Cargoreceipt cargoreceipt = cargoreceiptMapper.selectByPrimaryKey(goodsRevertBillCode);
            cargoreceipt.setArriveTime(goodsreceiptinfo.getRceiveGoodsDate());
            cargoreceipt.setBackBillState("未结合同");
            cargoreceiptMapper.updateByPrimaryKey(cargoreceipt);

            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("货运回执信息添加失败");
            return "ERROR";
        }
    }

    /**
     * 通知中转的目的就是为了改变以下cargoreceipt的状态
     * @param goodsRevertBillCode
     * @return
     */
    @Override
    public String addTransferArrived(String goodsRevertBillCode) {
        try {
            Goodsreceiptinfo goodsreceiptinfo = new Goodsreceiptinfo();
            goodsreceiptinfo.setGoodsRevertCode(goodsRevertBillCode);
            goodsreceiptinfo.setCheckGoodsRecord("货物已经中转");
            goodsreceiptinfoMapper.insert(goodsreceiptinfo);

            Cargoreceiptdetail cargoreceiptdetail = cargoreceiptdetailMapper.selectByPrimaryKey(goodsRevertBillCode);
            Goodsbillevent goodsbillevent = goodsbilleventMapper.selectByPrimaryKey(cargoreceiptdetail.getGoodsBillDetailId());
            goodsbillevent.setEventName("已中转");
            goodsbillevent.setOccurTime(new Date());
            goodsbilleventMapper.updateByPrimaryKey(goodsbillevent);

            Goodsbill goodsbill = goodsbillMapper.selectByPrimaryKey(cargoreceiptdetail.getGoodsBillDetailId());
            goodsbill.setFactDealDate(goodsreceiptinfo.getRceiveGoodsDate());
            goodsbillMapper.updateByPrimaryKey(goodsbill);

            Cargoreceipt cargoreceipt = cargoreceiptMapper.selectByPrimaryKey(goodsRevertBillCode);
            cargoreceipt.setArriveTime(new Date());
            cargoreceipt.setBackBillState("已中转");
            cargoreceiptMapper.updateByPrimaryKey(cargoreceipt);

            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("通知中转的时候出错");
            return "ERROR";
        }
    }
}

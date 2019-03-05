package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.BillinfoMapper;
import com.logistics.dao.mapper.CargoreceiptdetailMapper;
import com.logistics.dao.mapper.GoodsbillMapper;
import com.logistics.dao.mapper.GoodsbilleventMapper;
import com.logistics.pojo.*;
import com.logistics.service.GoodsBillService;
import com.logistics.util.Result;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service(value = "goodsBillService")
@Transactional(propagation = Propagation.REQUIRED)
public class GoodsBillServiceImpl implements GoodsBillService {

    @Autowired
    private GoodsbillMapper goodsbillMapper;

    @Autowired
    private BillinfoMapper billinfoMapper;

    @Autowired
    private GoodsbilleventMapper goodsbilleventMapper;

    @Autowired
    private CargoreceiptdetailMapper cargoreceiptdetailMapper;

    /**
     * 保存货运单，在这个其中，还要插入单据明细表用具查询单据，还有货运单事件表，可以跟踪这个货运单的状态
     * @param goodsbill
     * @return
     */
    @Override
    public Map<?, ?> save(Goodsbill goodsbill) {
        //首先需要生成一个随机数作为单号
        Map<String,String> map = new HashMap<>();
        try {
            String goodsBillCode = "HY";
            //为了保证不重复
            while(true){
                goodsBillCode += randomCode();
                if(goodsbillMapper.selectByPrimaryKey(goodsBillCode)==null){
                    break;
                }
                goodsBillCode = "HY";
            }

            System.out.println(goodsbill.toString());
            goodsbill.setGoodsBillCode(goodsBillCode);
            goodsbill.setValidity(false);
            goodsbill.setIfAudit(false);
            goodsbillMapper.insert(goodsbill);

            Billinfo billinfo = new Billinfo();
            billinfo.setBillCode(goodsBillCode);
            billinfo.setBillType("货运单");
            billinfo.setBillState("已经填写");
            billinfo.setWriteDate(new Date());
            billinfoMapper.insert(billinfo);

            Goodsbillevent goodsbillevent = new Goodsbillevent();
            goodsbillevent.setGoodsBillId(goodsBillCode);
            goodsbillevent.setEventName("待发");
            goodsbillevent.setRemark("单据已经填写");
            goodsbillevent.setOccurTime(new Date());
            goodsbilleventMapper.insert(goodsbillevent);

            map.put("goodsBillCode",goodsBillCode);
            map.put("status","SUCCESS");
            return map;
        }catch (Exception e){
            System.out.println("货运单 | 单据 | 货运单事件表 插入失败");
            map.put("status","ERROR");
            return map;
        }
    }

    /**
     * 插入货运单回执主表，参数goodsBillCode的作用是为了去查询货运单主表，把里面的是否审核和是否有效的两个参数改掉
     * @param goodsBillCode
     * @param cargoreceiptdetail
     * @return
     */
    @Override
    public boolean addGoods(String goodsBillCode, Cargoreceiptdetail cargoreceiptdetail) {
        try {
            //简称“货运回执单”为HZ
            String goodsRevertBillId = "HZ";
            while(true){
                goodsRevertBillId += randomCode();
                if(cargoreceiptdetailMapper.selectByPrimaryKey(goodsRevertBillId)==null){
                    break;
                }
                goodsRevertBillId = "HZ";
            }

            cargoreceiptdetail.setGoodsRevertBillId(goodsRevertBillId);
            cargoreceiptdetail.setGoodsBillDetailId(goodsBillCode);
            cargoreceiptdetailMapper.insert(cargoreceiptdetail);

            Goodsbill goodsbill = goodsbillMapper.selectByPrimaryKey(goodsBillCode);

            goodsbill.setIfAudit(true);
            goodsbill.setValidity(true);
            goodsbillMapper.updateByPrimaryKey(goodsbill);
            return true;
        }catch (Exception e){
            System.out.println("货物插入失败");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 分页查询货运单的状态
     * @param eventNum 这个是状态
     * @param pageNum 表示当前页
     * @param limit 表示每页显示的数量
     * @return
     */
    @Override
    public Result selectByEvent(String eventNum, int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);

        GoodsbilleventExample example = new GoodsbilleventExample();
        GoodsbilleventExample.Criteria criteria = example.createCriteria();
        criteria.andEventNameEqualTo(eventNum);

        List<Goodsbillevent> list = goodsbilleventMapper.selectByExample(example);
        PageInfo<Goodsbillevent> pageInfo = new PageInfo<Goodsbillevent>(list);

        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        System.out.println("查询货运单的状态成功   "+result.toString());
        return result;
    }

    /**
     * 查询所有的货运单
     * @param pageNum 当前的页数
     * @param limit 当前显示的行数
     * @return
     */
    @Override
    public Result selectByEvent(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);

        GoodsbilleventExample example = new GoodsbilleventExample();
        List<Goodsbillevent> list = goodsbilleventMapper.selectByExample(example);
        PageInfo<Goodsbillevent> pageInfo = new PageInfo<>(list);

        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        System.out.println("查询所有的货运单成功");
        return result;
    }

    /**
     * 根据货运单的编号查看货运单详情页面，也就是查询货运单的主表
     * @param goodsBillCode 货运单的编号
     * @return
     */
    @Override
    public Goodsbill selectByCode(String goodsBillCode) {
        Goodsbill result = goodsbillMapper.selectByPrimaryKey(goodsBillCode);
        return result;
    }

    /**
     * 根据货运单的编号修改货运单
     * @param goodsBillCode 货运单的编号
     * @param goodsbill 货运单
     * @return
     */
    @Override
    public String updateByCode(String goodsBillCode, Goodsbill goodsbill) {
        goodsbill.setGoodsBillCode(goodsBillCode);
        int resutl = goodsbillMapper.updateByPrimaryKey(goodsbill);
        System.out.println("货运单修改的状态——————"+resutl);
        if(resutl<0){
            return "ERROR";
        }
        return "SUCCESS";
    }

    /**
     * 生成一个6位的随即数，作为单号
     * @return
     */
    public String randomCode(){
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for(int i = 0;i<6;i++){
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }
}

package com.logistics.service.impl;

import com.logistics.dao.mapper.BillinfoMapper;
import com.logistics.dao.mapper.CargoreceiptdetailMapper;
import com.logistics.dao.mapper.GoodsbillMapper;
import com.logistics.dao.mapper.GoodsbilleventMapper;
import com.logistics.pojo.Billinfo;
import com.logistics.pojo.Cargoreceiptdetail;
import com.logistics.pojo.Goodsbill;
import com.logistics.pojo.Goodsbillevent;
import com.logistics.service.GoodsBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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

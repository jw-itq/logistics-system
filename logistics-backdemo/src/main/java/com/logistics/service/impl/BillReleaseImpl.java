package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.BillinfoMapper;
import com.logistics.dao.mapper.BillreleaseMapper;
import com.logistics.pojo.Billinfo;
import com.logistics.pojo.BillinfoExample;
import com.logistics.pojo.Billrelease;
import com.logistics.pojo.BillreleaseExample;
import com.logistics.service.BillService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "billService")
@Transactional(propagation = Propagation.REQUIRED)
public class BillReleaseImpl implements BillService {

    @Autowired
    private BillinfoMapper billinfoMapper;

    @Autowired
    private BillreleaseMapper billreleaseMapper;

    /**
     * 这里对应的页面是票据分发页面，首先这个票据一定要是货运单才能分发，在就是货运单的状态必须是已经填写，
     * 其实这个条件是多于的，最重要的是这个货运单的单号不能在货运回执单里面，
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
        List<String> notIn = new ArrayList<>();
        for(Billrelease b : billreleases){
            notIn.add(b.getBillCode());
        }
        criteria.andBillCodeNotIn(notIn);

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
     *
     * @param billCode 表示货运单的编号
     * @param billrelease 这是单据分发表的pojo
     * @return
     */
    @Override
    public String addRelease(String billCode, Billrelease billrelease) {
        billrelease.setBillCode(billCode);
        int result = billreleaseMapper.insert(billrelease);
        if(result<0){
            return "ERROR";
        }
        return "SUCCESS";
    }
}

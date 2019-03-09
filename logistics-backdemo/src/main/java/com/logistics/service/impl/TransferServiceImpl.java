package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.TransfercominfoMapper;
import com.logistics.pojo.Transfercominfo;
import com.logistics.pojo.TransfercominfoExample;
import com.logistics.service.TransferService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "transferService")
@Transactional(propagation = Propagation.REQUIRED)
public class TransferServiceImpl implements TransferService {

    @Autowired
    private TransfercominfoMapper transfercominfoMapper;

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
}

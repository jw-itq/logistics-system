package com.logistics.service.impl;

import com.logistics.dao.mapper.CustomerinfoMapper;
import com.logistics.pojo.Customerinfo;
import com.logistics.pojo.CustomerinfoExample;
import com.logistics.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "customerService")
@Transactional(propagation = Propagation.REQUIRED)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerinfoMapper customerinfoMapper;

    /**
     * 查询所有的客户编号
     * 返回一个String类型的集合
     * @return
     */
    @Override
    public List<String> selectAllCusCode() {
        CustomerinfoExample example = new CustomerinfoExample();
        List<Customerinfo> list = customerinfoMapper.selectByExample(example);
        List<String> result = new ArrayList<>();
        for(Customerinfo s : list){
            result.add(s.getCustomerCode());
        }
        return result;
    }

    /**
     * 根据客户的编号再客户详情表中查询客户的一些基本信息
     * @param customerCode
     * @return
     */
    @Override
    public Customerinfo selectCusByCode(String customerCode) {
        Customerinfo customerinfo = customerinfoMapper.selectByPrimaryKey(customerCode);
        return customerinfo;
    }
}

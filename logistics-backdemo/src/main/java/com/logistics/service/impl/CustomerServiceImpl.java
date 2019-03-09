package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.CustomerinfoMapper;
import com.logistics.dao.mapper.UserMapper;
import com.logistics.dao.mapper.UsergroupMapper;
import com.logistics.dao.mapper.UserwithgroupMapper;
import com.logistics.pojo.*;
import com.logistics.service.CustomerService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service(value = "customerService")
@Transactional(propagation = Propagation.REQUIRED)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerinfoMapper customerinfoMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UsergroupMapper usergroupMapper;

    @Autowired
    private UserwithgroupMapper userwithgroupMapper;

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

    /**
     * 查询所有的客户信息
     * @return
     */
    @Override
    public Result selectAllCus(int pageNum,int limit) {
        PageHelper.startPage(pageNum,limit);
        CustomerinfoExample customerinfoExample = new CustomerinfoExample();
        List<Customerinfo> list = customerinfoMapper.selectByExample(customerinfoExample);
        PageInfo<Customerinfo> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 根据id删除客户的信息;删除用户的信息；删除用户和组的信息
     * @param customerCode
     * @return
     */
    @Override
    public String deleteCus(String customerCode) {
        try {
            customerinfoMapper.deleteByPrimaryKey(customerCode);
            userMapper.deleteByPrimaryKey(customerCode);
            UserwithgroupExample userwithgroupExample = new UserwithgroupExample();
            UserwithgroupExample.Criteria criteria = userwithgroupExample.createCriteria();
            criteria.andUserIdEqualTo(customerCode);
            userwithgroupMapper.deleteByExample(userwithgroupExample);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("删除客户信息的时候出错");
            return "ERROR";
        }
    }

    /**
     * 添加客户的信息；添加用户信息；添加用户和组的表，表示给客户分配客户的权限
     * @param customerinfo
     * @return
     */
    @Override
    public String addCus(Customerinfo customerinfo) {
        try {
            String customerCode = "KH";
            CustomerinfoExample customerinfoExample = new CustomerinfoExample();
            List<Customerinfo> list = customerinfoMapper.selectByExample(customerinfoExample);
            List<String> isCode = new ArrayList<>();
            for(Customerinfo c : list){
                isCode.add(c.getCustomerCode());
            }
            while(true){
                customerCode += randomCode();
                if(!isCode.contains(customerCode)){
                    break;
                }
            }

            customerinfo.setCustomerCode(customerCode);
            customerinfoMapper.insert(customerinfo);
            //添加用户
            User user = new User(customerCode,false,"E10ADC3949BA59ABBE56E057F20F883E");
            userMapper.insert(user);
            //添加用户和组的信息
            String department = "客户组";
            UsergroupExample usergroupExample = new UsergroupExample();
            UsergroupExample.Criteria criteria = usergroupExample.createCriteria();
            criteria.andGroupNameEqualTo(department);
            List<Usergroup> usergroups = usergroupMapper.selectByExample(usergroupExample);

            Userwithgroup userwithgroup = new Userwithgroup();
            userwithgroup.setGroupId(usergroups.get(0).getId());
            userwithgroup.setUserId(customerCode);
            userwithgroupMapper.insert(userwithgroup);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("添加客户信息的时候出错了");
            return "ERROR";
        }
    }

    /**
     * 修改客户的信息，名字不能更改，还是要用以前的名字，所以要根据id查询；
     * @param customerCode 这个是提交过来的编号
     * @param customerinfo
     * @return
     */
    @Override
    public String updateCustomerInfo(String customerCode, Customerinfo customerinfo) {
        Customerinfo customer = customerinfoMapper.selectByPrimaryKey(customerCode);
        customerinfo.setCustomerCode(customerCode);
        customerinfo.setCustomer(customer.getCustomer());
        try {
            customerinfoMapper.updateByPrimaryKey(customerinfo);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("客户更新的时候出错");
            return "ERROR";
        }
    }

    private String randomCode() {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }
}

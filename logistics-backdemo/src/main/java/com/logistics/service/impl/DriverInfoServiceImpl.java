package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.DriverinfoMapper;
import com.logistics.dao.mapper.UserMapper;
import com.logistics.dao.mapper.UsergroupMapper;
import com.logistics.dao.mapper.UserwithgroupMapper;
import com.logistics.pojo.*;
import com.logistics.service.DriverInfoService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service(value = "driverInfoService")
@Transactional(propagation = Propagation.REQUIRED)
public class DriverInfoServiceImpl implements DriverInfoService {

    @Autowired
    private DriverinfoMapper driverinfoMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UsergroupMapper usergroupMapper;

    @Autowired
    private UserwithgroupMapper userwithgroupMapper;

    /**
     * 添加一个新的司机信息；并且添加这个司机为用户；并且也添加用户跟组的信息，表示给这个用户分配权限
     * @param driverinfo
     * @return
     */
    @Override
    public String add(Driverinfo driverinfo) {
        driverinfo.setState("空闲");
        String driverCode = "SJ";
        DriverinfoExample driverinfoExample = new DriverinfoExample();
        List<Driverinfo> list = driverinfoMapper.selectByExample(driverinfoExample);
        List<String> isCode = new ArrayList<>();
        for(Driverinfo d : list){
            isCode.add(d.getId());
        }
        while (true){
            driverCode += randomCode();
            if(!isCode.contains(driverCode)){
                break;
            }
        }

        driverinfo.setId(driverCode);
        try {
            //添加用户信息表
            User user = new User(driverCode,false,"E10ADC3949BA59ABBE56E057F20F883E");
            userMapper.insert(user);

            //添加用户和组的表
            String department = "司机组";
            UsergroupExample usergroupExample = new UsergroupExample();
            UsergroupExample.Criteria criteria = usergroupExample.createCriteria();
            criteria.andGroupNameEqualTo(department);
            List<Usergroup> usergroups = usergroupMapper.selectByExample(usergroupExample);

            Userwithgroup userwithgroup = new Userwithgroup();
            userwithgroup.setUserId(driverCode);
            userwithgroup.setGroupId(usergroups.get(0).getId());
            userwithgroupMapper.insert(userwithgroup);

            driverinfoMapper.insert(driverinfo);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("添加司机信息的时候出错了");
            return "ERROR";
        }

    }

    /**
     * 查询所有的司机信息,分页
     * @return
     */
    @Override
    public Result selectAllByPage(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        DriverinfoExample driverinfoExample = new DriverinfoExample();
        List<Driverinfo> list = driverinfoMapper.selectByExample(driverinfoExample);
        PageInfo<Driverinfo> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 删除司机的信息，根据id;同时也要删除这个用户，以及用户和组
     * @param id
     * @return
     */
    @Override
    public String deleteDriverById(String id) {
        try {
            driverinfoMapper.deleteByPrimaryKey(id);
            userMapper.deleteByPrimaryKey(id);
            UserwithgroupExample userwithgroupExample = new UserwithgroupExample();
            UserwithgroupExample.Criteria criteria = userwithgroupExample.createCriteria();
            criteria.andUserIdEqualTo(id);
            userwithgroupMapper.deleteByExample(userwithgroupExample);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("删除司机信息的时候出错");
            return "ERROR";
        }
    }

    /**
     * 根据司机的id来查询
     * @param driverId
     * @return
     */
    @Override
    public Driverinfo selectById(String driverId) {
        return driverinfoMapper.selectByPrimaryKey(driverId);
    }

    /**
     * 修改司机的信息，但是不能修改司机的状态，所以这个状态要保留之前的状态
     * @param id
     * @param driverinfo
     * @return
     */
    @Override
    public String updateById(String id, Driverinfo driverinfo) {
        Driverinfo oldDriverInfo = driverinfoMapper.selectByPrimaryKey(id);
        driverinfo.setState(oldDriverInfo.getState());
        driverinfo.setId(id);
        try {
            System.out.println("司机的信息--"+driverinfo.toString());
            driverinfoMapper.updateByPrimaryKey(driverinfo);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("修改司机信息的时候出错");
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

    /**
     * 查询所有司机的编号
     * @return
     */
    @Override
    public List<String> selectAllId() {
        DriverinfoExample example = new DriverinfoExample();
        List<Driverinfo> list = driverinfoMapper.selectByExample(example);
        List<String> result = new ArrayList<>();
        for(Driverinfo d : list){
            result.add(d.getId());
        }
        return result;
    }
}

package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.*;
import com.logistics.pojo.*;
import com.logistics.service.GroupService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


@Service(value = "groupService")
@Transactional(propagation = Propagation.REQUIRED)
public class GroupServiceImpl implements GroupService {

    @Autowired
    private UserwithgroupMapper userwithgroupMapper;

    @Autowired
    private FunctionwithgroupMapper functionwithgroupMapper;

    @Autowired
    private UsergroupMapper usergroupMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private FunctionMapper functionMapper;


    /**
     * 查询登陆的用户所对应的功能，要先查询对应的组别，再根据组别查询对应的功能
     * @param loginId
     * @return
     */
    @Override
    public List<Functionwithgroup> findFunctionByLoginId(String loginId) {
        UserwithgroupExample example = new UserwithgroupExample();
        UserwithgroupExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(loginId);

        List<Userwithgroup> list = userwithgroupMapper.selectByExample(example);
        if(list.size()==0||list==null){
            return null;
        }
        FunctionwithgroupExample functionwithgroupExample = new FunctionwithgroupExample();
        FunctionwithgroupExample.Criteria criteria1 = functionwithgroupExample.createCriteria();
        criteria1.andGroupIdEqualTo(list.get(0).getGroupId());

        List<Functionwithgroup> result = functionwithgroupMapper.selectByExample(functionwithgroupExample);
        return result;
    }

    /**
     * 查询所有用户组，供添加职员的时候使用
     * @return
     */
    @Override
    public List<Usergroup> selectAllUserGroup() {
        UsergroupExample usergroupExample = new UsergroupExample();
        List<Usergroup> result = usergroupMapper.selectByExample(usergroupExample);
        return result;
    }

    @Override
    public boolean save(Usergroup userGroup) {
        try {
            usergroupMapper.insert(userGroup);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("用户组表插入失败！");
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            Usergroup usergroup = usergroupMapper.selectByPrimaryKey(id);
            usergroupMapper.deleteByPrimaryKey(id);
            EmployeeExample employeeExample = new EmployeeExample();
            EmployeeExample.Criteria criteria = employeeExample.createCriteria();
            criteria.andDepartmentEqualTo(usergroup.getGroupName());
            List<Employee> list = employeeMapper.selectByExample(employeeExample);
            Employee employee = list.get(0);
            employee.setDepartment("临时组");
            return true;
        }catch (Exception e){
            System.err.println("用户组表删除 | 职工部门更新 失败！");
            return false;
        }
    }

    @Override
    public Result selectAllGroup(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        UsergroupExample usergroupExample = new UsergroupExample();
        List<Usergroup> list = usergroupMapper.selectByExample(usergroupExample);
        PageInfo<Usergroup> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    @Override
    public Usergroup findById(int id) {
        return usergroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean update(int id, String description) {
        Usergroup usergroup = usergroupMapper.selectByPrimaryKey(id);
        usergroup.setDescription(description);
        try {
            usergroupMapper.updateByPrimaryKey(usergroup);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("用户组描述更新失败！");
            return false;
        }
    }

    @Override
    public List<Function> findAllFunction() {
        FunctionExample functionExample = new FunctionExample();
        return functionMapper.selectByExample(functionExample);
    }

    @Override
    public List<Functionwithgroup> findAllFunctionWithGroups(int groupId) {
        FunctionwithgroupExample functionwithgroupExample = new FunctionwithgroupExample();
        FunctionwithgroupExample.Criteria criteria = functionwithgroupExample.createCriteria();
        criteria.andGroupIdEqualTo(groupId);
        return functionwithgroupMapper.selectByExample(functionwithgroupExample);
    }

    @Override
    public boolean addFuncGro(int groupId, int[] functionId) {
        System.out.println(groupId);
        System.out.println(functionId);
        List<Integer> list = new LinkedList<>();
        for (int i : functionId) {
            list.add(i);
        }
        System.out.println(list);
        /*for (int i = 0; i < 11; i++) {
            FunctionwithgroupExample functionwithgroupExample = new FunctionwithgroupExample();
            FunctionwithgroupExample.Criteria criteria = functionwithgroupExample.createCriteria();
            criteria.andGroupIdEqualTo(groupId);
            criteria.andFunctionIdEqualTo(i+1);
            if (functionwithgroupMapper.selectByExample(functionwithgroupExample) == null) {
                System.out.println(i);
                if (list.contains(i+1)) {
                    Functionwithgroup functionWithGroup = new Functionwithgroup();
                    functionWithGroup.setFunctionId(i+1);
                    functionWithGroup.setGroupId(groupId);
                    functionwithgroupMapper.insert(functionWithGroup);
                }
            }
        }*/

        FunctionwithgroupExample functionwithgroupExample = new FunctionwithgroupExample();
        FunctionwithgroupExample.Criteria criteria = functionwithgroupExample.createCriteria();
        criteria.andGroupIdEqualTo(groupId);
        List<Functionwithgroup> ls = functionwithgroupMapper.selectByExample(functionwithgroupExample);

        List<Integer> function = new ArrayList<>();
        for(Functionwithgroup f : ls){
            function.add(f.getFunctionId());
        }
        for(Integer in : list){
            if(!function.contains(in)){
                Functionwithgroup functionWithGroup = new Functionwithgroup();
                functionWithGroup.setFunctionId(in);
                functionWithGroup.setGroupId(groupId);
                functionwithgroupMapper.insert(functionWithGroup);
            }
        }

        for(Integer in : function){
            if(!list.contains(in)){
                FunctionwithgroupExample funcExample = new FunctionwithgroupExample();
                FunctionwithgroupExample.Criteria criteria1 = funcExample.createCriteria();
                criteria1.andFunctionIdEqualTo(in);
                criteria1.andGroupIdEqualTo(groupId);
                functionwithgroupMapper.deleteByExample(funcExample);
            }
        }
        return true;
    }

}

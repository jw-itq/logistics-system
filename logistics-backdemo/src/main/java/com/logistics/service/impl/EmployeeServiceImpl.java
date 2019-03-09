package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.EmployeeMapper;
import com.logistics.dao.mapper.UserMapper;
import com.logistics.dao.mapper.UsergroupMapper;
import com.logistics.dao.mapper.UserwithgroupMapper;
import com.logistics.pojo.*;
import com.logistics.service.EmployeeService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service(value = "employeeService")
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UsergroupMapper usergroupMapper;

    @Autowired
    private UserwithgroupMapper userwithgroupMapper;

    /**
     * 分页查询所有的员工
     * @param pageNum
     * @param limit
     * @return
     */
    @Override
    public Result selectAllEmp(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        EmployeeExample employeeExample = new EmployeeExample();
        List<Employee> list = employeeMapper.selectByExample(employeeExample);
        PageInfo<Employee> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 添加新员工，首先根据函数计算出当前职员对应的编号；然后判断是否要添加用户权限；然后将职员添加到对应的组表中（组就是部门）
     * @param employee
     * @param condition 表示是否同时也是用户，1，是，0，不是
     * @return
     */
    @Override
    public String addNewEmp(Employee employee, int condition) {
        try {
            //设置职员的id
            String department = employee.getDepartment();
            String employeeCode = "";
            employeeCode += departmentPrefix(department);
            EmployeeExample employeeExample = new EmployeeExample();
            List<Employee> list = employeeMapper.selectByExample(employeeExample);
            List<String> isCode = new ArrayList<>();
            for(Employee e : list){
                isCode.add(e.getEmployeeCode());
            }
            while(true){
                employeeCode += randomCode();
                if(!isCode.contains(employeeCode)){
                    break;
                }
            }

            //判断是否需要给用户权限
            if(condition==1){
                User user = new User(employeeCode,false,"E10ADC3949BA59ABBE56E057F20F883E");
                userMapper.insert(user);
            }

            //将职员添加到对应的组中，也就是用户跟组的中间表中
            UsergroupExample usergroupExample = new UsergroupExample();
            UsergroupExample.Criteria criteria = usergroupExample.createCriteria();
            criteria.andGroupNameEqualTo(department);
            List<Usergroup> groupList = usergroupMapper.selectByExample(usergroupExample);

            Userwithgroup userwithgroup = new Userwithgroup();
            userwithgroup.setUserId(employeeCode);
            userwithgroup.setGroupId(groupList.get(0).getId());
            userwithgroupMapper.insert(userwithgroup);

            employee.setEmployeeCode(employeeCode);
            employeeMapper.insert(employee);
            return "SUCCESS";

        }catch (Exception e){
            e.printStackTrace();
            System.err.println("职员 | 用户 | 用户组关系表 信息插入失败！");
            return "ERROR";
        }
    }

    /**
     * 根据职员信息的编号查找职员信息
     * @param employeeCode
     * @return
     */
    @Override
    public Employee selectEmpByCode(String employeeCode) {
        return employeeMapper.selectByPrimaryKey(employeeCode);
    }

    /**
     * 修改员工表；修改用户和组表；修改用户表
     * @param employeeCode
     * @param employee
     * @param condition
     * @return
     */
    @Override
    public String updateEmp(String employeeCode, Employee employee, int condition) {
        try {
            //1 根据旧表和新表的部门对比来判断是否要重新分配，如果不一样，重新分配，并且更新用户和组表
            Employee emp = employeeMapper.selectByPrimaryKey(employeeCode);
            if(!emp.getDepartment().equals(employee.getDepartment())){
                String department = employee.getDepartment();
                employeeMapper.deleteByPrimaryKey(emp.getEmployeeCode());
                //更新编号
                String newEmployeeCode = "";
                newEmployeeCode += departmentPrefix(department);
                EmployeeExample employeeExample = new EmployeeExample();
                List<Employee> list = employeeMapper.selectByExample(employeeExample);
                List<String> isCode = new ArrayList<>();
                for(Employee e : list){
                    isCode.add(e.getEmployeeCode());
                }
                while(true){
                    newEmployeeCode += randomCode();
                    if(!isCode.contains(newEmployeeCode)){
                        break;
                    }
                }
                //跟新id
                emp.setEmployeeCode(newEmployeeCode);
                emp.setDepartment(employee.getDepartment());
                emp.setPosition(employee.getPosition());
                employeeMapper.insert(emp);

                //更新用户和组
                UsergroupExample usergroupExample = new UsergroupExample();
                UsergroupExample.Criteria criteria = usergroupExample.createCriteria();
                criteria.andGroupNameEqualTo(department);
                List<Usergroup> usergroups = usergroupMapper.selectByExample(usergroupExample);

                UserwithgroupExample userwithgroupExample = new UserwithgroupExample();
                UserwithgroupExample.Criteria criteria1 = userwithgroupExample.createCriteria();
                criteria1.andUserIdEqualTo(employee.getEmployeeCode());
                List<Userwithgroup> userwithgroups = userwithgroupMapper.selectByExample(userwithgroupExample);

                Userwithgroup userwithgroup = userwithgroups.get(0);
                userwithgroup.setGroupId(usergroups.get(0).getId());
                userwithgroup.setUserId(newEmployeeCode);
                userwithgroupMapper.updateByPrimaryKey(userwithgroup);


            }else{
                System.out.println("准备更新---"+emp.toString());
                //2 更新员工信息表
                emp.setPosition(employee.getPosition());
                employeeMapper.updateByPrimaryKey(emp);
            }
            //3 根据condition的状态更新用户表
            User user = userMapper.selectByPrimaryKey(employee.getEmployeeCode());
            if(user==null&&condition==1){
                user = new User(employee.getEmployeeCode(),false,"E10ADC3949BA59ABBE56E057F20F883E");
                userMapper.insert(user);
            }else if(user!=null&&condition==0){
                userMapper.deleteByPrimaryKey(user.getLoginId());
            }
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("职员 | 用户 | 用户组关系表 信息更新失败！");
            return "ERROR";
        }
    }

    /**
     * 删除员工信息；如果有用户，也要删除对应的用户；并且删除对应的用户和组表
     * @param employeeCode
     * @return
     */
    @Override
    public String deleteEmpByCode(String employeeCode) {
        try {
            employeeMapper.deleteByPrimaryKey(employeeCode);
            //删除对应的用户和组表

            UserwithgroupExample userwithgroupExample = new UserwithgroupExample();
            UserwithgroupExample.Criteria criteria1 = userwithgroupExample.createCriteria();
            criteria1.andUserIdEqualTo(employeeCode);
            userwithgroupMapper.deleteByExample(userwithgroupExample);
            //如果有用户，删除对应的用户
            User user = userMapper.selectByPrimaryKey(employeeCode);
            if(user!=null){
                userMapper.deleteByPrimaryKey(user.getLoginId());
            }
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("删除职员信息的时候报错");
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

    private String departmentPrefix(String department) {
        String result = "";
        if (department.equals("管理组")) {
            result = "GL";
        } else if (department.equals("票据组")) {
            result = "PJ";
        } else if (department.equals("财务组")) {
            result = "CW";
        } else if (department.equals("客服组")) {
            result = "KF";
        } else if (department.equals("监控组")) {
            result = "JK";
        }
        return result;
    }
}

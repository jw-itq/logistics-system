package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.EmployeeMapper;
import com.logistics.pojo.Employee;
import com.logistics.pojo.EmployeeExample;
import com.logistics.service.EmployeeService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "employeeService")
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

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
}

package com.logistics.controller;

import com.logistics.pojo.Employee;
import com.logistics.service.EmployeeService;
import com.logistics.service.UserService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@ControllerAdvice
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "addEmp",method = RequestMethod.POST)
    public String addNewEmp(Employee employee,@RequestParam("condition")int condition){
        return employeeService.addNewEmp(employee,condition);
    }

    @RequestMapping(value = "/selectAllEmp",method = RequestMethod.GET)
    public Result selectAllEmp(@RequestParam("pageNum")int pageNum,@RequestParam("limit")int limit){
        return employeeService.selectAllEmp(pageNum,limit);
    }

    @RequestMapping(value = "/selectEmpByCode/{employeeCode}",method = RequestMethod.GET)
    public Map<?,?> selectEmpByCode(@PathVariable("employeeCode")String employeeCode){
        Employee employee = employeeService.selectEmpByCode(employeeCode);
        Map<String,Object> map = new HashMap<>();
        boolean flag = userService.isExist(employeeCode);
        map.put("employee",employee);
        map.put("condition",flag == true ? 1 : 0);
        return map;
    }

    @RequestMapping(value = "/updateEmp/{employeeCode}",method = RequestMethod.PUT)
    public String updateEmp(@PathVariable("employeeCode")String employeeCode,Employee employee,int condition){
        return employeeService.updateEmp(employeeCode,employee,condition);
    }

    @RequestMapping(value = "/deleteEmp/{employeeCode}",method = RequestMethod.DELETE)
    public String deleteEmpByCode(@PathVariable("employeeCode")String employeeCode){
        return employeeService.deleteEmpByCode(employeeCode);
    }
}

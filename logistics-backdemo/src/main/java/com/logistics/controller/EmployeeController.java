package com.logistics.controller;

import com.logistics.service.EmployeeService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@ControllerAdvice
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping()
    public String addNewEmp(){

    }

    @RequestMapping(value = "/selectAllEmp",method = RequestMethod.GET)
    public Result selectAllEmp(@RequestParam("pageNum")int pageNum,@RequestParam("limit")int limit){
        return employeeService.selectAllEmp(pageNum,limit);
    }
}

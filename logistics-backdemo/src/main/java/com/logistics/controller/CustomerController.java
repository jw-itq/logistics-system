package com.logistics.controller;

import com.logistics.pojo.Customerinfo;
import com.logistics.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@ControllerAdvice
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/selectAllCusCode")
    public List<String> selectAllCusCode(){
        List<String> result = customerService.selectAllCusCode();
        return result;
    }

    @GetMapping(value = "/selectCusByCode/{customerCode}")
    public Customerinfo selectCusByCode(@PathVariable("customerCode") String customerCode){
        Customerinfo result = customerService.selectCusByCode(customerCode);
        return result;
    }
}

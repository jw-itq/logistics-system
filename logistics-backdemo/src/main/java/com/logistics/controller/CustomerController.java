package com.logistics.controller;

import com.logistics.pojo.Customerinfo;
import com.logistics.service.CustomerService;
import com.logistics.util.Result;
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

    @RequestMapping(value = "/selectAllCus",method = RequestMethod.GET)
    public Result selectAllCus(@RequestParam("pageNum")int pageNum,@RequestParam("limit")int limit){
        return customerService.selectAllCus(pageNum,limit);
    }

    @RequestMapping(value = "/deleteCus/{customerCode}",method = RequestMethod.DELETE)
    public String deleteCus(@PathVariable("customerCode")String customerCode){
        return customerService.deleteCus(customerCode);
    }

    @RequestMapping(value = "/updateCustomerInfo/{customerCode}",method = RequestMethod.PUT)
    public String updateCustomerInfo(@PathVariable("customerCode")String customerCode,Customerinfo customerinfo){
        return customerService.updateCustomerInfo(customerCode,customerinfo);
    }

    @RequestMapping(value = "/addCus",method = RequestMethod.POST)
    public String addCus(Customerinfo customerinfo){
        return customerService.addCus(customerinfo);
    }
}

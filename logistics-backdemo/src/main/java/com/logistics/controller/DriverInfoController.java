package com.logistics.controller;

import com.logistics.service.DriverInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/driverInfo")
public class DriverInfoController {

    @Autowired
    private DriverInfoService driverInfoService;

    @RequestMapping(value = "/selectAllId",method = RequestMethod.GET)
    public List<String> selectAllId(){
        return driverInfoService.selectAllId();
    }
}

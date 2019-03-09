package com.logistics.controller;

import com.logistics.pojo.Driverinfo;
import com.logistics.service.DriverService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/driverInfo")
@RestController
@CrossOrigin
@ControllerAdvice
public class DriverController {

    @Autowired
    private DriverService driverService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Driverinfo driverinfo){
        return driverService.add(driverinfo);
    }

    @RequestMapping(value = "/selectAllByPage",method = RequestMethod.GET)
    public Result selectAllByPage(@RequestParam("pageNum")int pageNum,@RequestParam("limit")int limit){
        return driverService.selectAllByPage(pageNum,limit);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteDriverById(@PathVariable("id")String id){
        return driverService.deleteDriverById(id);
    }

    @RequestMapping(value = "/selectById/{driverId}",method = RequestMethod.GET)
    public Driverinfo selectById(@PathVariable("driverId")String driverId){
        return driverService.selectById(driverId);
    }

    @RequestMapping(value = "/update/{driverId}",method = RequestMethod.PUT)
    public String updateById(@PathVariable("driverId")String driverId,Driverinfo driverinfo){
        return driverService.updateById(driverId,driverinfo);
    }
}

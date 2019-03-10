package com.logistics.controller;

import com.logistics.pojo.Driverinfo;
import com.logistics.service.DriverInfoService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/driverInfo")
@ControllerAdvice
public class DriverInfoController {

    @Autowired
    private DriverInfoService driverInfoService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Driverinfo driverinfo){
        return driverInfoService.add(driverinfo);
    }

    @RequestMapping(value = "/selectAllByPage",method = RequestMethod.GET)
    public Result selectAllByPage(@RequestParam("pageNum")int pageNum, @RequestParam("limit")int limit){
        return driverInfoService.selectAllByPage(pageNum,limit);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteDriverById(@PathVariable("id")String id){
        return driverInfoService.deleteDriverById(id);
    }

    @RequestMapping(value = "/selectById/{driverId}",method = RequestMethod.GET)
    public Driverinfo selectById(@PathVariable("driverId")String driverId){
        return driverInfoService.selectById(driverId);
    }

    @RequestMapping(value = "/update/{driverId}",method = RequestMethod.PUT)
    public String updateById(@PathVariable("driverId")String driverId,Driverinfo driverinfo){
        return driverInfoService.updateById(driverId,driverinfo);
    }

    @RequestMapping(value = "/selectAllId",method = RequestMethod.GET)
    public List<String> selectAllId(){
        return driverInfoService.selectAllId();
    }

}

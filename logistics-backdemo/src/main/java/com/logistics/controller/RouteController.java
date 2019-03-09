package com.logistics.controller;

import com.logistics.pojo.Cityexpand;
import com.logistics.pojo.Routeinfo;
import com.logistics.service.CityExpandService;
import com.logistics.service.RouteService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/route")
@ControllerAdvice
public class RouteController extends ReturnType{

    @Autowired
    private CityExpandService cityExpandService;

    @Autowired
    private RouteService routeService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addExpand(Cityexpand cityexpand){
        boolean flag = cityExpandService.addExpand(cityexpand);
        if(flag){
            routeService.generateRoute();
            return SUCCESS;
        }
        return ERROR;
    }

    @RequestMapping(value = "/findAllRoutes",method = RequestMethod.GET)
    public List<Routeinfo> findAllRouteInfo(){
        return routeService.findAllRouteInfos();
    }

    @RequestMapping(value = "/findAllExpands",method = RequestMethod.GET)
    public Result findAllExpands(@RequestParam("pageNum") int pageNum,@RequestParam("limit") int limit){
        return cityExpandService.findAllExpands(pageNum,limit);
    }

    @RequestMapping(value = "/delete/{cityId}",method = RequestMethod.DELETE)
    public String deleteExpandsById(@PathVariable("cityId") String cityId){
        return cityExpandService.deleteExpandsById(cityId);
    }

    @RequestMapping(value = "/update/{expandId}",method = RequestMethod.PUT)
    public String updateExpandById(@PathVariable(value = "expandId") int expandId,Cityexpand cityexpand){
        return cityExpandService.updateExpandById(expandId,cityexpand);
    }

    @RequestMapping(value = "/findRouteByCode/{start}",method = RequestMethod.GET)
    public List<Routeinfo> findRouteByCode(@PathVariable("start") String startLoadstation){
        System.out.println("这里的数据是："+startLoadstation);
        return routeService.findRouteByCode(startLoadstation);
    }

    @RequestMapping(value = "/startRouteinfo",method = RequestMethod.GET)
    public List<Routeinfo> startRouteinfo(){
        return routeService.startRoutInfos();
    }


}

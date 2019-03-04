package com.logistics.controller;

import com.logistics.pojo.Area;
import com.logistics.service.AreaService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@ControllerAdvice
public class AreaController extends ReturnType{

    @Autowired
    private AreaService areaService;

    @GetMapping(value = "/getchildarea",produces = "application/json")
    public List<Area> findAreaByParentId(int parent_id){
        List<Area> list = areaService.findAreaByParentId(parent_id);
        System.out.println(list.toString());
        return list;
    }
}

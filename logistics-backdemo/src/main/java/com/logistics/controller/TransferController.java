package com.logistics.controller;

import com.logistics.pojo.Transfercominfo;
import com.logistics.service.TransferService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ControllerAdvice
@RequestMapping(value = "/transfer")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addTransferCompany(Transfercominfo transfercominfo){
        return transferService.add(transfercominfo);
    }

    @RequestMapping(value = "/findByPage",method = RequestMethod.GET)
    public Result findByPage(@RequestParam("pageNum")int pageNum,@RequestParam("limit")int limit){
        return transferService.findByPage(pageNum,limit);
    }
}

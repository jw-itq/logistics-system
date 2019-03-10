package com.logistics.controller;

import com.logistics.pojo.Callbackinfo;
import com.logistics.service.CallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@ControllerAdvice
@RequestMapping(value = "/callback")
public class CallbackController {

    @Autowired
    private CallbackService callbackService;

    @RequestMapping(value = "/add/{goodsBillId}",method = RequestMethod.POST)
    public String addInfo(@PathVariable("goodsBillId")String goodsBillId, Callbackinfo callbackinfo){
        return callbackService.addInfo(callbackinfo);
    }

    @RequestMapping(value = "/findDetail/{goodsBillId}/{type}",method = RequestMethod.GET)
    public Callbackinfo findDetail(@PathVariable("goodsBillId")String goodsBillId,@PathVariable("type")String type){
        return callbackService.findDetail(goodsBillId,type);
    }
}

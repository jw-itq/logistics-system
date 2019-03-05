package com.logistics.controller;

import com.logistics.pojo.Cargoreceiptdetail;
import com.logistics.pojo.Goodsbill;
import com.logistics.service.GoodsBillService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@ControllerAdvice
@RequestMapping(value = "/goodsBill")
public class GoodsBillController extends ReturnType{

    @Autowired
    private GoodsBillService goodsBillService;

    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,false));
    }

    @PostMapping(value = "/add",produces = "application/json")
    public Map<?,?> add(Goodsbill goodsbill){
        System.out.println(goodsbill.toString());
        return goodsBillService.save(goodsbill);
    }

    //@PostMapping(value = "/addGoods/{goodsBillCode}",produces = "application/json")
    @RequestMapping(value = "/addGoods/{goodsBillCode}",produces = "application/json",method = RequestMethod.POST)
    public Map<?,?> addGoods(@PathVariable("goodsBillCode") String goodsBillCode, Cargoreceiptdetail cargoreceiptdetail){
        boolean flag = goodsBillService.addGoods(goodsBillCode,cargoreceiptdetail);
        Map<String,String> map = new HashMap<>();
        if(flag){
            map.put("STATUS",SUCCESS);
            return map;
        }
        map.put("ERROR",ERROR);
        return map;
    }

    @RequestMapping(value = "/selectByEvent/{eventName}",method = RequestMethod.GET)
    public Result selectByEvent(@PathVariable("eventName") String eventName,@RequestParam("pageNum") int pageNum,@RequestParam("limit") int limit){
        return goodsBillService.selectByEvent(eventName,pageNum,limit);
    }

    @RequestMapping(value = "/selectByEvent",method = RequestMethod.GET)
    public Result selectByEvent(@RequestParam("pageNum") int pageNum,@RequestParam("limit") int limit){
        return goodsBillService.selectByEvent(pageNum,limit);
    }

    @RequestMapping(value = "/selectByCode/{goodsBillCode}",method = RequestMethod.GET)
    public Goodsbill selectByCode(@PathVariable("goodsBillCode") String goodsBillCode){
        return goodsBillService.selectByCode(goodsBillCode);
    }

    @RequestMapping(value = "updateByCode/{goodsBillCode}",method = RequestMethod.PUT)
    public String updateByCode(@PathVariable("goodsBillCode") String goodsBillCode,Goodsbill goodsbill){
        return goodsBillService.updateByCode(goodsBillCode,goodsbill);
    }

    @RequestMapping(value = "deleteByCode/{goodsBillCode}",method = RequestMethod.PUT)
    public String deleteByCode(@PathVariable("goodsBillCode") String goodsBillCode){
        return goodsBillService.deleteByCode(goodsBillCode);
    }
}

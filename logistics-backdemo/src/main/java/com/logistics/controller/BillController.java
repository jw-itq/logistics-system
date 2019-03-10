package com.logistics.controller;

import com.logistics.pojo.Billrelease;
import com.logistics.pojo.Goodsreceiptinfo;
import com.logistics.service.BillService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping(value = "/findNotRelease",method = RequestMethod.GET)
    public Result findNotRelease(@RequestParam("pageNum") int pageNum,@RequestParam("limit") int limit){
        return billService.findNotRelease(pageNum,limit);
    }

    @RequestMapping(value = "/findByPage",method = RequestMethod.GET)
    public Result findByPage(@RequestParam("pageNum") int pageNum,@RequestParam("limit") int limit){
        return billService.findByPage(pageNum,limit);
    }

    @RequestMapping(value = "/addRelease/{billCode}",method = RequestMethod.POST)
    public String addRelease(@PathVariable("billCode") String billCode, Billrelease billrelease){
        return billService.addRelease(billCode,billrelease);
    }

    @RequestMapping(value = "/addArrived/{goodsRevertBillCode}",method = RequestMethod.POST)
    public String addArrived(@PathVariable("goodsRevertBillCode")String goodsRevertBillCode, Goodsreceiptinfo goodsreceiptinfo){
        return billService.addArrived(goodsRevertBillCode,goodsreceiptinfo);
    }
}

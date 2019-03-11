package com.logistics.controller;

import com.logistics.pojo.Customerreceiptinfo;
import com.logistics.pojo.Goodsbill;
import com.logistics.pojo.Transfercominfo;
import com.logistics.pojo.Transferinfo;
import com.logistics.service.TransferService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@ControllerAdvice
@RequestMapping(value = "/transfer")
public class TransferController extends ReturnType{

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

    @RequestMapping(value = "/arriveGoods/{driverId}",method = RequestMethod.GET)
    public Result arriveGoods(@PathVariable("driverId")String driverId, @RequestParam("pageNum")int pageNum,@RequestParam("limit")int limit){
        return transferService.arriveGoods(driverId,pageNum,limit);
    }

    @RequestMapping(value = "/findCusRes/{customerCode}",method = RequestMethod.GET)
    public Result findCusRes(@PathVariable("customerCode")String customerCode,int pageNum,int limit){
        return transferService.findCusRes(customerCode,pageNum,limit);
    }

    @RequestMapping(value = "/findOnWayBills",method = RequestMethod.GET)
    public Result findOnWayBills(){
        return transferService.findOnWayBills();
    }

    @RequestMapping(value = "/addCusRec",method = RequestMethod.POST)
    public String addCusRes(Customerreceiptinfo customerreceiptinfo){
        return transferService.addCusRes(customerreceiptinfo);
    }

    @RequestMapping(value = "/addInfo/{goodsBillCode}", method = RequestMethod.POST)
    public String addTransfer(@PathVariable("goodsBillCode") String goodsBillCode, Transferinfo transferInfo) {
        boolean flag = false;
        flag = transferService.addTransferInfo(transferInfo);
        if (!flag) {
            return ERROR;
        }
        return SUCCESS;
    }

    @RequestMapping(value = "/transferGoods/{driverId}", method = RequestMethod.GET)
    public Result transferGoods(@PathVariable("driverId") String driverId) {
        return transferService.transferGoods("已中转", driverId);
    }

    @RequestMapping(value = "/detail/{goodsBillCode}", method = RequestMethod.GET)
    public Transfercominfo detail(@PathVariable("goodsBillCode") String goodsBillCode) {

        Transfercominfo transferComInfo = transferService.findByGoodsBillCode(goodsBillCode);
        return transferComInfo;

    }

    @RequestMapping(value = "/findInfoByPage", method = RequestMethod.GET)
    public Result findInfoByPage(@RequestParam("pageNum") int pageNum, @RequestParam("limit") int limit) {
        return transferService.findInfoByPage(pageNum,limit);
    }
}

package com.logistics.controller;

import com.logistics.pojo.Cargoreceipt;
import com.logistics.pojo.Goodsbill;
import com.logistics.service.CargoReceiptService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/vehicle")
@ControllerAdvice
public class CargoRecetiptController{

    @Autowired
    private CargoReceiptService cargoReceiptService;

    @RequestMapping(value = "/selectLeftCodes",method = RequestMethod.GET)
    public List<?> selectLeftCodes(){
        return cargoReceiptService.selectLeftCodes();
    }

    @RequestMapping(value = "/findGoodsBill/{receiptCode}",method = RequestMethod.GET)
    public Goodsbill findGoodsBill(@PathVariable("receiptCode") String receiptCode){
        return cargoReceiptService.findGoodsBill(receiptCode);
    }

    @RequestMapping(value = "/add/{routeInfoId}",method = RequestMethod.POST)
    public String add(@PathVariable("routeInfoId") int routeInfoId, Cargoreceipt cargoreceipt){
        return cargoReceiptService.add(routeInfoId,cargoreceipt);
    }

    @RequestMapping(value = "/select/{backBillState}",method = RequestMethod.GET)
    public Result selectReceiptByState(@PathVariable("backBillState") String backBillState,@RequestParam("pageNum") int pageNum,@RequestParam("limit")int limit){
        return cargoReceiptService.selectReceiptByState(backBillState,pageNum,limit);
    }

    @RequestMapping(value = "/selectByCode/{goodsRevertBillCode}",method = RequestMethod.GET)
    public Cargoreceipt selectReceiptByBillCode(@PathVariable("goodsRevertBillCode")String goodsRevertBillCode){
        return cargoReceiptService.selectReceiptByBillCode(goodsRevertBillCode);
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public String updateReceiptByBillCode(Cargoreceipt cargoreceipt){
        return cargoReceiptService.updateReceiptByBillCode(cargoreceipt);
    }

    @RequestMapping(value = "/submit",method = RequestMethod.PUT)
    public String submit(Cargoreceipt cargoreceipt){
        boolean result = cargoReceiptService.submit(cargoreceipt);
        if(result){
            return "SUCCESS";
        }
        return "ERROR";
    }

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public Result selectRecetiptAll(@RequestParam("pageNum") int pageNum,@RequestParam("limit") int limit){
        return cargoReceiptService.selectRecetiptAll(pageNum,limit);
    }

    @RequestMapping(value = "/delete/{goodsRevertBillCode}",method = RequestMethod.DELETE)
    public String deleteReceiptByBillCode(@PathVariable("goodsRevertBillCode")String goodsRevertBillCode){
        return cargoReceiptService.deleteReceiptByBillCode(goodsRevertBillCode);
    }
}

package com.logistics.controller;

import com.logistics.pojo.Cargoreceipt;
import com.logistics.pojo.Goodsbill;
import com.logistics.service.CargoReceiptService;
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
}

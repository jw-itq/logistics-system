package com.logistics.controller;

import com.logistics.pojo.*;
import com.logistics.service.MoniterService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/monitor")
@ControllerAdvice
public class MoniterController {

    @Autowired
    private MoniterService moniterService;

    /**
     * 预期未到运单
     */
    @RequestMapping(value = "/selectUnArrive", method = RequestMethod.GET)
    public Result selectUnArrive() {
        List<Goodsbill> goodsbills = moniterService.selectAllUnArrive();
        Result result = new Result(200, "SUCCESS", goodsbills.size(), goodsbills);
        return result;
    }

    /**
     * 滞留未取运单
     */
    @RequestMapping(value = "/selectUnTake", method = RequestMethod.GET)
    public Result selectUnTake() {

        List<Goodsbill> goodsbills = moniterService.selectAllUnTake();
        Result result = new Result(200, "SUCCESS", goodsbills.size(), goodsbills);
        return result;
    }

    /**
     * 打印客户用量
     */
    @RequestMapping(value = "/selectCusAcount", method = RequestMethod.GET)
    public Result selectCusAcount() {

        List<Customeramount> customerAmounts = moniterService.selectAllCusAcount();
        Result result = new Result(200, "SUCCESS", customerAmounts.size(), customerAmounts);
        return result;
    }

    /**
     * 打印司机用量
     */
    @RequestMapping(value = "/selectDriAcount", method = RequestMethod.GET)
    public Result selectDriAcount() {

        List<Driveramount> driverAmounts = moniterService.selectAllDriAcount();
        Result result = new Result(200, "SUCCESS", driverAmounts.size(), driverAmounts);
        return result;
    }

    /**
     * 打印往来业务用量
     */
    @RequestMapping(value = "/printContactsService", method = RequestMethod.GET)
    public Result printContactsService() {

        List<Contactsservice> contactsServices = moniterService.printAllContactsService();
        Result result = new Result(200, "SUCCESS", contactsServices.size(), contactsServices);

        return result;
    }

    /**
     * 打印往来业务用量-查询
     */
    @RequestMapping(value = "/selectContactsServiceByCode/{goodsBillCode}", method = RequestMethod.GET)
    public Contactsservice selectContactsServiceByCode(@PathVariable("goodsBillCode") String goodsBillCode) {
        System.out.println("controller: " + goodsBillCode);
        Contactsservice contactsService = moniterService.selectByGoodsBillCode(goodsBillCode);
        return contactsService;
    }

    /**
     * 打印专线整体
     */
    @RequestMapping(value = "/printLineOverall", method = RequestMethod.GET)
    public Result printLineOverall() {

        List<Lineoverall> lineOveralls = moniterService.printAllLineOverall();
        Result result = new Result(200, "SUCCESS", lineOveralls.size(), lineOveralls);
        return result;
    }



    /**
     * 打印车辆成本
     */
    @RequestMapping(value = "/printCar", method = RequestMethod.GET)
    public Result printCar() {

        List<Carcost> carCosts = moniterService.printAllCarCost();
        Result result = new Result(200, "SUCCESS", carCosts.size(), carCosts);

        return result;
    }

    /**
     * 打印车辆成本-查询
     */
    @RequestMapping(value = "/selectCarCostByCode/{driverCode}", method = RequestMethod.GET)
    public Carcost selectCarCostByCode(@PathVariable("driverCode") String driverCode) {
        Carcost carCost = moniterService.selectByCode(driverCode);
        return carCost;
    }
}

package com.logistics.controller;

import com.logistics.pojo.Customerbillclear;
import com.logistics.pojo.Driverclear;
import com.logistics.pojo.Extraclear;
import com.logistics.pojo.Proxyfeeclear;
import com.logistics.service.ClearService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@ControllerAdvice
@RequestMapping(value = "/clear")
public class ClearController {

    @Autowired
    private ClearService clearService;


    /**
     * 司机结算-返回未结的所有实体(实体中能填的属性都填好)
     */
    @RequestMapping(value = "/selectClearDri/{eventName}", method = RequestMethod.GET)
    public Result selectClearDri(@PathVariable("eventName") String eventName) {
        return clearService.selectDrclear(eventName);
    }

    /**
     * 司机结算-通过订单编号查询单个实体的已填所有信息
     */
    @RequestMapping(value = "/selectDriverClearByCode/{goodsBillCode}", method = RequestMethod.GET)
    public Driverclear selectDriverClearByCode(@PathVariable("goodsBillCode") String goodsBillCode) {
        return clearService.selectByCargoReceiptCode(goodsBillCode);
    }

    /**
     * 司机结算（前台返回一个完整的实体）
     */
    @RequestMapping(value = "/addDriClear", method = RequestMethod.PUT, produces = "application/json")
    public String addDriClear(Driverclear driverClear) {
        return clearService.driClear(driverClear);
    }

    /**
     * 客户结算-返回未结的所有实体(实体中能填的属性都填好)
     */
    @RequestMapping(value = "/selectclearCus/{eventName}", method = RequestMethod.GET)
    public Result selecClearCus(@PathVariable("eventName") String eventName) {
        return clearService.selectCusclear(eventName);
    }

    /**
     * 客户结算-通过订单编号查询单个实体的已填所有信息
     */
    @RequestMapping(value = "/selectCustomerBillClearByCode/{goodsBillCode}", method = RequestMethod.GET)
    public Customerbillclear selectCustomerBillClearByCode(@PathVariable("goodsBillCode") String goodsBillCode) {
        return clearService.selectByBillCode(goodsBillCode);
    }

    /**
     * 客户结算（前台返回一个完整的实体）
     */
    @RequestMapping(value = "/addCusClear", method = RequestMethod.PUT, produces = "application/json")
    public String addCusClear(Customerbillclear customerBillClear) {
        return clearService.cusClear(customerBillClear);
    }

    /**
     * 代收结算-返回未结的所有实体(实体中能填的属性都填好)
     */
    @RequestMapping(value = "/selectClearHelp/{eventName}", method = RequestMethod.GET)
    public Result selectClearHelp(@PathVariable("eventName") String eventName) {
        return clearService.selectHelpclear(eventName);
    }

    /**
     * 代收结算-通过订单编号查询单个实体的已填所有信息
     */
    @RequestMapping(value = "/selectHelpBillClearByCode/{goodsBillCode}", method = RequestMethod.GET)
    public Proxyfeeclear selectHelpBillClearByCode(@PathVariable("goodsBillCode") String goodsBillCode) {
        return clearService.selectByGoodsBillCode(goodsBillCode);
    }

    /**
     * 代收结算（前台返回一个完整的实体）
     */
    @RequestMapping(value = "/addCHelpClear", method = RequestMethod.PUT, produces = "application/json")
    public String addCHelpClear(Proxyfeeclear proxyFeeClear) {
        return clearService.helpClear(proxyFeeClear);
    }

    /**
     * 杂费结算  add
     */
    @RequestMapping(value = "/addExtraClear", method = RequestMethod.POST)
    public String addExtraClear(Extraclear extraClear) {
        return clearService.saveExtraClear(extraClear);
    }

    /**
     * 杂费结算  select
     */
    @RequestMapping(value = "/selectAllExtraClear", method = RequestMethod.GET)
    public Result selectAllExtraClear(@RequestParam("pageNum") int pageNum, @RequestParam("limit") int limit) {
        return clearService.selectAllExtraClearByPage(pageNum,limit);
    }
}

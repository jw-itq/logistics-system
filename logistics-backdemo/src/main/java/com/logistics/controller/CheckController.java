package com.logistics.controller;

import com.logistics.pojo.*;
import com.logistics.service.CheckService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ControllerAdvice
@RequestMapping(value = "/check")
public class CheckController extends ReturnType {

	@Autowired
	private CheckService checkService;
	
	/**
	 * 录入营业外收入
	 */
	@RequestMapping(value = "/addExtraIncome", method = RequestMethod.POST, produces = "application/json")
	public String add(Extraincome extraIncome) {
		boolean flag = false;
		flag = checkService.save(extraIncome);
		if (!flag) {
			return ERROR;
		}
		return SUCCESS;
	}
	
	/**
	 * 查询所有营业外收入
	 */
    @RequestMapping(value = "/selectExtraIncome", method = RequestMethod.GET)
	public Result selectAllExtra(@RequestParam("pageNum") int pageNum, @RequestParam("limit") int limit) {
		return checkService.selectAllExtra(pageNum,limit);
	}
    
	/**
	 * 录入财务费用
	 */
	@RequestMapping(value = "/addFinanceFee", method = RequestMethod.POST, produces = "application/json")
	public String add(Financefee financeFee) {
		boolean flag = false;
		flag = checkService.save(financeFee);
		if (!flag) {
			return ERROR;
		}
		return SUCCESS;	
	}
	
	/**
	 * 查询所有财务费用
	 */
    @RequestMapping(value = "/selectFinanceFee", method = RequestMethod.GET)
	public Result selectAllFinance(@RequestParam("pageNum") int pageNum, @RequestParam("limit") int limit) {
		return checkService.selectAllFinance(pageNum,limit);
	}
    
    /**
	 * 录入管理费用
	 */
	@RequestMapping(value = "/addManageFee", method = RequestMethod.POST, produces = "application/json")
	public String add(Managefee manageFee) {
		boolean flag = false;
		flag = checkService.save(manageFee);
		if (!flag) {
			return ERROR;
		}
		return SUCCESS;
	}
	
	/**
	 * 查询所有管理费用
	 */
    @RequestMapping(value = "/selectManageFee", method = RequestMethod.GET)
	public Result selectAllManageFee(@RequestParam("pageNum") int pageNum, @RequestParam("limit") int limit) {
		return checkService.selectAllManage(pageNum,limit);
	}
    
    /**
   	 * 根据id查询管理费用
   	 */
    @RequestMapping(value = "/findManageFee/{id}", method = RequestMethod.GET)
   	public Managefee selectByMId(@PathVariable("id")int id) {
    	Managefee manageFee = checkService.selectByMId(id);
   		return manageFee;		
   	}
    
	/**
	 * 录入员工工资
	 */
	@RequestMapping(value = "/addWage", method = RequestMethod.POST, produces = "application/json")
	public String add(Employeewage wage) {
		boolean flag = false;
		flag = checkService.save(wage);
		if (!flag) {
			return ERROR;
		}
		return SUCCESS;
	}
	
    /**
	 * 查询所有员工工资
	 */
    @RequestMapping(value = "/selectWage", method = RequestMethod.GET)
	public Result selectAllWage(@RequestParam("pageNum") int pageNum, @RequestParam("limit") int limit) {
		return checkService.selectAllWage(pageNum,limit);
	}
    
    /**
	 * 根据员工编号查询员工工资
	 */
    @RequestMapping(value = "/findWage/{employeeCode}", method = RequestMethod.GET)
	public Employeewage selectByEmployeeCode(@PathVariable("employeeCode") String employeeCode) {
    	Employeewage wage= checkService.selectByEmployeeCode(employeeCode);
		return wage;		
	}
    
    /**
	 * 查询当前月报
	 */
    @RequestMapping(value = "/selectIncomeMonthly", method = RequestMethod.GET)
	public Incomemonthlytemp selectAll() {
		Incomemonthlytemp incomeMonthlyTemp = checkService.selectAll();
		return incomeMonthlyTemp;	
	}
}

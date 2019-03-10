package com.logistics.service;

import com.logistics.pojo.*;
import com.logistics.util.Result;

import java.util.List;

public interface CheckService {
    public boolean save(Extraincome extraIncome);

    public Result selectAllExtra(int pageNum, int limit);

    public List<Extraincome> selectByIncomeMonth(String incomeMonth);


    public List<Cargoreceipt> selectBySignTime(String beginTime, String endTime);


    public boolean save(Financefee financeFee);

    public Result selectAllFinance(int pageNum,int limit);

    public List<Financefee> selectByFPayoutMonth(String payoutMonth);


    public boolean save(Managefee manageFee);

    public Result selectAllManage(int pageNum,int limit);

    public List<Managefee> selectByMPayoutMonth(String payoutMonth);

    public Managefee selectByMId(int id);


    public boolean save(Employeewage employeeWage);

    public Result selectAllWage(int pageNum,int limit);

    public List<Employeewage> selectByDate(String beginTime,String endTime);

    public Employeewage selectByEmployeeCode(String employeeCode);


    public List<Extraclear> selectByBalanceDate(String beginTime,String endTime);


    public Incomemonthlytemp save();

    public Incomemonthlytemp selectAll();

    public Incomemonthlytemp selectByMonth(String month);
}

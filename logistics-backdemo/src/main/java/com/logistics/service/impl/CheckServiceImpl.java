package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.*;
import com.logistics.pojo.*;
import com.logistics.service.CheckService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

@Service(value = "checkService")
@Transactional(propagation = Propagation.REQUIRED)
public class CheckServiceImpl implements CheckService {

    @Autowired
    private ExtraincomeMapper extraincomeMapper;

    @Autowired
    private CargoreceiptMapper cargoreceiptMapper;

    @Autowired
    private FinancefeeMapper financefeeMapper;

    @Autowired
    private ManagefeeMapper managefeeMapper;

    @Autowired
    private EmployeewageMapper employeewageMapper;

    @Autowired
    private ExtraclearMapper extraclearMapper;

    @Autowired
    private IncomemonthlytempMapper incomemonthlytempMapper;

    @Override
    public boolean save(Extraincome extraIncome) {
        try {
            extraincomeMapper.insert(extraIncome);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("营业外收入添加失败");
            return false;
        }
    }

    @Override
    public Result selectAllExtra(int pageNum, int limit) {
        ExtraincomeExample extraincomeExample = new ExtraincomeExample();
        PageHelper.startPage(pageNum,limit);
        List<Extraincome> list = extraincomeMapper.selectByExample(extraincomeExample);
        PageInfo<Extraincome> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    @Override
    public List<Extraincome> selectByIncomeMonth(String incomeMonth) {
        ExtraincomeExample extraincomeExample = new ExtraincomeExample();
        ExtraincomeExample.Criteria criteria = extraincomeExample.createCriteria();
        criteria.andIncomeMonthEqualTo(incomeMonth);
        return extraincomeMapper.selectByExample(extraincomeExample);
    }

    @Override
    public List<Cargoreceipt> selectBySignTime(String beginTime, String endTime) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        java.util.Date date1 = null;
        try {
            date = df.parse(beginTime);
            date1 = df.parse(endTime);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        CargoreceiptExample cargoreceiptExample = new CargoreceiptExample();
        CargoreceiptExample.Criteria criteria = cargoreceiptExample.createCriteria();
        criteria.andSignTimeBetween(date,date1);
        return cargoreceiptMapper.selectByExample(cargoreceiptExample);
    }

    @Override
    public boolean save(Financefee financeFee) {
        try {
            financefeeMapper.insert(financeFee);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Result selectAllFinance(int pageNum, int limit) {
        FinancefeeExample financefeeExample = new FinancefeeExample();
        List<Financefee> list = financefeeMapper.selectByExample(financefeeExample);
        PageHelper.startPage(pageNum,limit);
        PageInfo<Financefee> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    @Override
    public List<Financefee> selectByFPayoutMonth(String payoutMonth) {
        FinancefeeExample financefeeExample = new FinancefeeExample();
        FinancefeeExample.Criteria criteria = financefeeExample.createCriteria();
        criteria.andPayoutMonthEqualTo(payoutMonth);
        return financefeeMapper.selectByExample(financefeeExample);
    }

    @Override
    public boolean save(Managefee manageFee) {
        try {
            managefeeMapper.insert(manageFee);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("管理费用添加失败");
            return false;
        }
    }

    @Override
    public Result selectAllManage(int pageNum, int limit) {
        ManagefeeExample managefeeExample = new ManagefeeExample();
        List<Managefee> list = managefeeMapper.selectByExample(managefeeExample);
        PageHelper.startPage(pageNum,limit);
        PageInfo<Managefee> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    @Override
    public List<Managefee> selectByMPayoutMonth(String payoutMonth) {
        ManagefeeExample managefeeExample = new ManagefeeExample();
        ManagefeeExample.Criteria criteria = managefeeExample.createCriteria();
        criteria.andPayoutMonthEqualTo(payoutMonth);
        return managefeeMapper.selectByExample(managefeeExample);
    }

    @Override
    public Managefee selectByMId(int id) {
        return managefeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean save(Employeewage employeeWage) {
        try {
            employeewageMapper.insert(employeeWage);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Result selectAllWage(int pageNum, int limit) {
        EmployeewageExample employeewageExample = new EmployeewageExample();
        List<Employeewage> list = employeewageMapper.selectByExample(employeewageExample);
        PageHelper.startPage(pageNum,limit);
        PageInfo<Employeewage> pageInfo = new PageInfo<>(list);
        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    @Override
    public List<Employeewage> selectByDate(String beginTime, String endTime) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        java.util.Date date1 = null;
        try {
            date = df.parse(beginTime);
            date1 = df.parse(endTime);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        EmployeewageExample employeewageExample = new EmployeewageExample();
        EmployeewageExample.Criteria criteria = employeewageExample.createCriteria();
        criteria.andDateBetween(date,date1);
        return employeewageMapper.selectByExample(employeewageExample);
    }

    @Override
    public Employeewage selectByEmployeeCode(String employeeCode) {
        EmployeewageExample employeewageExample = new EmployeewageExample();
        EmployeewageExample.Criteria criteria = employeewageExample.createCriteria();
        criteria.andEmployeeCodeEqualTo(employeeCode);
        List<Employeewage> list = employeewageMapper.selectByExample(employeewageExample);
        return list!=null?list.get(0):null;
    }

    @Override
    public List<Extraclear> selectByBalanceDate(String beginTime, String endTime) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        java.util.Date date1 = null;
        try {
            date = df.parse(beginTime);
            date1 = df.parse(endTime);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ExtraclearExample extraclearExample = new ExtraclearExample();
        ExtraclearExample.Criteria criteria = extraclearExample.createCriteria();
        criteria.andBalanceDateBetween(date,date1);
        return extraclearMapper.selectByExample(extraclearExample);
    }

    @Override
    public Incomemonthlytemp save() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));
        String cMonth = String.valueOf(calendar.get(Calendar.MONTH) + 1);
        String cYear = String.valueOf(calendar.get(Calendar.YEAR));
        if (cMonth.length() == 1) {
            cMonth = "0" + cMonth;
        }
        String cTime = cYear + "-" + cMonth;
        String bTime = cTime + "-01";
        String eTime = cTime + "-31";
        double carriageMoney = 0;
        double insuranceMoney = 0;
        double unbizIncome = 0;
        double fFee = 0;
        double officeFee = 0;
        double houseRent = 0;
        double waterElecFee = 0;
        double phoneFee = 0;
        double other = 0;
        double wage = 0;
        double balanceMoney = 0;
        double carCarriage = 0;
        double payOut = 0;
        double income = 0;
        // 运费、保险费（营业收入）
        List<Cargoreceipt> cargoReceipts = selectBySignTime(bTime, eTime);
        System.out.println(1);
        for (int i = 0; i < cargoReceipts.size(); i++) {
            carriageMoney += cargoReceipts.get(i).getAllCarriage();
            insuranceMoney += cargoReceipts.get(i).getInsurance();
        }
        // 非营业收入
        List<Extraincome> extraIncomes = selectByIncomeMonth(cTime);
        System.out.println(1);
        for (int i = 0; i < extraIncomes.size(); i++) {
            unbizIncome += extraIncomes.get(i).getMoney();
        }
        // 收入
        income = carriageMoney + insuranceMoney + unbizIncome;
        // 财务费用
        List<Financefee> financeFees = selectByFPayoutMonth(cTime);
        System.out.println(1);
        for (int i = 0; i < financeFees.size(); i++) {
            fFee += financeFees.get(i).getFee();
        }
        // 管理费用
        List<Managefee> manageFees = selectByMPayoutMonth(cTime);
        System.out.println(1);
        for (int i = 0; i < manageFees.size(); i++) {
            officeFee += manageFees.get(i).getOfficeFee();
            houseRent += manageFees.get(i).getHouseRent();
            waterElecFee += manageFees.get(i).getWaterElecFee();
            phoneFee += manageFees.get(i).getPhoneFee();
            other += manageFees.get(i).getOtherPayout();
        }
        // 工资
        List<Employeewage> employeeWages = selectByDate(bTime, eTime);
        System.out.println(1);
        for (int i = 0; i < employeeWages.size(); i++) {
            wage += (employeeWages.get(i).getBasicWage() + employeeWages.get(i).getAllowance()
                    + employeeWages.get(i).getStationWage());
        }
        // 经营费用（搬运费、车运费）
        List<Extraclear> extraClears = selectByBalanceDate(bTime, eTime);
        System.out.println(1);
        for (int i = 0; i < extraClears.size(); i++) {
            balanceMoney += extraClears.get(i).getBalanceMoney();
        }
        carCarriage = 500;
        // 支出
        payOut = carCarriage + balanceMoney + wage + officeFee + houseRent + waterElecFee + phoneFee + officeFee + fFee;
        try {
            Incomemonthlytemp iMonthlyTemp = selectByMonth(cTime);
            if (iMonthlyTemp == null) {
                iMonthlyTemp = new Incomemonthlytemp();
            }
            iMonthlyTemp.setMonth(cTime);
            iMonthlyTemp.setCarriageMoney(carriageMoney);
            iMonthlyTemp.setInsuranceMoney(insuranceMoney);
            iMonthlyTemp.setBizIncome(insuranceMoney + carriageMoney);
            iMonthlyTemp.setUnbizIncome(unbizIncome);
            iMonthlyTemp.setIncome(income);
            iMonthlyTemp.setFinanceFee(fFee);
            iMonthlyTemp.setOfficeFee(officeFee);
            iMonthlyTemp.setHouseRent(houseRent);
            iMonthlyTemp.setWaterElecFee(waterElecFee);
            iMonthlyTemp.setPhoneFee(phoneFee);
            iMonthlyTemp.setOther(other);
            iMonthlyTemp.setManageFee(officeFee + houseRent + waterElecFee + phoneFee + other);
            iMonthlyTemp.setWage(wage);
            iMonthlyTemp.setConveyWage(balanceMoney);
            iMonthlyTemp.setCarCarriage(carCarriage);
            iMonthlyTemp.setBizFee(carCarriage + balanceMoney);
            iMonthlyTemp.setPayout(payOut);
            iMonthlyTemp.setProfit(income - payOut);

            incomemonthlytempMapper.updateByPrimaryKey(iMonthlyTemp);
            return iMonthlyTemp;
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
            System.err.println("月报信息添加失败");
            return null;
        }
    }

    @Override
    public Incomemonthlytemp selectAll() {
        return save();
    }

    @Override
    public Incomemonthlytemp selectByMonth(String month) {
        IncomemonthlytempExample incomemonthlytempExample = new IncomemonthlytempExample();
        IncomemonthlytempExample.Criteria criteria = incomemonthlytempExample.createCriteria();
        criteria.andMonthEqualTo(month);
        return incomemonthlytempMapper.selectByExample(incomemonthlytempExample).get(0);
    }
}

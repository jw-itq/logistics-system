package com.logistics.service;


import com.logistics.pojo.Customerinfo;
import com.logistics.util.Result;

import java.util.List;

public interface CustomerService {

    public List<String> selectAllCusCode();

    public Customerinfo selectCusByCode(String customerCode);

    public Result selectAllCus(int pageNum,int limit);

    public String deleteCus(String customerCode);

    public String addCus(Customerinfo customerinfo);

    public String updateCustomerInfo(String customerCode,Customerinfo customerinfo);
}

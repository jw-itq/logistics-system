package com.logistics.service;


import com.logistics.pojo.Customerinfo;

import java.util.List;

public interface CustomerService {

    public List<String> selectAllCusCode();

    public Customerinfo selectCusByCode(String customerCode);
}

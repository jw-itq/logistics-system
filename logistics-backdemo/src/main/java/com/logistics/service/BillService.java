package com.logistics.service;

import com.logistics.pojo.Billrelease;
import com.logistics.util.Result;

public interface BillService {
    public Result findNotRelease(int pageNum,int limit);

    public Result findByPage(int pageNum,int limit);

    public String addRelease(String billCode, Billrelease billrelease);
}
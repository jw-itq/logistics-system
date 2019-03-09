package com.logistics.service;

import com.logistics.pojo.Driverinfo;
import com.logistics.util.Result;

public interface DriverService {

    public String add(Driverinfo driverinfo);

    public Result selectAllByPage(int pageNum,int limit);

    public String deleteDriverById(String id);

    public Driverinfo selectById(String driverId);

    public String updateById(String id,Driverinfo driverinfo);
}

package com.logistics.service;

import com.logistics.pojo.Driverinfo;
import com.logistics.util.Result;

import java.util.List;

public interface DriverInfoService {

    public List<String> selectAllId();

    public String add(Driverinfo driverinfo);

    public Result selectAllByPage(int pageNum, int limit);

    public String deleteDriverById(String id);

    public Driverinfo selectById(String driverId);

    public String updateById(String id,Driverinfo driverinfo);
}

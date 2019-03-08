package com.logistics.service;

import com.logistics.pojo.Cityexpand;
import com.logistics.util.Result;

public interface CityExpandService {

    public boolean addExpand(Cityexpand cityexpand);

    public Result findAllExpands(int pageNum,int limit);

    public String deleteExpandsById(String cityId);

    public String updateExpandById(int expandId, Cityexpand cityexpand);
}

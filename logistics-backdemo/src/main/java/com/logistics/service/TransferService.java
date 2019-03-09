package com.logistics.service;

import com.logistics.pojo.Transfercominfo;
import com.logistics.pojo.Transferinfo;
import com.logistics.util.Result;

public interface TransferService {

    public String add(Transfercominfo transfercominfo);

    public Result findByPage(int pageNum,int limit);
}

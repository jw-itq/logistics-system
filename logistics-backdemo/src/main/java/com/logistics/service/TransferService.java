package com.logistics.service;

import com.logistics.pojo.Customerreceiptinfo;
import com.logistics.pojo.Transfercominfo;
import com.logistics.pojo.Transferinfo;
import com.logistics.util.Result;
import org.springframework.web.bind.annotation.PathVariable;

public interface TransferService {

    public String add(Transfercominfo transfercominfo);

    public Result findByPage(int pageNum,int limit);

    public Result arriveGoods(String driverId,int pageNum,int limit);

    public Result findCusRes(String customerCode, int pageNum, int limit);

    public Result findOnWayBills();

    public String addCusRes(Customerreceiptinfo customerreceiptinfo);

    public boolean addTransferInfo(Transferinfo transferinfo);

    public Result transferGoods(String type,String driverId);

    public Transfercominfo findByGoodsBillCode(String goodsBillCode);

    public Result findInfoByPage(int pageNum,int limit);
}

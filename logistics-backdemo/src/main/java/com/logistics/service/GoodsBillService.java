package com.logistics.service;

import com.logistics.pojo.Cargoreceiptdetail;
import com.logistics.pojo.Goodsbill;
import com.logistics.util.Result;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

public interface GoodsBillService {

    public Map<?,?> save(Goodsbill goodsbill);

    public boolean addGoods(String goodsBillCode, Cargoreceiptdetail cargoreceiptdetail);

    public Result selectByEvent(String eventNum,int pageNum,int limit);

    public Result selectByEvent(int pageNum,int limit);

    public Goodsbill selectByCode(String goodsBillCode);

    public String updateByCode(String goodsBillCode,Goodsbill goodsbill);

    public String deleteByCode(String goodsBillCode);

    public Result findInform(String billType,int pageNum,int limit);

    public Result findOldInform(String type,int pageNum,int limit);

    public Result findAllGot(int pageNum,int limit);
}

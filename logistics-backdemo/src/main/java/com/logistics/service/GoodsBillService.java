package com.logistics.service;

import com.logistics.pojo.Cargoreceiptdetail;
import com.logistics.pojo.Goodsbill;
import com.logistics.util.Result;

import java.util.Map;

public interface GoodsBillService {

    public Map<?,?> save(Goodsbill goodsbill);

    public boolean addGoods(String goodsBillCode, Cargoreceiptdetail cargoreceiptdetail);

    public Result selectByEvent(String eventNum,int pageNum,int limit);
}

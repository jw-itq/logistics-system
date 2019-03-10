package com.logistics.service;

import com.logistics.pojo.Customerbillclear;
import com.logistics.pojo.Driverclear;
import com.logistics.pojo.Extraclear;
import com.logistics.pojo.Proxyfeeclear;
import com.logistics.util.Result;

public interface ClearService {
    public Result selectDrclear(String eventName);

    public Driverclear selectByCargoReceiptCode(String goodsBillCode);

    public String driClear(Driverclear driverClear);

    public Result selectCusclear(String eventName);

    public Customerbillclear selectByBillCode(String goodsBillCode);

    public String cusClear(Customerbillclear customerBillClear);

    public Result selectHelpclear(String eventName);

    public Proxyfeeclear selectByGoodsBillCode(String goodsBillCode);

    public String helpClear(Proxyfeeclear proxyFeeClear);

    public String saveExtraClear(Extraclear extraClear);

    public Result selectAllExtraClearByPage(int pageNum,int limit);
}

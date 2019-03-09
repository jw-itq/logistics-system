package com.logistics.service;

import com.logistics.pojo.Cargoreceipt;
import com.logistics.pojo.Goodsbill;
import com.logistics.util.Result;

import java.util.List;

public interface CargoReceiptService {

    public List<?> selectLeftCodes();

    public Goodsbill findGoodsBill(String receiptCode);

    public String add(int routeInfoId, Cargoreceipt cargoreceipt);

    public Result selectReceiptByState(String backbillState,int pageNum,int limit);

    public Cargoreceipt selectReceiptByBillCode(String goodsRevertBillCode);

    public String updateReceiptByBillCode(Cargoreceipt cargoreceipt);

    public boolean submit(Cargoreceipt cargoreceipt);

    public Result selectRecetiptAll(int pageNum,int limit);

    public String deleteReceiptByBillCode(String goodsRevertBillCode);
}

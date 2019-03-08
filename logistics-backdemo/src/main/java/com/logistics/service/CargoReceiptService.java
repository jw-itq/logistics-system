package com.logistics.service;

import com.logistics.pojo.Cargoreceipt;
import com.logistics.pojo.Goodsbill;

import java.util.List;

public interface CargoReceiptService {

    public List<?> selectLeftCodes();

    public Goodsbill findGoodsBill(String receiptCode);

    public String add(int routeInfoId, Cargoreceipt cargoreceipt);
}

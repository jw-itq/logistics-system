package com.logistics.service;

import com.logistics.pojo.*;

import java.util.List;

public interface MoniterService {

    List<Goodsbill> selectAllUnArrive();

    List<Goodsbill> selectAllUnTake();

    List<Customeramount> selectAllCusAcount();

    List<Driveramount> selectAllDriAcount();

    List<Contactsservice> printAllContactsService();

    List<Lineoverall> printAllLineOverall();

    List<Carcost> printAllCarCost();

    Carcost selectByCode(String driverCode);

    Contactsservice selectByGoodsBillCode(String goodsBillCode);
}

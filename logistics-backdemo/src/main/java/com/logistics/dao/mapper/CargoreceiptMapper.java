package com.logistics.dao.mapper;

import com.logistics.pojo.Cargoreceipt;
import com.logistics.pojo.CargoreceiptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CargoreceiptMapper {
    int countByExample(CargoreceiptExample example);

    int deleteByExample(CargoreceiptExample example);

    int deleteByPrimaryKey(String goodsRevertBillCode);

    int insert(Cargoreceipt record);

    int insertSelective(Cargoreceipt record);

    List<Cargoreceipt> selectByExample(CargoreceiptExample example);

    Cargoreceipt selectByPrimaryKey(String goodsRevertBillCode);

    int updateByExampleSelective(@Param("record") Cargoreceipt record, @Param("example") CargoreceiptExample example);

    int updateByExample(@Param("record") Cargoreceipt record, @Param("example") CargoreceiptExample example);

    int updateByPrimaryKeySelective(Cargoreceipt record);

    int updateByPrimaryKey(Cargoreceipt record);
}
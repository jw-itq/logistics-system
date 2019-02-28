package com.logistics.dao.mapper;

import com.logistics.pojo.Customeramount;
import com.logistics.pojo.CustomeramountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomeramountMapper {
    int countByExample(CustomeramountExample example);

    int deleteByExample(CustomeramountExample example);

    int deleteByPrimaryKey(String sendGoodsCustomer);

    int insert(Customeramount record);

    int insertSelective(Customeramount record);

    List<Customeramount> selectByExample(CustomeramountExample example);

    Customeramount selectByPrimaryKey(String sendGoodsCustomer);

    int updateByExampleSelective(@Param("record") Customeramount record, @Param("example") CustomeramountExample example);

    int updateByExample(@Param("record") Customeramount record, @Param("example") CustomeramountExample example);

    int updateByPrimaryKeySelective(Customeramount record);

    int updateByPrimaryKey(Customeramount record);
}
package com.logistics.dao.mapper;

import com.logistics.pojo.Driveramount;
import com.logistics.pojo.DriveramountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DriveramountMapper {
    int countByExample(DriveramountExample example);

    int deleteByExample(DriveramountExample example);

    int deleteByPrimaryKey(String driverCode);

    int insert(Driveramount record);

    int insertSelective(Driveramount record);

    List<Driveramount> selectByExample(DriveramountExample example);

    Driveramount selectByPrimaryKey(String driverCode);

    int updateByExampleSelective(@Param("record") Driveramount record, @Param("example") DriveramountExample example);

    int updateByExample(@Param("record") Driveramount record, @Param("example") DriveramountExample example);

    int updateByPrimaryKeySelective(Driveramount record);

    int updateByPrimaryKey(Driveramount record);
}
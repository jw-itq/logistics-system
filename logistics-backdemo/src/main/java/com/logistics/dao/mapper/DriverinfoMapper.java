package com.logistics.dao.mapper;

import com.logistics.pojo.Driverinfo;
import com.logistics.pojo.DriverinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DriverinfoMapper {
    int countByExample(DriverinfoExample example);

    int deleteByExample(DriverinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Driverinfo record);

    int insertSelective(Driverinfo record);

    List<Driverinfo> selectByExample(DriverinfoExample example);

    Driverinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Driverinfo record, @Param("example") DriverinfoExample example);

    int updateByExample(@Param("record") Driverinfo record, @Param("example") DriverinfoExample example);

    int updateByPrimaryKeySelective(Driverinfo record);

    int updateByPrimaryKey(Driverinfo record);
}
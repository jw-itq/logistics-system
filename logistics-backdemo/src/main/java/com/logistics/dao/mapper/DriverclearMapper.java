package com.logistics.dao.mapper;

import com.logistics.pojo.Driverclear;
import com.logistics.pojo.DriverclearExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DriverclearMapper {
    int countByExample(DriverclearExample example);

    int deleteByExample(DriverclearExample example);

    int deleteByPrimaryKey(String backBillCode);

    int insert(Driverclear record);

    int insertSelective(Driverclear record);

    List<Driverclear> selectByExample(DriverclearExample example);

    Driverclear selectByPrimaryKey(String backBillCode);

    int updateByExampleSelective(@Param("record") Driverclear record, @Param("example") DriverclearExample example);

    int updateByExample(@Param("record") Driverclear record, @Param("example") DriverclearExample example);

    int updateByPrimaryKeySelective(Driverclear record);

    int updateByPrimaryKey(Driverclear record);

//    增加的接口
    List<Map<String,Object>> find();
}
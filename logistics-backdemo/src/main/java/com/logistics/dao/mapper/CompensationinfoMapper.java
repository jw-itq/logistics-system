package com.logistics.dao.mapper;

import com.logistics.pojo.Compensationinfo;
import com.logistics.pojo.CompensationinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompensationinfoMapper {
    int countByExample(CompensationinfoExample example);

    int deleteByExample(CompensationinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Compensationinfo record);

    int insertSelective(Compensationinfo record);

    List<Compensationinfo> selectByExample(CompensationinfoExample example);

    Compensationinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Compensationinfo record, @Param("example") CompensationinfoExample example);

    int updateByExample(@Param("record") Compensationinfo record, @Param("example") CompensationinfoExample example);

    int updateByPrimaryKeySelective(Compensationinfo record);

    int updateByPrimaryKey(Compensationinfo record);
}
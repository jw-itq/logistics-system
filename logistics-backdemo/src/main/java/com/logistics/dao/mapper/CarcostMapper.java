package com.logistics.dao.mapper;

import com.logistics.pojo.Carcost;
import com.logistics.pojo.CarcostExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarcostMapper {
    int countByExample(CarcostExample example);

    int deleteByExample(CarcostExample example);

    int deleteByPrimaryKey(String driverCode);

    int insert(Carcost record);

    int insertSelective(Carcost record);

    List<Carcost> selectByExample(CarcostExample example);

    Carcost selectByPrimaryKey(String driverCode);

    int updateByExampleSelective(@Param("record") Carcost record, @Param("example") CarcostExample example);

    int updateByExample(@Param("record") Carcost record, @Param("example") CarcostExample example);

    int updateByPrimaryKeySelective(Carcost record);

    int updateByPrimaryKey(Carcost record);
}
package com.logistics.dao.mapper;

import com.logistics.pojo.Goodsbillevent;
import com.logistics.pojo.GoodsbilleventExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsbilleventMapper {
    int countByExample(GoodsbilleventExample example);

    int deleteByExample(GoodsbilleventExample example);

    int deleteByPrimaryKey(String goodsBillId);

    int insert(Goodsbillevent record);

    int insertSelective(Goodsbillevent record);

    List<Goodsbillevent> selectByExample(GoodsbilleventExample example);

    Goodsbillevent selectByPrimaryKey(String goodsBillId);

    int updateByExampleSelective(@Param("record") Goodsbillevent record, @Param("example") GoodsbilleventExample example);

    int updateByExample(@Param("record") Goodsbillevent record, @Param("example") GoodsbilleventExample example);

    int updateByPrimaryKeySelective(Goodsbillevent record);

    int updateByPrimaryKey(Goodsbillevent record);
}
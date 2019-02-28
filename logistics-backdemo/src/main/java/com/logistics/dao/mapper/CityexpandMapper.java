package com.logistics.dao.mapper;

import com.logistics.pojo.Cityexpand;
import com.logistics.pojo.CityexpandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityexpandMapper {
    int countByExample(CityexpandExample example);

    int deleteByExample(CityexpandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cityexpand record);

    int insertSelective(Cityexpand record);

    List<Cityexpand> selectByExample(CityexpandExample example);

    Cityexpand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cityexpand record, @Param("example") CityexpandExample example);

    int updateByExample(@Param("record") Cityexpand record, @Param("example") CityexpandExample example);

    int updateByPrimaryKeySelective(Cityexpand record);

    int updateByPrimaryKey(Cityexpand record);
}
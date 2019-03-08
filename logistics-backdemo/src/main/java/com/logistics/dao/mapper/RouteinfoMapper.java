package com.logistics.dao.mapper;

import com.logistics.pojo.Routeinfo;
import com.logistics.pojo.RouteinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RouteinfoMapper {
    int countByExample(RouteinfoExample example);

    int deleteByExample(RouteinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Routeinfo record);

    int insertSelective(Routeinfo record);

    List<Routeinfo> selectByExample(RouteinfoExample example);

    Routeinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Routeinfo record, @Param("example") RouteinfoExample example);

    int updateByExample(@Param("record") Routeinfo record, @Param("example") RouteinfoExample example);

    int updateByPrimaryKeySelective(Routeinfo record);

    int updateByPrimaryKey(Routeinfo record);

//    清空表
    int truntable();
}
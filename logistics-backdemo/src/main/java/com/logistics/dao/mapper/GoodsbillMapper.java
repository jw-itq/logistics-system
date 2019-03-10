package com.logistics.dao.mapper;

import com.logistics.pojo.Goodsbill;
import com.logistics.pojo.GoodsbillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsbillMapper {
    int countByExample(GoodsbillExample example);

    int deleteByExample(GoodsbillExample example);

    int deleteByPrimaryKey(String goodsBillCode);

    int insert(Goodsbill record);

    int insertSelective(Goodsbill record);

    List<Goodsbill> selectByExample(GoodsbillExample example);

    Goodsbill selectByPrimaryKey(String goodsBillCode);

    int updateByExampleSelective(@Param("record") Goodsbill record, @Param("example") GoodsbillExample example);

    int updateByExample(@Param("record") Goodsbill record, @Param("example") GoodsbillExample example);

    int updateByPrimaryKeySelective(Goodsbill record);

    int updateByPrimaryKey(Goodsbill record);

//    额外加条件
    List<Goodsbill> transferState(@Param("type") String type,@Param("driverId") String driverId);

    List<Goodsbill> informGet(@Param("type")String type);

    List<Goodsbill> findOldCall(@Param("type") String type);

    List<Goodsbill> findAllGot();

    List<Goodsbill> findOnWayBills();

    List<Map<String,Object>> find();
}
package com.logistics.dao.mapper;

import com.logistics.pojo.Cargoerror;
import com.logistics.pojo.CargoerrorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CargoerrorMapper {
    int countByExample(CargoerrorExample example);

    int deleteByExample(CargoerrorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cargoerror record);

    int insertSelective(Cargoerror record);

    List<Cargoerror> selectByExample(CargoerrorExample example);

    Cargoerror selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cargoerror record, @Param("example") CargoerrorExample example);

    int updateByExample(@Param("record") Cargoerror record, @Param("example") CargoerrorExample example);

    int updateByPrimaryKeySelective(Cargoerror record);

    int updateByPrimaryKey(Cargoerror record);
}
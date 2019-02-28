package com.logistics.dao.mapper;

import com.logistics.pojo.Extraclear;
import com.logistics.pojo.ExtraclearExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtraclearMapper {
    int countByExample(ExtraclearExample example);

    int deleteByExample(ExtraclearExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Extraclear record);

    int insertSelective(Extraclear record);

    List<Extraclear> selectByExample(ExtraclearExample example);

    Extraclear selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Extraclear record, @Param("example") ExtraclearExample example);

    int updateByExample(@Param("record") Extraclear record, @Param("example") ExtraclearExample example);

    int updateByPrimaryKeySelective(Extraclear record);

    int updateByPrimaryKey(Extraclear record);
}
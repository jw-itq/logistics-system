package com.logistics.dao.mapper;

import com.logistics.pojo.Transferinfo;
import com.logistics.pojo.TransferinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransferinfoMapper {
    int countByExample(TransferinfoExample example);

    int deleteByExample(TransferinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Transferinfo record);

    int insertSelective(Transferinfo record);

    List<Transferinfo> selectByExample(TransferinfoExample example);

    Transferinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Transferinfo record, @Param("example") TransferinfoExample example);

    int updateByExample(@Param("record") Transferinfo record, @Param("example") TransferinfoExample example);

    int updateByPrimaryKeySelective(Transferinfo record);

    int updateByPrimaryKey(Transferinfo record);
}
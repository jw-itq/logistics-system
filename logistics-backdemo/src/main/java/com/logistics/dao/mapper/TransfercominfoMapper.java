package com.logistics.dao.mapper;

import com.logistics.pojo.Transfercominfo;
import com.logistics.pojo.TransfercominfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransfercominfoMapper {
    int countByExample(TransfercominfoExample example);

    int deleteByExample(TransfercominfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Transfercominfo record);

    int insertSelective(Transfercominfo record);

    List<Transfercominfo> selectByExample(TransfercominfoExample example);

    Transfercominfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Transfercominfo record, @Param("example") TransfercominfoExample example);

    int updateByExample(@Param("record") Transfercominfo record, @Param("example") TransfercominfoExample example);

    int updateByPrimaryKeySelective(Transfercominfo record);

    int updateByPrimaryKey(Transfercominfo record);
}
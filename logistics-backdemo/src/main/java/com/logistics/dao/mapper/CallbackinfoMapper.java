package com.logistics.dao.mapper;

import com.logistics.pojo.Callbackinfo;
import com.logistics.pojo.CallbackinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CallbackinfoMapper {
    int countByExample(CallbackinfoExample example);

    int deleteByExample(CallbackinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Callbackinfo record);

    int insertSelective(Callbackinfo record);

    List<Callbackinfo> selectByExample(CallbackinfoExample example);

    Callbackinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Callbackinfo record, @Param("example") CallbackinfoExample example);

    int updateByExample(@Param("record") Callbackinfo record, @Param("example") CallbackinfoExample example);

    int updateByPrimaryKeySelective(Callbackinfo record);

    int updateByPrimaryKey(Callbackinfo record);
}
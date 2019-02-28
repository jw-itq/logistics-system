package com.logistics.dao.mapper;

import com.logistics.pojo.Lineoverall;
import com.logistics.pojo.LineoverallExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LineoverallMapper {
    int countByExample(LineoverallExample example);

    int deleteByExample(LineoverallExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lineoverall record);

    int insertSelective(Lineoverall record);

    List<Lineoverall> selectByExample(LineoverallExample example);

    Lineoverall selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lineoverall record, @Param("example") LineoverallExample example);

    int updateByExample(@Param("record") Lineoverall record, @Param("example") LineoverallExample example);

    int updateByPrimaryKeySelective(Lineoverall record);

    int updateByPrimaryKey(Lineoverall record);
}
package com.logistics.dao.mapper;

import com.logistics.pojo.Sentlist;
import com.logistics.pojo.SentlistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SentlistMapper {
    int countByExample(SentlistExample example);

    int deleteByExample(SentlistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sentlist record);

    int insertSelective(Sentlist record);

    List<Sentlist> selectByExample(SentlistExample example);

    Sentlist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sentlist record, @Param("example") SentlistExample example);

    int updateByExample(@Param("record") Sentlist record, @Param("example") SentlistExample example);

    int updateByPrimaryKeySelective(Sentlist record);

    int updateByPrimaryKey(Sentlist record);
}
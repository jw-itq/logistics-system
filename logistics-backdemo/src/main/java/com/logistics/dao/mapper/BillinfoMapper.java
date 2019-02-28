package com.logistics.dao.mapper;

import com.logistics.pojo.Billinfo;
import com.logistics.pojo.BillinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillinfoMapper {
    int countByExample(BillinfoExample example);

    int deleteByExample(BillinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Billinfo record);

    int insertSelective(Billinfo record);

    List<Billinfo> selectByExample(BillinfoExample example);

    Billinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Billinfo record, @Param("example") BillinfoExample example);

    int updateByExample(@Param("record") Billinfo record, @Param("example") BillinfoExample example);

    int updateByPrimaryKeySelective(Billinfo record);

    int updateByPrimaryKey(Billinfo record);
}
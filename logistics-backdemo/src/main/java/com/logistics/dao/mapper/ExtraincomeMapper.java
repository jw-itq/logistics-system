package com.logistics.dao.mapper;

import com.logistics.pojo.Extraincome;
import com.logistics.pojo.ExtraincomeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtraincomeMapper {
    int countByExample(ExtraincomeExample example);

    int deleteByExample(ExtraincomeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Extraincome record);

    int insertSelective(Extraincome record);

    List<Extraincome> selectByExample(ExtraincomeExample example);

    Extraincome selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Extraincome record, @Param("example") ExtraincomeExample example);

    int updateByExample(@Param("record") Extraincome record, @Param("example") ExtraincomeExample example);

    int updateByPrimaryKeySelective(Extraincome record);

    int updateByPrimaryKey(Extraincome record);
}
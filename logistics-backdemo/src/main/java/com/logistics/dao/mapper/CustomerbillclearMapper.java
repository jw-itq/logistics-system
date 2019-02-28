package com.logistics.dao.mapper;

import com.logistics.pojo.Customerbillclear;
import com.logistics.pojo.CustomerbillclearExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerbillclearMapper {
    int countByExample(CustomerbillclearExample example);

    int deleteByExample(CustomerbillclearExample example);

    int deleteByPrimaryKey(String goodsBillCode);

    int insert(Customerbillclear record);

    int insertSelective(Customerbillclear record);

    List<Customerbillclear> selectByExample(CustomerbillclearExample example);

    Customerbillclear selectByPrimaryKey(String goodsBillCode);

    int updateByExampleSelective(@Param("record") Customerbillclear record, @Param("example") CustomerbillclearExample example);

    int updateByExample(@Param("record") Customerbillclear record, @Param("example") CustomerbillclearExample example);

    int updateByPrimaryKeySelective(Customerbillclear record);

    int updateByPrimaryKey(Customerbillclear record);
}
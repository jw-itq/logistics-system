package com.logistics.dao.mapper;

import com.logistics.pojo.Functionwithgroup;
import com.logistics.pojo.FunctionwithgroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FunctionwithgroupMapper {
    int countByExample(FunctionwithgroupExample example);

    int deleteByExample(FunctionwithgroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Functionwithgroup record);

    int insertSelective(Functionwithgroup record);

    List<Functionwithgroup> selectByExample(FunctionwithgroupExample example);

    Functionwithgroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Functionwithgroup record, @Param("example") FunctionwithgroupExample example);

    int updateByExample(@Param("record") Functionwithgroup record, @Param("example") FunctionwithgroupExample example);

    int updateByPrimaryKeySelective(Functionwithgroup record);

    int updateByPrimaryKey(Functionwithgroup record);
}
package com.logistics.dao.mapper;

import com.logistics.pojo.Incomemonthlytemp;
import com.logistics.pojo.IncomemonthlytempExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IncomemonthlytempMapper {
    int countByExample(IncomemonthlytempExample example);

    int deleteByExample(IncomemonthlytempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Incomemonthlytemp record);

    int insertSelective(Incomemonthlytemp record);

    List<Incomemonthlytemp> selectByExample(IncomemonthlytempExample example);

    Incomemonthlytemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Incomemonthlytemp record, @Param("example") IncomemonthlytempExample example);

    int updateByExample(@Param("record") Incomemonthlytemp record, @Param("example") IncomemonthlytempExample example);

    int updateByPrimaryKeySelective(Incomemonthlytemp record);

    int updateByPrimaryKey(Incomemonthlytemp record);
}
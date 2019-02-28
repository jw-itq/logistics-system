package com.logistics.dao.mapper;

import com.logistics.pojo.Customerinfo;
import com.logistics.pojo.CustomerinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerinfoMapper {
    int countByExample(CustomerinfoExample example);

    int deleteByExample(CustomerinfoExample example);

    int deleteByPrimaryKey(String customerCode);

    int insert(Customerinfo record);

    int insertSelective(Customerinfo record);

    List<Customerinfo> selectByExample(CustomerinfoExample example);

    Customerinfo selectByPrimaryKey(String customerCode);

    int updateByExampleSelective(@Param("record") Customerinfo record, @Param("example") CustomerinfoExample example);

    int updateByExample(@Param("record") Customerinfo record, @Param("example") CustomerinfoExample example);

    int updateByPrimaryKeySelective(Customerinfo record);

    int updateByPrimaryKey(Customerinfo record);
}
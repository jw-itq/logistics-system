package com.logistics.dao.mapper;

import com.logistics.pojo.Customerreceiptinfo;
import com.logistics.pojo.CustomerreceiptinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerreceiptinfoMapper {
    int countByExample(CustomerreceiptinfoExample example);

    int deleteByExample(CustomerreceiptinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Customerreceiptinfo record);

    int insertSelective(Customerreceiptinfo record);

    List<Customerreceiptinfo> selectByExample(CustomerreceiptinfoExample example);

    Customerreceiptinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Customerreceiptinfo record, @Param("example") CustomerreceiptinfoExample example);

    int updateByExample(@Param("record") Customerreceiptinfo record, @Param("example") CustomerreceiptinfoExample example);

    int updateByPrimaryKeySelective(Customerreceiptinfo record);

    int updateByPrimaryKey(Customerreceiptinfo record);
}
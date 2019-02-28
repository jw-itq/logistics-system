package com.logistics.dao.mapper;

import com.logistics.pojo.Billrelease;
import com.logistics.pojo.BillreleaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillreleaseMapper {
    int countByExample(BillreleaseExample example);

    int deleteByExample(BillreleaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Billrelease record);

    int insertSelective(Billrelease record);

    List<Billrelease> selectByExample(BillreleaseExample example);

    Billrelease selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Billrelease record, @Param("example") BillreleaseExample example);

    int updateByExample(@Param("record") Billrelease record, @Param("example") BillreleaseExample example);

    int updateByPrimaryKeySelective(Billrelease record);

    int updateByPrimaryKey(Billrelease record);
}
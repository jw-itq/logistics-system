package com.logistics.dao.mapper;

import com.logistics.pojo.Userwithgroup;
import com.logistics.pojo.UserwithgroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserwithgroupMapper {
    int countByExample(UserwithgroupExample example);

    int deleteByExample(UserwithgroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userwithgroup record);

    int insertSelective(Userwithgroup record);

    List<Userwithgroup> selectByExample(UserwithgroupExample example);

    Userwithgroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userwithgroup record, @Param("example") UserwithgroupExample example);

    int updateByExample(@Param("record") Userwithgroup record, @Param("example") UserwithgroupExample example);

    int updateByPrimaryKeySelective(Userwithgroup record);

    int updateByPrimaryKey(Userwithgroup record);
}
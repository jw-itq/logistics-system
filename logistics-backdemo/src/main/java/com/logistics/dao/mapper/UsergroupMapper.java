package com.logistics.dao.mapper;

import com.logistics.pojo.Usergroup;
import com.logistics.pojo.UsergroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsergroupMapper {
    int countByExample(UsergroupExample example);

    int deleteByExample(UsergroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usergroup record);

    int insertSelective(Usergroup record);

    List<Usergroup> selectByExample(UsergroupExample example);

    Usergroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usergroup record, @Param("example") UsergroupExample example);

    int updateByExample(@Param("record") Usergroup record, @Param("example") UsergroupExample example);

    int updateByPrimaryKeySelective(Usergroup record);

    int updateByPrimaryKey(Usergroup record);
}
package com.logistics.dao.mapper;

import com.logistics.pojo.Employeewage;
import com.logistics.pojo.EmployeewageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeewageMapper {
    int countByExample(EmployeewageExample example);

    int deleteByExample(EmployeewageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employeewage record);

    int insertSelective(Employeewage record);

    List<Employeewage> selectByExample(EmployeewageExample example);

    Employeewage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employeewage record, @Param("example") EmployeewageExample example);

    int updateByExample(@Param("record") Employeewage record, @Param("example") EmployeewageExample example);

    int updateByPrimaryKeySelective(Employeewage record);

    int updateByPrimaryKey(Employeewage record);
}
package com.logistics.dao.mapper;

import com.logistics.pojo.Employeeuser;
import com.logistics.pojo.EmployeeuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeuserMapper {
    int countByExample(EmployeeuserExample example);

    int deleteByExample(EmployeeuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employeeuser record);

    int insertSelective(Employeeuser record);

    List<Employeeuser> selectByExample(EmployeeuserExample example);

    Employeeuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employeeuser record, @Param("example") EmployeeuserExample example);

    int updateByExample(@Param("record") Employeeuser record, @Param("example") EmployeeuserExample example);

    int updateByPrimaryKeySelective(Employeeuser record);

    int updateByPrimaryKey(Employeeuser record);
}
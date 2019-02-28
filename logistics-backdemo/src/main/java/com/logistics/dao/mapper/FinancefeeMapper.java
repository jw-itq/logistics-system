package com.logistics.dao.mapper;

import com.logistics.pojo.Financefee;
import com.logistics.pojo.FinancefeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinancefeeMapper {
    int countByExample(FinancefeeExample example);

    int deleteByExample(FinancefeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Financefee record);

    int insertSelective(Financefee record);

    List<Financefee> selectByExample(FinancefeeExample example);

    Financefee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Financefee record, @Param("example") FinancefeeExample example);

    int updateByExample(@Param("record") Financefee record, @Param("example") FinancefeeExample example);

    int updateByPrimaryKeySelective(Financefee record);

    int updateByPrimaryKey(Financefee record);
}
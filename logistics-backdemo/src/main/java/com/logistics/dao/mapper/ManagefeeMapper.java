package com.logistics.dao.mapper;

import com.logistics.pojo.Managefee;
import com.logistics.pojo.ManagefeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagefeeMapper {
    int countByExample(ManagefeeExample example);

    int deleteByExample(ManagefeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Managefee record);

    int insertSelective(Managefee record);

    List<Managefee> selectByExample(ManagefeeExample example);

    Managefee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Managefee record, @Param("example") ManagefeeExample example);

    int updateByExample(@Param("record") Managefee record, @Param("example") ManagefeeExample example);

    int updateByPrimaryKeySelective(Managefee record);

    int updateByPrimaryKey(Managefee record);
}
package com.logistics.dao.mapper;

import com.logistics.pojo.Complaintinfo;
import com.logistics.pojo.ComplaintinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComplaintinfoMapper {
    int countByExample(ComplaintinfoExample example);

    int deleteByExample(ComplaintinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Complaintinfo record);

    int insertSelective(Complaintinfo record);

    List<Complaintinfo> selectByExample(ComplaintinfoExample example);

    Complaintinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Complaintinfo record, @Param("example") ComplaintinfoExample example);

    int updateByExample(@Param("record") Complaintinfo record, @Param("example") ComplaintinfoExample example);

    int updateByPrimaryKeySelective(Complaintinfo record);

    int updateByPrimaryKey(Complaintinfo record);
}
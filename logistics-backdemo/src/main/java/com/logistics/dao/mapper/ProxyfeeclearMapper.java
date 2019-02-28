package com.logistics.dao.mapper;

import com.logistics.pojo.Proxyfeeclear;
import com.logistics.pojo.ProxyfeeclearExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProxyfeeclearMapper {
    int countByExample(ProxyfeeclearExample example);

    int deleteByExample(ProxyfeeclearExample example);

    int deleteByPrimaryKey(String goodsBillCode);

    int insert(Proxyfeeclear record);

    int insertSelective(Proxyfeeclear record);

    List<Proxyfeeclear> selectByExample(ProxyfeeclearExample example);

    Proxyfeeclear selectByPrimaryKey(String goodsBillCode);

    int updateByExampleSelective(@Param("record") Proxyfeeclear record, @Param("example") ProxyfeeclearExample example);

    int updateByExample(@Param("record") Proxyfeeclear record, @Param("example") ProxyfeeclearExample example);

    int updateByPrimaryKeySelective(Proxyfeeclear record);

    int updateByPrimaryKey(Proxyfeeclear record);
}
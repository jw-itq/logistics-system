package com.logistics.dao.mapper;

import com.logistics.pojo.Goodsreceiptinfo;
import com.logistics.pojo.GoodsreceiptinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsreceiptinfoMapper {
    int countByExample(GoodsreceiptinfoExample example);

    int deleteByExample(GoodsreceiptinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goodsreceiptinfo record);

    int insertSelective(Goodsreceiptinfo record);

    List<Goodsreceiptinfo> selectByExample(GoodsreceiptinfoExample example);

    Goodsreceiptinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goodsreceiptinfo record, @Param("example") GoodsreceiptinfoExample example);

    int updateByExample(@Param("record") Goodsreceiptinfo record, @Param("example") GoodsreceiptinfoExample example);

    int updateByPrimaryKeySelective(Goodsreceiptinfo record);

    int updateByPrimaryKey(Goodsreceiptinfo record);
}
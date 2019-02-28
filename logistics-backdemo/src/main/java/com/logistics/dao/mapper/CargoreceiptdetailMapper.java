package com.logistics.dao.mapper;

import com.logistics.pojo.Cargoreceiptdetail;
import com.logistics.pojo.CargoreceiptdetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CargoreceiptdetailMapper {
    int countByExample(CargoreceiptdetailExample example);

    int deleteByExample(CargoreceiptdetailExample example);

    int deleteByPrimaryKey(String goodsRevertBillId);

    int insert(Cargoreceiptdetail record);

    int insertSelective(Cargoreceiptdetail record);

    List<Cargoreceiptdetail> selectByExample(CargoreceiptdetailExample example);

    Cargoreceiptdetail selectByPrimaryKey(String goodsRevertBillId);

    int updateByExampleSelective(@Param("record") Cargoreceiptdetail record, @Param("example") CargoreceiptdetailExample example);

    int updateByExample(@Param("record") Cargoreceiptdetail record, @Param("example") CargoreceiptdetailExample example);

    int updateByPrimaryKeySelective(Cargoreceiptdetail record);

    int updateByPrimaryKey(Cargoreceiptdetail record);
}
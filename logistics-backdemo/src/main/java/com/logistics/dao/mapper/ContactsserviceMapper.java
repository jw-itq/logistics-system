package com.logistics.dao.mapper;

import com.logistics.pojo.Contactsservice;
import com.logistics.pojo.ContactsserviceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactsserviceMapper {
    int countByExample(ContactsserviceExample example);

    int deleteByExample(ContactsserviceExample example);

    int deleteByPrimaryKey(String sendGoodsCustomer);

    int insert(Contactsservice record);

    int insertSelective(Contactsservice record);

    List<Contactsservice> selectByExample(ContactsserviceExample example);

    Contactsservice selectByPrimaryKey(String sendGoodsCustomer);

    int updateByExampleSelective(@Param("record") Contactsservice record, @Param("example") ContactsserviceExample example);

    int updateByExample(@Param("record") Contactsservice record, @Param("example") ContactsserviceExample example);

    int updateByPrimaryKeySelective(Contactsservice record);

    int updateByPrimaryKey(Contactsservice record);
}
package com.logistics.service;

import com.logistics.pojo.Functionwithgroup;
import com.logistics.pojo.Usergroup;
import com.logistics.pojo.Userwithgroup;

import java.util.List;

public interface GroupService {

    public List<Functionwithgroup> findFunctionByLoginId(String loginId);

    public List<Usergroup> selectAllUserGroup();

}

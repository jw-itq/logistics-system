package com.logistics.service;

import com.logistics.pojo.Functionwithgroup;

import java.util.List;

public interface GroupService {

    public List<Functionwithgroup> findFunctionByLoginId(String loginId);

}

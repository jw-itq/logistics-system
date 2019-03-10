package com.logistics.service;

import com.logistics.pojo.Function;
import com.logistics.pojo.Functionwithgroup;
import com.logistics.pojo.Usergroup;
import com.logistics.pojo.Userwithgroup;
import com.logistics.util.Result;

import java.util.List;

public interface GroupService {

    public List<Functionwithgroup> findFunctionByLoginId(String loginId);

    public List<Usergroup> selectAllUserGroup();

    public boolean save(Usergroup userGroup);

    public boolean delete(int id);

    public Result selectAllGroup(int pageNum,int limit);

    public Usergroup findById(int id);

    public boolean update(int id, String description);

    public List<Function> findAllFunction();

    public List<Functionwithgroup> findAllFunctionWithGroups(int groupId);

    public boolean addFuncGro(int groupId, int[] functionId);


}

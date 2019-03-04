package com.logistics.service.impl;

import com.logistics.dao.mapper.FunctionwithgroupMapper;
import com.logistics.dao.mapper.UserwithgroupMapper;
import com.logistics.pojo.Functionwithgroup;
import com.logistics.pojo.FunctionwithgroupExample;
import com.logistics.pojo.Userwithgroup;
import com.logistics.pojo.UserwithgroupExample;
import com.logistics.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service(value = "groupService")
@Transactional(propagation = Propagation.REQUIRED)
public class GroupServiceImpl implements GroupService {

    @Autowired
    private UserwithgroupMapper userwithgroupMapper;

    @Autowired
    private FunctionwithgroupMapper functionwithgroupMapper;

    /**
     * 查询登陆的用户所对应的功能，要先查询对应的组别，再根据组别查询对应的功能
     * @param loginId
     * @return
     */
    @Override
    public List<Functionwithgroup> findFunctionByLoginId(String loginId) {
        UserwithgroupExample example = new UserwithgroupExample();
        UserwithgroupExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(loginId);

        List<Userwithgroup> list = userwithgroupMapper.selectByExample(example);

        FunctionwithgroupExample functionwithgroupExample = new FunctionwithgroupExample();
        FunctionwithgroupExample.Criteria criteria1 = functionwithgroupExample.createCriteria();
        criteria1.andGroupIdEqualTo(list.get(0).getGroupId());

        List<Functionwithgroup> result = functionwithgroupMapper.selectByExample(functionwithgroupExample);
        return result;
    }

}

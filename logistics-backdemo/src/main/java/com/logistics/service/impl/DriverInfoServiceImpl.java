package com.logistics.service.impl;

import com.logistics.dao.mapper.DriverinfoMapper;
import com.logistics.pojo.Driverinfo;
import com.logistics.pojo.DriverinfoExample;
import com.logistics.service.DriverInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "driverInfoService")
@Transactional(propagation = Propagation.REQUIRED)
public class DriverInfoServiceImpl implements DriverInfoService {

    @Autowired
    private DriverinfoMapper driverinfoMapper;

    /**
     * 查询所有司机的编号
     * @return
     */
    @Override
    public List<String> selectAllId() {
        DriverinfoExample example = new DriverinfoExample();
        List<Driverinfo> list = driverinfoMapper.selectByExample(example);
        List<String> result = new ArrayList<>();
        for(Driverinfo d : list){
            result.add(d.getId());
        }
        return result;
    }
}

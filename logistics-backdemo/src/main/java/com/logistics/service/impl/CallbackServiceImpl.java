package com.logistics.service.impl;

import com.logistics.dao.mapper.CallbackinfoMapper;
import com.logistics.pojo.Callbackinfo;
import com.logistics.pojo.CallbackinfoExample;
import com.logistics.service.CallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "callbackService")
@Transactional(propagation = Propagation.REQUIRED)
public class CallbackServiceImpl implements CallbackService {


    @Autowired
    private CallbackinfoMapper callbackinfoMapper;

    /**
     * 添加客户回搞
     * @param callbackinfo
     * @return
     */
    @Override
    public String addInfo(Callbackinfo callbackinfo) {
        try {
            callbackinfo.setLocked(false);
            callbackinfo.setSuccess(true);
            callbackinfoMapper.insert(callbackinfo);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("插入回告失败");
            return "ERROR";
        }
    }

    /**
     * 查询一条回搞信息
     * @param goodsBillId
     * @param type
     * @return
     */
    @Override
    public Callbackinfo findDetail(String goodsBillId, String type) {
        try {
            CallbackinfoExample callbackinfoExample = new CallbackinfoExample();
            CallbackinfoExample.Criteria criteria = callbackinfoExample.createCriteria();
            criteria.andGoodsBillIdEqualTo(goodsBillId);
            criteria.andTypeEqualTo(type);
            List<Callbackinfo> list = callbackinfoMapper.selectByExample(callbackinfoExample);
            return list.get(0);
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("查询回告信息的时候出错");
            return null;
        }
    }
}

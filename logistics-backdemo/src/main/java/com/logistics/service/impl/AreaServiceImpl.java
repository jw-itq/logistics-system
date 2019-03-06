package com.logistics.service.impl;

import com.logistics.dao.mapper.AreaMapper;
import com.logistics.pojo.Area;
import com.logistics.pojo.AreaExample;
import com.logistics.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional(propagation = Propagation.REQUIRED)
@Service(value = "areaService")
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    /**
     * 根据父id查找直系节点
     * @param parent_id
     * @return
     */
    @Override
    public List<Area> findAreaByParentId(int parent_id) {
        AreaExample areaExample = new AreaExample();
        AreaExample.Criteria criteria = areaExample.createCriteria();
        criteria.andParentIdEqualTo(parent_id);
        List<Area> list = areaMapper.selectByExample(areaExample);
        return list;
    }

    /**
     * 得到所有的城市并且按照拼音排序
     */
    public String getAllArea(){
        AreaExample example = new AreaExample();
        List<Area> list = areaMapper.selectByExample(example);

        Map<String,List<String>> map = new HashMap<>();
        /*map.put("name",)

        for(Area a : list){

        }*/

        return "";
    }
}

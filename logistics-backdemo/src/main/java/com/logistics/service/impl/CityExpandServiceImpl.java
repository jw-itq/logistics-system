package com.logistics.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.logistics.dao.mapper.CityexpandMapper;
import com.logistics.dao.mapper.RouteinfoMapper;
import com.logistics.pojo.Cityexpand;
import com.logistics.pojo.CityexpandExample;
import com.logistics.service.CityExpandService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service(value = "cityExpandService")
@Transactional(propagation = Propagation.REQUIRED)
public class CityExpandServiceImpl implements CityExpandService {

    @Autowired
    private CityexpandMapper cityexpandMapper;

    @Autowired
    private RouteinfoMapper routeinfoMapper;

    /**
     * 保存城市扩充表，然后每一次保存后都要清空空线路信息表
     * @param cityexpand 这个参数就是城市扩充表
     * @return
     */
    @Override
    public boolean addExpand(Cityexpand cityexpand) {

        try {
            cityexpandMapper.insert(cityexpand);

            //清空线路信息表
            routeinfoMapper.truntable();
            return true;
        }catch (Exception e){
            System.err.println("插入线路扩充表失败 | 清空线路信息表失败");
        }
        return false;
    }

    /**
     * 查询所有的城市扩充信息，并且分页
     * @param pageNum
     * @param limit
     * @return
     */
    @Override
    public Result findAllExpands(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        CityexpandExample cityexpandExample = new CityexpandExample();
        List<Cityexpand> list =  cityexpandMapper.selectByExample(cityexpandExample);
        PageInfo<Cityexpand> pageInfo = new PageInfo<>(list);

        Result result = new Result(200,"SUCCESS", (int) pageInfo.getTotal(),pageInfo.getList());
        return result;
    }

    /**
     * 根据id删除城市扩充表的信息
     * @param cityId 这是城市id
     * @return
     */
    @Override
    public String deleteExpandsById(String cityId) {
        CityexpandExample example = new CityexpandExample();
        CityexpandExample.Criteria criteria = example.createCriteria();
        criteria.andCityIdEqualTo(Integer.parseInt(cityId));
        int result = cityexpandMapper.deleteByExample(example);
        if(result<0){
            return "ERROR";
        }
        return "SUCCESS";
    }

    /**
     * 根据id修改城市扩充表
     * @param expandId 这是id
     * @param cityexpand 这是需要修改的信息
     * @return
     */
    @Override
    public String updateExpandById(int expandId, Cityexpand cityexpand) {
        Cityexpand city = cityexpandMapper.selectByPrimaryKey(expandId);
        city.setCityId(cityexpand.getCityId());
        city.setRangeCity(cityexpand.getRangeCity());
        int result = cityexpandMapper.updateByPrimaryKey(city);
        if(result<0){
            return "ERROR";
        }
        return "SUCCESS";
    }

}

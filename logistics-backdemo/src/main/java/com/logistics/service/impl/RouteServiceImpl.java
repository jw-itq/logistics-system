package com.logistics.service.impl;

import com.logistics.dao.mapper.AreaMapper;
import com.logistics.dao.mapper.CityexpandMapper;
import com.logistics.dao.mapper.RegionMapper;
import com.logistics.dao.mapper.RouteinfoMapper;
import com.logistics.pojo.*;
import com.logistics.service.RouteService;
import com.sun.org.apache.xerces.internal.xs.StringList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service(value = "routeService")
@Transactional(propagation = Propagation.REQUIRED)
public class RouteServiceImpl implements RouteService {

    private static List<String> sb = new ArrayList<>();
    private static List<List<String>> list = new ArrayList<>();
    private static Map<String, Set<String>> map = new HashMap<>();
    @Autowired
    private RouteinfoMapper routeinfoMapper;
    @Autowired
    private AreaMapper areaMapper;
    @Autowired
    private CityexpandMapper cityexpandMapper;

    /**
     * 这个方法存在的目的就是为了区计算线路信息
     * 作者是用了dfs，我想了下确实要用dfs，但是我用的不熟练，花了很多时间写了个能用的，还行
     * 好久没有写过算法了
     *
     */
    @Override
    public void generateRoute() {
        try {
            //首先查询所有城市扩充表得到list
            CityexpandExample cityexpandExample = new CityexpandExample();
            List<Cityexpand> cityexpands = cityexpandMapper.selectByExample(cityexpandExample);
            //根据list添加到map里面去，只是为了方便处理
            for(Cityexpand city : cityexpands){
                String[] rangeCity = city.getRangeCity().split(",");
                Set<String> rangeSet = new HashSet<>();
                for(String range : rangeCity){
                    rangeSet.add(range);
                }
                map.put(city.getCityId()+"", rangeSet);
            }
            //然后遍历map集合调用f2函数可以计算出所有的线路信息存放在list集合里面
            for(String key : map.keySet()){
                f2(key, map.get(key));
            }
            //根据list集合元素的元素的个数来计算距离，和时间，还可以根据id查询得到起点，终点，和中转地，存放到routeinfo对象
            for(List<String> ls : list){
                Routeinfo route = new Routeinfo();
                route.setDistance((double) ls.size()*100);
                route.setFetchTime((double) ls.size());
                //根据id查询对应的地名
                //起点
                Area startArea = areaMapper.selectByPrimaryKey(Integer.parseInt(ls.get(0)));
                route.setStartStation(startArea.getAreaName());
                //中转
                String pass = "";
                for(int i = 1;i<ls.size()-1;i++){
                    Area passArea = areaMapper.selectByPrimaryKey(Integer.parseInt(ls.get(i)));
                    pass += passArea.getAreaName()+",";
                }
                if(pass.length()<1){
                    route.setPassStation(pass);
                }else {
                    //目的是去掉逗号
                    route.setPassStation(pass.substring(0,pass.length()-1));
                }
                //终点
                Area endArea = areaMapper.selectByPrimaryKey(Integer.parseInt(ls.get(ls.size()-1)));
                route.setEndStation(endArea.getAreaName());
                //存放route
                routeinfoMapper.insert(route);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("存放线路信息失败！");
        }

    }

    /**
     * 查询所有的线路信息
     * @return
     */
    @Override
    public List<Routeinfo> findAllRouteInfos() {
        RouteinfoExample example = new RouteinfoExample();
        return routeinfoMapper.selectByExample(example);
    }


    /**
     * 测试添加线路信息
     * @param args
     *//*
    public static void main(String[] args){

        Set<String> set1 = new HashSet<>();
        set1.add("3");
        set1.add("4");
        set1.add("5");
        map.put("2",set1);

        Set<String> set2 = new HashSet<>();
        set2.add("2");
        set2.add("4");
        set2.add("6");
        set2.add("8");
        map.put("7",set2);

        Set<String> set3 = new HashSet<>();
        set3.add("2");
        set3.add("4");
        map.put("3",set3);

        Set<String> set4 = new HashSet<>();
        set4.add("1");
        set4.add("2");
        set4.add("3");
        set4.add("7");
        map.put("4",set4);

        System.out.println(map.toString());


        for(String s : map.keySet()){
            f2(s,map.get(s));
            System.out.println(list.toString());
        }

        System.out.println("---");
    }*/


    public void f2(String k,Set<String> v){
        if(sb.contains(k)){
            if(list.size()>0){
                List<String> end = list.get(list.size()-1);
                if(end.get(end.size()-1).equals(sb.get(sb.size()-1))){
                    return;
                }
            }
            list.add(new ArrayList<>(sb));
            return;
        }
        sb.add(k);
        if(v==null){
            list.add(new ArrayList<>(sb));
            sb.remove(k);
            return;
        }
        for(String s : v){
            f2(s,map.get(s));

        }
        sb.remove(k);
    }
}

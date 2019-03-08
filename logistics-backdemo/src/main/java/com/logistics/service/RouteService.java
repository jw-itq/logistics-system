package com.logistics.service;

import com.logistics.pojo.Cityexpand;
import com.logistics.pojo.Routeinfo;

import java.util.List;

public interface RouteService {

    public void generateRoute();

    public List<Routeinfo> findAllRouteInfos();


}

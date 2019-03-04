package com.logistics.service;

import com.logistics.pojo.Area;

import java.util.List;

public interface AreaService {

    public List<Area> findAreaByParentId(int parent_id);
}

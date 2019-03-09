package com.logistics.controller;


import com.logistics.pojo.Functionwithgroup;
import com.logistics.pojo.Usergroup;
import com.logistics.pojo.Userwithgroup;
import com.logistics.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@ControllerAdvice
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping(value = "/selectFunc/{loginId}")
    public List<Functionwithgroup> findFunctionByLoginId(@PathVariable("loginId") String loginId){
        List<Functionwithgroup> result = groupService.findFunctionByLoginId(loginId);
        return result;
    }

    @RequestMapping(value = "/selectAllUserFroup",method = RequestMethod.GET)
    public List<Usergroup> selectAllUserGroup(){
        return groupService.selectAllUserGroup();
    }
}

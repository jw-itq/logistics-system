package com.logistics.controller;


import com.logistics.pojo.Function;
import com.logistics.pojo.Functionwithgroup;
import com.logistics.pojo.Usergroup;
import com.logistics.pojo.Userwithgroup;
import com.logistics.service.GroupService;
import com.logistics.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@ControllerAdvice
public class GroupController extends ReturnType{

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

    @RequestMapping(value = "/addGroup", method = RequestMethod.POST, produces = "application/json")
    public String addNewGroup(Usergroup userGroup) {

        boolean flag = false;
        flag = groupService.save(userGroup);
        if (!flag) {
            return ERROR;
        }
        return SUCCESS;
    }

    @RequestMapping(value = "/addNewFunc", method = RequestMethod.POST)
    public String addNewFunc(@RequestParam("groupId") int groupId, @RequestParam("array[]") int[] array) {
        boolean flag = false;
        flag = groupService.addFuncGro(groupId, array);
        if (!flag) {
            return ERROR;
        }
        return SUCCESS;
    }

    @RequestMapping(value = "/deleteGroup/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String deleteGroup(@PathVariable("id") int id) {
        boolean flag = false;
        flag = groupService.delete(id);
        if (!flag) {
            return ERROR;
        }
        return SUCCESS;
    }

    @RequestMapping(value = "/selectAllGroup", method = RequestMethod.GET)
    public Result selectAllGroup(@RequestParam("pageNum") int pageNum, @RequestParam("limit") int limit) {
        return groupService.selectAllGroup(pageNum,limit);
    }

    @RequestMapping(value = "/selectGroup/{id}", method = RequestMethod.GET)
    public Usergroup selectGroupById(@PathVariable("id") int id) {
        Usergroup userGroup = groupService.findById(id);
        return userGroup;
    }

    @RequestMapping(value = "/updateDescription/{id}", method = RequestMethod.PUT)
    public String updateDescription(@PathVariable("id") int id, @RequestParam("description") String description) {

        boolean flag = false;
        flag = groupService.update(id, description);
        if (!flag) {
            return ERROR;
        }
        return SUCCESS;
    }



    @RequestMapping(value = "/selectAllFunction", method = RequestMethod.GET)
    public List<Function> selectAllFunction() {

        List<Function> functions = groupService.findAllFunction();

        return functions;
    }

    @RequestMapping(value = "/selectFunctionByGroup/{groupId}", method = RequestMethod.GET)
    public List<Functionwithgroup> selectFunctionByGroup(@PathVariable("groupId") int groupId) {

        List<Functionwithgroup> functions = groupService.findAllFunctionWithGroups(groupId);

        return functions;
    }
}

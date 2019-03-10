package com.logistics.service.impl;

import com.logistics.dao.mapper.UserMapper;
import com.logistics.pojo.User;
import com.logistics.pojo.UserExample;
import com.logistics.service.UserService;
import com.logistics.util.Enctype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional(propagation = Propagation.REQUIRED)
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登陆的方法，根据用户名和密码两个参数来判断
     * @param loginId
     * @param password
     * @return
     */
    @Override
    public Map<?, ?> userLogin(String loginId, String password) {
        Map<String,Object> map = new HashMap<>();
        try {
            User user = userMapper.selectByPrimaryKey(loginId);
            System.out.println("--------------------"+user.toString());
            if(user.getPassword().equals(Enctype.MD5(password))){
                user.setIfOnline(true);
                userMapper.updateByPrimaryKey(user);
                map.put("STATUS","SUCCESS");
                map.put("USER",user);
            }else {
                map.put("STATUS","ERROR");
            }
            return map;
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("用户密码验证失败用户密码验证失败");
            map.put("STATUS","ERROR");
            return map;
        }
    }

    /**
     * 查找对应的职员编号是不是属于终于表中，用来判断这个职员是不是用户
     * @param employeeCode
     * @return
     */
    @Override
    public boolean isExist(String employeeCode) {
        UserExample userExample = new UserExample();
        List<User> list = userMapper.selectByExample(userExample);
        for(User user : list){
            if(user.getLoginId().equals(employeeCode)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String changePassword(String loginId, String oldPassword, String newPassword) {
        User user = userMapper.selectByPrimaryKey(loginId);
        if(Enctype.MD5(oldPassword).equals(user.getPassword())){
            user.setPassword(Enctype.MD5(newPassword));
            userMapper.updateByPrimaryKey(user);
            return "SUCCESS";
        }
        return "ERROR";
    }
}

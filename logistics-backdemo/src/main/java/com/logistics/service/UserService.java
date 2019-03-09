package com.logistics.service;

import java.util.Map;

public interface UserService {

    Map<?,?> userLogin(String loginId,String password);

    public boolean isExist(String employeeCode);
}

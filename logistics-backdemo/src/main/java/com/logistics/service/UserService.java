package com.logistics.service;

import java.util.Map;

public interface UserService {

    Map<?,?> userLogin(String loginId,String password);

    public boolean isExist(String employeeCode);

    String changePassword(String loginId, String oldPassword, String newPassword);
}

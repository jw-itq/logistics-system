package com.logistics.pojo;

public class User {
    public User(String loginId, Boolean ifOnline, String password) {
        this.loginId = loginId;
        this.ifOnline = ifOnline;
        this.password = password;
    }

    private String loginId;

    private Boolean ifOnline;

    private String password;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public Boolean getIfOnline() {
        return ifOnline;
    }

    public void setIfOnline(Boolean ifOnline) {
        this.ifOnline = ifOnline;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "loginId='" + loginId + '\'' +
                ", ifOnline=" + ifOnline +
                ", password='" + password + '\'' +
                '}';
    }
}
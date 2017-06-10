package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：实体类 User
 *
 * @author pengdh
 * @date: 2017-06-11 1:33
 */
public class User {
    private String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

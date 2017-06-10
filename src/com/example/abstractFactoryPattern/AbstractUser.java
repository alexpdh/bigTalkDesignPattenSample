package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：抽象类 AbstractUser,类似 AbstractProductA 类
 *
 * @author pengdh
 * @date: 2017-06-11 1:45
 */
public abstract class AbstractUser {
    public abstract  void insert(User user);
    public abstract User query(String id);
}

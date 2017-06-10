package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：MysqlUser 类，类似 ProductA1 类
 *
 * @author pengdh
 * @date: 2017-06-11 1:50
 */
public class MysqlUser extends AbstractUser {
    @Override
    public void insert(User user) {
        System.out.println("在 mysql 中插入一条 User 记录");
    }

    @Override
    public User query(String id) {
        System.out.println("在 mysql 中查询一条 User 记录");
        return null;
    }
}

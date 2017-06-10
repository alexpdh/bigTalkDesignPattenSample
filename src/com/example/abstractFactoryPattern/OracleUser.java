package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：OracleUser 类，类似 ProductA2 类
 *
 * @author pengdh
 * @date: 2017-06-11 1:56
 */
public class OracleUser extends AbstractUser {
    @Override
    public void insert(User user) {
        System.out.println("在 oracle 中插入一条 User 记录");
    }

    @Override
    public User query(String id) {
        System.out.println("在 oracle 中查询一条 User 记录");
        return null;
    }
}

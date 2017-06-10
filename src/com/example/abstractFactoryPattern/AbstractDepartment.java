package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：抽象类 AbstractDepartment，类似 AbstractProductB 类
 *
 * @author pengdh
 * @date: 2017-06-11 1:58
 */
public abstract class AbstractDepartment {
    public abstract void inser(Department department);
    public abstract Department query(String id);
}

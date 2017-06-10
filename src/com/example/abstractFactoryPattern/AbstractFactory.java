package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：AbstractFactory 类，定义访问两个实体对象的的抽象工厂类
 *
 * @author pengdh
 * @date: 2017-06-11 2:04
 */
public abstract class AbstractFactory {
    public abstract  AbstractUser createUser();
    public abstract AbstractDepartment createDepartment();
}

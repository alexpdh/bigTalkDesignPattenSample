package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：MysqlFacory 类，类似 ConcreteFactory1 类，用于实例化 MysqlUser 和 MysqlDepartment
 *
 * @author pengdh
 * @date: 2017-06-11 2:08
 */
public class MysqlFacory extends AbstractFactory {
    @Override
    public AbstractUser createUser() {
        return new MysqlUser();
    }

    @Override
    public AbstractDepartment createDepartment() {
        return new MysqlDepartment();
    }
}

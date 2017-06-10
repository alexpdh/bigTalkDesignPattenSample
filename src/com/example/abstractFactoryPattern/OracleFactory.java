package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：OracleFacory 类，类似 ConcreteFactory2 类，用于实例化 OracleUser 和 OracleDepartment
 *
 * @author pengdh
 * @date: 2017-06-11 2:12
 */
public class OracleFactory extends AbstractFactory {
    @Override
    public AbstractUser createUser() {
        return new OracleUser();
    }

    @Override
    public AbstractDepartment createDepartment() {
        return new OracleDepartment();
    }
}

package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：客户端测试类 TestAbstractFactoryPattern
 *
 * @author pengdh
 * @date: 2017-06-11 2:15
 */
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        AbstractFactory mysqlFacory = new MysqlFacory();
        AbstractFactory oracleFactory = new OracleFactory();

        AbstractUser muser = mysqlFacory.createUser();
        muser.insert(user);
        muser.query("1");
        AbstractDepartment mdepartment = mysqlFacory.createDepartment();
        mdepartment.inser(department);
        mdepartment.query("1");

        AbstractUser ouser = oracleFactory.createUser();
        ouser.insert(user);
        ouser.query("2");
        AbstractDepartment odepartment = oracleFactory.createDepartment();
        odepartment.inser(department);
        odepartment.query("2");
    }
}

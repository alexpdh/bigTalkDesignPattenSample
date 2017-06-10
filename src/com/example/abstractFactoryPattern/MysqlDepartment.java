package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：MysqlDepartment 类，类似 ProductB1 类
 *
 * @author pengdh
 * @date: 2017-06-11 2:01
 */
public class MysqlDepartment extends AbstractDepartment {
    @Override
    public void inser(Department department) {
        System.out.println("在 mysql 中插入一条 Department 记录");
    }

    @Override
    public Department query(String id) {
        System.out.println("在 mysql 中查询一条 Department 记录");
        return null;
    }
}

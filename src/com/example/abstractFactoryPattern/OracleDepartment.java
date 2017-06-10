package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：OracleDepartment 类，类似 ProductB2 类
 *
 * @author pengdh
 * @date: 2017-06-11 2:03
 */
public class OracleDepartment extends AbstractDepartment {
    @Override
    public void inser(Department department) {
        System.out.println("在 oracle 中插入一条 Department 记录");
    }

    @Override
    public Department query(String id) {
        System.out.println("在 oracle 中查询一条 Department 记录");
        return null;
    }
}

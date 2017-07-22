package com.example.factoryMethodPattern;

/**
 * 工厂方法模式：测试类
 *
 * @author pengdh
 * @date: 2017-05-08 1:41
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        AbstractOperation add = new OperationAdd(); // 需要修改其他计算方法，修改这里就可以
        add = factory.createOperation();
        add.numberA = 1;
        add.numberB = 2;
        double result = add.getResult();
        System.out.println(result);
    }
}

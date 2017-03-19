package com.sample.simpleFactoryPattern;

/**
 * 运算测试类
 *
 * @author pengdh
 * @date: 2017-03-16 0:16
 */
public class OperationTest {
    public static void main(String[] args) {
        Operation oper = new Operation();
        oper = OperationFactory.createOperate("+");
        oper.numberA = 3;
        oper.numberB = 1;
        double result = oper.getResult();
        System.out.println("-----------pengdh----------- result = " + result + "," + "当前类 = OperationTest.main()");
    }
}

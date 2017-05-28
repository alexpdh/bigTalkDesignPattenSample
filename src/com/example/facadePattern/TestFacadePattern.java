package com.example.facadePattern;

/**
 * 外观模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-05-28 22:43
 */
public class TestFacadePattern {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.testFacade();
    }
}

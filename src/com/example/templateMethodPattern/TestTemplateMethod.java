package com.example.templateMethodPattern;

/**
 * 模板方法模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-05-21 21:11
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new ConcreteTemplateA();
        abstractTemplate.templateMethod();

        abstractTemplate = new ConcreteTemplateB();
        abstractTemplate.templateMethod();
    }
}

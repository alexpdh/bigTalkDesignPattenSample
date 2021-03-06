package com.example.templateMethodPattern;

/**
 * 模板方法模式：具体模板类A
 *
 * @author pengdh
 * @date: 2017-05-21 21:01
 */
public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    protected void primitiveOperation1() {
        System.out.println("具体模板类A实现方法1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体模板类A实现方法2");
    }
}

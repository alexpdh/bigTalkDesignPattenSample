package com.example.templateMethodPattern;

/**
 * 模板方法模式：抽象模板类
 *
 * @author pengdh
 * @date: 2017-05-21 20:53
 */
public abstract class AbstractTemplate {
    /**
     * 模板方法
     */
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteMethod();
    }

    /**
     * 申明抽象基本方法，由子类具体实现
     */
    protected abstract void primitiveOperation1();

    /**
     * 申明抽象基本方法，由子类具体实现
     */
    protected abstract void primitiveOperation2();

    /**
     * 基本方法
     */
    private void concreteMethod() {
    }
}

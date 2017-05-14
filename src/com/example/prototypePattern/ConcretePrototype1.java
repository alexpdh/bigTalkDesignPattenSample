package com.example.prototypePattern;

/**
 * 原型模式：具体原型类
 *
 * @author pengdh
 * @date: 2017-05-14 21:38
 */
public class ConcretePrototype1 implements Prototype {
    @Override
    public Object clone() {
        // 最基本的克隆方式，新建一个自身对象
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}

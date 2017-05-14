package com.example.prototypePattern;

/**
 * 原型模式：客户端类
 *
 * @author pengdh
 * @date: 2017-05-14 21:43
 */
public class Client {
    // 申明一个原型接口的对象
    private Prototype prototype;

    /**
     * 构造方法，传入需要使用的原型接口对象
     * @param prototype
     */
    public Client(Prototype prototype) {
        this.prototype = prototype;
    }
    public void operation(Prototype p) {
        // 需要创建原型接口的对象
        Prototype copyPrototype = (Prototype) prototype.clone();
    }
}

package com.example.proxyPattern;

/**
 * 代理模式：报错一个引用使得代理可以访问实体，并提供一个与 Subject 的接口相同的接口，这样代理就可以用来替换实体
 *
 * @author pengdh
 * @date: 2017-04-23 13:40
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("调用真实对象");
        realSubject.request();
    }
}

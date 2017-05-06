package com.example.proxyPattern;

/**
 * 代理模式：定义 Proxy 代表的真实实体
 *
 * @author pengdh
 * @date: 2017-04-23 13:38
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求!");
    }
}

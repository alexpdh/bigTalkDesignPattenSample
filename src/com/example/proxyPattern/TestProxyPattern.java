package com.example.proxyPattern;

/**
 * 代理模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-04-23 13:45
 */
public class TestProxyPattern {
    public static void main(String[] args) {
        RealSubject realObj = new RealSubject();
        Subject obj = new Proxy(realObj);
        obj.request();
    }
}

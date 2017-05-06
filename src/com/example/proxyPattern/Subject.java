package com.example.proxyPattern;

/**
 * 代理模式：定义了 RealSubject 和 Proxy 的共用接口，目的是为了在任何使用 RealSubject 的地方都能使用 Proxy
 *
 * @author pengdh
 * @date: 2017-04-23 13:34
 */
public interface Subject {
    public void request();
}

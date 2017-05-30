package com.example.observerPattern;

/**
 * 观察者模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-05-30 12:43
 */
public class TestObserverPattern {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver("obs1", s));
        s.attach(new ConcreteObserver("obs2", s));

        s.setSubjectState("new state");
        s.notifyObservers();
    }
}

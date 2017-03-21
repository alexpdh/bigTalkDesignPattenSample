package com.example.statePattern;

/**
 * 状态模式测试类
 *
 * @author pengdh
 * @date: 2017-03-21 22:13
 */
public class TestStatePattern {
    public static void main(String[] args) {
        Context c  = new Context(new ConcreteStateA());
        c.request();
        c.request();
    }
}

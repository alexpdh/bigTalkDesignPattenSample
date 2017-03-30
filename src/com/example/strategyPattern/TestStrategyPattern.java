package com.example.strategyPattern;

/**
 * 策略模式测试类
 *
 * @author pengdh
 * @date: 2017-03-30 23:39
 */
public class TestStrategyPattern {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}

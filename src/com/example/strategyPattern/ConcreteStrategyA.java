package com.example.strategyPattern;

/**
 * 策略模式：具体算法A
 *
 * @author pengdh
 * @date: 2017-03-30 23:28
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
}

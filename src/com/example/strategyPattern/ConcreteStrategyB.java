package com.example.strategyPattern;

/**
 * 策略模式：具体算法B
 *
 * @author pengdh
 * @date: 2017-03-30 23:31
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法B实现");
    }
}

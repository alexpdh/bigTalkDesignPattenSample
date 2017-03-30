package com.example.strategyPattern;

/**
 * 策略模式：具体算法C
 *
 * @author pengdh
 * @date: 2017-03-30 23:32
 */
public class ConcreteStrategyC implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法C实现");
    }
}

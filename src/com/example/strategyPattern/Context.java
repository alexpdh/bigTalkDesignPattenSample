package com.example.strategyPattern;

/**
 * 环境角色类
 *
 * @author pengdh
 * @date: 2017-03-30 23:34
 */
public class Context {
    // 申明一个抽象的策略对象
    private Strategy strategy;

    // 构造函数，传入一个具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}

package com.example.factoryMethodPattern;

/**
 * 工厂方法模式：减法计算类
 *
 * @author pengdh
 * @date: 2017-05-08 1:37
 */
public class OperationSub extends AbstractOperation {
    public double getResult() {
        double result = 0L;
        return numberA - numberB;
    }
}

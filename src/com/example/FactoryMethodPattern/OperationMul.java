package com.example.FactoryMethodPattern;

/**
 * 工厂方法模式：乘法计算类
 *
 * @author pengdh
 * @date: 2017-05-08 1:39
 */
public class OperationMul extends AbstractOperation {
    public double getResult() {
        double result = 0L;
        return numberA * numberB;
    }
}

package com.example.FactoryMethodPattern;

/**
 * 工厂方法模式：除法计算类
 *
 * @author pengdh
 * @date: 2017-05-08 1:40
 */
public class OperationDiv extends AbstractOperation {
    public double getResult() {
        double result = 0L;
        return numberA / numberB;
    }
}

package com.example.FactoryMethodPattern;

/**
 * 工厂方法模式：加法计算类
 *
 * @author pengdh
 * @date: 2017-05-08 1:31
 */
public class OperationAdd extends AbstractOperation implements OperationFactory {
    @Override
    public double getResult() {
        double result = 0L;
        return numberA + numberB;
    }
}

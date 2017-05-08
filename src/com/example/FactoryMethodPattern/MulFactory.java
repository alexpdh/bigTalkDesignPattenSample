package com.example.FactoryMethodPattern;

/**
 * 工厂方法模式：乘法工厂
 *
 * @author pengdh
 * @date: 2017-05-08 2:03
 */
public class MulFactory implements IFactory {
    @Override
    public AbstractOperation createOperation() {
        return new OperationMul();
    }
}

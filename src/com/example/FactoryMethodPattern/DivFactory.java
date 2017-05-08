package com.example.FactoryMethodPattern;

/**
 * 工厂方法模式：除法工厂
 *
 * @author pengdh
 * @date: 2017-05-08 2:04
 */
public class DivFactory implements IFactory {
    @Override
    public AbstractOperation createOperation() {
        return new OperationDiv();
    }
}

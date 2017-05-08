package com.example.FactoryMethodPattern;

/**
 * 工厂方法模式：加法工厂
 *
 * @author pengdh
 * @date: 2017-05-08 1:46
 */
public class AddFactory implements IFactory {
    @Override
    public AbstractOperation createOperation() {
        return new OperationAdd();
    }
}

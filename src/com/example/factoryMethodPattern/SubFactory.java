package com.example.factoryMethodPattern;

/**
 * 工厂方法模式：减法工厂
 *
 * @author pengdh
 * @date: 2017-05-08 2:02
 */
public class SubFactory implements IFactory {
    @Override
    public AbstractOperation createOperation() {
        return new OperationSub();
    }
}

package com.example.factoryMethodPattern;

/**
 * 工厂方法模式：运算工厂抽象类 主要目的是将各个计算类要用的变量写在这里，避免每个计算实现类都写一个
 *
 * @author pengdh
 * @date: 2017-05-08 1:20
 */
public class AbstractOperation implements OperationFactory {
    protected double numberA;
    protected double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    @Override
    public double getResult() {
        double result = 0L;
        return result;
    }
}

package com.sample.simpleFactoryPattern;

/**
 * 运算类
 *
 * @author pengdh
 * @date: 2017-03-15 22:44
 */
public class Operation {
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

    public double getResult() {
        double result = 0;
        return result;
    }
}

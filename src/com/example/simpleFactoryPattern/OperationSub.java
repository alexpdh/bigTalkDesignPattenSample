package com.example.simpleFactoryPattern;

/**
 * 减法运算类
 *
 * @author pengdh
 * @date: 2017-03-15 23:24
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = numberA - numberB;
        return result;
    }
}

package com.example.simpleFactoryPattern;

/**
 * 乘法运算类
 *
 * @author pengdh
 * @date: 2017-03-15 23:27
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = numberA * numberB;
        return result;
    }
}

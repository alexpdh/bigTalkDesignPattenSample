package com.example.simpleFactoryPattern;

/**
 * 加法运算类
 *
 * @author pengdh
 * @date: 2017-03-15 23:19
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = numberA + numberB;
        return result;
    }
}

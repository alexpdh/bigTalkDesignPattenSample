package com.example.simpleFactoryPattern;

/**
 * 除法运算类
 *
 * @author pengdh
 * @date: 2017-03-15 23:30
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = numberA / numberB;
        return result;
    }
}

package com.example.builderPattern;

/**
 * 建造者模式：指挥者类
 *
 * @author pengdh
 * @date: 2017-05-29 22:58
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构造产品方法
     */
    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}

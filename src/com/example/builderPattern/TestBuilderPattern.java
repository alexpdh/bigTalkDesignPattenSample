package com.example.builderPattern;

/**
 * 建造者模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-05-29 23:02
 */
public class TestBuilderPattern {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}

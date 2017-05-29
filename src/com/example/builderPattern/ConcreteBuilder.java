package com.example.builderPattern;

/**
 * 建造者模式：具体建造者类
 *
 * @author pengdh
 * @date: 2017-05-29 22:52
 */
public class ConcreteBuilder implements Builder {
    private Product product =  new Product();
    @Override
    public void buildPart1() {
        product.setPart1("建造产品部件1");
    }

    @Override
    public void buildPart2() {
    product.setPart2("建造产品部件2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

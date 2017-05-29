package com.example.builderPattern;

/**
 * 建造者模式：抽象建造者类
 *
 * @author pengdh
 * @date: 2017-05-29 22:50
 */
public interface Builder {
    /**
     * 建造产品部件1
     */
    public void buildPart1();

    /**
     * 建造产品部件2
     */
    public void buildPart2();

    /**
     * 返回产品
     * @return
     */
    public Product getResult();
}

package com.example.builderPattern;

/**
 * 建造者模式：产品类
 *
 * @author pengdh
 * @date: 2017-05-29 22:47
 */
public class Product {
    private String part1;
    private String part2;

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }
}

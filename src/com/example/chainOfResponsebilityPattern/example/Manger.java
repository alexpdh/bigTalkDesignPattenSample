package com.example.chainOfResponsebilityPattern.example;

/**
 * 责任链模式：管理者类
 *
 * @author pengdh
 * @date: 2017-03-20 22:55
 */
public abstract class Manger {
    protected String name;
    // 管理者上级
    protected Manger superior;

    public Manger(String name) {
        this.name = name;
    }

    // 获取上级
    public Manger getSuperior () {
        return superior;
    }
    // 设置管理者的上级
    public void setSuperior (Manger superior) {
        this.superior = superior;
    }

    public abstract void requestApplications (Request request);
}

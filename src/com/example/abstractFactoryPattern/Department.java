package com.example.abstractFactoryPattern;

/**
 * 抽象工厂模式：实体类 Department
 *
 * @author pengdh
 * @date: 2017-06-11 1:35
 */
public class Department {
    private String departId;
    private String departName;

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
}

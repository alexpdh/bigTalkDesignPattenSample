package com.example.facadePattern;

/**
 * 外观模式：门面类
 *
 * @author pengdh
 * @date: 2017-05-28 22:32
 */
public class Facade {
    private SubModuleA subModuleA;
    private SubModuleB subModuleB;
    private SubModuleC subModuleC;

    public Facade() {
        this.subModuleA = new SubModuleA();
        this.subModuleB = new SubModuleB();
        this.subModuleC = new SubModuleC();
    }

    public void testFacade() {
        subModuleA.methodA();
        subModuleB.methodB();
        subModuleC.methodC();
    }
}

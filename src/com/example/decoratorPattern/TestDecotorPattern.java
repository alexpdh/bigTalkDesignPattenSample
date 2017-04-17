package com.example.decoratorPattern;

/**
 * 装饰模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-04-17 23:19
 */
public class TestDecotorPattern {
    /**
     * 装饰的方法是：首先用 ConcreteComponet 实例化对象 c ，
     * 然后用 ConcreteDecoterA 的实例化对象 d1 来包装 c ,
     * 再用 ConcreteDecoterB 的实例化对象 d2 来包装 d1 ,
     * 最终执行 d2 的operation()方法
     * @param args
     */
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecotorA d1 = new ConcreteDecotorA(c);
        ConcreteDecotorB d2 = new ConcreteDecotorB(d1);
        System.out.println(d2);
    }
}

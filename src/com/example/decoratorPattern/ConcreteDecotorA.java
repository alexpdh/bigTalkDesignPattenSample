package com.example.decoratorPattern;

/**
 * 装饰模式：具体装饰角色A
 *
 * @author pengdh
 * @date: 2017-04-17 23:10
 */
public class ConcreteDecotorA extends Decorator {
    // 本类的独有功能，区别于 ConcreteDecotorB
    private String addedState;
    public ConcreteDecotorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}

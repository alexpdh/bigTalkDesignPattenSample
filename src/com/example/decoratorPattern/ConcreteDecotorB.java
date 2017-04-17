package com.example.decoratorPattern;

/**
 * 装饰模式：具体装饰角色B
 *
 * @author pengdh
 * @date: 2017-04-17 23:15
 */
public class ConcreteDecotorB extends Decorator {
    public ConcreteDecotorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    /**
     * 本类独有的方法，以区别于ConcreteDecotorB
     */
    private void addedBehavior() {

    }
}

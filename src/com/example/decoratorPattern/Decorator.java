package com.example.decoratorPattern;

/**
 * 装饰模式：装饰角色
 *
 * @author pengdh
 * @date: 2017-04-17 23:06
 */
public abstract class Decorator implements Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 委派给构建
        component.operation();
    }
}

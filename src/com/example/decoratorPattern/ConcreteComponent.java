package com.example.decoratorPattern;

/**
 * 装饰模式：具体构建角色
 *
 * @author pengdh
 * @date: 2017-04-17 23:02
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象操作");
    }
}

package com.example.statePattern;

/**
 * 状态模式：具体状态类
 *
 * @author pengdh
 * @date: 2017-03-21 22:10
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        // 设置 ConcreteStateB 的下一状态是 ConcreteStateA
        context.setState( new ConcreteStateA());
        //context.request();
    }
}

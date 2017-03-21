package com.example.statePattern;

/**
 * 状态模式：具体状态类
 *
 * @author pengdh
 * @date: 2017-03-21 22:05
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        // 设置 ConcreteStateA 的下一状态是 ConcreteStateB
        context.setState( new ConcreteStateB());
        //context.request();
    }
}

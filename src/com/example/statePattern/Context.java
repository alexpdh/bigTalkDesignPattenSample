package com.example.statePattern;

/**
 * 状态模式：环境类
 *
 * @author pengdh
 * @date: 2017-03-21 22:01
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }
    // 对请求做处理并设置下一状态
    public void request() {
        state.handle(this);
    }
}

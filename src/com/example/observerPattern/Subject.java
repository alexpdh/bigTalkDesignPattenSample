package com.example.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式：抽象主题类
 *
 * @author pengdh
 * @date: 2017-05-30 12:06
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 增加观察者
     * @param observer
     */
    public void attach(Observer observer) {
        list.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void detach(Observer observer) {
        list.remove(observer);
    }

    /**
     * 发布通知
     */
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update();
        }
    }
}

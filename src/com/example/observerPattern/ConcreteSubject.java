package com.example.observerPattern;

/**
 * 观察者模式：具体主题类
 *
 * @author pengdh
 * @date: 2017-05-30 12:26
 */
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}

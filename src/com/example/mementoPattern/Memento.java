package com.example.mementoPattern;

/**
 * 备忘录模式：备忘录类
 *
 * @author pengdh
 * @date: 2017-07-22 20:05
 */
public class Memento {
  private String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}

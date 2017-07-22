package com.example.mementoPattern;

/**
 * 备忘录模式：管理者类
 *
 * @author pengdh
 * @date: 2017-07-22 20:05
 */
public class Caretaker {
  private Memento memento;

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }
}

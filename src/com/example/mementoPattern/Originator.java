package com.example.mementoPattern;

/**
 * 备忘录模式：发起人类
 *
 * @author pengdh
 * @date: 2017-07-22 20:02
 */
public class Originator {
  private String state;

  /**
   * 创建备忘录，将当前需要保存的信息保存。
   *
   * @return 一个新的备忘录对象
   */
  public Memento createMemento() {
    return new Memento(state);
  }

  /**
   * 恢复备忘录，将发起人对象恢复到备忘录对象所记载的状态
   * @param memento
   */
  public void restoreMemento(Memento memento) {
    this.state = memento.getState();
  }

  /**
   * 显示数据
   */
  public void show() {
    System.out.println("state：" + state);
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}

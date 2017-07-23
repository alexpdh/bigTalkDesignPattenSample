package com.example.compositePattern;

/**
 * 组合模式：抽象构建类
 *
 * @author pengdh
 * @date: 2017-07-23 18:52
 */
public abstract class Component {
  protected String name;

  public Component(String name) {
    this.name = name;
  }

  /**
   * 添加一个子部件对象
   * @param c
   */
  public abstract void add(Component c);

  /**
   * 删除一个子部件对象
   * @param c
   */
  public abstract void remove(Component c);

  /**
   * 显示目录树
   * @param depth
   */
  public abstract void display(String depth);
}

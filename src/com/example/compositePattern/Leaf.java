package com.example.compositePattern;

/**
 * 组合模式：树叶构件类
 *
 * @author pengdh
 * @date: 2017-07-23 18:59
 */
public class Leaf extends Component {

  public Leaf(String name) {
    super(name);
  }

  @Override
  public void add(Component c) {
    return;
  }

  @Override
  public void remove(Component c) {
    return;
  }

  @Override
  public void display(String depth) {
    System.out.println(depth + " " + name);
  }
}

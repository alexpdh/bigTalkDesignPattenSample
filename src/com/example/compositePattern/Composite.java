package com.example.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式：树枝构件类
 *
 * @author pengdh
 * @date: 2017-07-23 19:10
 */
public class Composite extends Component {

  private List<Component> childrenComopnents = new ArrayList<Component>();

  public Composite(String name) {
    super(name);
  }

  @Override
  public void add(Component c) {
    childrenComopnents.add(c);
  }

  @Override
  public void remove(Component c) {
    childrenComopnents.remove(c);
  }

  @Override
  public void display(String depth) {
    System.out.println(depth + " " + name);
    depth += "+";
    for (Component component : childrenComopnents) {
      component.display(depth);
    }
  }
}

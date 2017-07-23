package com.example.compositePattern;

/**
 * 组合模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-07-23 19:16
 */
public class TestCompositePattern {

  public static void main(String[] args) {
    // 添加根节点
    Composite root = new Composite("root");
    // 根节点上添加叶子节点
    root.add(new Leaf("Leaf A"));
    root.add(new Leaf("Leaf B"));

    // 添加树枝节点
    Composite comp = new Composite("Composite X");
    // 树枝节点上添加叶子节点
    comp.add(new Leaf("Leaf XA"));
    comp.add(new Leaf("Leaf XB"));
    // 将树枝节点添加到根节点
    root.add(comp);

    Composite comp2 = new Composite("Composite XY");
    comp2.add(new Leaf("Leaf XYA"));
    comp2.add(new Leaf("Leaf XYB"));
    root.add(comp2);

    root.add(new Leaf("Leaf C"));

    Leaf leaf = new Leaf("D");
    root.add(leaf);
    root.remove(leaf);

    root.display("+");
  }

}

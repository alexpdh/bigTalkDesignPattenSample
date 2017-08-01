---
title: Java设计模式（十九）：桥接模式
date: 2017-07-30 22:20:47
categories:  设计模式
tags: 结构型模式
---
#### 桥接模式（bridge pattern）
**桥接模式（bridge pattern）：**属于对象的结构型模式，将抽象部分与它的实现部分分离，使它们都可以独立地变化。

----------
#### 桥接模式UML图
![bridge-pattern](http://ojirj5wkr.bkt.clouddn.com/bridge-pattern.jpg)

由图可看出，系统包含了两个等级结构

1. 由抽象化角色和被提炼的抽象化角色组成的抽象化等级结构
2. 由实现化角色和两个具体的实现化角色组成的实现化等级结构

<!-- more -->

----------
#### 桥接模式涉及的角色
**抽象化（Abstraction）角色：**抽象化给出的定义，并保存一个对实现化对象的引用。
**被提炼的抽象化（RefineAbstraction）角色：**扩展抽象化角色，改变和修正父类对抽象化的定义。
**实现化（Implementor）角色：**这个角色给出实现化角色的接口，但不给出具体的实现。
**具体实现化（ConcreteImplementor）角色：**这个角色给出实现化角色接口的具体实现。

----------
#### 示例代码
**实现化抽象类 Implementor**

``` java
package com.example.bridge;

/**
 * 桥接模式：实现化抽象类
 *
 * @author pengdh
 * @date: 2017-07-30 23:32
 */
public abstract class Implementor {

  /**
   * 实现抽象部分需要的某些具体功能
   */
  public abstract void operationImpl();
}

```

**具体实现 A 类 ImplementorA**

``` java
package com.example.bridge;

/**
 * 桥接模式：具体实现 A 类
 *
 * @author pengdh
 * @date: 2017-07-30 23:41
 */
public class ImplementorA extends Implementor {

  @Override
  public void operationImpl() {
    System.out.println("具体实现 A 方法执行！");
  }
}

```

**具体实现 B 类 ImplementorB**

``` java
package com.example.bridge;

/**
 * 桥接模式：具体实现 B 类
 *
 * @author pengdh
 * @date: 2017-07-30 23:42
 */
public class ImplementorB extends Implementor {

  @Override
  public void operationImpl() {
    System.out.println("具体实现 B 方法执行！");
  }
}

```

**抽象化类 Abstraction**

``` java
package com.example.bridge;

/**
 * 桥接模式：抽象化类
 *
 * @author pengdh
 * @date: 2017-07-30 23:34
 */
public abstract class Abstraction {
  protected Implementor impl;

  protected Abstraction(Implementor impl) {
    this.impl = impl;
  }

  public abstract  void operation();

}

```

**被提炼的抽象化类 RefinedAbstraction**

``` java
package com.example.bridge;

/**
 * 桥接模式：被提炼的抽象化类
 *
 * @author pengdh
 * @date: 2017-07-30 23:36
 */
public class RefinedAbstraction extends Abstraction {

  protected RefinedAbstraction(Implementor impl) {
    super(impl);
  }

  @Override
  public void operation() {
    impl.operationImpl();
  }
}

```

**客户端测试类 BridgePatternTest**

``` java
package com.example.bridge;

/**
 * 桥接模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-07-30 23:43
 */
public class BridgePatternTest {

  public static void main(String[] args) {
    Abstraction ab1 = new RefinedAbstraction(new ImplementorA());
    ab1.operation();
    Abstraction ab2 = new RefinedAbstraction(new ImplementorB());
    ab2.operation();
  }
}

```

----------
#### 桥梁模式的优点
* 将抽象部分与它的实现部分分离

> 桥梁模式分离了抽象部分和实现部分，即实现系统可能有多种角度分类，每一种分类都有可能变化，那么就把这种多角度分离出来让它们独立变化，减少它们之间的耦合。

* 更好的扩展性

> 桥梁模式更好的利用了合成/聚合复用原则，使得抽象部分和实现部分可以分别独立地扩展，而不会相互影响，从而大大提高了系统的可扩展性。

----------
#### 参考文献
* <span style="color:red;font-size:14px;font-family:Microsoft YaHei;">大话设计模式</span>
* [<span style="color:blue;font-size:14px;font-family:Microsoft YaHei;font-style:oblique;">http://www.cnblogs.com/java-my-life</span>](http://www.cnblogs.com/java-my-life)
* [<span style="color:blue;font-size:14px;font-family:Microsoft YaHei;font-style:oblique;">源码地址：https://github.com/alexpdh/bigTalkDesignPattenSample</span>](http://www.cnblogs.com/java-my-life)

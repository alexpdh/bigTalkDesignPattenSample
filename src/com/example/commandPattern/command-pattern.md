---
title: Java设计模式（二十）：命令模式
date: 2017-08-01 21:49:10
categories:  设计模式
tags: 行为型模式
---
#### 命令模式（command pattern）
**命令模式（command pattern）：**属于对象的行为模式，将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销操作。

----------
#### 命令模式UML图
![command-pattern](http://ojirj5wkr.bkt.clouddn.com/command-pattern.jpg)
<!-- more -->

----------
#### 命令模式涉及的角色
**客户端(Client)角色：**创建一个具体命令(ConcreteCommand)对象并确定其接收者。
**命令(Command)角色：**声明了一个给所有具体命令类的抽象接口。
**具体命令(ConcreteCommand)角色：**定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法。
**请求者(Invoker)角色：**负责调用命令对象执行请求，相关的方法叫做行动方法。
**接收者(Receiver)角色：**负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。

----------
#### 示例代码
**接收者类 Receiver**

``` java
package com.example.commandPattern;

/**
 * 命令模式：接收者类
 *
 * @author pengdh
 * @date: 2017-08-01 22:19
 */
public class Receiver {

  /**
   * 真正执行命令相应的操作
   */
  public void action() {
    System.out.println("执行请求操作！");
  }
}

```

**命令接口 Command**

``` java
package com.example.commandPattern;

/**
 * 命令模式：命令接口
 *
 * @author pengdh
 * @date: 2017-08-01 22:23
 */
public interface Command {

  /**
   * 执行命令请求
   */
  void execute();
}

```

**具体命令类 ConcreteCommand**

``` java
package com.example.commandPattern;

/**
 * 命令模式：具体命令类
 * @author pengdh
 * @date: 2017-08-01 22:25
 */
public class ConcreteCommand implements Command {

  /**
   * 持有相应的接收者对象
   */
  private Receiver receiver;

  public ConcreteCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void execute() {
    //通常会转调接收者对象的相应方法，让接收者来真正执行功能
    receiver.action();
  }
}

```

**请求者类 Invoker**

``` java
package com.example.commandPattern;

/**
 * 命令模式：请求者类
 *
 * @author pengdh
 * @date: 2017-08-01 22:27
 */
public class Invoker {

  /**
   * 命令对象
   */
  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  /**
   * 行动方法
   */
  public void action() {
    command.execute();
  }
}

```

**客户端测试类 CommandPatternTest**

``` java
package com.example.commandPattern;

/**
 * 命令模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-08-01 22:29
 */
public class CommandPatternTest {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    Invoker invoker = new Invoker(command);
    invoker.action();
  }
}

```

----------
#### 命令模式的优点
* 松散的耦合

> 命令模式使得发起命令的对象——客户端，和具体实现命令的对象——接收者对象完全解耦，也就是说发起命令的对象完全不知道具体实现对象是谁，也不知道如何实现。

* 动态的控制

> 命令模式把请求封装起来，可以动态地对它进行参数化、队列化和日志化等操作，从而使得系统更灵活。

* 很自然的复合命令

> 命令模式中的命令对象能够很容易地组合成复合命令，也就是宏命令，从而使系统操作更简单，功能更强大。

* 更好的扩展性

> 由于发起命令的对象和具体的实现完全解耦，因此扩展新的命令就很容易，只需要实现新的命令对象，然后在装配的时候，把具体的实现对象设置到命令对象中，然后就可以使用这个命令对象，已有的实现完全不用变化。

----------
#### 参考文献
* <span style="color:red;font-size:14px;font-family:Microsoft YaHei;">大话设计模式</span>
* [<span style="color:blue;font-size:14px;font-family:Microsoft YaHei;font-style:oblique;">http://www.cnblogs.com/java-my-life</span>](http://www.cnblogs.com/java-my-life)
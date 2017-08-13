package com.example.interpreterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式：客户端测试类
 *
 * @author pengdh
 * @date: 2017-08-14 0:05
 */
public class InterpreterPatternTest {

  public static void main(String[] args) {
    InterpreterContext context = new InterpreterContext();
    List<AbstractExpresstion> list = new ArrayList<AbstractExpresstion>();
    list.add(new TerminalExpression());
    list.add(new NonTerminalExpresstion());
    list.add(new TerminalExpression());
    for (AbstractExpresstion exp : list) {
      exp.interpret(context);
    }
  }
}

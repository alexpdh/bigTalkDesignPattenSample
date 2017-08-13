package com.example.interpreterPattern;

/**
 * 解释器模式：非终结表达式类
 *
 * @author pengdh
 * @date: 2017-08-14 0:04
 */
public class NonTerminalExpresstion extends AbstractExpresstion {

  @Override
  public void interpret(InterpreterContext context) {
    System.out.println("非终端解释器");
  }
}

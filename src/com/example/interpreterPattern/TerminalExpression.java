package com.example.interpreterPattern;

/**
 * 解释器模式：终结符表达式类
 *
 * @author pengdh
 * @date: 2017-08-14 0:01
 */
public class TerminalExpression extends AbstractExpresstion {

  @Override
  public void interpret(InterpreterContext context) {
    System.out.println("终端解释器");
  }
}

package com.example.interpreterPattern;

/**
 * 解释器模式：抽象表达式类
 *
 * @author pengdh
 * @date: 2017-08-13 23:57
 */
public abstract class AbstractExpresstion {

  /**
   * 以给定的环境为准，解释给定的任何一个表达式
   * @param context
   */
  public abstract void interpret(InterpreterContext context);
}

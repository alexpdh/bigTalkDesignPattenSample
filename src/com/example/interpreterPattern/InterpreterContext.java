package com.example.interpreterPattern;

/**
 * 解释器模式：环境类
 *
 * @author pengdh
 * @date: 2017-08-13 23:56
 */
public class InterpreterContext {
  private String input;
  private String output;

  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }
}

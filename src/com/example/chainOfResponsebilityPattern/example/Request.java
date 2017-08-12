package com.example.chainOfResponsebilityPattern.example;

/**
 * 请求类
 *
 * @author pengdh
 * @date: 2017-03-20 23:03
 */
public class Request {
    // 申请类别
    private String requestType;
    // 申请内容
    private String requestContent;
    // 申请数量
    private int number;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

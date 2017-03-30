package com.example.chainOfResponsebilityPattern;

/**
 * 责任链模式：经理类
 *
 * @author pengdh
 * @date: 2017-03-20 23:08
 */
public class CommonManager extends Manger {
    public CommonManager(String name) {
        super(name);
    }
    @Override
    public void requestApplications (Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(name +"："  + request.getRequestContent() + request.getNumber() + "被批准");
        } else if (getSuperior() != null) {
            getSuperior().requestApplications(request);
        }
    }
}

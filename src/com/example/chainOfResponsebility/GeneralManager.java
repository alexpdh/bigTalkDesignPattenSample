package com.example.chainOfResponsebility;

/**
 * 责任链模式：总经理类
 *
 * @author pengdh
 * @date: 2017-03-20 23:30
 */
public class GeneralManager extends Manger {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(name +"：" + request.getRequestContent() + request.getNumber() + "被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
            System.out.println(name +"：" + request.getRequestContent() + request.getNumber() + "被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
            System.out.println(name +"：" + request.getRequestContent() + request.getNumber() + "再说吧");
        }
    }
}

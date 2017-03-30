package com.example.chainOfResponsebility;

/**
 * 责任链模式：总监类
 *
 * @author pengdh
 * @date: 2017-03-20 23:26
 */
public class MajorDomo extends Manger {

    public MajorDomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(name +"："  + request.getRequestContent() + request.getNumber() + "被批准");
        } else if (getSuperior() != null) {
            getSuperior().requestApplications(request);
        }
    }
}

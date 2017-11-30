package com.itcast.yitao.design.model;

/**
 * Created by 311198 on 2017/2/7.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this smsSender!!");
    }
}

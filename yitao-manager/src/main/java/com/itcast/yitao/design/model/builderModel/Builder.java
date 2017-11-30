package com.itcast.yitao.design.model.builderModel;


import com.itcast.yitao.design.model.MailSender;
import com.itcast.yitao.design.model.Sender;
import com.itcast.yitao.design.model.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 311198 on 2017/2/8.
 * 建造者模式 将许多的功能集成到一个类中
 */
public class Builder {

    List<Sender> list=new ArrayList<>();

    public void smsProduceSender(int num){
        for (int i = 0; i <num ; i++) {
            list.add(new SmsSender());
        }
    }

    public void mailProduceSender(int num){
        for (int i = 0; i < num; i++) {
            list.add(new MailSender());
        }
    }
}

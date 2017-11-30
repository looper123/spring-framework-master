package com.itcast.yitao.design.model.factoryModel;

import com.itcast.yitao.design.model.MailSender;
import com.itcast.yitao.design.model.Sender;
import com.itcast.yitao.design.model.SmsSender;

/**
 * Created by 311198 on 2017/2/7.
 * 多工厂模式
 */
public class SenderFactorise {

    public Sender mailSender(){
        return new MailSender();
    }

    public Sender smsSender(){
        return new SmsSender();
    }
}

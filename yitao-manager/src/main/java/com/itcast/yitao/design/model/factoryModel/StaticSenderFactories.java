package com.itcast.yitao.design.model.factoryModel;

import com.itcast.yitao.design.model.MailSender;
import com.itcast.yitao.design.model.Sender;
import com.itcast.yitao.design.model.SmsSender;

/**
 * Created by 311198 on 2017/2/7.
 */
public class StaticSenderFactories {

    public static Sender mailSender(){
        return new MailSender();
    }

    public  static Sender smsSender(){
        return new SmsSender();
    }
}

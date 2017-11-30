package com.itcast.yitao.design.model.abstractFactoryModel;

import com.itcast.yitao.design.model.MailSender;
import com.itcast.yitao.design.model.Sender;

/**
 * Created by 311198 on 2017/2/7.
 * 抽象工厂类
 */
public class MailFactorySender  implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}

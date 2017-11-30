package com.itcast.yitao.design.model.abstractFactoryModel;

import com.itcast.yitao.design.model.Sender;
import com.itcast.yitao.design.model.SmsSender;

/**
 * Created by 311198 on 2017/2/7.
 * 抽象工厂类
 */
public class SmsFactorySender implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

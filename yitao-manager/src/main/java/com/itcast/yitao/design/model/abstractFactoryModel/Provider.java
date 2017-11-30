package com.itcast.yitao.design.model.abstractFactoryModel;

import com.itcast.yitao.design.model.Sender;

/**
 * Created by 311198 on 2017/2/7.
 * 给所有工厂类提供接口类 ，降低耦合性（如果还需要添加工厂类 只需要在写一个类来实现Provider接口 ，不需要在原来的工厂类修改代码）
 */
public interface Provider {

    public Sender produce();
}

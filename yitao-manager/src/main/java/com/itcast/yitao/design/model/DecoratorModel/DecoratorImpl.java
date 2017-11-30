package com.itcast.yitao.design.model.DecoratorModel;

/**
 * Created by 311198 on 2017/2/8.
 * 装饰者模式
 * DecoratorImpl 可以为Source类动态的添加一些功能
 */
public class DecoratorImpl implements OraginalInterface {

    private OraginalInterface oraginalImpl;

    public DecoratorImpl(OraginalInterface oraginalImpl) {
        this.oraginalImpl = oraginalImpl;
    }

//    给原方法装饰
    @Override
    public void method() {
        System.out.println("before method");
        oraginalImpl.method();
        System.out.println("after method");
    }
}

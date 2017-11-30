package com.itcast.yitao.design.model.adpaterModel;

/**
 * Created by 311198 on 2017/2/8.
 * 对象适配器
 * 不继承Source类来获取其中的方法，直接直接获取Source类的实例
 */
public class ObjectAdapter implements Targetable {

    private Source source;

    public ObjectAdapter(Source source) {
//        super();
        this.source = source;
    }

    @Override
    public void method1() {
          source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

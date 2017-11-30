package com.itcast.yitao.design.model.ChainofResponsibilityModel;

/**
 * Created by 311198 on 2017/2/13.
 * 责任链模式：Abstracthandler类提供了get和set方法，方便MyHandle类设置和修改引用对象，
 * MyHandle类是核心，实例化后生成一系列相互持有的对象，构成一条链。
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }


    @Override
    public void operator() {
        System.out.println(name+"deal");
        if(getHandler() !=null){
            getHandler().operator();
        }
    }


}

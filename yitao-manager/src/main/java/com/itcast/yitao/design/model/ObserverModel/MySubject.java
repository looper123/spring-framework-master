package com.itcast.yitao.design.model.ObserverModel;

/**
 * Created by 311198 on 2017/2/13.
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation(){
        System.out.println("update.............");
        notifyObject();
    }
}

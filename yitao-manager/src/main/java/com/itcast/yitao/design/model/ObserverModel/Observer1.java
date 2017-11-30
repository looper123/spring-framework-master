package com.itcast.yitao.design.model.ObserverModel;

/**
 * Created by 311198 on 2017/2/13.
 */
public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println("Observer1 has received change");
    }
}

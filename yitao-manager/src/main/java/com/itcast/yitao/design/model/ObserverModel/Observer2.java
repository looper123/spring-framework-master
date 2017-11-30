package com.itcast.yitao.design.model.ObserverModel;

/**
 * Created by 311198 on 2017/2/13.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer2 has received  change");
    }
}

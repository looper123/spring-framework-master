package com.itcast.yitao.syn;

/**
 * Created by 311198 on 2017/2/18.
 */
public class HungryDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("hungryman thread"+Thread.currentThread().getName()+"---"+ HungryMan.getInstance());
    }
}

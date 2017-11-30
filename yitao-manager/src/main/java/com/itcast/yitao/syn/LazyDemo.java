package com.itcast.yitao.syn;

/**
 * Created by 311198 on 2017/2/18.
 */
public class LazyDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("lazyMan thread"+Thread.currentThread().getName()+"---"+ LazyMan.getInstance());
    }
}

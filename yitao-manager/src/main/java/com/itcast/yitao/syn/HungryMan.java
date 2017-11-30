package com.itcast.yitao.syn;

/**
 * Created by 311198 on 2017/2/18.
 * 饿汉单例
 */
public class HungryMan {

    public HungryMan() {
    }

    //类初始化的时候就创建了对象
    private static final HungryMan instance = new HungryMan();

    public static HungryMan getInstance() {
        return instance;
    }
}

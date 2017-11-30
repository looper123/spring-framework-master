package com.itcast.yitao.design.model.ProxyModel;

/**
 * Created by 311198 on 2017/2/8.
 */
public class Resource implements Resourceable{

    @Override
    public void method() {
        System.out.println("this is oragin method");
    }
}

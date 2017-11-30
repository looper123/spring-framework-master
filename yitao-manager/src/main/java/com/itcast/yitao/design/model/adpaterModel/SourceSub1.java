package com.itcast.yitao.design.model.adpaterModel;

/**
 * Created by 311198 on 2017/2/8.
 * 接口适配器模式
 * 继承并重写 我们真正需要的方法
 */
public class SourceSub1 extends Wrappper {

    public void method1(){
        System.out.println("this is sourceable class first sub");
    }
}

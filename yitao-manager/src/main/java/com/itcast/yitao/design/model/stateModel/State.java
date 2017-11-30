package com.itcast.yitao.design.model.stateModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public class State {

    private String value;


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public  void method1(){

        System.out.println("执行method1");
    }

    public void method2(){
        System.out.println("执行method2");
    }
}

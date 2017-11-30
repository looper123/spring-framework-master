package com.itcast.yitao.design.model.stateModel;

/**
 * Created by 311198 on 2017/2/14.
 *
 * 状态模式:当对象的状态改变时，同时改变其行为
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){
        if (this.state.getValue().equals("state1")){
            state.method1();
        }else if (this.state.getValue().equals("state2")){
            state.method2();
        }
    }
}

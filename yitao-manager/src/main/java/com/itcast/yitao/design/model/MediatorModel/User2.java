package com.itcast.yitao.design.model.MediatorModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public class User2 extends User {
    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}

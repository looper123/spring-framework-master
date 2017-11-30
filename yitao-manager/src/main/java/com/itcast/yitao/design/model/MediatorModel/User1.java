package com.itcast.yitao.design.model.MediatorModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public class User1 extends User {

    public User1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}

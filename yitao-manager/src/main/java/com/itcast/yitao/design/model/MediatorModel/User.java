package com.itcast.yitao.design.model.MediatorModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public abstract class User {

    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}

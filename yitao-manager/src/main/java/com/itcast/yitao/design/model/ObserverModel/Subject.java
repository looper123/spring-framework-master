package com.itcast.yitao.design.model.ObserverModel;

/**
 * Created by 311198 on 2017/2/13.
 */
public interface Subject {

    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObject();

    public void operation();
}

package com.itcast.yitao.design.model.ObserverModel;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by 311198 on 2017/2/13.
 * 观察者模式 当你订阅了该文章，如果后续有更新，会及时通知你。其实，
 * 简单来讲就一句话：当一个对象变化时，其它依赖该对象的对象都会收到通知，
 * 并且随着变化！对象之间是一种一对多的关系。先来看看关系图：
 */
public class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<Observer>();
//   添加观察者
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

//    删除观察者
    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

//    通知所有类
    @Override
    public void notifyObject() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }

    @Override
    public void operation() {

    }
}

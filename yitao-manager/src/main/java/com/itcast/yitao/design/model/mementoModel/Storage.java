package com.itcast.yitao.design.model.mementoModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public class Storage {

    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

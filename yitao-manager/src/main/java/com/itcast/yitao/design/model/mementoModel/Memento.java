package com.itcast.yitao.design.model.mementoModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public class Memento {

    public String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

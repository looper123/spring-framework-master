package com.itcast.yitao.design.model.mementoModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public class Oraginal {

    private String value;

    public Oraginal(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

//    创建一个备忘录
    public Memento  createMemento(){
        return new Memento(value);
    }

//   回复备忘录
    public  void restoreMemento(Memento memento){
        this.value=memento.getValue();
    }
}

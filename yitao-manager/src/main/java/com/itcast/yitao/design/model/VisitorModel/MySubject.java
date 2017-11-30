package com.itcast.yitao.design.model.VisitorModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}

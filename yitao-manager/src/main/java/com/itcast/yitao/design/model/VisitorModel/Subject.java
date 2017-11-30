package com.itcast.yitao.design.model.VisitorModel;

/**
 * Created by 311198 on 2017/2/14.
 */
public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}

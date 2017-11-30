package com.itcast.yitao.design.model.iteratorModel;

/**
 * Created by 311198 on 2017/2/13.
 */
public interface Iterator {

//    前移
    public Object previous();

//    后移
    public Object next();

//    是否有下一个元素
    public boolean hasNext();

//    获取第一个元素
    public Object getFirst();
}

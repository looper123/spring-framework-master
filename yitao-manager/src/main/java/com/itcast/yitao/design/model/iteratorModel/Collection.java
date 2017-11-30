package com.itcast.yitao.design.model.iteratorModel;

/**
 * Created by 311198 on 2017/2/13.
 */
public interface Collection {

    public Iterator Iterator();

//    获取结合元素
    public Object get(int object);

//    获取集合大小
    public  int size();
}

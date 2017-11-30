package com.itcast.yitao.design.model.iteratorModel;

/**
 * Created by 311198 on 2017/2/13.
 */
public class MyCollection implements Collection {

    public Object[] ob;

    public MyCollection(Object[] ob) {
        this.ob = ob;
    }

    @Override
    public Iterator Iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return ob[i];
    }

    @Override
    public int size() {
        return ob.length;
    }
}

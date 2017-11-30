package com.itcast.yitao.design.model.singletonModel;

/**
 * Created by 311198 on 2017/2/7.
 */
public class Singleton {

//    私有化构造
    private Singleton() {
    }

//    对外提供获取构造的方法
    public static Singleton getInstance(){
          return SingletonFactory.instance;
    }

//   内部使用静态类来获取单例
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }
}

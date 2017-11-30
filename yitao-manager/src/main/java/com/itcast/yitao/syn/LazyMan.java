package com.itcast.yitao.syn;

/**
 * Created by 311198 on 2017/2/18.
 * 懒汉单例
 */
public class LazyMan {

    private LazyMan() {
    }

    //初始化为null 有外部调用时才创建对象
    private static LazyMan instance = null;
    //锁对象
    private static String lock=new String();

    public static LazyMan getInstance() {
        //在公共代码块添加同步锁
        //第一个判断是为了提高后续线程的执行效率
        if(instance ==null){
            synchronized (lock){
                //第二个判断（必须）保证在第一次多个线程进入外面的判断后，线程保证唯一
                if (instance == null) {
                    instance= new LazyMan();
                }
            }
        }
        return instance;
    }
}

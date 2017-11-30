package com.itcast.yitao.design.model.ProxyModel;

/**
 * Created by 311198 on 2017/2/8.
 * 代理模式 就是采用一个代理类调用原有的方法，且对产生的结果进行控制
 */
public class Proxy implements Resourceable {

    private Resourceable resource;

    public Proxy(Resourceable resource) {
        this.resource = resource;
    }

    @Override
    public void method() {
        before();
        resource.method();
        after();
    }

    private void after() {
        System.out.println("after proxy");
    }

    private void before() {
        System.out.println("before proxy");
    }


}

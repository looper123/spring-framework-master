package com.itcast.yitao.design.model.strategyModel;

/**
 * Created by 311198 on 2017/2/9.
 * 具体算法实现类
 */
public class Plus  extends AbstractCalculator implements  ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arr = split(exp,"\\+");
        return arr[0]+arr[1];
    }
}

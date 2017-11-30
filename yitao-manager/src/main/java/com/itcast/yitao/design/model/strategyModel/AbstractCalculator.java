package com.itcast.yitao.design.model.strategyModel;

/**
 * Created by 311198 on 2017/2/9.
 * 辅助类
 */
public class AbstractCalculator {

    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}

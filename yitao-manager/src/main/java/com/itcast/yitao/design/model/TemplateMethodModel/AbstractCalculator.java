package com.itcast.yitao.design.model.TemplateMethodModel;

/**
 * Created by 311198 on 2017/2/9.
 * 模板方法模式
 */
public abstract class AbstractCalculator {

    //    主方法 用于调用其他方法
    public final int calculate(String exp, String opt) {
        int array[] = split(exp, opt);
        return calculate(array[0], array[1]);
    }

    /*被子类重写的方法*/
    abstract public int calculate(int num1, int num2);

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}

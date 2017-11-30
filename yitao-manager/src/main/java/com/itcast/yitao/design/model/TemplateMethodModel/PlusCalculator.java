package com.itcast.yitao.design.model.TemplateMethodModel;

/**
 * Created by 311198 on 2017/2/9.
 */
public class PlusCalculator extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}

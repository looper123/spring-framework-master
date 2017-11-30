package com.itcast.yitao.design.model.interpreterModel;

/**
 * Created by 311198 on 2017/2/14.
 * 加法解析器
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}

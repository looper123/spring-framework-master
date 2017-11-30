package com.itcast.yitao.design.model.interpreterModel;

/**
 * Created by 311198 on 2017/2/14.
 * 解释器模式：一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄
 *减法解析器
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}

package com.itcast.yitao.design.model.CommandModel;

/**
 * Created by 311198 on 2017/2/13.
 */
public class Invoker {

    private  Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}

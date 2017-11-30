package com.itcast.yitao.design.model.FacadeModel;

/**
 * Created by 311198 on 2017/2/8.
 * 外观模式  将他们的关系放在一个Facade类中，降低了类类之间的耦合度
 */
public class Computer {

    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void start(){
        cpu.start();
        disk.start();
        memory.start();
    }

    public void shutDown(){
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
    }
}

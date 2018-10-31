package com.zoub.facade_pattern;

public class Facade {

    ModuleA moduleA = new ModuleA();
    ModuleB moduleB = new ModuleB();
    ModuleC moduleC = new ModuleC();

    /**
     * 下面这些是ABC模块对子系统外部提供的方法
     * */
    public void a1(){
        moduleA.a1();
    }

    public void b1(){
        moduleB.b1();
    }

    public void c1(){
        moduleC.c1();
    }

    public void test(){
        a1();
        b1();
        c1();
    }
}

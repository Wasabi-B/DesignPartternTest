package com.zoub.decorator_pattern;

/**
 * 具体构件角色“大圣本尊”猢狲类
 * */
public class Monkey implements TheGreatSage{

    public Monkey() {
        super();
        System.out.println("我是猴子");
    }

    @Override
    public void move() {
        //代码
        System.out.println("Monkey Move.");
    }
}

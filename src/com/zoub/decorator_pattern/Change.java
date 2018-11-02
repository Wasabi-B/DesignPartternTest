package com.zoub.decorator_pattern;

/**
 * 抽象装饰角色“七十二变”
 * */
public class Change implements TheGreatSage {

    private TheGreatSage sage;

    public Change(TheGreatSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        //代码
        sage.move();
    }
}

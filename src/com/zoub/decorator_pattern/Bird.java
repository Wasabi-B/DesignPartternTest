package com.zoub.decorator_pattern;

/**
 * 具体装饰角色“鸟儿”
 * */
public class Bird extends Change {

    public Bird(TheGreatSage sage) {
        super(sage);
        System.out.println("我是鸟");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Bird Move.");
    }
}

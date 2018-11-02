package com.zoub.decorator_pattern;

/**
 * 具体装饰角色“鱼儿”
 * */
public class Fish extends Change {

    public Fish(TheGreatSage sage) {
        super(sage);
        System.out.println("我是鱼");
    }

    @Override
    public void move() {
//        super.move();
        //代码
        System.out.println("Fish Move");
    }
}

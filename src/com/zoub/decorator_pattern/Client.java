package com.zoub.decorator_pattern;

/**
 * 客户端调用
 * */
public class Client {

    public static void main(String[] args){
        TheGreatSage sage = new Monkey();
        //第一种写法 单层装饰
        TheGreatSage bird = new Bird(sage);
        TheGreatSage fish = new Fish(bird);
        //第二种写法 双层装饰
//        TheGreatSage fish2 = new Fish(new Bird(sage));
        sage.move();
        bird.move();
        fish.move();
//        fish2.move();

        /**
         * “大圣本尊”是ConcreteComponent类，而“鸟儿”和“鱼儿”是装饰类。要装饰的是“大圣本尊”，也是
         * 猢狲实例。
         *
         * 上面的例子中，系统把大圣从一只猢狲装饰成了一只鸟儿（把鸟儿的功能加到了猢狲身上），然后又把鸟儿
         * 装饰成了一条鱼儿（把鱼儿的功能加到了猢狲+鸟儿身上，得到了猢狲+鸟儿+鱼儿）。
         * */
    }
}

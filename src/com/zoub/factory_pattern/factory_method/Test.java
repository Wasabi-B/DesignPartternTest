package com.zoub.factory_pattern.factory_method;

/**
 * 场景描述：
 * 小明（客户端）想要买一个灯泡，他不认识工厂，只能去供销店（工厂类）买，于是和老板说“我要一个灯泡”
 * ，老板说“没问题！稍等”。转身到了后院，对生产灯泡的小弟（灯泡的工厂子类）吆喝一声，给我找个灯泡！
 * 不一会灯泡造好了，老板拿给小明，“嘿嘿，灯泡给你做了一个，试试”，小明把灯泡拧在灯口，开关了两下
 * */
public class Test {
    public static void main(String[] args){
        ICreator creator = new BulbCreator();
        ILight light = creator.createLight();
        light.turnOn();
        light.turnOff();

        creator = new TubeCreator();
        light = creator.createLight();
        light.turnOn();
        light.turnOff();
    }
}

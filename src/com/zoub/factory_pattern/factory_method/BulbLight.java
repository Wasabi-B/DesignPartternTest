package com.zoub.factory_pattern.factory_method;

/**
 * 具体产品，这个角色实现了抽象产品所有声明的接口，工厂方法模式所创建的每一个对象都是某个具体产品的实例
 * */
public class BulbLight implements ILight {
    @Override
    public void turnOn() {
        System.out.println("BulbLight turns on.");
    }

    @Override
    public void turnOff() {
        System.out.println("BulbLight turns off.");
    }
}

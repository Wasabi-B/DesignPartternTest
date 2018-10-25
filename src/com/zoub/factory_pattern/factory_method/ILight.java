package com.zoub.factory_pattern.factory_method;

/**
 * 抽象产品，工厂方法模式所创建的对象的超类，也就是所有产品类的共同父类或共同拥有的忌口。
 * 在实际的系统中，这个角色也尝尝使用抽象类实现
 * */
public interface ILight {
    void turnOn();
    void turnOff();
}

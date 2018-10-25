package com.zoub.factory_pattern.factory_method;
/**
 * 抽象工厂，担任这个角色的是工厂方法模式的核心，任何在模式中创建对象的工厂类必须实现这个接口。
 * 在实际的系统中，这个角色也常常使用抽象类实现
 * */
public interface ICreator {

    ILight createLight();
}

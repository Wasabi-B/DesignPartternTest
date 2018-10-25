package com.zoub.factory_pattern.factory_method;

/**
 * 具体工厂，担任这个角色的是实现抽象工厂借口的具体Java类。
 * 具体工厂角色含有与业务密切相关的逻辑，这个角色也尝尝使用抽象类实现。
 * */
public class BulbCreator implements ICreator {
    @Override
    public ILight createLight() {
        return new BulbLight();
    }
}

package com.zoub.factory_pattern.simple_factory;

/**
 * 工厂角色：负责实现创建所有实例的内部逻辑
 * */
public class SimpleFactoryDemo {
    public static final int DOMAIN = 0;
    public static final int PASSWORD = 1;

    /**
     * 优点：使用工厂类，外界不在关心如何创造各种具体的产品，只提供一个产品的名称作为参数传给工厂，
     * 就可以直接得到想要的实例，并且可以按照接口规范来调用产品对象的所有功能（方法）
     * */
    public static Login factory(int type){
        if (type == DOMAIN){
            return new DomainLogin();
        }else if (type == PASSWORD){
            return new PasswordLogin();
        }else {
            throw new RuntimeException("没有找到登录类型");
        }
    }
}

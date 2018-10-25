package com.zoub.factory_pattern.simple_factory;

/**
 * 抽象产品角色：所有对象的父类，负责描述所有实例共有的公共接口
 * */
public interface Login {

    public boolean vertify(String name,String password);

    public String getLoginType();
}

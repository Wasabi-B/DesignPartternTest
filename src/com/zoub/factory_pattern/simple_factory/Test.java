package com.zoub.factory_pattern.simple_factory;

public class Test {
    public static void main(String[] args){
        int loginType = SimpleFactoryDemo.DOMAIN;
        String name = "admin";
        String password = "123";
        Login login = SimpleFactoryDemo.factory(loginType);
        boolean vertify = login.vertify(name, password);
        if (vertify){
            System.out.println("使用"+login.getLoginType()+"登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}

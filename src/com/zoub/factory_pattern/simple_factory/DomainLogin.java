package com.zoub.factory_pattern.simple_factory;

/**
 * 具体产品角色：是创建目标，所有创建的对象都充当这个角色的某个具体类的实例
 * */
public class DomainLogin implements Login {
    @Override
    public boolean vertify(String name, String password) {
        if ("admin".equals(name) && "123".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getLoginType() {
        return DomainLogin.class.getSimpleName();
    }
}

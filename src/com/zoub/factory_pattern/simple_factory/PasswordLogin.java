package com.zoub.factory_pattern.simple_factory;

public class PasswordLogin implements Login{
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
        return  PasswordLogin.class.getSimpleName();
    }
}

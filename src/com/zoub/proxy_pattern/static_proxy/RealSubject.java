package com.zoub.proxy_pattern.static_proxy;

/**
 * 步骤2： 创建真实对象类（RealSubject）,即”我“
 * */
public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台Mac");
    }
}

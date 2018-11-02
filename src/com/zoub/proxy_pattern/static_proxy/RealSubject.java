package com.zoub.proxy_pattern.static_proxy;

public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台Mac");
    }
}

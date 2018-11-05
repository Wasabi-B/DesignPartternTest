package com.zoub.proxy_pattern.static_proxy;
/**
 * 步骤1： 创建抽象对象接口（Subject）：声明你（真实对象）需要让代购（代理对象）帮忙做的事（买Mac）
 * */
public interface Subject {
    void buyMac();
}

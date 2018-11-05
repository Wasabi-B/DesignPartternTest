package com.zoub.proxy_pattern.static_proxy;
/**
 * 步骤4：客户端调用
 * */
public class ProxyPattern {

    public static void main(String[] a){
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}

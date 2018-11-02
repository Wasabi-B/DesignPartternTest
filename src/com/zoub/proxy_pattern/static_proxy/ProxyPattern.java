package com.zoub.proxy_pattern.static_proxy;

public class ProxyPattern {

    public static void main(String[] a){
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}

package com.zoub.adapter_pattern;

/**
 * 对象的适配器模式
 * */
public class ObjectAdapter220V implements Target {

    private PowerPort220V powerPort220V;

    public ObjectAdapter220V(PowerPort220V adaptee){
        powerPort220V = adaptee;
    }
    @Override
    public void Convert_110v() {
        this.powerPort220V.Output_220V();
    }
}

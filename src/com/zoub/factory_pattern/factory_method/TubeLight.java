package com.zoub.factory_pattern.factory_method;

public class TubeLight implements ILight {
    @Override
    public void turnOn() {
        System.out.println("TubeLight turns on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TubeLight turns off.");
    }
}

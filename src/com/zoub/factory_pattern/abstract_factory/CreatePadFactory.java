package com.zoub.factory_pattern.abstract_factory;

public class CreatePadFactory implements AbstractFactory {
    @Override
    public Apple createAppleStyle() {
        return new Ipad();
    }

    @Override
    public Sumsung createSumsungStyle() {
        return new Tabs();
    }
}

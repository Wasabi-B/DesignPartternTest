package com.zoub.factory_pattern.abstract_factory;

public class CreatePhoneFactory implements AbstractFactory {
    @Override
    public Apple createAppleStyle() {

        return new Iphone();
    }

    @Override
    public Sumsung createSumsungStyle() {

        return new Note();
    }
}

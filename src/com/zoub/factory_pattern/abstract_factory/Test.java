package com.zoub.factory_pattern.abstract_factory;

public class Test {
    public static void main(String[] args){
        AbstractFactory factory = new CreatePhoneFactory();
        Apple appleStyle = factory.createAppleStyle();
        appleStyle.appleStyle();
        Sumsung sumsungStyle = factory.createSumsungStyle();
        sumsungStyle.BangziStyle();

        factory = new CreatePadFactory();
        appleStyle = factory.createAppleStyle();
        appleStyle.appleStyle();
        sumsungStyle = factory.createSumsungStyle();
        sumsungStyle.BangziStyle();
    }
}

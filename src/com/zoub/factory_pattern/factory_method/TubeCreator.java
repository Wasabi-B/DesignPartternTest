package com.zoub.factory_pattern.factory_method;

public class TubeCreator implements ICreator {
    @Override
    public ILight createLight() {
        return new TubeLight();
    }
}

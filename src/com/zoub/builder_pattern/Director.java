package com.zoub.builder_pattern;

public class Director {
    private Builder mBuilder = null;

    public Director(Builder builder){
        mBuilder = builder;
    }

    /**
     * 构建对象
     *
     *
     * */
    public void construct(int cpu,int ram,String os){
        mBuilder.buildCPU(cpu);
        mBuilder.buildRAM(ram);
        mBuilder.buildOS(os);
    }
}

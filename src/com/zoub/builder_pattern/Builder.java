package com.zoub.builder_pattern;
/**
 * builder抽象类
 * */
public abstract class Builder {

    //设置CPU核心数
    public abstract void buildCPU(int core);

    //设置内存
    public abstract void buildRAM(int gb);

    //设置操作系统
    public abstract void buildOS(String os);

    //创建电脑
    public abstract Computer create();
}

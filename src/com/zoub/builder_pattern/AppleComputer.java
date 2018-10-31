package com.zoub.builder_pattern;

/**
 * 具体产品类
 * */
public class AppleComputer extends Computer{
    @Override
    public void setCPU(int core) {
        mCpuCore = core;
    }

    @Override
    public void setRAM(int gb) {
        mRamSize = gb;
    }

    @Override
    public void setOS(String os) {
        mOs = os;
    }
}

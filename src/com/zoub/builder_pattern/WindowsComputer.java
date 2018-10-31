package com.zoub.builder_pattern;

public class WindowsComputer extends Computer {

    private WindowsPCBuilder mBuilder;

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

    public void setBuiler(WindowsPCBuilder builer){
        mCpuCore = builer.mCore;
        mRamSize = builer.ram;
        mOs = builer.os;
    }
}

package com.zoub.builder_parttern;

import com.sun.java.swing.plaf.windows.WindowsButtonUI;

public class WindowsPCBuilder {

    private WindowsComputer mComputer = new WindowsComputer();

    public int mCore;
    public int ram;
    public String os;

    public WindowsPCBuilder buildCPU(int core) {
//        mComputer.setCPU(core);
        mCore = core;
        return this;
    }

    public WindowsPCBuilder buildRAM(int gb){
//        mComputer.setRAM(gb);
        this.ram = gb;
        return this;
    }

    public WindowsPCBuilder buildOS(String os){
//        mComputer.setOS(os);
        this.os = os;
        return this;
    }

    public Computer build(){
        mComputer.setBuiler(this);
        return mComputer;
    }


}

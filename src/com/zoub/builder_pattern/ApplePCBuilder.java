package com.zoub.builder_pattern;

public class ApplePCBuilder extends Builder {

    private Computer computer = new AppleComputer();

    @Override
    public void buildCPU(int core) {
        computer.setCPU(core);
    }

    @Override
    public void buildRAM(int gb) {
        computer.setRAM(gb);
    }

    @Override
    public void buildOS(String os) {
        computer.setOS(os);
    }

    @Override
    public Computer create() {
        return computer;
    }
}

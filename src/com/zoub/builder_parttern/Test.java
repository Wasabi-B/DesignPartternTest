package com.zoub.builder_parttern;

public class Test {
    public static void main(String[] args){
        //构建器
        Builder builder = new ApplePCBuilder();
        //指挥者
        Director director = new Director(builder);
        //封装构建过程，4核，2GB，windows系统
        director.construct(4,2,"Mac");
        //构建电脑，输出相关信息
        System.out.println("Computer Info:"+builder.create().toString());

        WindowsPCBuilder windowsPCBuilder = new WindowsPCBuilder();
        WindowsComputer windows = (WindowsComputer) windowsPCBuilder.buildCPU(8)
                .buildOS("windows")
                .buildRAM(4)
                .build();
        System.out.println("Computer Info : "+ windows.toString());
    }

}

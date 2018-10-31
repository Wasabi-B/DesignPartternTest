package com.zoub.adapter_pattern;

public class AdapterParttern {

    public static void main(String[] args){

        Target mAdapter220V = new Adapter220V();
        ImportedMachine machine = new ImportedMachine();

        //用户拿着进口机器插上适配器（调用Convert_110v()方法）
        //再将适配器插上原有插头（Convert_110v()方法内部调用Output_220v()方法输出220V）
        //适配器只是个外壳，对外提供110V，但本质还是220V进行供电
        mAdapter220V.Convert_110v();
        machine.work();

        //对象适配器模式
        Target objectAdapter = new ObjectAdapter220V(new PowerPort220V());
        objectAdapter.Convert_110v();
        machine.work();
    }
}

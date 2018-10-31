package com.zoub.adapter_pattern;

/**
 * 适配器类 (类适配器模式，与原类是继承关系)
 * */
public class Adapter220V extends PowerPort220V implements Target {
    //期待的插头要求调用Convert_110V(),但原有插头没有
    //因此适配器补充上这个方法名
    //但实际上Convert_110V()只是调用原有插头的Output_220v()方法的内容
    //所以适配器只是将Output_220V()做了一层封装，封装成Target可以调用的Convert_110V()而已

    @Override
    public void Convert_110v() {
        this.Output_220V();
    }
}

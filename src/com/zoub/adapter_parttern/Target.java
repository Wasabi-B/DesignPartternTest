package com.zoub.adapter_parttern;

/**
 * Target接口（期望得到的接口）：能输出110V(将220V转换成110V)
 * */
public interface Target {

    //将220V 转换输出110V（原有插头（Adaptee）没有的）
    public void Convert_110v();
}

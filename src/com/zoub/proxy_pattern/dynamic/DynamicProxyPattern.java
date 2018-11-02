package com.zoub.proxy_pattern.dynamic;
/**
 * 步骤4 通过动态代理对象，调用目标对象的方法
 * */
public class DynamicProxyPattern {

    public static void main(String[] args){

        //1.创建调用处理器类对象
        DynamicProxy dynamicProxy = new DynamicProxy();

        //2.创建目标对象
        Buyer1 buyer1 = new Buyer1();

        //3.创建动态代理 & 对象：通过调用处理器类对象newProxyInstance()
        //传入上述目标对象
        Subject buyer1_DynamicProxy = (Subject) dynamicProxy.newProxyInstance(buyer1);

        //4.通过调用动态代理对象方法从而调用目标对象方法
        //实际上是调用了invoke()，在通过invoke()里的反射机制调用了目标对象的方法
        buyer1_DynamicProxy.buybuybuy();
        //以上代购为小成代购Mac

        //以下是代购为小何代购iPhone
        Buyer2 buyer2 = new Buyer2();
        Subject buyer2_DynamicProxy = (Subject) dynamicProxy.newProxyInstance(buyer2);
        buyer2_DynamicProxy.buybuybuy();
    }
}

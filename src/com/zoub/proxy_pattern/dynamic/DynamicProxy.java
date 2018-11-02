package com.zoub.proxy_pattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 调用处理器
 * 作用：
 * 1.生成 动态代理对象
 * 2.指定 代理对象运行目标对象方法时需要完成的 具体任务
 * 注：需事先InvocationHandler接口 = 调用处理器 接口
 * 所以成为 调用处理器类
 *
 * */
public class DynamicProxy implements InvocationHandler {

    //声明代理对象
    //作用：绑定关系，即关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke()
    private Object proxyObject;

    public Object newProxyInstance(Object proxyObject){
        this.proxyObject = proxyObject;
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(),
                proxyObject.getClass().getInterfaces(),this);
        //Proxy类 = 动态代理类的主类
        //Proxy.newProxyInstance()作用：根据指定的类装载器、一组接口 & 调用处理器 生成动态代理类实例，
        // 并最终返回
        //参数说明：
        //参数1：指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        //参数2：指定目标对象的实现接口
        //即要给目标对象提供一组什么接口，若提供了一组接口给它，那么该代理对象就默认实现了该接口，
        //这样就能调用这组接口中的方法
        //参数3：指定InvocationHandler对象。即动态代理对象在调用方法时，会关联到哪个InvocationHandler对象
    }

    //复写InvocationHandler接口的invoke()
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        return null;
    }
}

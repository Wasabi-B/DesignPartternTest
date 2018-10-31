package com.zoub.singleton_pattern;

public class SingletonPartternDemo {

    /**
     * volatile在多线程中避免指令重排
     * */
    private static volatile SingletonPartternDemo instance = null;
    private static SingletonPartternDemo instance2 = null;
    private SingletonPartternDemo() {
    }

    /**
     * 懒汉模式-双重校验锁，线程安全
     * 第一层if判断：检测当前实例是否存在，如果存在则直接返回，否则执行实例化操作
     * 同步锁：同一个时间点只有一个线程能够执行，避免多线程建立多个对象
     * 第二层if：避免两个线程已经进行排队候都会执行实例化，所以再次判断实例是否存在
     * */
    public static SingletonPartternDemo getInstance(){
        if (instance == null){
            synchronized (SingletonPartternDemo.class){
                if (instance == null){
                    instance = new SingletonPartternDemo();
                }
            }
        }
        return instance;
    }

    /**
     * 静态内部类实现
     *
     * 具有延迟初始化的好处，而且由JVM提供了线程安全的支持
     * */
    private static class SingletonHolder{
        private static SingletonPartternDemo INSTANCE = new SingletonPartternDemo();
    }

    public SingletonPartternDemo getInstance2(){
        return SingletonHolder.INSTANCE;
    }


}

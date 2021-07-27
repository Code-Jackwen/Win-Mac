package com.nyist.xu.shejimoshi.Singleton2;


/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-02 23:25
 **/
public class Singleton1 {
    //单例模式  静态内部类  懒汉：DCL、静态内部类
    private Singleton1() {
    }

    //JVM 能确保 INSTANCE 只被实例化一次
    //当 Singleton 类被加载时，静态内部类 Inner 没有被加载进内存。
    //基于静态内部类和基于synchronize加锁创建单例对象的方式存在反射攻击
    private static class Inner {
        //相当于把懒汉移动到静态内部类中了。注意 final
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return Inner.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
    }
}

package com.nyist.xu.shejimoshi.Singleton2;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-02 23:27
 */
public class Singleton3 {
    //单例模式  DCL

    private Singleton3(){}

    //1. 为 uniqueInstance 分配内存空间
    //2. 初始化 uniqueInstance
    //3. 将 uniqueInstance 指向分配的内存地址
    private static volatile Singleton3 instance;

    public static Singleton3 getInstance(){

        //第一个 if 语句用来避免 uniqueInstance 已经被实例化之后的加锁低效操作
        //第二个 if 语句进行了加锁，所以只能有一个线程进入，避免实例化多次
        //synchronized代码块，控制更细的粒度
        if(instance == null){
            synchronized (Singleton3.class) {
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1==instance2);
    }
}

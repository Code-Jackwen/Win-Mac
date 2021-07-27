package com.nyist.xu.shejimoshi.Singleton1;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-30 21:10
 **/
public class SingletonDCL {
    //懒汉DCL
    private SingletonDCL() {
    }

    private volatile static SingletonDCL instance = null;

    public static SingletonDCL getInstance() {
        if (instance == null) {
            synchronized (SingletonDCL.class) {
                if(instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }
}

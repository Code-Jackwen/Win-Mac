package com.nyist.xu.shejimoshi.Singleton1;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-30 21:11
 **/
public class SingletonEnum {
    private SingletonEnum(){
    }
    /**
     * 枚举类型是线程安全的，并且只会装载一次
     */
//    private enum Singleton{
//        INSTANCE;
//        private final SingletonEnum instance;
//        Singleton(){
//            instance = new SingletonEnum();
//        }
//        private SingletonEnum getInstance(){
//            return instance;
//        }
//    }
    //这个也是true
    private enum Singleton{
        INSTANCE;
        private static final SingletonEnum instance = new SingletonEnum();
    }

    public static SingletonEnum getInstance(){
        return Singleton.instance;
    }

    public static void main(String[] args) {
        SingletonEnum instance = getInstance();
        SingletonEnum instance1 = getInstance();
        System.out.println(instance==instance1);
//        AbstractRoutingDataSource
//        ThreadLocal
    }
}

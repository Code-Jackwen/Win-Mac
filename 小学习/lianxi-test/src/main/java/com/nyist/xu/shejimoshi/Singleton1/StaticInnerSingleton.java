package com.nyist.xu.shejimoshi.Singleton1;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-30 21:14
 **/
public class StaticInnerSingleton {

    private StaticInnerSingleton(){}


    private static class InnerClass{
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    private static StaticInnerSingleton getInstance(){
        return InnerClass.INSTANCE;
    }

    //测试
    public static void main(String[] args) {
        StaticInnerSingleton instance = getInstance();
        StaticInnerSingleton instance1 = getInstance();
        System.out.println(instance==instance1);//true
    }

}

package com.nyist.xu.shejimoshi.Singleton2;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-02 23:27
 **/
public enum Singleton2 {
    //单例模式  枚举(最安全)
    //懒汉:直接实例化、静态代码块、枚举

    //枚举
    //枚举防止反射改变私有构造函数攻击，由JVM保证只实例化一次。
    //枚举防止序列化攻击

    //java中创建对象的方式有new、clone、序列化、反射。clone需要实现Cloneable接口
    //其它实现需要使用 transient 修饰所有字段，并且实现序列化和反序列化的方法。


    //枚举原理：
    //枚举类的域(field)其实是相应的enum类型的一个实例对象
    //反编译枚举类：
    //public final class Fruit extends Enum

    INSTANCE;

    //
    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }
    //

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        // 单例测试
        Singleton2 firstSingleton = Singleton2.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());//firstName

        Singleton2 secondSingleton = Singleton2.INSTANCE;
        secondSingleton.setObjName("secondName");

        System.out.println(firstSingleton.getObjName());//secondName  说明secondSingleton对firstSingleton产生影响
        System.out.println(secondSingleton.getObjName());//secondName   是同一个对象

        // 反射获取实例测试
        try {
            Singleton2[] enumConstants = Singleton2.class.getEnumConstants();
            for (Singleton2 enumConstant : enumConstants) {
                System.out.println(enumConstant.getObjName());//secondName
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //输出：
        //firstName
        //secondName
        //secondName
        //secondName
    }
}
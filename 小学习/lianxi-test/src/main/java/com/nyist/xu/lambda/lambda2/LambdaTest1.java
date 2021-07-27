package com.nyist.xu.lambda.lambda2;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 20:04
 **/
public class LambdaTest1 {

//    未完结  2系列
//    原文链接：https://blog.csdn.net/qq_36561697/article/details/80847812

//    访问权限：
//    在Lambda表达式使用中，
//    Lambda表达式外面的局部变量会被JVM隐式的编译成final类型，
//    Lambda表达式内部只能访问，不能修改 

//    Lambda表达式 内部 对 静态变量和成员变量是可读可写的 
//    Lambda不能访问函数接口的默认方法，在函数接口中可以添加default关键字定义默认的方法

    //变量 访问权限 示例：
    public static void main(String[] args) {
        int num = 6;//局部变量
        Sum sum = value -> {
//            num = 8; 这里会编译出错
            return num + value;
        };
        sum.add(8);
    }

    /**
     * 函数式接口
     */
    @FunctionalInterface
    interface Sum{
        int add(int value);
    }

    //静态变量和成员变量示例：
    public int num1 = 6;//这个算成员变量， 类中的方法内部 再定义的变量是 局部变量
    public static int num2 = 8;
    private int getSum(){
        Sum sum = value -> {
            num1 = 10;
            num2 = 10;
            return  num1 + num2;
        };
        return sum.add(1);
    }

//    方法引用
//    在lambda表达式中，方法引用是一种简化写法，引用的方法就是Lambda表达式的方法体的实现 
//    语法结构：ObjectRef:: methodName 
//    左边是类名或者实例名，中间的“：：”是方法引用符号，右边是相应的方法名 
//    方法引用一般分为三类： 
//    静态方法引用，实例方法引用，构造方法引用



}

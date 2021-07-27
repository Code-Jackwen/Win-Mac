package com.nyist.xu.lambda.lambda2;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 20:04
 **/
public class LambdaTest2 {

//    原文链接：https://blog.csdn.net/qq_36561697/article/details/80847812

//    方法引用
//    在lambda表达式中，方法引用是一种简化写法，引用的方法就是Lambda表达式的方法体的实现 
//    语法结构：ObjectRef:: methodName 
//    左边是类名或者实例名，中间的“：：”是方法引用符号，右边是相应的方法名 
//    方法引用一般分为三类： 

//    静态方法引用，实例方法引用，构造方法引用

    //静态方法引用

    //传统方式
    Transform<String, Integer> transform1 = new Transform<String, Integer>() {
        @Override
        public Integer transform(String s) {
            return LambdaTest2.strToInt(s);
        }
    };
    int result1 = transform1.transform("100");

    //Lambda方式
    Transform<String, Integer> transform2 = LambdaTest2::strToInt;
    int result2 = transform2.transform("200");

    //strToInt就是 接口方法的 一个实现
    static int strToInt(String str) {
        return Integer.valueOf(str);
    }

    /**
     * 函数式接口
     * @param <A>
     * @param <B>
     */
    @FunctionalInterface
    interface Transform<A, B> {
        B transform(A a);
    }


}

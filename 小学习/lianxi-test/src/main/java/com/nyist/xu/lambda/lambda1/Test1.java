package com.nyist.xu.lambda.lambda1;

import com.nyist.xu.service.lambda1.*;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 17:36
 **/
public class Test1 {

    //https://www.cnblogs.com/haixiang/p/11029639.html#lambda-%E8%AF%AD%E6%B3%95%E7%AE%80%E5%8C%96

    //接口只有一个没有方法体的抽象方法，这样的称为    函数式接口。
    //Lambda表达式需要函数式接口的支持
    //可以通过@FunctionalInterface注解判断一个接口是不是函数式接口

    //函数式接口（Functional Interfaces）：
    //如果一个接口定义个唯一一个抽象方法，那么这个接口就成为函数式接口。
    //同时，引入了一个新的注解：@FunctionalInterface。 就是个函数式接口的判断约束。
    //可以把他它放在一个接口前，表示这个接口是一个函数式接口。
    //这个注解是非必须的，只要接口只包含一个方法的接口，虚拟机会自动判断，
    //不过最好在接口上使用注解 @FunctionalInterface 进行声明。
    //在接口中添加了 @FunctionalInterface 的接口，只允许有一个抽象方法，否则编译器也会报错。

    //原文链接：https://blog.csdn.net/qq_36561697/article/details/80847812


    //语法形式为 () -> {}，其中 () 用来描述参数列表，{} 用来描述方法体，-> 为 lambda运算符 ，读作(goes to)。

    public static void main(String[] args) {

        //无参无返回
        NoReturnNoParam noReturnNoParam = () -> {
            System.out.println("NoReturnNoParam");
        };
        noReturnNoParam.method();

        //一个参数无返回
        NoReturnOneParam noReturnOneParam = (int a) -> {
            System.out.println("NoReturnOneParam param:" + a);
        };
        noReturnOneParam.method(6);

        //多个参数无返回
        NoReturnMultiParam noReturnMultiParam = (int a, int b) -> {
            System.out.println("NoReturnMultiParam param:" + "{" + a +"," + + b +"}");
        };
        noReturnMultiParam.method(6, 8);

        //无参有返回值
        ReturnNoParam returnNoParam = () -> {
            System.out.print("ReturnNoParam");
            return 1;
        };

        int res = returnNoParam.method();
        System.out.println("return:" + res);

        //一个参数有返回值
        ReturnOneParam returnOneParam = (int a) -> {
            System.out.println("ReturnOneParam param:" + a);
            return 1;
        };

        int res2 = returnOneParam.method(6);
        System.out.println("return:" + res2);

        //多个参数有返回值
        ReturnMultiParam returnMultiParam = (int a, int b) -> {
            System.out.println("ReturnMultiParam param:" + "{" + a + "," + b +"}");
            return 1;
        };

        int res3 = returnMultiParam.method(6, 8);
        System.out.println("return:" + res3);
    }

}

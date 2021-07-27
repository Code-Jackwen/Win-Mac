package com.nyist.xu.lambda.lambda1;

import com.nyist.xu.service.lambda1.*;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 17:57
 **/
public class Test2 {

    //Tset1的代码的进一步简化
    public static void main(String[] args) {

        //1.简化参数类型，可以不写参数类型，但是必须所有参数都不写
        NoReturnMultiParam lamdba1 = (a, b) -> {
            System.out.println("简化参数类型");
        };
        lamdba1.method(1, 2);

        //2.简化参数小括号，如果只有一个参数则可以省略参数小括号
        NoReturnOneParam lambda2 = a -> {
            System.out.println("简化参数小括号");
        };
        lambda2.method(1);

        //3.简化方法体大括号，如果方法条只有一条语句，则可以胜率方法体大括号
        NoReturnNoParam lambda3 = () -> System.out.println("简化方法体大括号");
        lambda3.method();

        //4.如果方法体只有一条语句，并且是 return 语句，则可以省略方法体大括号
        ReturnOneParam lambda4 = a -> a+3;
        System.out.println(lambda4.method(5));

        ReturnMultiParam lambda5 = (a, b) -> a+b;
        System.out.println(lambda5.method(1, 1));
    }

}

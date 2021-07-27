package com.nyist.xu.lambda.lambda2;

import java.util.function.Supplier;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 21:18
 **/
public class Supplier1 {

    /**
     * Supplier接口：返回一个给定类型的结果。不需要输入参数，无输入有输出
     */
    private static void supplierTest(){
        Supplier<String> supplier = () -> "我就是输出";
        String s = supplier.get();
        System.out.println(s);
    }

}

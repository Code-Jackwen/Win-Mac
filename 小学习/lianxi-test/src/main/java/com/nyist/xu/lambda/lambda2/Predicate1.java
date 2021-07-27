package com.nyist.xu.lambda.lambda2;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 21:09
 **/
public class Predicate1 {
//     四个常用的接口
//    java已经给我们提供了部分接口。这些接口在java.util.function的包里面。
//    总结起来就是四种类型：
//     1.功能型接口   即接受参数也提供返回值  Function<P, T>
//     2.供给型接口   不接受参数但是有返回值  Supplier<T>
//     3.断言式接口   主要用于判断           Predicate<P>
//     4.消费型接口   接受参数没有返回值      Sonsumer<P>
//    原文链接：https://blog.csdn.net/peiyuWang_2015/article/details/72626531

//     Predicate接口

    /**
     * Predicate接口：输入一个参数，返回一个boolean值，内置了许多用于逻辑判断的默认方法
     */
    public void predicateTest() {
        Predicate<String> predicateStr = s -> s.length() > 8;
        boolean testResult = predicateStr.test("test");//需要api 24
        testResult = predicateStr.negate().test("test");//取反，也就是s.length<=8

        Predicate<Object> predicateObj = Objects::nonNull;
        Object obj = null;
        testResult = predicateObj.test(obj);//判断是否为空


    }
}
package com.nyist.xu.bishi.fuAndzi.A;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-23 15:17
 **/
public class Zi extends Fu{

    int num = 2;
    static int snum = 2;

    static void method1() { //不能覆盖的
        System.out.println("zi 静态method_1");
    }

    @Override
    void method2() {
        System.out.println("zi method_2");
    }

}

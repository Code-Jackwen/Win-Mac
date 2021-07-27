package com.nyist.xu.lambda.lambda2;

import java.util.function.Consumer;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 21:16
 **/
public class Consumer1 {

    /**
     * consumer接口：对输入的参数进行操作。有输入没输出
     */
    private static void consumerTest(){
        Consumer<Integer> add5 = (p) -> {
            System.out.println("old value:" + p);
            p = p + 5;
            System.out.println("new value:" + p);
        };
        add5.accept(10);
    }
}

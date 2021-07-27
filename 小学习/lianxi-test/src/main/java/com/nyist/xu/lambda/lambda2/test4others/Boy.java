package com.nyist.xu.lambda.lambda2.test4others;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 20:51
 **/
//男孩类
public class Boy extends Parent {
    public Boy(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSome() {
        System.out.println("我是个男孩");
    }
}

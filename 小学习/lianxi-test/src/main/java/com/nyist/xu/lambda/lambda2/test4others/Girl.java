package com.nyist.xu.lambda.lambda2.test4others;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 20:52
 **/

//女孩类
public class Girl extends Parent {
    public Girl(String name, int age) {
        super(name, age);
    }

    @Override
    public void doSome() {
        System.out.println("我是个女孩");
    }
}

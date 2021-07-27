package com.nyist.xu.bishi.chushihua;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-22 23:31
 **/
public class TestQ {

    //初始化顺序
    public static TestQ t1=new TestQ();

    {
        System.out.println("TestQ 代码块");
    }

    static {
        System.out.println("TestQ 静态代码块");
    }
    TestQ() {
        System.out.println("TestQ 构造");
    }

    public static void main(String[] args){
        TestQ t2=new TestQ();
    }
}
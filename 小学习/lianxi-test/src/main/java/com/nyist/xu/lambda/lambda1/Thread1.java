package com.nyist.xu.lambda.lambda1;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 18:21
 **/
public class Thread1 {
    //lambda 表达式创建线程
    //我们以往都是通过创建 Thread 对象，然后通过匿名内部类重写 run() 方法，
    //一提到匿名内部类我们就应该想到可以使用 lambda 表达式来简化线程的创建过程。

    public static void main(String[] args) {

        //使用表达式
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(2 + ":" + i);
            }
        });
        t.start();

        //使用表达式
//        Runnable r =()->System.out.println("==========");
//        r.run();
    }

    //不 使用表达式

//    //方式一：定义一个类实现Runnable接口，重写run方法即可
//    public class Demo implements Runnable{
//        @Override
//        public void run() {
//            System.out.println("============");
//
//        }
//        public static void main(String[] args) {
//            new Demo().run();
//        }
//    }
//    //方式二：使用匿名内部类实现
//    @Test
//    public void demoTwo(){
//        Runnable runnable  =  new Runnable() {
//            public void run() {
//                System.out.println("===========");
//            }
//        };
//        runnable.run();
//    }
//    原文链接：https://blog.csdn.net/qq_34491508/article/details/93722293




}

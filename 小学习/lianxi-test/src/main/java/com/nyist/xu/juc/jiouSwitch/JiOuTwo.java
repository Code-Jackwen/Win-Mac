package com.nyist.xu.juc.jiouSwitch;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-31 21:26
 **/
public class JiOuTwo {

    //多线程奇数偶数交替执行
    //https://www.javazhiyin.com/33817.html

    public static void main(String[] args) {
        new Thread(new SoulutionTask(), "偶数").start();
        new Thread(new SoulutionTask(), "奇数").start();
    }

    static class SoulutionTask implements Runnable {
        static int value = 0;
        @Override
        public void run() {
            while (value <= 100) {
                synchronized (SoulutionTask.class) {
                    System.out.println(Thread.currentThread().getName() + ":" + value++);
                    SoulutionTask.class.notify();
                    try {
                        SoulutionTask.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }

}

package com.nyist.xu.bishi;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-25 20:09
 **/
public class ThreadA {

    //    设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。使用内部类实现线程，对j增减的时候没有考虑顺序问题。

        private int j;

        public static void main (String args[]){
            ThreadA tt = new ThreadA();
            Inc inc = tt.new Inc();
            Dec dec = tt.new Dec();
            for (int i = 0; i < 2; i++) {
                Thread t = new Thread(inc);
                t.start();
                t = new Thread(dec);
                t.start();
            }
    }

        private synchronized void inc () {
        j++;
        System.out.println(Thread.currentThread().getName() + "-inc:" + j);
    }

        private synchronized void dec () {
        j--;
        System.out.println(Thread.currentThread().getName() + "-dec:" + j);
    }

        class Inc implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    inc();
                }
            }
        }

        class Dec implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    dec();
                }
            }
        }
}
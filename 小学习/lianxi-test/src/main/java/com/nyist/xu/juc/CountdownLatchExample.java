package com.nyist.xu.juc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-29 11:36
 **/
public class CountdownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            int finalI = i;
            executorService.execute(() -> {
                System.out.println("run.."+finalI);
                countDownLatch.countDown();//单独只有countDown()的话，下边还会执行
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("run..after"+ finalI);
            });
        }
        countDownLatch.await();//await()下边都先不再执行
        System.out.println("end");//只有end 一定在最后，其他随机
        executorService.shutdown();
    }
}
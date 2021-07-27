package com.nyist.xu.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-29 14:17
 **/
public class FutureTaskExample {

    //public class FutureTask<V> implements RunnableFuture<V>
    //public interface RunnableFuture<V> extends Runnable, Future<V>

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int result = 0;
                for (int i = 0; i < 100; i++) {
                    Thread.sleep(10);
                    result += i;
                }
                Thread.sleep(3000);
                return result;
            }
        });
        Thread computeThread = new Thread(futureTask);
        computeThread.start();

//        Thread otherThread = new Thread(() -> {
//            System.out.println("other task is running...");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        otherThread.start();
        System.out.println(futureTask.get());
        System.out.println("结束");
    }
}

package com.nyist.xu.juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-29 11:19
 **/
public class CyclicBarrierExample {
        public static void main(String[] args){
            final int totalThread = 10;
            CyclicBarrier cyclicBarrier = new CyclicBarrier(totalThread);
            ExecutorService executorService = Executors.newCachedThreadPool();
            for (int i = 0; i < totalThread; i++) {
                int finalI = i;
                executorService.execute(() -> {
                    System.out.println("before.."+ finalI);
                    try {
                        cyclicBarrier.reset();
                        cyclicBarrier.await();//await()下边都先不再执行
//                        cyclicBarrier.await(1, TimeUnit.MILLISECONDS);//会报错...
                    } catch (InterruptedException | BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    System.out.println("after.."+ finalI);//after的输出具有随机性
                });
            }

//            for (int i = 0; i < totalThread; i++) {
//                int finalI = i;
//                executorService.execute(() -> {
//                    System.out.println("before.."+ finalI);
//                    try {
//                        cyclicBarrier.await();//await()下边都先不再执行
////                        cyclicBarrier.await(1, TimeUnit.MILLISECONDS);//会报错...
//                    } catch (InterruptedException | BrokenBarrierException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("after.."+ finalI);//after的输出具有随机性
//                });
//            }
            executorService.shutdown();
        }
}

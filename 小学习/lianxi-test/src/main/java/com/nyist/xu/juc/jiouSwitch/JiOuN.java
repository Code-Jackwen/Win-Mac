package com.nyist.xu.juc.jiouSwitch;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-31 21:52
 **/
public class JiOuN implements Runnable {

    //例如 N=3
    //输出
    //thread0 : 0
    //thread1 : 1
    //thread2 : 2
    //thread0 : 3
    //thread1 : 4
    //thread2 : 5

    private static final Object LOCK = new Object();
    /**
     * 当前即将打印的数字
     */
    private static int current = 0;
    /**
     * 当前线程编号，从0开始
     */
    private int threadNo;
    /**
     * 线程数量
     */
    private int threadCount;
    /**
     * 打印的最大数值
     */
    private int maxInt;

    public JiOuN(int threadNo, int threadCount, int maxInt) {
        this.threadNo = threadNo;
        this.threadCount = threadCount;
        this.maxInt = maxInt;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (LOCK) {
                // 判断是否轮到当前线程执行
                while (current % threadCount != threadNo) {
                    if (current > maxInt) {
                        break;
                    }
                    try {
                        // 如果不是，则当前线程进入wait
                        LOCK.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                // 最大值跳出循环
                if (current > maxInt) {
                    break;
                }
                System.out.println("thread" + threadNo + " : " + current);
                current++;
                // 唤醒其他wait线程
                LOCK.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        int threadCount = 3;
        int max = 100;
        for (int i = 0; i < threadCount; i++) {
            new Thread(new JiOuN(i, threadCount, max)).start();
        }
    }
}

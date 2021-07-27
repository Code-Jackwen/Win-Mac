package com.nyist.xu.dataStructure.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-16 22:32
 **/
public class PriorityQueueTest {
    //特殊的队列叫做PriorityQueue，即优先队列，它实现了Queue接口，不允许放入null元素。
    //方法也和Queue雷同，但是它线程不安全的。底层实现是Object 数组存储
    //优先队列保证每次取出的元素都是队列中权值最小的
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        pq.offer(5);
        pq.offer(2);
        pq.offer(3);
        System.out.println(pq.peek());//2   默认返回最小的，默认就是最小堆。
        //小根堆
        //特点：跟最小，一般的层次遍历 出来的结果是从小到大排列


        //大根堆的实现：
        //创建时 传递Comparator 的排序递减实现
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });
    }
}

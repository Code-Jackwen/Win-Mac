package com.nyist.xu.dataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-11 15:56
 **/
//https://www.cnblogs.com/zhilu-doc/p/5251640.html
public class TestQueue {
    //offer()添加、poll()删除、peek查看但不弹出
    //add、remove会报错

    //element同peek不移除

    //Queue接口与List、Set同一级别，都是继承了Collection接口。
    //下面总结常用的，还有线程阻塞的不常用put、take
    public static void main(String[] args) {
        //LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
        Queue<int[]> queue= new LinkedList<int[]>();
        //1、元素添加
        //添加尽量用offer()、删除用poll()  返回值是boolean 不会报错

        //Queue元素添加避免Collection的add()和remove()方法，add()和remove()方法在失败的时候会抛出异常。
        queue.add(new int[] { 0, 0, 0, 0 });


        //2、元素删除和查看
        //Java队列的poll,peek,element的区别
        //element：查看首个元素，不会移除首个元素，如果队列是空的就抛出异常NoSuchElementException
        //常用：
        //poll，查看并弹出，空就null
        //peek，查看不弹出，空就null
    }
}

package com.nyist.xu.javabasetest.CollectionFramework;

import com.nyist.xu.javabasetest.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-22 15:15
 **/
public class ArrayListTest {
    //cyc源码篇目

    static List ll =new ArrayList();
    static List getList(){return ll;}
    public static void main(String[] args) throws InterruptedException {

         for(Object o : getList()){}
         //for(Object o : getList();){} 错的



        List arrayList =new ArrayList();

//        //RandomAccess
//        Vector vector = new Vector();
////        Map.Entry
//        AbstractQueuedSynchronizer a = null;
//        LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue();
//        lbq.offer(1);
//        Integer poll = lbq.poll(5, TimeUnit.SECONDS);
//        System.out.println(poll);//1
//        Integer poll1 = lbq.poll(5, TimeUnit.SECONDS);
//        System.out.println(poll1);//null


//        Integer a = new Integer(1);
//        DelayQueue<Integer> dq = new DelayQueue();
//        boolean offer = dq.offer(a, 3, TimeUnit.SECONDS);
//        Integer poll = dq.poll(3, TimeUnit.SECONDS);
//        System.out.println(poll);
//        dq.poll()

        final List<User> list = new ArrayList();
        User u1 = new User("李华",18);
        User u2 = new User("小红",21);
        User u3 = new User("小李",12);
        list.add(u1);
        list.add(u2);
        list.add(u3);

        for (User user : list) {
            // 这个for 里面 可以删除，不可添加
            if (user.getAge()>20){
                list.remove(user);
            }
        }
        for (User user : list) {
            System.out.println(user);
        }

    }
}

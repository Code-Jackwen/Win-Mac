package com.nyist.xu.sort.CycSort;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-23 22:08
 **/
public abstract class Sort<T extends Comparable<T>> {

    public abstract void sort(T[] nums);

    protected boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
//for循环：

//        int i = 3;
//        for (;;) {
//                System.out.println("111");
//            i--;
//            if (i==0){
//                break;
//            }
//        }
//        //等价于
//        for (int j = 0; j < 3; j++) {
//            System.out.println("222");
//        }
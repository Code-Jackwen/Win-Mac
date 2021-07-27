package com.nyist.xu.sort.cyc;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-02-06 18:38
 **/
public abstract class Sort<T extends Comparable<T>> {

    public abstract void sort(T[] nums);

    protected  boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

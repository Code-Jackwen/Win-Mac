package com.nyist.xu.bishi;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-22 23:33
 **/
public class TestA1 {

    //携程的题 默认是 那个排序来着。

    public static void main(String[] args) {
        Comparable[] a = {15,0,6,9,3};
        Comparable[] sort = sort(a);
        System.out.println(sort);
    }

    public static Comparable[] sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;// 1, 4, 13, 40, ...
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i;  j >= h && compareElement(a[j],  a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
        return a;
    }

    public static boolean compareElement(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

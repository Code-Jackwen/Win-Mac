package com.nyist.xu.javabasetest.smallMethodTest.arrayCopy;

import java.util.Arrays;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-10 12:04
 **/
public class ArrayscopyOfRange {
    //按照范围截取出新数组copyOfRange[)
    //在一些处理数组的编程题里很好用，效率和clone基本一致，
    //都是native method，比利用循环复制数组效率要高得多。
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] ints = Arrays.copyOfRange(a, 1, 3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}

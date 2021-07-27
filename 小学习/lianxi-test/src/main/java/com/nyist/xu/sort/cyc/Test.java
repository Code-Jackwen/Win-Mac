package com.nyist.xu.sort.cyc;

import java.util.Arrays;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-02-06 18:41
 **/
public class Test {
    private static HeapSort<Integer> s= new HeapSort();
    public static void main(String[] args) {
//        Integer[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Integer[] arr = {6,1,2,7,9,11,4,5,10,8};
        Integer[] arr = {5,4,3,2,1,1,2,3,4,5};
        s.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

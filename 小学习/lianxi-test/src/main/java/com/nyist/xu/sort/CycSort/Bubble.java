package com.nyist.xu.sort.CycSort;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-23 23:35
 **/

public class Bubble<T extends Comparable<T>> extends Sort<T> {


    //从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
    //在一轮循环中，如果没有发生交换，那么说明数组已经是有序的，此时可以直接退出。
    //只是做了  有序跳出优化。
    @Override
    public void sort(T[] nums) {
        int N = nums.length;
        boolean isSorted = false;
        for (int i = N - 1; i > 0 && !isSorted; i--) {
            isSorted = true;
            for (int j = 0; j < i; j++) {
                if (less(nums[j + 1], nums[j])) {
                    isSorted = false;
                    swap(nums, j, j + 1);
                }
            }
        }
    }
}
package com.nyist.xu.sort.cyc.edit;

import java.util.Arrays;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-02-06 19:23
 **/
public class HeapSort {

    public static void main(String[] args) {
//        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int[] arr = {6,1,2,7,9,11,4,5,10,8};
        int[] arr = {5,4,3,2,1,1,2,3,4,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 数组第 0 个位置不能有元素
     */
    private static void sort(int[] nums) {
        int N = nums.length - 1;
        for (int k = N / 2; k >= 1; k--)
            sink(nums, k, N);
        while (N > 1) {
            swap(nums,1, N--);
            sink(nums,1, N);
        }
    }
    private static void sink(int[] nums, int k, int N) {
        while (2 * k <= N) {
            int j = 2 * k;
            if (j < N && nums[j]<nums[j+1])
                j++;
            if (nums[k]>=nums[j])
                break;
            swap(nums, k, j);
            k = j;
        }
    }
    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

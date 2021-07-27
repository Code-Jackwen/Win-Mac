package com.nyist.xu.interview.sz.log;

import java.util.Arrays;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-06 16:03
 **/
//打出 for各种循环的idea的自带模板 比如itar
//https://www.cnblogs.com/wtjqs/p/10486747.html

//冒泡优化
//https://blog.csdn.net/wubingju93123/article/details/81215984
public class BubboSort {
    public static void main(String[] args) {
//        int[] arr = {6, 3, 9, 2, 5, 3, 1, 7};
        int[] arr = {3, 3, 9, 2,1,7,0, 5, 3, 1, 3};
//        bubboSort(arr);
//        Stream.of(arr).forEach(a->System.out.println(a+"  "));
//        Arrays.stream(arr).forEach(System.out::print);

        Sort(arr, arr.length);

        Arrays.stream(arr).mapToObj(i -> i + "   ").forEach(System.out::print);

    }

    //1、基础的 减i 优化
    //2、针对中途 已经有序 跳出循环不再遍历
    //3、针对 序列 后边基本有序 还遍历比较， 改变有序边界
    public static void bubboSort(int[] a) {
        int temp;
        //记录最后一次交换的位置
        int lastExchangeIndex = 0;
        //无序数列的边界，每次比较只需要比到这里为止
        int sortBorder = a.length - 1;


        for (int i = 0; i < a.length - 1; i++) {
            //有序标记，每一轮的初始是true
            boolean isSorted = true;

            for (int j = 0; j < sortBorder; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    //有元素交换，所以不是有序，标记变为false
                    isSorted = false;

                    //把无序数列的边界更新为最后一次交换元素的位置
                    lastExchangeIndex = j;

                }
            }

            if (isSorted) {
                break;
            }

            sortBorder = lastExchangeIndex;
        }
    }


    //双向排序2   基于1的优化, 自己写的，检验没问题   双向冒泡自研
    private static void Sort(int[] arr, int len) {
        int temp;
        //右边临时边界
        int rightTemBor = 0;
        //右边真实边界
        int rightRealBor = arr.length - 1;
        int leftTemBor = 0;
        int leftRealBor = 0;
        for (int i = 0; i < len - 1; i++) {
            boolean flag = true;
            for (int j = leftRealBor; j < rightRealBor; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                    rightTemBor=j;
                }
            }
            if (flag) {
                break;
            }
            rightRealBor=rightTemBor;
            for (int j = rightRealBor; j > leftRealBor; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = false;
                    leftTemBor=j;
                }
            }
            if (flag) {
                break;
            }
            leftRealBor = leftTemBor;
        }
    }
}

//    //双向排序1 别人的没问题
//    private static void Sort(int[] arr, int len) {
//        int temp;
//        for (int i = 0; i < len - 1; i++) {
//            boolean flag = true;
//            for (int j = i; j < len - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    flag = false;
//                }
//            }
//            if (flag) {
//                break;
//            }
//            //一次确定一个的模式
//            for (int j = len - i - 1 - 1; j > i; j--) {
//                if (arr[j] < arr[j - 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                    flag = false;
//                }
//            }
//            if (flag) {
//                break;
//            }
//        }
//    }

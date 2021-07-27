package com.nyist.xu.bishi.wangyi2020;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-04 21:27
 **/
//链接：https://www.nowcoder.com/questionTerminal/8f5759df4aaf40a28906dfedf28fbf6d
//来源：牛客网
//
//小易在维护数据的时候遇到一个需求，具体来说小易有一系列数据，这些数据了构成一个长度为n的数字序列，接下来小易会在这个序列上进行q次操作。
//每次操作有一个查询的数字x，小易需要将序列数据中所有大于等于x的数字都减一，并输出在本次操作中有多少个数字被减一了。
//小易犯了难，希望你能帮帮他。
//
//输入描述:
//
//第一行n,q，表示数字个数和操作个数。
//接下来一行n个数表示初始的数字。
//接下来q行，每行一个数，表示指定的数字x。
//1≤n,q≤2000001 \leq n,q \leq 2000001≤n,q≤200000，1≤ai,x≤n1 \leq a_{i} , x \leq n1≤ai​,x≤n
//
//
//
//输出描述:
//
//对于每个询问，输出一个数字表示答案
//
//示例1
//输入
//
//4 3
//1 2 3 4
//4
//3
//1
//
//输出
//
//1
//2
//4
//
//示例2
//输入
//
//3 2
//1 2 3
//3
//3
//
//输出
//
//1
//0
public class A20200504_3 {

    //不难
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] arr = new int[n];
        //将数字录入数组
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        //先将数组排序
        Arrays.sort(arr);
        //查询次数
        for (int i = 0; i < q; i++) {
            //需要查询的数字
            int x = scanner.nextInt();
            System.out.println(demo4(arr, x));
        }
    }

    public static int demo4(int[] arr, int x) {
        int count = 0;
        //从大往小比较，碰到小于x的及时终止循环，能优化时间
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= x) {
                arr[i]--;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    //别人的
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int q = scanner.nextInt();
//        int[] arr = new int[n];
//        //将数字录入数组
//        for (int i = 0; i < n; i++) {
//            int num = scanner.nextInt();
//            arr[i] = num;
//        }
//        //先将数组排序
//        Arrays.sort(arr);
//        //查询次数
//        for (int i = 0; i < q; i++) {
//            //需要查询的数字
//            int x = scanner.nextInt();
//            System.out.println(demo4(arr, x));
//        }
//    }
//
//    public static int demo4(int[] arr, int x) {
//        int count = 0;
//        //从大往小比较，碰到小于x的及时终止循环，能优化时间
//        for (int i = arr.length-1; i >= 0; i--) {
//            if (arr[i] >= x) {
//                arr[i]--;
//                count++;
//            } else {
//                break;
//            }
//        }
//        return count;
//    }

}


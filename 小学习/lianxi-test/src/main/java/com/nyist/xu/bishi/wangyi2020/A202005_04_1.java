package com.nyist.xu.bishi.wangyi2020;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-04 22:31
 **/
//链接：https://www.nowcoder.com/questionTerminal/2d2d27effda849968aaab26f37b83c52
//来源：牛客网
//
//小易给你一个包含n个数字的数组a1,a2,…,a3a_1,a_2,…,a_3a1​,a2​,…,a3​。你可以对这个数组执行任意次以下交换操作：
//对于数组中的两个下标i,j(1<=i,j<=n)，如果ai+aja_i+a_jai​+aj​为奇数，就可以交换aia_iai​和aja_jaj​。
//
//现在允许你使用操作次数不限，小易希望你能求出在所有能通过若干次操作可以得到的数组中，字典序最小的一个是什么。
//
//输入描述:
//
//第一行一个整数n；
//第二行n个整数a1,a2,..,ana_1,a_2,..,a_na1​,a2​,..,an​，表示数组，每两个数字之间用一个空格分隔。
//输入保证1<=n<=105;1<=ai<=1091 <= n <= 10^5;1<=a_i<=10^91<=n<=105;1<=ai​<=109。
//
//
//
//输出描述:
//
//n个整数，每两个整数之间用一个空格分隔，表示得到的字典序最小的数组。
//
//示例1
//输入
//
//4
//7 3 5 1
//
//输出
//
//7 3 5 1
//
//示例2
//输入
//
//10
//53941 38641 31525 75864 29026 12199 83522 58200 64784 80987
//
//输出
//
//12199 29026 31525 38641 53941 58200 64784 75864 80987 83522
public class A202005_04_1 {

//    根据题意得
//    只要不全是奇数或者全是偶数，就进行排序

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
            }
            demo1(arr);
            return;
        }
    }

    public static void demo1(long[] arr) {
        //奇数数量
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                oddSum++;
            }
        }
        //如果全是偶数或者全是奇数则无法排序，直接输出
        if (oddSum == 0 || oddSum == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            return;
        }
        //如果至少存在一对奇偶数，则可以将序列全部从小到大排列
        Arrays.sort(arr);                    //直接就是 升序 排列
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



}

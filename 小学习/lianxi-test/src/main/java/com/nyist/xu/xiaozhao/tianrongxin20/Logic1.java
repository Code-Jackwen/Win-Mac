package com.nyist.xu.xiaozhao.tianrongxin20;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-19 19:45
 **/
////天融信
//    //正整数分解质因数
//    //时间限制： 3000MS
//    //内存限制： 589824KB
//    //题目描述：
//    //将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
//    //
//    //程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
//    //
//    //(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
//    //
//    //(2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
//    //
//    //(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
//    //
//    //
//    //
//    //输入描述
//    //一个正整数如90
//    //
//    //输出描述
//    //正整数分解式如90=2*3*3*5
//    //
//    //打印
//    //
//    //2
//    //
//    //3
//    //
//    //3
//    //
//    //5
//    //
//    //
//    //样例输入
//    //90
//    //样例输出
//    //2
//    //3
//    //3
//    //5
public class Logic1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2 ; i <= num ; i ++) {
            if (num % i == 0) {
                list.add(i);
                num = num / i;
                i = 1;
            }
        }
        for (int i = 0 ; i < list.size() - 1 ; i ++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.get(list.size() - 1));
    }
}

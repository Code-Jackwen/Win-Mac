package com.nyist.xu.xiaozhao.OJinput;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-12 14:05
 **/
public class OJ5 {
    //输入描述:
    //输入的第一行包括一个正整数t(1 <= t <= 100), 表示数据组数。
    //接下来t行, 每行一组数据。
    //每行的第一个整数为整数的个数n(1 <= n <= 100)。
    //接下来n个正整数, 即需要求和的每个正整数。

    //输出描述:
    //每组数据输出求和的结果

    //输入例子 1:
    //2
    //4 1 2 3 4
    //5 1 2 3 4 5
    //输出例子 1:
    //10
    //15

//    import java.util.Scanner;
//    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int ret = 0;
                int n = sc.nextInt();
                for (int j = 0; j < n; j++) {
                    int a = sc.nextInt();
                    ret += a;
                }
                System.out.println(ret);
            }
        }
//    }
}

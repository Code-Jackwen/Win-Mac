package com.nyist.xu.xiaozhao.tianrongxin20;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-19 19:46
 **/
////字符串排序
//    //时间限制： 3000MS
//    //内存限制： 589824KB
//    //题目描述：
//    //字符串排序
//    //
//    //把字符串转成char，进行冒泡排序
//    //
//    //
//    //
//    //输入描述
//    //字符串如：234rtyui
//    //
//    //输出描述
//    //234irtuy
//    //
//    //
//    //样例输入
//    //234rtyui
//    //样例输出
//    //234irtuy
public class Logic2 {



    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        Sort(c);
        System.out.println(s.valueOf(c));
    }


    public static void Sort (char[] ch) {
        char temp = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - 1 - i; j++) {
                if (ch[j] > ch[j + 1]) {
                    temp = ch[j + 1];
                    ch[j + 1] = ch[j];
                    ch[j] = temp;
                }
            }
        }
    }


}

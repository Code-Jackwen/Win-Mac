package com.nyist.xu.xiaozhao.OJinput;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-12 14:05
 **/
public class OJ8 {
    //输入描述:
    //输入有两行，第一行n
    //第二行是n个空格隔开的字符串
    //输出描述:
    //输出一行排序后的字符串，空格隔开，无结尾空格

    //输入例子 1:
    //5
    //c d a bb e
    //输出例子 1:
    //a bb c d e

    //import java.util.*;
    //public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String[] strs = new String[n];
            for(int i = 0; i < n; i++)
                strs[i] = scan.next();//这里是next函数
            Arrays.sort(strs);
            for(int i = 0;i < strs.length;i++){
                if( i != strs.length - 1)//结尾无空格
                    System.out.print(strs[i] + " ");
                else
                    System.out.print(strs[i]);
            }
        }
    //}
}

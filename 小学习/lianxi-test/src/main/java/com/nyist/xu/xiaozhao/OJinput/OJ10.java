package com.nyist.xu.xiaozhao.OJinput;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-12 14:05
 **/
public class OJ10 {
    //输入描述:
    //多个测试用例，每个测试用例一行。
    //每行通过,隔开，有n个字符，n＜100

    //输出描述:
    //对于每组用例输出一行排序后的字符串，用','隔开，无结尾空格

    //输入例子 1:
    //a,c,bb
    //f,dddd
    //nowcoder

    //输出例子 1:
    //a,bb,c
    //dddd,f
    //nowcoder

    //和9一样 逗号和空格的区别

    //import java.util.*;
    //public class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String line = in.nextLine();
                String[] strs = line.split(",");
                Arrays.sort(strs);
                for(int i = 0; i < strs.length - 1; i++){
                    System.out.print(strs[i] + ",");
                }
                System.out.println(strs[strs.length - 1]);
            }
        }
    //}
}

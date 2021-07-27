package com.nyist.xu.xiaozhao.xiechengbuzhao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-17 19:23
 **/
public class A1 {

    //携程的补录 补招  只有两个 算法题

//    相同编码检查
//    时间限制： 3000MS
////    内存限制： 589824KB
////    题目描述：
////    将字母A-Z按顺序编码为0-25，给出一个由A-Z构成的字符串，找出与它编码结果一致的不同字符串的数量（不包含输入字符串）。
////    输入描述
////    一行由[A-Z]26个大写字母组成的字符串，长度不超过80
////     输出描述
////    编码结果一致的不同字符串的数量（不包含输入字符串）。如：ABC编码为012，可编码为012的字符串有ABC、AM，所以编码结果一致的不同字符串的数量为1）
////    样例输入
////     ABC
////    样例输出
////    1

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        Character[] c1 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N'
         ,'O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        HashSet<Character> set = new HashSet<Character>(Arrays.asList(c1));


        char[] chars = input.toCharArray();
        String s = "";
        for (int i = 0; i < chars.length; i++) {
//            if (c.){
//            }
        }







    }

}   

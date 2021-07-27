package com.nyist.xu.algorithm.others;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-26 14:20
 **/
public class Easy1 {
    //曾经 笔试的题目，名字忘记了
    //反转循环字符串，自己的手写版本
    //ababababab
    //abcabcabcabcab
    //abccacabcabcab
    //abcabcab
    //adsjio
    //adsjioadsjio
    //adsjioadsjioadsjii
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        char[] cs = s.toCharArray();
        if (len <= 1) {
            System.out.println(s);
        }

        int index1 = 0;
        for (int i = 1; i < s.length(); i++) {
            if (cs[0] == cs[i]) {
                index1 = i;
                break;
            }
        }

        String sub = "";
        if (index1!=0){
            sub = s.substring(0, index1 - 1);
        }else{
            System.out.println(s);
            return;
        }

        char[] subcs = sub.toCharArray();
        int subLen = sub.length();

        if (len % subLen != 0) {
            System.out.println(s);
        }

        boolean flag = true;
        for (int j = subLen; j < cs.length; j++) {
            if (subcs[j % subLen] != cs[j]) {
                flag = false;
            }
        }
        if (flag){
            System.out.println(sub);
        }else {
            System.out.println(s);
        }
    }
}

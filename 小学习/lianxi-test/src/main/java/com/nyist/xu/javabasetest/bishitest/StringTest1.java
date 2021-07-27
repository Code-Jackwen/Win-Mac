package com.nyist.xu.javabasetest.bishitest;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-26 14:16
 **/
public class StringTest1 {
    public static void main(String[] args) {
        String str = "BEA";
        StringTest1.modify(str);
        System.out.println(str);
    }
    public static String modify(String s){
        s=s.replace('A', 'E');
        s=s.toLowerCase();
        s+='B';
        return s;
    }
}

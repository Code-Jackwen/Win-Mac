package com.nyist.xu.interview.sz.ans;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-04-08 16:31
 **/
class String2 {
    public static void main(String[] args) {
        String s1= "he";
        String s2 =  "h"+new String("e");
        System.out.println(s1==s2);
        System.out.println(s1==s1.intern());
    }
}
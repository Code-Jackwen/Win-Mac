package com.nyist.xu.javabasetest.smallMethodTest;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-13 23:16
 **/
public class String1 {
    public static void main(String[] args) {
        String s ="12345";
        String substring = s.substring(1, 2);//2    [1,2)   传递的是下标下标下标！
        System.out.println(substring);
        String substring1 = s.substring(0, s.length());//
        System.out.println(substring1);
        String substring2 = s.substring(0, s.length() - 1);//用的久了s.length() - 1就是减去最后一位
        System.out.println(substring2);
    }
}

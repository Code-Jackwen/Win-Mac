package com.nyist.xu.javabasetest.compare;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-12-11 19:47
 **/
public class String_compareTo {
    public static void main(String args[]) {
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";

        int result = str1.compareTo( str2 );
        System.out.println(result);//0

        result = str2.compareTo( str3 );
        System.out.println(result);        //-3

        result = str3.compareTo( str1 );
        System.out.println(result);        //3

        //48 从左到右直接不同返回第一个字符ASCII值的差
        System.out.println("abc".compareTo("123"));
        //48  同上
        System.out.println("abc123".compareTo("123"));
        //-3  从左到右部分相同返回的是长度差，正负代表大小
        System.out.println("abc".compareTo("abc123"));
    }
}

package com.nyist.xu.javabasetest.syso;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-28 12:21
 **/
public class i1 {

    public static void main(String[] args) {
        int j = 0;
        j = j++ + ++j + j++ + j++;
        System.out.println(j);//7
    }
}

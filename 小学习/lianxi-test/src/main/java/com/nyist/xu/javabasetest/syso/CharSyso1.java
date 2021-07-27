package com.nyist.xu.javabasetest.syso;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-28 12:18
 **/
public class CharSyso1 {

    public static void main(String[] args) {
        char cl=66;
        int i2=2;
        cl= (char) (cl+(char)i2);// D
        //cl= cl+(char)i2;报错
        System.out.println(cl);
    }
}

package com.nyist.xu.bishi.fuAndzi.B;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-19 21:59
 **/
public class FuA {
    public int a = 0;

    void fun() {
        System.out.println("A");
    }

    //1----------------------引用地址的 对象传递,对比字符串
    public static void main(String[] args) {
        //    ----------------------------------
        FuA z = new FuA();
        System.out.println("z1---"+z);//com.nyist.xu.bishi.fuAndzi.B.FuA@4f023edb
        z.modify(z);
        System.out.println("z2---"+z);//com.nyist.xu.bishi.fuAndzi.B.FuA@4f023edb
    }

    public void modify(FuA f) {
        f = new ZiB();
        System.out.println("f---"+f);//com.nyist.xu.bishi.fuAndzi.B.ZiB@3a71f4dd

    }
    //1----------------------

}

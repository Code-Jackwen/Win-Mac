package com.nyist.xu.javabasetest.AccessPermission.zibao;

import com.nyist.xu.javabasetest.AccessPermission.protected_test;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-04-17 15:58
 **/
class Zi extends protected_test {


    public static void test(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String[] args) {

        Zi zi = new Zi();
        int a = zi.pub;
        int b = zi.pro;//pro可以

//        int c = zi.pri;//访问不了
//        int d = zi.def;

        test(a,b);
    }

}

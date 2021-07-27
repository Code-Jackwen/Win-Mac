package com.nyist.xu.javabasetest.syso;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-28 17:59
 **/
public class SwitchSyso1 {
    public static void main(String[] args) {

        //这里的 都没有加 break
        //default 最多只能有一个，可以0个。

        test(1);// 12,3,45default
        System.out.println();

        test(2);//2,3,45default
        System.out.println();
        test(3);//2,3,45default
        System.out.println();
        test(-1);//default



//        test1(2);// 2default3,456
//        System.out.println();
//        test1(3);// 3,456       这个结果？？？
//        System.out.println();
//        test1(-1);// default3,456

        //对比  test1(2)
//        test4(2);// default3,456  不一样
//        System.out.println();
//        test4(3);// 3,456
//        System.out.println();
//        test4(-1);// default3,456
//        System.out.println();
//        test4(1);// 1default3,456

//        test2(2);// 23,456
//        System.out.println();
//        test2(3);// 3,456
//        System.out.println();
//        test2(-1);// default123,456

//        test3(-1);//没有default不报错。匹配不到啥也不输出。
    }

    public static void test(int a){
        switch (a){
            case 1:
                System.out.print("1");
            case 2:
            case 3:
            case 4:
                System.out.print("2,3,4");
            case 5:
                System.out.print("5");
            default:
                System.out.print("default");
        }
    }

    public static void test1(int a){
        switch (a){
            case 1:
                System.out.print("1");
            case 2:
                System.out.print("2");
            default:
                System.out.print("default");
            case 3:
            case 4:
                System.out.print("3,4");
            case 5:
                System.out.print("5");
            case 6:
                System.out.print("6");
        }
    }

    public static void test2(int a){
        switch (a){
            default:
                System.out.print("default");
            case 1:
                System.out.print("1");
            case 2:
                System.out.print("2");
            case 3:
            case 4:
                System.out.print("3,4");
            case 5:
                System.out.print("5");
            case 6:
                System.out.print("6");
        }
    }

    public static void test3(int a){
        switch (a){
            case 1:
                System.out.print("1");
            case 2:
                System.out.print("2");
            case 3:
            case 4:
                System.out.print("3,4");
            case 5:
                System.out.print("5");
            case 6:
                System.out.print("6");
        }
    }


    public static void test4(int a){
        switch (a){
            case 1:
                System.out.print("1");
            case 2:
            default:
                System.out.print("default");
            case 3:
            case 4:
                System.out.print("3,4");
            case 5:
                System.out.print("5");
            case 6:
                System.out.print("6");
        }
    }


}

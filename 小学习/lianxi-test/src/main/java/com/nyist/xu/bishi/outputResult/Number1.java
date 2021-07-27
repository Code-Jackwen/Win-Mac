package com.nyist.xu.bishi.outputResult;

import java.io.IOException;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-09 14:08
 **/
//sz析研科技
public class Number1 {
    public static void main(String[] args) {
        testMethod1(null);//Integer1

        testMethod2((Integer) null);//没有继承关系，报错，
        testMethod2((Integer) null);//不报错

//        testMethod3(1);//
//------------------------------------------------------------------
        String a = "Test";
        String b = "Test";
        String c =  new String(a);
        String d =  new String("Test");
        System.out.println(a==b);//ttf tft
        System.out.println(a.equals(b));
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(a==d);
        System.out.println(a.equals(d));

        try{
            double x = 0.0;
            throw (new Exception("111"));
        }catch(IOException e) {
            System.out.println("222");
        } catch (Exception e) {
            System.out.println("333");
        } finally {
            System.out.println("fff");  //结果 333 fff
        }

    }

    public static void testMethod1(Number number) {
        System.out.println("Number1");
    }

    public static void testMethod1(Integer number) {
        System.out.println("Integer1");
    }

    //testMethod1 总结
    //这种 重载优先考虑 子类，然后逐层向上。
    //跟继承有关系，如果不是Integer继承了Number 类就会编译不过。

    public static void testMethod2(Long number) {
        System.out.println("Long2");
    }
    public static void testMethod2(Integer number) {
        System.out.println("Integer2");
    }

    //就直接报错，没返回值
//    public static Integer testMethod3(Integer number) {
//        System.out.println("Integer3");
//    }
//    public static Number testMethod3(Integer number) {
//        System.out.println("Integer3");
//    }

}


package com.nyist.xu.javabasetest.bigDecimal1;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-15 14:46
 **/
public class FloatDouble {
    public static void main(String[] args) {
        float f1=12.1234561f;//9位
        float f2=12.1234565f;//最后一位为了检验四舍五入用
        float f3=12.1234570f;//最后一位写成0，不会显示出来

//        float f1=12.1234561f;//9位
//        float f2=12.1234565f;//最后一位为了检验四舍五入用
//        float f3=12.1234570f;//最后一位写成0，不会显示出来

        double d1=123456.12345678902;//17位
        double d2=123456.12345678906;//最后一位为了检验四舍五入用
        double d3=123456.12345678909;//最后一位为了检验四舍五入用
        double d4=123456.12345678910;//最后一位写成0，不会显示出来
        System.out.println("f1="+f1);
        System.out.println("f2="+f2);
        System.out.println("f3="+f3);
        System.out.println("zhuan="+(float)d1);//测试double转float
        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);
        System.out.println("d4="+d4);


        System.out.println(1.0-0.8);
        System.out.println(1.1+0.8);
        System.out.println(1.1*0.9);
        System.out.println(606.3/3000);

        System.out.println("-------------------");

        System.out.println(0.05 + 0.01);
        System.out.println(1.0 - 0.42);
        System.out.println(4.015 * 100);
        System.out.println(123.3 / 100);

    }
}

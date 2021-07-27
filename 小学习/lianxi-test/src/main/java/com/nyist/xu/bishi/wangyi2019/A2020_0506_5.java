package com.nyist.xu.bishi.wangyi2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-08 19:08
 **/
//链接：https://www.nowcoder.com/questionTerminal/3e483fe3c0bb447bb17ffb3eeeca78ba
//来源：牛客网
//
//今天上课，老师教了小易怎么计算加法和乘法，乘法的优先级大于加法，但是如果一个运算加了括号，那么它的优先级是最高的。例如：
//1
//2
//3
//4
//
//1+2*3=7
//1*(2+3)=5
//1*2*3=6
//(1+2)*3=9
//现在小易希望你帮他计算给定3个数a，b，c，在它们中间添加"+"， "*"， "("， ")"符号，能够获得的最大值。
//
//输入描述:
//
//一行三个数a，b，c (1 <= a, b, c <= 10)
//
//
//
//输出描述:
//
//能够获得的最大值
//
//示例1
//输入
//1 2 3
//输出
//9
public class A2020_0506_5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] d = new int[4];

        d[0] = a + b + c;
        d[1] = (a + b) * c;
        d[2] = a + (b + c);
        d[3] = a * b * c;
        Arrays.sort(d);
        System.out.println(d[3]);

        // 不是所有可能 情况 都值得 算，分析：
        //int sum1 = a + b + c;
        //    int sum2 = a * b * c;
        //    int sum3 = a * (b + c); // a*b+a*c
        //    int sum4 = b * (a + c);// a*b+b*c
        //    int sum5 = c * (a + b);// a*c+b*c
        //    // int sum6 = a * b + c;
        //    // int sum7 = a * c + b;
        //    // int sum8 = b * c + a;
        //    // 因为1 <= a, b, c <= 10 ,因此sum6<=sum3,sum7<=sum5,sum8<=sum4,因此这三个可以不用计算.
    }
}

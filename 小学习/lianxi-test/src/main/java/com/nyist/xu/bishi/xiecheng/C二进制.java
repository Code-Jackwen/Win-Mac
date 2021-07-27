package com.nyist.xu.bishi.xiecheng;

import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-23 16:51
 **/
public class C二进制 {
    //输入一个long类型的数值, 求该数值的二进制表示中的1的个数 .
    //     输入描述:
    //    long 类型的数值
    //    输出描述:
    //    该数值二进制表示中1的个数
    //    输入例子1:
    //     3
    //    输出例子1:
    //     2
    //    例子说明1:
    //     3的二进制表示: 11, 所以1个数为2
    //    输入例子2:
    //     65
    //    输出例子2:
    //     2
    //    例子说明2:
    //     65的二进制为:1000001，所以１的个数为：２

//    链接：https://www.nowcoder.com/questionTerminal/bc4c7936f5ed42cbb9131b6f39aa272b
//    来源：牛客网

    //这个c大佬实现的牛逼
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        int res=0;
        while(n!=0)
        {
            n=n&(n-1);
//            System.out.println(n);
            res++;
        }
//        //1、位与运算符（&）
//        //运算规则：两个数都转为二进制，然后从高位开始比较，如果两个数都为1则为1，否则为0。
        System.out.println(res);

//        System.out.println(n > 0 && ((n & (n - 1)) == 0 ));//判断一个数是否是2的方幂
        //2的次方 都是 一个1 后边全是0
        //如果是2 的次方，进行一次位这样的运算后，绝对会变成0000000类似的。
    }
}

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        int t = 0;
//        if(n>0){
//            while(n>=2){
//                if(n%2==1){
//                    t++;
//                }
//                n=n/2;
//            }
//            System.out.print(t+1);
//        }else if(n==0){
//            System.out.println(0);
//        }else{
//            n=-n;
//            String s = "";
//            //转二进制
//            while(n>=2){
//                s=s+String.valueOf(n%2);
//                n=n/2;
//            }
//            s=s+String.valueOf(n%2);
//            int len = s.length();
//            int []a = new int [len];
//            //取反
//            for(int i=0;i<s.length();i++){
//                if(s.charAt(i)=='1'){
//                    a[i]=0;
//                }else{
//                    a[i]=1;
//                }
//            }
//            //取补
//            a[0]=a[0]+1;
//            for(int i=0;i<len-1;i++){
//                if(a[i]==2){
//                    a[i]=0;
//                    a[i+1]=a[i+1]+1;
//                }
//            }
//            for(int i=0;i<len;i++){
//                if(a[i]==1){
//                    t++;
//                }
//            }
//            System.out.println(t+64-len);
//        }
//    }
//}
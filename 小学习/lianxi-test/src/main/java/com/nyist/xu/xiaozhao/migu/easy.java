package com.nyist.xu.xiaozhao.migu;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-07 15:39
 **/
public class easy {
    //咪咕的破题 就这一道。

    public static void main(String args[]) {
        //就是判断一个 十进制数 转换成二进制数后 二进制数有多少个1
        //对于大数，返回0
        Scanner sc = new Scanner(System.in);
        System.out.println(method(sc.nextLong()));
    }
    public static int method(long l){
        if (l>Integer.MAX_VALUE){
            return 0;
        }
        int i=0;
        while(l!=0){
            l=l & (l - 1);
            i++;
        }
        return i;
    }
}

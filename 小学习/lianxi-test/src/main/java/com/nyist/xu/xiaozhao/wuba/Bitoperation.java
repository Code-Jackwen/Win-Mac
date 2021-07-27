package com.nyist.xu.xiaozhao.wuba;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-10 13:49
 **/
public class Bitoperation {
    //有一道是位运算，还没做出来、


//        String s = new String();
//        System.out.println(s.length());\\0
//        int x=1,y=2,z=3;

//        System.out.println(y+=z--/++x);
//        y=y+z--/++x;
//        System.out.println(y);

    //        int count = 0;
//        while(n!=0)
//        {
//            if (n&1)
//            {
//                count++;
//            }
//            n = n >> 1;
//        }
//        return count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] time = new int[i];
        for (int j = 0; j < time.length; j++) {
            time[j]=Solu(j);
        }
        for (int k : time) {
            System.out.println(time[k]);
        }
    }
    static int Solu(int n)
    {

        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}

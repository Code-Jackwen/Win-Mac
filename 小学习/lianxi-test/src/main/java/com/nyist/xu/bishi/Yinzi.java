package com.nyist.xu.bishi;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-19 22:33
 **/
public class Yinzi {

//    一个数如果恰好等于它的因子之和, 这个数就称为”完数”. 例如 6 = 1+2+3。编程找出
//1000 以内的所有    完数.

//    public static int func(int n) {
//        int i, sum = 0;
//        for (i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int i;
//        for (i = 1; i <= 1000; i++) {
//            if (i == func(i)) {
//                System.out.println(i);
//            }
//        }
//    }
//    //6
//    //28
//    //496
}


//public class wsTest {
//    public static void main(String[] args) {
//        for (int m = 2; m < 1000; m++) {
//            int s = 0;
//            for (int i = 1; i < m; i++) {
//                if ((m % i) == 0) s += i;
//            }
//            if (s == m) {
//                System.out.print(m + " its factors are:");
//                for (int j = 1; j < m; j++) {
//                    if ((m % j) == 0) {
//                        System.out.print(j);
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//    }
//}
//6 its factors are:1 2 3
//28 its factors are:1 2 4 7 14
//496 its factors are:1 2 4 8 16 31 62 124 248
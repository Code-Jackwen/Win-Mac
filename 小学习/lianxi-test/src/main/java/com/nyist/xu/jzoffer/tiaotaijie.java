package com.nyist.xu.jzoffer;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-06 15:41
 **/
public class tiaotaijie {
    //跳台阶   斐波那契数列
    //1或者3 有多少方法
    public static void main(String[] args) {
        System.out.println(f(7));
    }
    public static int f(int n){
        if (n==0){
            return 0;
        }
        if(n<3){
            return 1;
        }
        if(n==3){
            return 2;
        }
        return f(n-1)+f(n-3);
    }
}
//n=0   f0                                          0
//n=1   f1                                          1
//n=2   f2                                          1
//n=3   f2+f0   1+1+1 3                             2
//n=4   f3+f1   1+1+1+1 3+1 1+3                     3
//n=5   f4+f2   1+1+1+1+1 3+1+1 1+3+1   1+1+3       4
//n=6   f5+f3                                       6
//11111、33、3111、1311、1131、1113

//验证7
// 1111111、133、313、331     31111、13111、11311、11131、11113      9
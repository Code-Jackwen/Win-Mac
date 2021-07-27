package com.nyist.xu.javabasetest.smallMethodTest.arrayCopy;

import java.util.Arrays;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-09 23:14
 **/
public class Arraysfill {
    public static void main(String[] args) {
        //1
        //Arrays.fill(dp, 1);测试
        //作用：给数组全部赋值的
//        int[] dp = new int[5];
//        Arrays.fill(dp, 1);
//        for (int i = 0; i < dp.length; i++) {
//            System.out.println(dp[i]);
//        }
        System.out.println(JumpFloorII1(10));
        System.out.println(JumpFloorII2(10));
    }


    public static int JumpFloorII1(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j];
        return dp[target - 1];
    }

    public static int JumpFloorII2(int target) {
        return (int) Math.pow(2, target - 1);
    }
}

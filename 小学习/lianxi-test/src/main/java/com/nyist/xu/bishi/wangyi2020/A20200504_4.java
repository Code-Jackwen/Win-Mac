package com.nyist.xu.bishi.wangyi2020;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-04 21:39
 **/
//链接：https://www.nowcoder.com/questionTerminal/4d5203fd86694b16b69973d86a0eb4e9
//来源：牛客网
//
//小易有一个初始为空的数字集合，支持两种操作：
//1、加入数字x到集合中。
//2、询问集合中是否存在一个子集，满足子集中所有数字的Or值恰好为k。
//Or为二进制按位或操作，C++中表示为"|"。
//小易希望你能解决这个问题。
//
//输入描述:
//
//第一行数字q,表示操作个数
//接下来q行，每行两个数字：
//1 x表示插入数字x
//2 x表示询问数字x(即题设中询问的数值k)
//1≤q≤1000001 \leq q \leq 1000001≤q≤100000 , 1≤x≤1000001 \leq x \leq 1000001≤x≤100000 。
//
//
//
//输出描述:
//
//对于每个询问，输出"YES"或者"NO"表示是否存在。
//
//示例1
//输入
//
//9
//1 4
//2 5
//1 9
//1 15
//2 4
//1 11
//2 10
//2 7
//2 9
//
//输出
//
//NO
//YES
//NO
//NO
//YES
public class A20200504_4 {
    //不会， 答案没有  全对的。
    //通过60

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        while (q-- > 0) {
            int flag = sc.nextInt(), target = sc.nextInt();
            if (flag == 1) {
                set.add(target);
            } else {
                int temp = 0;
                for (Integer each : set) {
                    if ((each & target) == each) {
                        temp |= each;
                    }
                    if (each == target) {
                        temp = target;
                        break;
                    }
                    if (target == temp) break;
                }
                if (temp == target) {
                    System.out.println("YES");
                    set.add(target);
                } else System.out.println("NO");
            }
        }

    }
}



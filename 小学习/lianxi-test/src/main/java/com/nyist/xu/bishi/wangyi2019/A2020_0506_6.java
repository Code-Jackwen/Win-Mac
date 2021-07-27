package com.nyist.xu.bishi.wangyi2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-08 19:31
 **/
//链接：https://www.nowcoder.com/questionTerminal/54868056c5664586b121d9098d008719
//来源：牛客网
//
//小易有一些立方体，每个立方体的边长为1，他用这些立方体搭了一些塔。
//现在小易定义：这些塔的不稳定值为它们之中最高的塔与最低的塔的高度差。
//小易想让这些塔尽量稳定，所以他进行了如下操作：每次从某座塔上取下一块立方体，并把它放到另一座塔上。
//注意，小易不会把立方体放到它原本的那座塔上，因为他认为这样毫无意义。
//现在小易想要知道，他进行了不超过k次操作之后，不稳定值最小是多少。
//
//输入描述:
//
//第一行两个数n,k (1 <= n <= 100, 0 <= k <= 1000)表示塔的数量以及最多操作的次数。
//第二行n个数，ai(1 <= ai <= 104)表示第i座塔的初始高度。
//
//
//
//输出描述:
//
//第一行两个数s, m，表示最小的不稳定值和操作次数(m <= k)
//接下来m行，每行两个数x,y表示从第x座塔上取下一块立方体放到第y座塔上。
//
//示例1
//输入
//
//3 2
//5 8 5
//
//输出
//
//0 2
//2 1
//2 3
public class A2020_0506_6 {

    //写的思路 很清晰 ， 集合函数的 运用很到位，代码显得简洁
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//塔的数量
        int k = sc.nextInt();//最多操作数
        ArrayList<Integer> towers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            towers.add(sc.nextInt());
        }
        int count = 0;
        int max = Collections.max(towers);//个人觉得这多余
        int min = Collections.min(towers);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (max - min > 1 && count < k) {
            max = Collections.max(towers);
            min = Collections.min(towers);
            list1.add(towers.indexOf(max) + 1);//list1、2 记录 交换痕迹，痕迹总是 最大 换到最小
            list2.add(towers.indexOf(min) + 1);
            towers.set(towers.indexOf(min), min + 1);// 把最高的换到最低的，更新 塔集合。
            towers.set(towers.indexOf(max), max - 1);
            count++;
        }
        System.out.println(Collections.max(towers) - Collections.min(towers) + " " + count);
        //遍历 交换 记录
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i) + " " + list2.get(i));
        }
    }
}

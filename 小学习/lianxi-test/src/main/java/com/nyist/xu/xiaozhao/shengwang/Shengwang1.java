package com.nyist.xu.xiaozhao.shengwang;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-11 22:02
 **/
public class Shengwang1 {
    //用的 牛客的编译器，不舒服，ACM模式，第二题是剑指原题
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0||n%5==0)
        {
            System.out.println(-1);
            return;
        }
        String f = "1";
        int cnt = 1;
        while (true){
            Long num = new Long(f);
            if(num%n  ==0){
                break;
            }
            f=f+"1";
            cnt++;
        }
        System.out.println(cnt);
        return;
    }
}

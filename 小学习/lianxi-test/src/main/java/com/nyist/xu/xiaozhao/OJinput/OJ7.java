package com.nyist.xu.xiaozhao.OJinput;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-12 14:05
 **/
public class OJ7 {
    //输入描述:
    //输入数据有多组, 每行表示一组输入数据。
    //每行不定有n个整数，空格隔开。(1 <= n <= 100)。

    //输出描述:
    //每组数据输出求和的结果

    //输入例子 1:
    //1 2 3
    //4 5
    //0 0 0 0 0
    //输出例子 1:
    //6
    //9
    //0

//    import java.util.Scanner;
//    public class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String[] line=in.nextLine().split(" ");
                int sum=0;
                for(String e:line){
                    sum+=Integer.parseInt(e);
                }
                System.out.println(sum);
            }
        }
//    }
}

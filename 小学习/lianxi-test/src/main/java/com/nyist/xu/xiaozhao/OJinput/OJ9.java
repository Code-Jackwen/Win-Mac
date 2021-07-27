package com.nyist.xu.xiaozhao.OJinput;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-12 14:05
 **/
public class OJ9 {
    //输入描述:
    //多个测试用例，每个测试用例一行。
    //每行通过空格隔开，有n个字符，n＜100
    //输出描述:
    //对于每组测试用例，输出一行排序过的字符串，每个字符串通过空格隔开

    //输入例子 1:
    //a c bb
    //f dddd
    //nowcoder

    //输出例子 1:
    //a bb c
    //dddd f
    //nowcoder

//    import java.util.*;
//    public class Main{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String line = in.nextLine();
                String[] strs = line.split(" ");
                Arrays.sort(strs);
                for(int i = 0; i < strs.length - 1; i++){
                    System.out.print(strs[i] + " ");
                }
                //或者用 StringBuilder
                //System.out.println(result.substring(0 , result.length() - 1));
                System.out.println(strs[strs.length - 1]);
            }
        }
    //}
}

package com.nyist.xu.xiaozhao.didi20;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-13 20:01
 **/
public class Loginc1 {
    //20年滴滴秋招，9月13号     第二题是小岛连通题。
    public static void main(String[] args) {
        //2
        //gogogoout
        //样例输出
        //ogogoguot
        //
        //提示
        //输入样例2
        //3
        //Gogo, go out!?
        //输出样例2
        //goG ,o ogtuo?!  不够3的也倒排
        //goG ,o ogtuo!?  是错的
        //goG ,o ogtuo?
        //goG ,o ogtuo?!   对了
        //输入样例3
        //6
        //hello
        //输出样例3
        //olleh

        //写之前 注视下 思路，最好一遍成。

        //总结：
        //next()  不能获取带空格的  字符串， 空格，tab，回车       都是终止
        //nextLine()的区别      能获取带空格的  字符串
        //这连个函数 结合使用 会出现 问题:
        //https://blog.csdn.net/homedjy/article/details/8733270
        //解决方案：
        //在每一个next()、nextInt()、nextDouble()等后加一条nextLine()语句，将被next()去掉的Enter过滤掉，代码如下：


        //智商税
        //三元运算符
        //int a = 3 > length ? length / k : 4;
        //boolean a = 20 < 45 ? true : false
        //三元运算符详解
        //https://www.cnblogs.com/itmlt1029/p/4756331.html
        //注意 运算符的 优先级，和三元的 隐式数据类型转换

        //基本数据类型
        //https://blog.csdn.net/nash885/article/details/79428130?utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~all~first_rank_v2~rank_v25-1-79428130.nonecase&utm_term=java%E5%9F%BA%E6%9C%AC%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E4%BB%8E%E5%B0%8F%E5%88%B0%E5%A4%A7


        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String kkkk = scanner.nextLine();//处理输入问题
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();//结果
        int length = s.length();

        //处理k 大的情况
        if (k>length){
            k = length;
        }
        int timek = length / k;//   9/2  = 4

        //转换
        for (int i = 1; i <= timek; i++) {// i: 1 2 3 4
            int index = i * k - 1;// 2 ,4 ,6, 8      1,3,5,7
            for (int j = 0; j < k ; j++) {
                sb.append(chars[index]);
                index--;
            }
        }

        //14/3 = 4 余2
        //处理 不够k的 末尾字符串
        int leftNum = length % k;
        if(leftNum>0){
            length--;
            for (int z = 0; z < leftNum; z++) {
                sb.append(chars[length--]);//  --是函数执行完后才减。
            }
        }

        //老逻辑 也对，不简洁。
//        int leftNum = length % k;
//        if(leftNum>0){
//            int leftIndex = leftNum;
//            for (int z = 0; z < leftNum; z++) {
//                sb.append(chars[timek * k - 1 + leftIndex]);
//                leftIndex--;
//            }
//        }
        System.out.println(sb.toString());
    }
}

package com.nyist.xu.xiaozhao.jinsanyun20;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-16 22:36
 **/
public class Logic1 {
    //斐波那锲三角形
    //时间限制： 3000MS
    //内存限制： 589824KB
    //题目描述：
    //小明对斐波那契数列很痴迷，他觉得这是一个非常非常神奇的数列。
    //
    //他想用斐波那契数列中的数字构造一个三角形，并取名为斐波那契三角形。
    //
    //一个7层的斐波那契三角形如下所示：
    //
    //            1
    //          1 1  1
    //        1 1 2  1 1
    //      1 1 2 3  2 1 1
    //    1 1 2 3 5  3 2 1 1
    //  1 1 2 3 5 8  5 3 2 1 1
    //1 1 2 3 5 8 13 8 5 3 2 1 1
    //
    //现在需要你编写一个程序，输入斐波那契三角形的层数n，输出对应的斐波那契三角形。
    //
    //
    //
    //输入描述
    //每组输入数据占1行。
    //
    //输入一个正整数n。（n<=100)
    //
    //输出描述
    //输出一个n层的斐波那契三角形，每一层两个数字之间用一个空格隔开。
    //
    //
    //样例输入
    //3
    //样例输出
    //1
    //1 1 1
    //1 1 2 1 1

    //n=7对应的结果

    //1
    //1 1 1
    //1 1 2 1 1
    //1 1 2 3 2 1 1
    //1 1 2 3 5 3 2 1 1
    //1 1 2 3 5 8 5 3 2 1 1
    //1 1 2 3 5 8 13 8 5 3 2 1 1



//1
//1	1
//1	2	1
//1	3	3	1
//1	4	6	4	1
//1	5	10	10	5	1
//1	6	15	20	15	6	1
//1	7	21	35	35	21	7	1
//1	8	28	56	70	56	28	8	1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("输入要打印的行数：");
//        int n = scanner.nextInt();
//        getTriangle(n);
//    }
//    //打印杨辉三角
//    public static int[][] getTriangle(int n) {
//        // 创建一个二维数组，此二维数组用来存放杨辉三角中每一行的值
//        int[][] array = new int[n][n];
//        // 给数组元素赋值
//        for (int i = 0; i < array.length; i++) {
//            // 每一行的值
//            array[i] = new int[i + 1];
//            // 给首末元素赋值
//            array[i][0] = array[i][i] = 1;
//            // 给每行的非首末元素赋值
//            if (i > 1) {
//                for (int j = 1; j < array[i].length - 1; j++) {
//                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
//                }
//            }
//        }
//        // 遍历二维数组
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        return array;
//    }


    //1 没用了
    //1 1 1
    //1 1 2 1 1
    //1 1 2 3 2 1 1
    //1 1 2 3 5 3 2 1 1
    //1 1 2 3 5 8 5 3 2 1 1
    //1 1 2 3 5 8 13 8 5 3 2 1 1
    //          1
    //        1 1 1
    //      1 1 2 1 1
    //    1 1 2 3 2 1 1
    //  1 1 2 3 5 3 2 1 1
    //1 1 2 3 5 8 5 3 2 1 1


    //n=7       我写的题解
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要打印的行数：");
        int n = scanner.nextInt();
        getSolution(n);
    }

    private static void getSolution(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
            array[i][0] = 1;
            if (i >= 1) {
                array[i][1] = 1;
            }
            for (int j = 2; j < array[i].length; j++) {
                array[i][j] = array[i][j - 1] + array[i][j - 2];
            }
        }
        //对称打印
        //思路
        //1
        //1 1        1
        //1 1 2       1 1
        //1 1 2 3       2 1 1
        //1 1 2 3 5      3 2 1 1
        //1 1 2 3 5 8       5 3 2 1 1
        //1 1 2 3 5 8 13       8 5 3 2 1 1

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            for (int j = array[i].length - 2; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

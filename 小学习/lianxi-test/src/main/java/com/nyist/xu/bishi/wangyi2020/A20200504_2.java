package com.nyist.xu.bishi.wangyi2020;

import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-04 19:59
 **/
//链接：https://www.nowcoder.com/questionTerminal/76f10d28d721471cb70d6ac6e0db1cb5
//来源：牛客网
//
//小易有一个体积巨大的货物，具体来说，是个在二维平面上占地c×dc \times dc×d的货物。
//小易有一个n×mn \times mn×m的广场，想把货物放在这个广场上。不幸的是，广场上已经有了一些障碍物，障碍物所在的格子不能放置你的货物。小易现在想知道能否成功地放置货物。
//
//输入描述:
//
//第一行数字t，表示有t组数据。
//对于每一组数据，第一行三个数字n,m,k，表示广场的大小和障碍物的个数。接下来k行，每行两个数x,y，表示一个障碍物的坐标。
//接下来一行两个数c,d，表示货物的大小。
//1≤n,m≤10001 \leq n,m \leq 10001≤n,m≤1000，1≤c≤n,1≤d≤m,0≤k≤n×m1 \leq c \leq n , 1\leq d \leq m , 0 \leq k \leq n \times m1≤c≤n,1≤d≤m,0≤k≤n×m
//
//
//
//输出描述:
//
//对于每组数据，输出"YES"或者"NO"表示货物是否可以被放置。
//
//示例1
//输入
//
//2
//3 3 1
//1 1
//2 2
//3 3 1
//2 2
//2 2
//
//输出
//
//YES
//NO
public class A20200504_2 {
//    链接：https://www.nowcoder.com/questionTerminal/76f10d28d721471cb70d6ac6e0db1cb5
//    来源：牛客网

// 示例 1
// 输入
// 2
// 3 3 1
// 1 1
// 2 2
// 3 3 1
// 2 2
// 2 2
// 输出
// YES
// NO

    private static Scanner sc;

    //不懂 用到的 算法 方法
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int t = sc.nextInt();//组数
        for (int a = 0; a < t; a++) {
            int n = sc.nextInt();//广场长(宽)
            int m = sc.nextInt();//广场长(宽)
            int k = sc.nextInt();//障碍物个数
            int[][] grid = new int[n + 10][m + 10];
            for (int i = 0; i < k; i++) {//填入障碍物坐标
                grid[sc.nextInt()][sc.nextInt()] = 1;
            }
            for (int row = 1; row < n; row++) {
                for (int col = 1; col < m; col++) {
                    grid[row][col] += grid[row - 1][col] + grid[row][col - 1] - grid[row - 1][col - 1];
                }
            }
            int c = sc.nextInt();//货物长(宽)
            int d = sc.nextInt();//货物长(宽)
            boolean findPosition = false;
            for (int row = 1; row < n - c + 1; row++) {
                for (int col = 1; col < m - d + 1; col++) {
                    int ok = grid[row + c - 1][col + d - 1] - grid[row + c - 1][col - 1] - grid[row - 1][col + d - 1] + grid[row - 1][col - 1];
                    if (ok == 0) {
                        System.out.println("YES");
                        findPosition = true;
                        break;
                    }
                }
                if (findPosition) {
                    break;
                }
            }
            if (!findPosition) {
                System.out.println("NO");
            }
        }
    }

    //


}

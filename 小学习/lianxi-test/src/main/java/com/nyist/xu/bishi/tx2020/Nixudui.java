package com.nyist.xu.bishi.tx2020;

import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-01 22:51
 **/
public class Nixudui {
    //逛街

    //链接：https://www.nowcoder.com/questionTerminal/8fe007e54fc04b5e82089aaa71ba3553
    //来源：牛客网
    //
    //作为程序员的小Q，他的数列和其他人的不太一样，他有2n2^n2n个数。
    //老板问了小Q一共 m次，每次给出一个整数qi(1<=i<=m)q_i (1 <= i <= m)qi​(1<=i<=m), 要求小Q把这些数每2qi2^{q_i}2qi​分为一组，然后把每组进行翻转，小Q想知道每次操作后整个序列中的逆序对个数是多少呢？
    //
    //例如:
    //对于序列1 3 4 2，逆序对有(4, 2),(3, 2),总数量为2。
    //翻转之后为2 4 3 1，逆序对有(2, 1),(4, 3), (4, 1), (3, 1),总数量为4
    // 链接：https://www.nowcoder.com/questionTerminal/8fe007e54fc04b5e82089aaa71ba3553
    //来源：牛客网
    //
    //输入描述:
    //
    //第一行一个数n(0≤n≤20)n(0 \leq n \leq 20)n(0≤n≤20)
    //第二行2n2^n2n个数，表示初始的序列(1≤初始序列≤1091 \leq 初始序列 \leq 10^91≤初始序列≤109)
    //第三行一个数m(1≤m≤106)m(1 \leq m \leq 10^6)m(1≤m≤106)
    //第四行m个数表示qi(0≤qi≤n)q_i(0 \leq q_i \leq n)qi​(0≤qi​≤n)
    //
    //
    //
    //输出描述:
    //
    //m行每行一个数表示答案。
    //
    //示例1
    //输入
    //
    //2
    //2 1 4 3
    //4
    //1 2 0 2
    //
    //输出
    //
    //0
    //6
    //6
    //0
    //
    //说明
    //
    //初始序列2 1 4 3
    //2q1=22^{q_1} = 22q1​=2 ->
    //第一次：1 2 3 4 -> 逆序对数为0
    //2q2=42^{q_2} = 42q2​=4 ->
    //第二次：4 3 2 1 -> 逆序对数为6
    //2q3=12^{q_3} = 12q3​=1 ->
    //第三次：4 3 2 1 -> 逆序对数为6
    //2q4=42^{q_4} = 42q4​=4 ->
    //第四次：1 2 3 4 -> 逆序对数为0


    //大概思路
    //先利用归并排序初始化不同间隔的逆序对和顺序对之和，当反转时交换顺序对和逆序对即可。每次查询时将不同间隔的逆序对加起来。


    //好难
    //45行不加long通过百分之80      int*int 溢出了 int的最大值是(2^31-1)
    public static void resolve(int arr[], int left, int right, int[] temp,
                               long[] result, long[][] dp, int index) {
        if (left < right) {
            int mid = left + right >> 1;
            resolve(arr, left, mid, temp, result, dp, index - 1);
            resolve(arr, mid + 1, right, temp, result, dp, index - 1);
            merge(arr, left, mid, right, temp, result, dp, index);
        }
    }

    public static void merge(int arr[], int left, int mid, int right, int[] temp,
                             long[] result, long[][] dp, int index) {
        int i = left;
        int j = mid + 1;
        int tempLeft = 0;

        long max = 0;
        long equal = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                max += j - mid - 1;
                if (arr[i] == arr[j]) {
                    equal++;
                    int ind = j + 1;
                    while (ind <= right && arr[j] == arr[ind++]) {
                        equal++;
                    }
                }
                temp[tempLeft++] = arr[i++];
            } else {
                temp[tempLeft++] = arr[j++];
            }
        }
        while (i <= mid) {
            max += right - mid;
            temp[tempLeft++] = arr[i++];
        }
        while (j <= right) {
            temp[tempLeft++] = arr[j++];
        }
        result[0] += max;
        dp[index][0] += max;
        dp[index][1] += (long) (right - mid) * (right - mid) - max - equal;

        tempLeft = left;
        i = 0;
        while (tempLeft <= right) {
            arr[tempLeft++] = temp[i++];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int total = n == 0 ? 1 : 2 << n - 1;
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        long[] result = {0};
        long[][] dp = new long[n][2];

        int[] temp = new int[total];
        resolve(arr, 0, total - 1, temp, result, dp, n - 1);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int qn = scanner.nextInt() - 1;
            if (i == 0 || qn != -1) {
                int index = 0;
                while (index <= qn) {
                    long tem = dp[index][0];
                    dp[index][0] = dp[index][1];
                    dp[index][1] = tem;
                    result[0] += dp[index][0] - dp[index][1];
                    index++;
                }
            }
            builder.append(result[0] + "\n");
        }
        System.out.print(builder);
    }


}

package com.nyist.xu.bishi.wangyi2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-06 20:57
 **/
public class A2020_0506_1 {
    //网易2019秋季校园招聘编程题真题集合

//    链接：https://www.nowcoder.com/questionTerminal/9407e24a70b04fedba4ab3bd3ae29704
//    来源：牛客网

    //这道题的思路很简单，N列，就定义一个1*N的数组，每一列落下方块时，对应数组位置+1，最后取数组的最小值就可以了
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            arr[scanner.nextInt() - 1]++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}

// 这个思路 也可以
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < m; i++) {
//            int num = sc.nextInt();
//            if (!map.containsKey(num)) {
//                map.put(num, 1);
//            } else {
//                map.put(num, map.get(num) + 1);
//            }
//        }
//        int min = Integer.MAX_VALUE;
//        if (map.size() == n) {
//            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                if (entry.getValue() < min) {
//                    min = entry.getValue();
//                }
//            }
//        } else {
//            min = 0;
//        }
//        System.out.println(min);
//    }

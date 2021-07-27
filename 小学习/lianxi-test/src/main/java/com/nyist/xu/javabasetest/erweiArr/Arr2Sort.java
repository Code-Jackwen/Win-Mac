package com.nyist.xu.javabasetest.erweiArr;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-04-10 17:42
 **/
public class Arr2Sort {
    //https://www.codenong.com/cs106806935/
    public static void main(String[] args) {

        //总结
        //对列：Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));
        //二维数组列排序1

        int[][] arr = {
         {323,336,169,841,744},
         {590,340,204,386,405},
         {152,646,765,520,891}
        };

//        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(arr, Comparator.comparingInt(o -> o[1]));


//        //按行排序，升序。
//        for (int i = 0; i < arr.length; i++) {
//            Arrays.sort(arr[i]);
//        }

        // 按照二维数组第二层的第一列排序一维层次，升序排序。
//        Arrays.sort(arr, new Comparator<int[]>() {//按二维数组每一行第一列，对列进行排序
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });

        //按照第二列，降序排序。
        //二维的排序规则，顺序变动依然针对的是一维度的数组。
//        Arrays.sort(arr, new Comparator<int[]>() {//按二维数组每一行第一列，对列进行排序
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o2[1] - o1[1];
//            }
//        });

        print(arr);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

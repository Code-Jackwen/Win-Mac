package com.nyist.xu.javabasetest.erweiArr;

import java.util.Arrays;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-04-10 17:53
 **/
public class Practice {

    //二维数组列排序2
    
    // 简化版
    public static int[][] mySort(int[][] array){
            Arrays.sort(array, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
            //lambda：Arrays.sort(matrix, (a, b) -> a[0] - b[0]);
            return array;
        }

//    public static int[][] mySort(int[][] array) {
//        // 新建一个比较器Comparator作为匿名内部类
//        Arrays.sort(array, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] == o2[0]) {
//                    // 若俩数组的第一个元素相等，则比较它们的第二个元素
//                    return o1[1] - o2[1];
//                } else {
//                    // 若俩数组的第一个元素不相等，则按从小到大的顺序排列
//                    return o1[0] - o2[0];
//                }
//            }
//        });
//        return array;
//    }

    public static void main(String[] args) {
        // 输入测试数据
        int[][] arr = new int[][]{{15, 18},{2, 4},{1, 3},{2, 6}, {8, 18},{8, 10} };

//        Arrays.sort(arr, (o1, o2) ->  o1[0] - o2[0]);//只按第一位排序
//        Arrays.sort(arr, (o1, o2) ->  o1[1] - o2[1]);//只按第二位排序
//        Arrays.sort(arr);//报错


//        int[][] sorted = mySort(arr);
        // 输出测试结果
        for (int[] a : arr) {
            System.out.println(a[0] + "," + a[1]);
        }
    }
}

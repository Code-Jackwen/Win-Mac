package com.nyist.xu.javabasetest.utiltest;

import java.util.Arrays;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-15 23:27
 **/
public class ArraysTest {
    //Class -- 02 -- Arrays类常用方法解析
    //https://blog.csdn.net/Goodbye_Youth/article/details/81003817
    //还有很多 java工具 类 方法总结
    //System、Math、Random等等

    public static void main(String[] args) {

        //1、总结
        //Arrays.copyOf(nums, 4) 第二参数是新数组的长度就是有几个元素。超过了原数组的话，后边元素是0
        //for(int i : a){} 这东西遍历数组有坑。
//        int[] nums = new int[]{1,2,3,4,5,6,7,8};
//        int[] a = Arrays.copyOf(nums, 4);//传递新数组的长度
//        int[] b = Arrays.copyOf(nums, 10);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//        }
//        System.out.println();
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i]);
//        }
//        System.out.println();
//        for (int num : nums) {//这种遍历方式 ，遍历数组a 或者 b 是有坑的，没细研究。
//            System.out.print(num);
//        }


        //Arrays用来 数组转字符串
        int []arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        System.out.println(4^8);
    }

}

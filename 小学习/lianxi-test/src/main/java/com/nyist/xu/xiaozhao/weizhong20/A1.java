package com.nyist.xu.xiaozhao.weizhong20;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-10 13:47
 **/
public class A1 {
    //我的 半对55A

//        5 5       长度 次数
//        1 2 3 4 5
//        3
//        0
//        7
//        2
//        5
//        样例输出
//        3
//        1
//        5
//        2
//        5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int time = sc.nextInt();
        int[] req = new int[time];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int j = 0; j < time; j++) {
            req[j] = sc.nextInt();
        }
        int[] result = new int[req.length];
        for (int k = 0; k < req.length; k++) {
            int index = 0;
            for (int h = 0; h < arr.length; h++) {
                int min = Math.abs(req[k] - arr[h]);
                if (h > 0 && min < Math.abs(req[k] - arr[h - 1])) {
                    index = h;
                }
            }
            System.out.println(arr[index]);
        }
    }
}
//山东 0A ，用二分
//    private static int getIndex(int k,int[]nums) {
//        if (nums.length==0)
//            return 0;
//        if (k<=nums[0])return nums[0];
//        if (k>=nums[nums.length-1])return nums[nums.length-1];
//        int mid=nums.length/2;
//        if (k==nums[mid]) {
//            return mid;
//        }
//        int start=0;
//        int end=nums.length-1;
//        int in1=0;
//        int in2=0;
//        while(start<=end){
//            mid=start+(end-start)/2;
//            if (k==nums[mid]) {
//                return nums[mid];
//            }else if (k>nums[mid]) {
//                in1 = start;
//                start=mid+1;
//            }else {
//                in2 = end;
//                end=mid-1;
//            }
//        }
//        int a = k - nums[in1];
//        int b = nums[in2]-k;
//        return a<b ? nums[in1]:nums[in2];
//    }

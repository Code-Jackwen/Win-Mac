package com.nyist.xu.algorithm.others;

import java.util.Arrays;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-08-04 16:03
 **/
public class Lgc {
    //拉科菲希科技有限公司   算法题目
    public static void main(String[] args) {
        int arr[] ={0,0,1,1,1,2,2,3,3,4};
        int len = 10;

        //师傅的实现
        int count=0;
        for (int i=0;i<arr.length-count;i++) {
            for(int j=i+1;j<arr.length-count;j++ ){
                if(arr[i]==arr[j]){
                    count++;
                    for(int m=j;m<arr.length-count;m++) {
                        arr[m] = arr[m + 1];
                    }
                    j--;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);

    }
}

package com.nyist.xu.sort;


import java.util.Arrays;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-21 13:36
 **/
//————————————————
//这个没贴代码
//原文链接：https://blog.csdn.net/sunlanchang/article/details/60478814
public class QuickSort {
    //易学教程，快排。  简单易懂
//    https://www.e-learn.cn/content/java/1545532
    //代码
    public static void quickSort(int[] arr, int l, int h) {
        if (l > h) {
            return;
        }
        int i = l, j = h, tag = arr[l];
        while (i < j) {
            //先看右边，依次往左递减, 两个while顺序不能颠倒！j--不能缩进去。
            while (tag <= arr[j] && i < j)
                j--;
            //再看左边，依次往右递增
            while (tag >= arr[i] && i < j)
                i++;
            //如果满足条件则交换,这条件多余。
            if (i < j) {//不带条件位运算交换就是错的，而普通交换带不带都是对的。
                swap(arr,i,j);
            }
        }
        //最后将基准为与i和j相等位置的数字交换
//        sw(arr,l,j);
        swap(arr,i,l);
        quickSort(arr, l, j - 1);
        quickSort(arr, j + 1, h);
    }
    public static void sw(int[] arr,int a,int b){
        arr[a] ^=arr[b];
        arr[b] ^=arr[a];
        arr[a] ^=arr[b];
    }
    public static void swap(int[] arr,int a,int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public static void main(String[] args) {
//        int[] arr = {6,1,2,7,9,11,4,5,10,8};
//        int[] arr = {6, 6, 2, 7, 8, 11, 6, 5, 8, 8};
//          int arr[] = {49,38,65,97,76,13,27,49};
        int arr[] = {5,4,3,2,1,1,2,3,4,5};
//        int[] arr= new int[]{10, 9, 2, 5, 3, 7, 101, 18};//这种定义也对

//        int arr[] = {2,1,3,4,5};
//        int arr[] = {1,0,-1,0,-2,2};
          quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
//          for (int i = 0; i < arr.length; i++) {
//              System.out.print(arr[i]+"\t");
//          }
    }


//22222--------------------------------------------------------------------------------------------------------

//1、算法原理：以一个数为中心将序列分成两个部分，一边全是比它小，另一边全是比它大。
//
//2、算法思路：一个军训小栗子，教官说“第一个同学出列，其余同学以他为中心，矮的全排到他的左边，高的全排到他的右边。”这就是一趟快速排序。
//
//3、算法过程
//
//举个栗子（第一趟的排序过程）
//
//原始序列：49、38、65、97、76、13、27、49
//
//                   i                                                      j
//
//1)进行第一趟快速排序，以第一个数49为枢轴，整个过程是一个交替扫描和交换的过程（ij分别指向头、尾元素）
//
//2)使用j，从序列最右端开始向前扫描，直到遇到比枢轴49小的27，j停在这里
//
//49、38、65、97、76、13、27、49
//
// i                                             j
//
//3)将27交换到序列前端i的位置
//
//27、38、65、97、76、13、49、49
//
// i                                             j
//
//4)这时使用i，换扫描方向，从左到右扫描，直到遇到比枢轴49大的数65，i停在这里
//
//27、38、65、97、76、13、49、49
//
//                 i                              j
//
//5)将65交换到序列j的位置
//
//27、38、49、97、76、13、65、49
//
//                 i                              j
//
//6)换扫描方向，从右到左扫描，直到遇到比枢轴49小的数13，j停在这里
//
//27、38、49、97、76、13、65、49
//
//                 i                      j
//
//7)将13交换到序列i的位置
//
//27、38、13、97、76、49、65、49
//
//                 i                      j
//
//8)换扫描方向，从左到右扫描，直到遇到比枢轴49大的数97，i停在这里
//
//27、38、13、97、76、49、65、49
//
//                       i                j
//
//9)将97交换到序列j的位置
//
//27、38、13、49、76、97、65、49
//
//                       i                j
//
//10)换扫描方向，从右到左扫描，直到遇到比枢轴49大的数，如果ij形象与，说明扫描结束，此时49位置就是最终排序位置。
//
//27、38、13、49、76、97、65、49

// 11）可以看出一次排序后，将原来的序列以49为枢轴，划分为两个部分，49左边数都比它小，右边数都比它大，接下来同样方法对序列{27、38、13}和{76、97、65、49}分别进行排序。

//public class QuickSort {
//    public static void main(String[] args) {
//        int arr[] = {49,38,65,97,76,13,27,49};
////        int[] arr = new int[]{6, 1, 2, 7, 9, 11, 4, 5, 10, 8};
////        int[] arr = {6, 1, 2, 7, 9, 11, 4, 5, 10, 8};
//        quickSort(arr, 0, 7);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void quickSort(int[] arr, int left, int right) {
//        if (left < right) {
//            // 一次划分
//            int mid = partion(arr, left, right);
//            quickSort(arr, 0, mid - 1);
//            quickSort(arr, mid + 1, right);
//        }
//    }
//
//    public static void swap(int[] arr, int l, int r) {
//        int tmp = arr[l];
//        arr[l] = arr[r];
//        arr[r] = tmp;
//    }
//
//    public static int partion(int[] arr, int left, int right) {
//        // 轴值，默认选取数组的第一个数字
//        while (left < right) {
//            while (left < right && arr[left] <= arr[right]) {
//                right--;
//            }
//            if (left<right){
//                swap(arr, left, right);
//            }
//            while (left < right && arr[left] <= arr[right]) {
//                left++;
//            }
//            if (left<right){
//                swap(arr, left, right);
//            }
//        }
//        return left;
//    }
//————————————————
//版权声明：本文为CSDN博主「那人好像一条猿」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/changhangshi/article/details/82736203

}
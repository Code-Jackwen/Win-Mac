package com.nyist.xu.sort;

import java.util.Arrays;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-21 22:15
 **/
public class HeapSort {
    public static void main(String[] args) {
//        int[] arr = {9,8,7,6,5,4,3,2,1};
//        int[] arr = {5,4,3,2,1,1,2,3,4,5};
        int[] arr = {6,1,2,7,9,11,4,5,10,8};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //堆排序
    public static void heapSort(int[] arr) {
        //构造大根堆（通过上浮）
        //swim(arr);
        //1、构建大顶堆
        int len = arr.length;
        //从第一个非叶子结点从下至上，数组上从右至左调整堆元素。
        int m = len / 2 - 1;
        while (m>=0) {
            sink(arr, m--, len-1);
        }
        //2、固定一个值并将新值重新下沉
        while (len > 1) {
            swap(arr,0, len-1);
            sink(arr,0, --len);
        }
    }
    public static void sink(int[] arr, int i, int len) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int t;
        while (l < len) {
            //判断孩子中较大的值的索引（要确保右孩子在len范围之内）
//            if (arr[l] < arr[r] && r < len) {
//                t = r;
//            } else {
//                t = l;
//            }
            t = arr[l] < arr[r] && r < len ? r:l;
            if (arr[i] > arr[t]) {
                t = i;
            }
            if (i == t) {
                break;
            }
            swap(arr, t, i);
            i = t;
            l = 2 * i + 1;
            r = 2 * i + 2;
        }
    }
    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
    //构造大根堆（通过上浮）
    public static void swim(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //当前插入的索引
            int c = i;
            //父结点索引
            int f = (c - 1) / 2;
            //如果当前插入的值大于其父结点的值,则交换值，并且将索引指向父结点
            //然后继续和上面的父结点值比较，直到不大于父结点，则退出循环
            while (arr[c] > arr[f]) {
                //交换当前结点与父结点的值
                swap(arr, c, f);
                //将当前索引指向父索引
                c = f;
                //重新计算当前索引的父索引
                f = (c - 1) / 2;
            }
        }
    }





    //堆排序
    //图解比较明白
    //https://blog.csdn.net/u010452388/article/details/81283998

//    堆的结构可以分为大根堆和小根堆，是一个完全二叉树，而堆排序是根据堆的这种数据结构设计的一种排序，下面先来看看什么是大根堆和小根堆
//
//    1.1
//    大根堆和小根堆
//    性质：每个结点的值都大于其左孩子和右孩子结点的值，称之为大根堆；每个结点的值都小于其左孩子和右孩子结点的值，称之为小根堆
//
//    还有一个基本概念：查找数组中某个数的父结点和左右孩子结点，比如已知索引为i的数，那么
//
//1.父结点索引：(i-1)/2（这里计算机中的除以2，省略掉小数）
//
//     2.左孩子索引：2*i+1
//
//     3.右孩子索引：2*i+2
//
//    所以上面两个数组可以脑补成堆结构，因为他们满足堆的定义性质：
//
//    大根堆：arr(i)>arr(2*i+1) && arr(i)>arr(2*i+2)
//
//    小根堆：arr(i)<arr(2*i+1) && arr(i)<arr(2*i+2)
//
//
//    堆排序基本步骤
//    基本思想：
//
//     1.首先将待排序的数组构造成一个大根堆，此时，整个数组的最大值就是堆结构的顶端
//
//2.将顶端的数与末尾的数交换，此时，末尾的数为最大值，剩余待排序数组个数为n-1
//
//     3.将剩余的n-1个数再构造成大根堆，再将顶端数与n-1位置的数交换，如此反复执行，便能得到有序数组
//
//2.1 构造堆
//    将无序数组构造成一个大根堆（升序用大根堆，降序就用小根堆）
//
//    总结
//    到这里，大家应该对堆排序都有了自己的见解，我们对上面的流程总结下：
//     1、首先将无需数组构造成一个大根堆（新插入的数据与其父结点比较）
//     2、固定一个最大值，将剩余的数重新构造成一个大根堆，重复这样的过程


//    public static void main(String[] args) {
//        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        heapSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    //堆排序
//    public static void heapSort(int[] arr) {
//        //构造大根堆
//        heapInsert(arr);
//        int size = arr.length;
//        while (size > 1) {
//            //固定最大值
//            swap(arr, 0, size - 1);
//            size--;
//            //构造大根堆
//            heapify(arr, 0, size);
//
//        }
//    }
//    //构造大根堆（通过新插入的数上升）
//    public static void heapInsert(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            //当前插入的索引
//            int currentIndex = i;
//            //父结点索引
//            int fatherIndex = (currentIndex - 1) / 2;
//            //如果当前插入的值大于其父结点的值,则交换值，并且将索引指向父结点
//            //然后继续和上面的父结点值比较，直到不大于父结点，则退出循环
//            while (arr[currentIndex] > arr[fatherIndex]) {
//                //交换当前结点与父结点的值
//                swap(arr, currentIndex, fatherIndex);
//                //将当前索引指向父索引
//                currentIndex = fatherIndex;
//                //重新计算当前索引的父索引
//                fatherIndex = (currentIndex - 1) / 2;
//            }
//        }
//    }
//    //将剩余的数构造成大根堆（通过顶端的数下降）
//    public static void heapify(int[] arr, int index, int size) {
//        int left = 2 * index + 1;
//        int right = 2 * index + 2;
//        while (left < size) {
//            int largestIndex;
//            //判断孩子中较大的值的索引（要确保右孩子在size范围之内）
//            if (arr[left] < arr[right] && right < size) {
//                largestIndex = right;
//            } else {
//                largestIndex = left;
//            }
//            //比较父结点的值与孩子中较大的值，并确定最大值的索引
//            if (arr[index] > arr[largestIndex]) {
//                largestIndex = index;
//            }
//            //如果父结点索引是最大值的索引，那已经是大根堆了，则退出循环
//            if (index == largestIndex) {
//                break;
//            }
//            //父结点不是最大值，与孩子中较大的值交换
//            swap(arr, largestIndex, index);
//            //将索引指向孩子中较大的值的索引
//            index = largestIndex;
//            //重新计算交换之后的孩子的索引
//            left = 2 * index + 1;
//            right = 2 * index + 2;
//        }
//    }
//    //交换数组中两个元素的值
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}

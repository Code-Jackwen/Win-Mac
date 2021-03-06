package com.nyist.xu.sort;

import java.util.Arrays;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-21 21:11
 **/
public class ShellSort {
    //希尔排序

    //希尔排序是1959年，Shell发明的，这是第一个突破O(n2)的排序算法，他与直接插入排序不同的是，他会优先比较距离较近的元素。因此，希尔排序又叫做缩小增量排序。

    //1、算法思想
    //其工作原理是定义一个间隔序列来表示排序过程中进行比较的元素之间有多远的间隔，每次将具有相同间隔的数分为一组，进行插入排序，大部分场景中，间隔是可以提前定义好的，也可以动态生成。
    //
    //希尔排序的实质就是分组的插入排序
    //
    //2、优缺点
    //优点：
    //空间复杂度较好，O(1)；作为改进版的插入排序，是一种相对高效的基于交换元素的排序方法。
    //缺点：
    //(i) 不稳定，在交换的过程中，会改变元素的相对次序。
    //(ii) 希尔排序的时间复杂度依赖于增量序列函数，所以分析起来比较困难，当n在某个特定范围的时候，希尔排序的时间复杂都约为O(n1.3)
    //
    //3、关键点
    //确定增量划分序列组，在不同的组中进行直接插入排序。实际上每次都是在间隔为gap的距离中进行比较（根据下图来理解）
    //
    //4、图例演示过程
    //最原始的那种增量，即从 gap=length/2 逐步减半，其实这还不算最快的希尔，有几个增量在实践中表现更出色，希尔排序是实现简单但是分析极其困难的一个算法的例子。
    //说了这么多理论性的文字，可能不太好理解，所以用图示来帮助大家更好的理解希尔排序和直接插入排序的关系。
    //
    //给定一个数组 [55，2，6，4，32，12，9，73，26，37] 对其进行希尔排序的操作过程如下图所示：
    //————————————————
    //版权声明：本文为CSDN博主「小白的进阶之路」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
    //原文链接：https://blog.csdn.net/qq_37466121/article/details/85957138



    //下边讲解不清楚


    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27, 49, 55, 04};
        shellSort(arr, arr.length);
    }

    public static void shellSort(int[] arr, int len) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        while (len >= 1) {
            //进行插入排序
            for (int i = len; i < arr.length; i++) {
                for (int j = i - len; j >= 0 && arr[j + len] < arr[j]; j -= len) {
                    int temp = arr[j + len];
                    arr[j + len] = arr[j];
                    arr[j] = temp;
                }
            }
            //设置新的增量
            len = len / 2;
            System.out.println(Arrays.toString(arr));
        }
    }


    //版权声明：本文为CSDN博主「那人好像一条猿」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
    //原文链接：https://blog.csdn.net/changhangshi/article/details/82744427
}

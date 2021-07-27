package com.nyist.xu.sort;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-19 19:44
 **/

import java.util.Arrays;

/**
 * 冒泡排序
 * @author mmz
 *
 */
public class BubbleSort {

    //冒泡

    //1、算法原理：比较两个相邻的元素，将值大的元素右移。
    //
    //2、算法思路：首先第一个元素和第二个元素比较，如果第一个大，则二者交换，否则不交换；然后第二个元素和第三个元素比较，如果第二个大，则二者交换，否则不交换……一直执行下去，最终最大的那个元素被交换到最后，一趟冒泡排序完成。最坏的情况是排序是逆序的。
    //
    //3、算法过程
    //
    //举个栗子（第一趟的排序过程）
    //
    //原始序列：49、38、65、97、76、13、27、49
    //
    //1)1号和2号比较49>38，交换
    //
    //结果：38、49、65、97、76、13、27、49
    //
    //2)2号和3号比较49<65，不交换
    //
    //结果：38、49、65、97、76、13、27、49
    //
    //3)3号和4号比较65<97，不交换
    //
    //结果：38、49、65、97、76、13、27、49
    //
    //4)4号和5号比较97>76，交换
    //
    //结果：38、49、65、76、97、13、27、49
    //
    //5)5号和6号比较97>13，交换
    //
    //结果：38、49、65、76、13、97、27、49
    //
    //6)6号和7号比较97>27，交换
    //
    //结果：38、49、65、76、13、27、97、49
    //
    //7)7号和8号比较97>49，交换
    //
    //结果：38、49、65、76、13、27、49、97
    //
    //第一趟排序结束，依次执行第二趟排序，直到排序过程没有元素位置改变或最后一趟排序完成，跳出循环。
    //————————————————
    //版权声明：本文为CSDN博主「那人好像一条猿」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
    //原文链接：https://blog.csdn.net/changhangshi/article/details/82734154


    public static void main(String[] args) {
        int[] arr = {49,38,65,97,76,13,27,49};
        bubbleSort(arr,arr.length);
    }

    public static void bubbleSort(int[] arr, int n) {
        for (int i=1,len=arr.length;i<len;i++){
            //标识符，判断这趟排序是否发生位置变化，没有发生，则排序已经完成，无须执行剩下循环
            Boolean flag=true;
            for (int j=1;j<len;j++){
                if (arr[j-1] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    flag=false;
                }
            }
            //排序过程打印记录
            System.out.println(Arrays.toString(arr));
            if (flag){
                return ;
            }
        }
    }


   //其他

//    public static int BubbleSort(int[] arr,int time) {
//        int temp;//定义一个临时变量
//
//        for(int i=0;i<arr.length-1;i++){//冒泡趟数
//            for(int j=0;j<arr.length-i-1;j++){
//                time++;
//                if(arr[j+1]<arr[j]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        return time;
//    }
//    public static void main(String[] args) {
//        int arr[] = new int[]{1,6,2,2,5};
//        int i = BubbleSort.BubbleSort(arr, 0);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(i);//4321  =10
//    }
}

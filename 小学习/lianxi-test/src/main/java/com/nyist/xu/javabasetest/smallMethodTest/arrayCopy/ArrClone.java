package com.nyist.xu.javabasetest.smallMethodTest.arrayCopy;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-13 15:15
 **/
public class ArrClone {
    //数组 的clone方法
//    A.一维数组：深克隆（重新分配空间，并将元素复制过去）
//    对clone后的数组进行修改不会影响源数组。
//    B.二维数组：浅克隆（只传递引用）
//    对clone后的数组进行修改时，将对源数组也产生影响（因为复制的是引用，实际上指向的是同一个地址）

//    如何实现二维数组的深克隆呢？
//    对每个一维数组调用clone方法。
    public static void main(String[] args) {
        int[] a =new int[]{1,2,3,4,5};
        int[] copy = a.clone();
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}

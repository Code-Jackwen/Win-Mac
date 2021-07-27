package com.nyist.xu.dataStructure.digui;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-14 13:35
 **/
public class digui {
    public static void main(String[] args) {
//        System.out.println("main "+digui1(4));
        System.out.println("main "+digui2(4));
    }
    public static int digui1(int i){
        if (i==0){
            return i;
        }
        System.out.println("前置 "+i);
        digui1(--i);
        i++;
        System.out.println("回溯 "+i);
        return i;
    }

    public static int digui2(int i){
        if (i==0){
            return i;
        }
        System.out.println("前置 "+i);
        digui2(--i);
        digui2(--i);//回不来了，4321、-1、-2.....
        i++;
        System.out.println("回溯 "+i);
        return i;
    }
}

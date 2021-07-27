package com.nyist.xu.leetcode.MianShiPart;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-26 10:19
 **/
public class YiCiBianJi {
    //力扣面试算法，一次编辑
    //记录 其中一个思路，   前后遍历，比较特殊下标。
    public static void main(String[] args) {
        System.out.println(oneEditAway("abcd","abcde"));
        System.out.println(oneEditAway("abcdd","abcde"));
        System.out.println(oneEditAway("abcde","abcwe"));
        System.out.println(oneEditAway("abcdq","abcwe"));
    }
    public static boolean oneEditAway(String first, String second) {
        int la =first.length();
        int lb = second.length();
        if(Math.abs(la-lb)>1) return false;
        if(first.equals(second)) return true;
        int l=0,r=0;
        for(;l<la&&l<lb;l++){
            if(first.charAt(l)!=second.charAt(l)) break;
        }
        for(r=1;r<=la&&r<=lb;r++){
            if(first.charAt(la-r)!=second.charAt(lb-r)) break;
        }
        return l+r-1 == (la==lb?la-1 : Math.min(la,lb));
    }
}

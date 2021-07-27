package com.nyist.xu.javabasetest.others;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-26 22:20
 **/
public class OperatorPriority {
    public static void main(String[] args) {
        //运算符优先级测试
        //csdn 收藏的也有
        int i =1;
        int j =1;
        int t =9;
        while (--t!=0)//执行8次    等于说前置的-- 放进去就是8，而后置--放进去还是9
        {
            System.out.print(i++);//后置++比 函数要慢
//            System.out.print(++j);//前置++比 函数要快
//            System.out.print(" - ");
        }
        System.out.println();
        i=1;
        t=9;
        j=1;
        while (t--!=0)//执行9次
        {
            System.out.print(i++);
//            System.out.print(++j);
//            System.out.print(" - ");
        }
    }
}

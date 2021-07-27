package com.nyist.xu.javabasetest;

import org.junit.jupiter.api.Test;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-07-02 21:34
 **/
public class HomeworkTest {
    //String方法和     方差计算手写

    @Test
    public void replace() {
        String a = "78   +   90   +   87   +   96   +   69   +   87   +   99   +   68   +   85   +   83";
//        String a = "92   +   80   +   90   +   76   +   89   +   95   +   83   +   85   +   81   +   96";
//        String a = "78   +   79   +   72   +   85   +   74   +   70   +   92   +   88   +   81   +   72";
        String replace = a.replace("   +   ", ",");
//        System.out.println(replace);
        String replace1 = a.replace("   +   ", ",");
//        System.out.println(replace1);
        //切分函数 应该是 不让 有 空格的
        String[] split = replace.split(",");
//        System.out.println(split);
//        String[] split1 = a.split("+");


        for (String s : split) {
            System.out.print(s);
        }
//        System.out.println();
//
//        List<Integer> list = new ArrayList();
//        for (String s : split) {
//            list.add(Integer.parseInt(s));
//        }
//        //计算平均数
//        int p = 0;
//        for (Integer integer : list) {
//            p += integer;
//        }
//        System.out.println("和 = " + p);
//        //int 不转double 直接 精度丢失
//        double p1 = (double) p / 10;
//        System.out.println("平均数 = " + p1);
//
//        //计算方差
//        double f = 0;
//        for (Integer o : list) {
//            double x = o;
//            f += Math.pow((x - p1), 2);
//            System.out.println("每一次的 差平方和" + f);
//        }
//        System.out.println("方差分子 = " + f);
//        System.out.println("字符串数组长度= " + split.length);
//        double s2 = f / 10;
//
//        System.out.println("方差 = " + f / split.length);
//        System.out.println("方差 = " + s2);

    }

}

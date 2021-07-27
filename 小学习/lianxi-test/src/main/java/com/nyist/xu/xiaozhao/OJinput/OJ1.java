package com.nyist.xu.xiaozhao.OJinput;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-12 13:59
 **/
public class OJ1 {
//    OJ输入练习        题号在下边 1-11
//    https://www.nowcoder.com/test/27976983/summary#question

//    import java.util .*;
//    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (scan.hasNext()) {
                int a = scan.nextInt();//或者是nextLong()
                int b = scan.nextInt();
                System.out.println(a + b);
            }
        }
//    }
}

package twtest;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-13 20:09
 **/
public class Main {
    public static void main(String[] args) {
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();

        if (l < 0 || l % 10 == 0 && l != 0) {
            System.out.println(false);
        }
        long r = 0;
        while (l > r) {
            r = r * 10 + l % 10;
            l /= 10;
        }
        System.out.println(l==r||l==r/10);


//        if (l < 0) {
//            System.out.println(b);
//        }
//        long help = 1;
//        long tmp = l;
//        while (tmp >= 10) {
//            help *= 10;
//            tmp /= 10;
//        }
//        while (l != 0) {
//            if (l % 10 != l / help) {
//                System.out.println(b);
//            }
//            l = l % help / 10;
//            help /= 100;
//        }
//        System.out.println(true);
    }

}

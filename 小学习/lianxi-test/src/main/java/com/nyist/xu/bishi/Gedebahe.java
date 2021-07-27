package com.nyist.xu.bishi;

import java.util.Scanner;
/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-20 23:19
 **/
public class Gedebahe {

//    歌德巴赫猜想：
//    偶数分解,任何一个大于六的偶数可以拆分成两个质数的和。
    //质数和素数是一个意思。只能被1和自己蒸出的数。

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        if (m % 2 != 0 || m <= 6) {
            System.out.println("parameter error!");
        }
        for (int n = 2; n <= m; n++) {
            for (int y = m; y > n; y--) {
                if (fan(n) && fan(y)) {
                    if (n + y == m) {
                        System.out.print(m + "=" + y + "+" + n + " ");
                        System.out.print("\n");
                    }
                }
            }
        }
        scan.close();
    }

    public static boolean fan(int x) {  //素数判断
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//————————————————
//    版权声明：本文为CSDN博主「爱娶媳妇的苗同学」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/weixin_44609873/article/details/87787949
package com.nyist.xu.bishi.wangyi2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-08 18:19
 **/
//链接：https://www.nowcoder.com/questionTerminal/83b419c027fa490aa60669b0e7dc06a3
//来源：牛客网
//
//又到了丰收的季节，恰逢小易去牛牛的果园里游玩。
//牛牛常说他对整个果园的每个地方都了如指掌，小易不太相信，所以他想考考牛牛。
//在果园里有N堆苹果，每堆苹果的数量为ai，小易希望知道从左往右数第x个苹果是属于哪一堆的。
//牛牛觉得这个问题太简单，所以希望你来替他回答。
//
//输入描述:
//
//第一行一个数n(1 <= n <= 105)。
//第二行n个数ai(1 <= ai <= 1000)，表示从左往右数第i堆有多少苹果
//第三行一个数m(1 <= m <= 105)，表示有m次询问。
//第四行m个数qi，表示小易希望知道第qi个苹果属于哪一堆。
//
//
//
//输出描述:
//
//m行，第i行输出第qi个苹果属于哪一堆。
//
//示例1
//输入
//
//5
//2 7 3 4 9
//3
//1 25 11
//
//输出
//
//1
//5
//3
public class A2020_0506_3 {

    //这个没看懂，说是空间换时间。 下边的 思路 懂 差不多一致
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] nu = new int[n];
//        int sum = 0;
//        for(int i = 0; i < n; i++) {
//            nu[i] = sc.nextInt();
//            sum+=nu[i];//一共有多少个苹果
//        }
//
//        int m = sc.nextInt();
//        int[] mu = new int[m];
//        for(int i = 0; i < m; i++) {
//            mu[i] = sc.nextInt();
//        }
//
//        int[] nx = new int[sum+1];
//        int su=0;
//        for(int i = 1, j = 0; i <= sum; i++) {
//
//            if(i<=(nu[j]+su)){
//                //x=j+1（j从0开始）
//                nx[i]=j+1;//如果第i个苹果小于等于前x推苹果，就赋值为第x推（j从0开始，需加1赋值）
//            }else
//            {
//                nx[i]=++j+1;//否者等于第x+1推苹果，x增加1
//                su+=nu[j-1];//前x推苹果和
//            }
//        }
//
//        for(int i = 0; i < m; i++) {
//            System.out.println(nx[mu[i]]);
//        }
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int appleNums[] = new int[n];
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            appleNums[i] = a + input;
            a = appleNums[i];
        }

        int m = scanner.nextInt();
        int searchNums[] = new int[m];
        for (int i = 0; i < m; i++) {
            searchNums[i] = scanner.nextInt();
        }

        //二分查找法
        for (int i = 0; i < m; i++) {
            int index = Arrays.binarySearch(appleNums, searchNums[i]);
            if (index > 0) {
                System.out.println(index + 1);
            } else {
                System.out.println(-index);
            }
        }
    }
}
            //binarySearch(Object[], Object key)
            //a: 要搜索的数组
            //key：要搜索的值
            //如果key在数组中，则返回搜索值的索引；否则返回-1或“-”（插入点）。插入点是索引键将要插入数组的那一点，即第一个大于该键的元素的索引。
            //技巧：
            //[1] 搜索值不是数组元素，且在数组范围内，从1开始计数，得“ - 插入点索引值”；
            //[2] 搜索值是数组元素，从0开始计数，得搜索值的索引值；

            //[3] 搜索值不是数组元素，且大于数组内元素，索引值为 – (length + 1);
            //[4] 搜索值不是数组元素，且小于数组内元素，索引值为 – 1。
            //版权声明：本文为CSDN博主「Lynn_lurk」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
            //原文链接：https://blog.csdn.net/cxhply/article/details/49423501


//5
//2 7 3 4 9
//3
//1 25 11
//-1        1
//4         5
//-3        3
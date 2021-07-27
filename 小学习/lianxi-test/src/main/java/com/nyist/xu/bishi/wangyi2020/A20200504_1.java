package com.nyist.xu.bishi.wangyi2020;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-04 18:46
 **/
//链接：https://www.nowcoder.com/questionTerminal/f51e08c7642345fb96dd7b29792b0790
//来源：牛客网
//
//小易是班级的英语课代表, 他开发了一款软件开处理他的工作。
//小易的软件有一个神奇的功能，能够通过一个百分数来反应你的成绩在班上的位置。“成绩超过班级 ...% 的同学”。
//设这个百分数为 p，考了 s 分，则可以通过以下式子计算得出 p：
//p = ( 分数不超过 s 的人数 - 1) ÷\div÷ 班级总人数 ×100%\times 100\%×100%
//突然一天的英语考试之后，软件突然罢工了，这可忙坏了小易。成绩输入这些对于字写得又快又好的小易当然没有问题，但是计算这些百分数……这庞大的数据量吓坏了他。
//于是他来找到你，希望他编一个程序模拟这个软件：给出班级人数 n，以及每个人的成绩，请求出某几位同学的百分数。
//
//输入描述:
//
//第一行一个整数 n，表示班级人数。
//第二行共 n 个自然数，第 i 个数表示第 i 位同学的成绩 aia_iai​。
//第三行一个整数 q，表示询问的次数。
//接下来 q 行，每行一个数 x，表示询问第 x 位同学的百分数。
//1<=n,q<=10000,0<=ai<=1501 <= n, q <= 10000, 0 <= a_i <= 1501<=n,q<=10000,0<=ai​<=150
//
//
//
//输出描述:
//
//输出应有 q 行，每行一个百分数，对应每一次的询问。
//
//为了方便，不需要输出百分号，只需要输出百分号前的数字即可。四舍五入保留六位小数即可。
//
//示例1
//输入
//
//3
//100 98 87
//3
//1
//2
//3
//
//输出
//
//66.666667
//33.333333
//0.000000
public class A20200504_1 {
    //链接：https://www.nowcoder.com/questionTerminal/76f10d28d721471cb70d6ac6e0db1cb5
    //    来源：牛客网

    //题目不难，但是调了好久的精度终于AC了

    public static void main(String[] args) {
        A20200504_1 main = new A20200504_1();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int len = sc.nextInt();
            int[] scores = new int[len];
            for (int i=0;i<len;i++){
                scores[i] = sc.nextInt();
            }
            HashMap<Integer,Integer> scoreMap = main.creatHashmap(scores,len);
            int queryLen = sc.nextInt();
            for (int i = 0;i<queryLen;i++){
                System.out.printf("%.6f\n",main.outputRank(scoreMap,scores,len,sc.nextInt()-1));
            }
        }
    }

    public HashMap<Integer,Integer> creatHashmap(int[] scores, int len){
        int[] copy = Arrays.copyOf(scores,len);
        Arrays.sort(copy);
        HashMap<Integer,Integer> hashpmap = new HashMap<>();
        int count = 0;
        for (int i=0;i<len;i++){
            if (hashpmap.containsKey(copy[i])){
                hashpmap.put(copy[i],hashpmap.get(copy[i])+1);
                count++;
            }
            else{
                count++;
                hashpmap.put(copy[i],count);
            }
        }
        return hashpmap;
    }

    public Double outputRank(HashMap<Integer,Integer> hashMap,int[] scores,int len,int query){
        double ans=0;
        double rank = hashMap.get(scores[query]);
        ans = (rank-1)*100/len;
        return ans;
    }

    // 我和他思路一致
//    public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//            int n = Integer.parseInt(sc.nextLine());
//            int[] nums = new int[n];
//            for (int i = 0; i < n; i++) {
//                nums[i] = sc.nextInt();
//            }
//            int query = sc.nextInt();
//            for (int i = 0; i < query; i++) {
//                int index = sc.nextInt();
//                double ans = moreThan(nums,index) * 1.0 / n * 100;
////                System.out.println(ans);
//                System.out.printf("%.6f",ans); // 类似C语言， 这是取float小数的后6位。
//                System.out.println();
//            }
//        }
//
//
//        public static int moreThan(int[] nums, int i){
//            int point = nums[i - 1];
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[j] <= point)
//                {
//                    ++count;
//                }
//            }
//            return --count;
//        }


}

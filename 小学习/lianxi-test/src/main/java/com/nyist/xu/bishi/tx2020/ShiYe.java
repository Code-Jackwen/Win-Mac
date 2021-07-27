package com.nyist.xu.bishi.tx2020;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-01 23:25
 **/
public class ShiYe {
//    链接：https://www.nowcoder.com/questionTerminal/61e1e66e39f348cdb6495de91ac36a41
//    来源：牛客网

//    小Q在进行一场竞技游戏,这场游戏的胜负关键就在于能否能争夺一条长度为L的河道,即可以看作是[0,L]的一条数轴。
//    这款竞技游戏当中有n个可以提供视野的道具−真视守卫,第i个真视守卫能够覆盖区间[xi,yi]。现在小Q想知道至少用几个真视守卫就可以覆盖整段河道。
//    输入描述:
//    输入包括n+1行。
//    第一行包括两个正整数n和L(1<=n<=105,1<=L<=109)
//    接下来的n行,每行两个正整数xi,yi(0<=xi<=yi<=109),表示第i个真视守卫覆盖的区间。
//    输出描述:
//    一个整数，表示最少需要的真视守卫数量, 如果无解, 输出-1。
//    示例1
//     输入
//     4 6
//     3 6
//     2 4
//     0 2
//     4 7
//    输出
//     3

    //Java贪心算法
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int L=in.nextInt();
        int[][] temp=new int[n][2];
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                temp[i][j]=in.nextInt();
            }
        }
        //。获得了数组，进行排序
        Arrays.sort(temp,new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0];
            }
        });
        int index=0;
        int count=0;
        int pre=0;   //右边界
        while(pre<L) {
            if(temp[index][0]>pre) {
                System.out.println(-1);
            }
            int max=0;
            while(index<n&&temp[index][0]<=pre) {
                max=Math.max(max, temp[index][1]);
                index++;
            }
            count++;
            pre=max;
            if(pre>=L) {
                System.out.println(count);
                return;
            }
            if(index>=n) {
                System.out.println(-1);
                return;
            }
        }
    }

    //牛客作者： 无趣的灵魂啊
    //Queue

    //  public static void main(String[] args) {
    //        Scanner scanner = new Scanner(System.in);
    //        int n = scanner.nextInt();
    //        int l = scanner.nextInt();
    //        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
    //            if (o1[0] == o2[0])
    //                return o2[1] - o1[1];
    //            return o1[0] - o2[0];
    //        });
    //        for (int i = 0; i < n; i++) {
    //            int[] arr = new int[2];
    //            arr[0] = scanner.nextInt();
    //            arr[1] = scanner.nextInt();
    //            queue.offer(arr);
    //        }
    //        scanner.close();
    //        if (queue.peek()[0] != 0) {
    //            System.out.println(-1);
    //        } else {
    //            int from = queue.poll()[1];
    //            int count = 1;
    //            PriorityQueue<int[]> queue1 = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
    //            while (from < l) {
    //                while (queue.size() > 0 && queue.peek()[0] <= from)
    //                    queue1.offer(queue.poll());
    //                if (queue1.size() > 0 && queue1.peek()[1] > from) {
    //                    from = queue1.poll()[1];
    //                    count++;
    //                } else {
    //                    System.out.println(-1);
    //                    return;
    //                }
    //            }
    //            System.out.println(count);
    //        }
    //    }



}

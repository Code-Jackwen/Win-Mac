package com.nyist.xu.bishi.tx2020;

import java.util.Scanner;
import java.util.Stack;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-01 22:19
 **/
public class DandiaoStack {
    //小Q在周末的时候和他的小伙伴来到大城市逛街，一条步行街上有很多高楼，共有n座高楼排成一行。
    //小Q从第一栋一直走到了最后一栋，小Q从来都没有见到这么多的楼，
    //所以他想知道他在每栋楼的位置处能看到多少栋楼呢？（当前面的楼的高度大于等于后面的楼时，后面的楼将被挡住）

    //输入
    //6
    //5 3 8 3 2 5
    //输出
    //3 3 5 4 4 4

//    链接：https://www.nowcoder.com/questionTerminal/35fac8d69f314e958a150c141894ef6a
//    来源：牛客网

    //使用单调栈实现，开辟一个数组 rightLook 保留往右看得到的数量.
    //从右往左遍历，利用单调栈将看得到的数量保留在数组 rightLook 中 ，再从左往右遍历，获取往左看的计数。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0 ; i < len ; i++){
            arr[i] = sc.nextInt();
        }
        // stack中要保存的是 能看见的楼的 index

        //6
        //5 3 8 3 2 5        //输入
        //3 3 5 4 4 4        //输出
        int[] rightLook = new int[len];
        Stack<Integer> stack = new Stack<>();
        //2 1 2 2 1 0   得到从左往右 -->
        for(int i = len - 1; i >= 0; i--){
            //用栈大小代表能看到楼的个数
            rightLook[i] = stack.size();
            //如果说当前值比栈中的值大了就清出栈，保证栈内一直是递增。
            while((!stack.isEmpty()) && (arr[i] >= stack.peek())){//栈非空且
                stack.pop();
            }
            stack.push(arr[i]);//存 能看见的楼的 index 或者高度都可以
        }
        stack.clear();
        //得到从右往左看       <--
        for(int i = 0 ; i < len ; i++){
            int total = rightLook[i] + 1 + stack.size();
            while((!stack.isEmpty()) && (arr[i] >= arr[stack.peek()])){
                stack.pop();
            }
            System.out.print(total + " ");
            stack.push(i);
        }
    }

    //这个也是用的栈
    //链接：https://www.nowcoder.com/questionTerminal/35fac8d69f314e958a150c141894ef6a
    //来源：牛客网
    //
    //public static void main(String[] args) {
    //        // 获取输入
    //        Scanner scanner = new Scanner(System.in);
    //        int n = scanner.nextInt();
    //        int[] heights = new int[n];
    //        for (int i = 0; i < n; ++i) {
    //            heights[i] = scanner.nextInt();
    //        }
    //
    //        int[] result = new int[n];
    //
    //        // 从前向后遍历，维持一个递减栈
    //        Stack<Integer> stack = new Stack<Integer>();
    //        for (int i = 0; i < n; ++i) {
    //            result[i] += 1; // 自己所在位置
    //            result[i] += stack.size(); // 前面能看到的楼数
    //
    //            // 维护栈
    //            while (!stack.isEmpty() && stack.peek() <= heights[i]) {
    //                stack.pop();
    //            }
    //            stack.push(heights[i]);
    //        }
    //
    //        // 从后向前遍历，同样维持递减栈
    //        stack.clear();
    //        for (int i = n - 1; i >= 0; --i) {
    //            result[i] += stack.size(); // 后面能看到的楼数
    //
    //            // 维护栈
    //            while (!stack.isEmpty() && stack.peek() <= heights[i]) {
    //                stack.pop();
    //            }
    //            stack.push(heights[i]);
    //        }
    //
    //        // 输出
    //        for (int i = 0; i < n; ++i) {
    //            if (i != 0) {
    //                System.out.print(" " + result[i]);
    //            } else {
    //                System.out.print(result[i]);
    //            }
    //        }
    //    }

}

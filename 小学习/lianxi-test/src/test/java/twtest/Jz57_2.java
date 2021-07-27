package twtest;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-12-09 17:18
 **/


public class Jz57_2 {

    //剑指 Offer 57 - II. 和为s的连续正数序列
    //滑动窗口

    //输入：target = 15
    //输出：[[1,2,3,4,5],[4,5,6],[7,8]]

    //1<= target <= 10^5

    //返回结果要求
    //[9, 10, 11, 12, 13, 14, 15, 16]
    //[18, 19, 20, 21, 22]

    //矩阵或者ArrayList<ArrayList<Integer>>
    public static void main(String[] args) {
        int[][] continuousSequence = findContinuousSequence(100);
        for (int[] ints : continuousSequence) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }

    public static int[][] findContinuousSequence(int target) {
        int i = 1; // 滑动窗口的左边界
        int j = 1; // 滑动窗口的右边界
        int sum = 0; // 滑动窗口中数字的和
        List<int[]> res = new ArrayList<>();

        while (i <= target / 2) {
            if (sum < target) {
                // 右边界向右移动
                sum += j;
                j++;
            } else if (sum > target) {
                // 左边界向右移动
                sum -= i;
                i++;
            } else {
                // 记录结果
                int[] arr = new int[j-i];
                for (int k = i; k < j; k++) {
                    arr[k-i] = k;
                }
                res.add(arr);
                // 左边界向右移动
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }


}

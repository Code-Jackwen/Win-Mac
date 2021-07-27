package com.nyist.xu.xiaozhao.luan;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-15 10:53
 **/
public class buzhinajia {
    // 下边的 这些 测试用例都是正确的。

    //题目
    //Give two array A, B which can be represented as two horizontal lines.
    //you can connect two node once they are equal,
    //i.e. `A[i] === B[j]`
    //make the drawing, find the max lines count which will not result in cross-line
    //1  3  5
    //|   \
    //|    \
    //1  5  3
    //Example 1
    //Input: A = [1,3,5], B = [1,5,3]
    //Output: 2
    //Explain: 5 can not connect to 5 cause it will cause the cross-line with 3
    //Example 2
    //Input: A = [1,1,2,1], B = [3,3,1]
    //Output: 1
    //Example 3
    //Input: A = [3,3,2,3,3], B = [1,3,1,2]
    //Output: 2
    //Example 4
    //Input: A = [1,4], B = [3,5]
    //Output: 0

    //例3
    //输入：A=[3,3,2,3,3]，B=[1,3,1,2]
    //输出：2

    //1 3 5
    //|  \
    //|   \
    //1 5  3
    // 5 3 1
    //  \  |
    //   \ |
    // 3 5 1
    //例1
    //输入：A=[1,3,5]，B=[1,5,3]
    //输出：2


    //输入：A=[1,1,2,1]，B=[3,3,1]
    //1 1 2 1
    // \
    //  \
    //   \
    //3 3 1
    //输出：1

    //例4
    //输入：A=[1,4]，B=[3,5]
    //输出：0


    // 3 3 2 3 3
    // \   \
    //  \   \
    // 1 3 1 2
    //得2

    //1 1  2 3
    //| |   /
    //1 1  3
    //得3
    public static void main(String[] args) {

        int[] A = {3, 3, 2, 3, 3};
        int[] B = {1, 3, 1, 2};

//        A= new int[]{3,3,2,3,3};
//        B= new int[]{1,3,1,2};

//        A= new int[]{1,3,5};
//        B= new int[]{1,5,3};

//        A= new int[]{1,1,2,1};
//        B= new int[]{3,3,1};

//        A= new int[]{1,4};
//        B= new int[]{3,5};

//        A= new int[]{3,3,2,3,3};
//        B= new int[]{1,3,1,2};

        A = new int[]{1, 1, 2, 3};
        B = new int[]{1, 1, 3};

        System.out.println(maxCount(A, B));
    }

    public static int maxCount(int[] A, int[] B) {
        int cnt = 0;
        int startA = -1;
        int startB = -1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (i > startA && j > startB && A[i] == B[j]) {
                    cnt++;
                    startA = i;
                    startB = j;
                }
            }
        }
        return cnt;
    }
}

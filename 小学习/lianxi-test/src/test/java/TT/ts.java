package TT;

import java.util.ArrayList;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-12-23 11:32
 **/
public class ts {
    //        System.out.println(-1001>>1);
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList res = new ArrayList();

        // 输入的二维数组非法,返回空的数组
        if (row == 0 || col == 0)  return res;

        // 定义四个关键变量,表示左上和右下的打印范围
        int left = 0, top = 0, right = col - 1, bottom = row - 1;
        while (left <= right && top <= bottom)
        {
            // left to right
            for (int i = left; i <= right; ++i)  res.add(matrix[top][i]);// 3x3 的中间是5  只有这里输出 1<=1
            // top to bottom
            for (int i = top + 1; i <= bottom; ++i)  res.add(matrix[i][right]);// 3x3 的中间是5,这里就是 2<=1 不成立了
            // right to left
            if (top != bottom)
                for (int i = right - 1; i >= left; --i)  res.add(matrix[bottom][i]);//防止5
            // bottom to top
            if (left != right)
                for (int i = bottom - 1; i > top; --i)  res.add(matrix[i][left]);//防止5
            left++;top++;right--;bottom--;
        }
        return res;
    }
}

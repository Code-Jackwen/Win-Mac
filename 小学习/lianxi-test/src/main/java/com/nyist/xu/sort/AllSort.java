package com.nyist.xu.sort;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-17 23:30
 **/
public class AllSort {

    //数学 全排列
    //数组 排列组合全排列 循环加递归实现

    //不属于  大小排序

    public void permutation(char[] c, int begin, int end) {
        if (begin == end) {
            System.out.println("输出结果：");
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i]);
            }
            System.out.println();
        } else {
            char temp;
            for (int i = begin; i <= end; i++) {

                System.out.println("i:"+i);

                temp = c[begin];

                c[begin] = c[i];

                c[i] = temp;

//                i:0
//                i:1
//                输出结果：
//                abc
//                i:2
//                输出结果：
//                acb

//                i:1
//                i:1
//                输出结果：
//                bac

//                i:2
//                输出结果：
//                bca
//                i:2
//                i:1
//                输出结果：
//                cba
//                i:2
//                输出结果：
//                cab





//
//
//
//
//
//
//                begin =0 i=0   这三个全是c[0],全是1
//
//                i=0 temp=1 c[0]=1 c[0]=1      1234
//                            begin=1
//
//
//
//
//
//                i=1 temp=1 c[0]=2 c[1]=2      1234
//                i=2 temp=1 c[0]=3 c[2]=3      1234
//                i=3 temp=1 c[0]=4 c[3]=4      1234
//
//                begin =1 end=3
//                i=0 temp=2 c[1]=1 c[0]=1
//                i=1 temp=2 c[1]=2 c[1]=2
//                i=2 temp=2 c[1]=3 c[2]=3
//                i=3 temp=2 c[1]=4 c[3]=4
//
//
//                begin =2 i=2   temp=3 c[2]=c[2]

//                System.out.println("换位置操作：");
//                for (int k = 0; k < c.length; k++) {
//                    System.out.print(""+c[k]);
//                }
//                System.out.println();

                permutation(c, begin + 1, end);//递归。开始值 逐渐+1

//                System.out.println("递归结束：");
//                for (int j = 0; j < c.length; j++) {
//                    System.out.print(c[j]);
//                }
//                System.out.println();
////
//                System.out.println("执行：");

                temp = c[begin];
                c[begin] = c[i];
                c[i] = temp;


//                System.out.println("--又换回来之后：");
//                for (int q = 0; q < c.length; q++) {
//                    System.out.print(c[q]);
//                }
//                System.out.println();

            }
        }
    }

    public static void main(String[] args) {
        AllSort a = new AllSort();
        char[] c = {'a', 'b', 'c'};
        a.permutation(c, 0, c.length - 1);
    }
}
// System.out.println("temp ---------------"+temp);
//  System.out.println("c[i]--------------"+c[i]);
//  System.out.println("begin------"+begin+"c[begin] = c[i] -------"+c[begin]);
//  System.out.println("c[i]--------------"+c[i]);


//换位置操作：1
//abc
//换位置操作：2
//abc
//输出结果：
//abc
//递归结束：
//abc
//执行：
//--又换回来之后：3
//abc



//换位置操作：
////acb
////输出结果：
////acb
////递归结束：
////acb
////执行：
////--又换回来之后：
////abc

////递归结束：
////abc
////执行：
////--又换回来之后：
////abc


//-----------------abc、acb

//换位置操作：
// bac
// 换位置操作：
// bac
// 输出结果：
// bac
// 递归结束：
// bac
// 执行：
// --又换回来之后：
// bac
// 换位置操作：
// bca
// 输出结果：
// bca
// 递归结束：
// bca
// 执行：
// --又换回来之后：
// bac
// 递归结束：
// bac
// 执行：
// --又换回来之后：
// abc
//

// 换位置操作：
// bac
// 换位置操作：
// bac
// 输出结果：
// bac
// 递归结束：
// bac
// 执行：
// --又换回来之后：
// bac
// 换位置操作：
// bca
// 输出结果：
// bca
// 递归结束：
// bca
// 执行：
// --又换回来之后：
// bac
// 递归结束：
// bac
// 执行：
// --又换回来之后：
// abc





// 换位置操作：
// cba
// 换位置操作：
// cba
// 输出结果：
// cba
// 递归结束：
// cba
// 执行：
// --又换回来之后：
// cba
// 换位置操作：
// cab
// 输出结果：
// cab
// 递归结束：
// cab
// 执行：
// --又换回来之后：
// cba
// 递归结束：
// cba
// 执行：
// --又换回来之后：
// abc
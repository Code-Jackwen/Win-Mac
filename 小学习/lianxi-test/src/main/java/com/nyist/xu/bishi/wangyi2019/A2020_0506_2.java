package com.nyist.xu.bishi.wangyi2019;

import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-07 23:13
 **/
//链接：https://www.nowcoder.com/questionTerminal/93f2c11daeaf45959bb47e7894047085
//来源：牛客网
//
//小易觉得高数课太无聊了，决定睡觉。不过他对课上的一些内容挺感兴趣，所以希望你在老师讲到有趣的部分的时候叫醒他一下。你知道了小易对一堂课每分钟知识点的感兴趣程度，并以分数量化，以及他在这堂课上每分钟是否会睡着，你可以叫醒他一次，这会使得他在接下来的k分钟内保持清醒。你需要选择一种方案最大化小易这堂课听到的知识点分值。
//
//输入描述:
//
//第一行 n, k (1 <= n, k <= 105) ，表示这堂课持续多少分钟，以及叫醒小易一次使他能够保持清醒的时间。
//第二行 n 个数，a1, a2, ... , an(1 <= ai <= 104) 表示小易对每分钟知识点的感兴趣评分。
//第三行 n 个数，t1, t2, ... , tn 表示每分钟小易是否清醒, 1表示清醒。
//
//
//
//输出描述:
//
//小易这堂课听到的知识点的最大兴趣值。
//
//示例1
//输入
//
//6 3
//1 3 5 2 5 4
//1 1 0 1 0 0
//
//输出
//
//16
public class A2020_0506_2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] val = new int[n];
        int[] state = new int[n];
        //保存瞌睡时的累计评分
        int sleep = 0;
        int[] sleepval = new int[n];
        for(int i=0;i<n;i++){
            val[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            state[i] = scan.nextInt();
            if(state[i]==0){
                sleep += val[i];
            }
            //+=的处理 效率 比再多写个循环高
            sleepval[i] = sleep;//保存 每个 睡着的、没睡着的跟前面一样   持续累积兴趣分值
        }
        A2020_0506_2 ma = new A2020_0506_2();
        int res = ma.getMaxVal(val,state,n,k,sleepval);
        System.out.println(res);
    }

    /**
     *
     * @param val
     * @param state
     * @param n 一堂课 几分钟
     * @param k 叫醒 持续清醒的分钟
     * @param sleepval
     * @return
     */
    public int getMaxVal(int[] val,int[] state,int n,int k,int[] sleepval){
        int res = 0;
        int addval = 0;
        for(int i=0;i<n;i++){   //n是课堂共n分钟
            if(state[i]==1)
            {
                res += val[i];
            }
            else{
                //边界情况处理
                int wakeval = 0;
                //这里面用到   赛跑累积时间路程差的 画图思想
                //7+3-1 >=10 9 走else  8+3-1>=10 10 不走else    i=7 代表的是课堂的 第8分钟 -1 跟总 分钟判断
                //9+3-1>=10 11 是防止 叫醒持续 超时的判断。     i=9 代表的是课堂的 第10分钟
                if(i+k-1>=n){
                    //超时的话
                    //n-1 就是9最后一个 累积    i+k-1 这时是10    i-1 就是7 第7分钟
                    wakeval =(i>0)?(sleepval[n-1]-sleepval[i-1]):sleepval[n-1];
                    //i=0  的情况：i=0 k=3 n=3 吧 直接肯定叫醒是最大值
                }else{
                    //sleepval[i+k-1]-sleepval[i-1]) 这个插值代表 叫醒后 累积的分值
                    //i=0的话 是不必作差了，直接sleepval[i+k-1] 就是
                    wakeval = (i>0)?(sleepval[i+k-1]-sleepval[i-1]):sleepval[i+k-1];
                }
                addval = addval>=wakeval?addval:wakeval;
            }
        }
        return res+addval;
    }

}

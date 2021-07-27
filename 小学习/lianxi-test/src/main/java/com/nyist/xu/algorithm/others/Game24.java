package com.nyist.xu.algorithm.others;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-19 18:02
 **/
public class Game24 {
    //链接：https://www.nowcoder.com/questionTerminal/fbc417f314f745b1978fc751a54ac8cb
    //来源：牛客网
    //24点游戏算法
    //问题描述：给出4个1-10的数字，通过加减乘除，得到数字为24就算胜利
    //输入：
    //4个1-10的数字。[数字允许重复，但每个数字仅允许使用一次，测试用例保证无异常数字]
    //输出：
    //true or false
    //
    //输入描述:
    //
    //输入4个int整数
    //
    //
    //
    //输出描述:
    //
    //返回能否得到24点，能输出true，不能输出false
    //
    //示例1
    //输入
    //
    //7 2 1 10
    //
    //输出
    //
    //true

    //这是不  完全准确的，10、10、10、4 额外不对的  也算了对
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double result=0.0;
        int[] num=new int[4];
        while(input.hasNext()){
            int[] temp=new int[4];
            for(int i=0;i<4;i++){
                num[i]=input.nextInt();
            }
            System.out.println(check(num,temp,result));
        }
        input.close();//这个 应该是执行不了的
    }

    private static boolean check(int[] num,int[] temp,double result) {
        for(int i=0;i<num.length;i++){
            if(temp[i]==0){
                temp[i]=1;
                if(check(num,temp,result+num[i])
                 || check(num,temp,result-num[i])
                 || check(num,temp,result*num[i])
                 || check(num,temp,result/num[i])){
                    return true;
                }
                temp[i]=0;
            }

        }
        if(result==24){
            return true;
        }else{
            return false;
        }
    }
}

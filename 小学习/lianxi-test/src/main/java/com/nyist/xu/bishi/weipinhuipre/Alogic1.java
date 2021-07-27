package com.nyist.xu.bishi.weipinhuipre;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-12 20:34
 **/
public class Alogic1 {
    //算法题1
    //输入两个字符串a和b，字符串内容为二进制数字，求两个字符串相加的结果，加法计算方法以二进制方式计算，并返回对应的字符串结果。要求程序尽可能的高效。示例如下：
    //
    ///**
    //
    //* @param a = "1101"
    //
    //* @param b = "1100"
    //
    //* @return "11001"
    //
    //*/
    //
    //public String add(String a, String b){
    //}


//        public static void main(String[] args) {
            //方法一
//            Scanner scanner = new Scanner(System.in);
//            String str1 = scanner.next();
//            String str2 = scanner.next();
//            System.out.println(Integer.toBinaryString(Integer.valueOf(str1, 16) + Integer.valueOf(str2, 16)));

            //智商税 测试
            //字符 0 1 分别是 int类型 十进制的 48 49
            //    a 和 A 分别是  97  65
            //空格 字符是    32
//            char c = str1.charAt(1);
//            System.out.println((int)c);
//            System.out.println((int)'1');
//            int i = c - '1';
//            System.out.println(c);
//            System.out.println(i);
//            System.out.println((int)' ');

//        }

        //方法二
    // 链接：https://www.nowcoder.com/questionTerminal/829ae8987a424bd6b9a95a240ebdb0e3
    //来源：牛客网

    //二进制的加法     纯字符串逻辑实现，朴实、易懂。
        public static void main(String[] args){
            Scanner sca = new Scanner(System.in);
            String[] str = sca.nextLine().split(" ");
            String a = str[0];
            String b = str[1];
            System.out.println(addBinary(a,b));
        }
      public static String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int aLen = a.length();
            int bLen = b.length();
            int max = Math.max(aLen, bLen);
            StringBuilder ar = new StringBuilder(a).reverse();//反转，因为两个数从低位开始相加
            StringBuilder br = new StringBuilder(b).reverse();

            boolean isCarry = false;//是否进位
            for (int i = 0; i < max; i++) {
                char aChar = i >= aLen ? '0' : ar.charAt(i);//数字长度不同 补0对齐操作
                char bChar = i >= bLen ? '0' : br.charAt(i);
                if (aChar == '1' && bChar == '1') {
                    sb.append(isCarry ? '1' : '0');
                    isCarry = true;
                } else if (aChar == '0' && bChar == '0') {
                    sb.append(isCarry ? '1' : '0');
                    isCarry = false;
                } else {
                    sb.append(isCarry ? '0' : '1');
                }
            }
            //过的去
            if (isCarry) sb.append("1");
            return sb.reverse().toString();
        }

    //插曲：https://blog.csdn.net/yangmm2048/article/details/45293339public
    // 类似方法二 ，略微不同的实现
    //算法思路：1、要定义几个参数，carry代表进位，opa代表数组a的元素转换成数字，opb代表数组b的元素转换成数字。sum代表数组的和
    //
    //2、判断两个字符串是否长度相同，如果不同的要从左补齐。
    //
    //3、两个字符串对齐之后，进行一个for循环，循环从字符串最后一位到第一位，分别对应相加，如果加和等于2的话就该位变为0，进位标志位carry为1，如果加和为1，进位为0
    //
    //4、利用Java中StringBuilder的字符串具有可变长度的性质，利用append方法将sum连接起来。
    //
    //5、最后如果carry为1的话则字符串继续append("1")
    //
    //6、最后一步，利用reverse方法将字符串反转。
    // String addBinary(String a, String b) {
    //    int carry=0;
    //    int sum=0;
    //    int opa=0;
    //    int opb=0;
    //    StringBuilder result=new  StringBuilder();
    //    while(a.length()!=b.length()){
    //        if(a.length()>b.length()){
    //            b="0"+b;
    //        }else{
    //            a="0"+a;
    //        }
    //    }
    //    for(int i=a.length()-1;i>=0;i--){
    //        opa=a.charAt(i)-'0';
    //        opb=b.charAt(i)-'0';
    //        sum=opa+opb+carry;
    //        if(sum>=2){
    //            result.append((char) (sum-2 +'0'));
    //            carry=1;
    //        }else{
    //            result.append((char) (sum +'0'));
    //            carry=0;
    //        }
    //
    //    }
    //     if(carry==1){
    //            result.append("1");
    //        }
    //    return result.reverse().toString();
    //    }


    //方法三         可以再查 一些，运算符的  实现，这里没再深入
    //  回头 复习 运算符......         ^  & |
//    public static void main(String[] args){
//        Scanner in=new Scanner(System.in);
//        while(in.hasNext()){
//            String a=in.next();
//            String b=in.next();
//            System.out.println(add(a,b));
//        }
//    }
//    public static String add(String a,String b){
//        int p1=a.length()-1;
//        int p2=b.length()-1;
//        int carry=0;
//        String ans="";
//        while(p1!=-1||p2!=-1||carry!=0){
//            int n1 = (p1<0) ? 0 : a.charAt(p1)-'0';
//            int n2 = (p2<0) ? 0 : b.charAt(p2)-'0';
//            int sum = n1 ^ n2 ^ carry;
//            carry = ((n1 & n2) == 1) ? 1 : ((n1^n2)&carry);
//            ans = sum + ans;
//            if(p1>=0) p1--;
//            if(p2>=0) p2--;
//        }
//        return ans;
//    }

}

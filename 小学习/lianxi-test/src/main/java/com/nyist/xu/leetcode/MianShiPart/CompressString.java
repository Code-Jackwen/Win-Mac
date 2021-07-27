package com.nyist.xu.leetcode.MianShiPart;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-26 14:12
 **/
public class CompressString {
    //题目          压缩字符串
    //测试用例
    // 输入："aabcccccaaa"
    // 输出："a2b1c5a3"
    public static void main(String[] args) {
        System.out.println(compressString("aabccc"));//a2b1c3
        System.out.println(compressString("aabcccccaaa"));//a2b1c5a3
        System.out.println(compressString("abbccd"));//a1b2c2d1 abbccd
    }
    //这是别人的
    public static String compressString(String S) {
        // 记录上一个字符出现了几次
        // 如果当前字符和上一个字符相等, 则频率+1
        // 如果当前字符和上一个字符不相等, 则把上一个字符和频率拼接上去

        if(S == null || S.length() == 0) {
            return S;
        }

        StringBuilder res = new StringBuilder();
        // 记录上一个字符
        char pre = S.charAt(0);         //比我的cs[i]、cd[i+1]   好
        // 记录上一个字符的频率
        int  times = 1;

        for(int i = 1; i < S.length(); i++) {
            char cur = S.charAt(i);
            if (cur == pre) { //和上一个字符相等, 词频+1
                times++;
            } else { // 和上一个字符不相等, 把上一个字符以及频率拼接上去
                res.append(pre).append(times);
                pre = cur;
                times = 1;
            }
        }
        // 把最后一个字符以及频率拼接上去              这也比我处理的好
        res.append(pre).append(times);
        // 判断压缩字符串是否比原字符串短
        if(res.length() >= S.length()) {
            return S;
        }
        return res.toString();
    }
    //自己的，思路一样
//    public static String compressString(String S) {
//        //题目没说 压缩后相等怎么输出。我按照一样的话输出压缩的
//        char[] cs = S.toCharArray();
//        int len = S.length();
//        //防止数组越界
//        if(len<=1){
//            return S;
//        }
//        StringBuilder sb = new StringBuilder();//stbui
//        int time = 1;
//        for (int i = 0; i < cs.length - 1; i++) {
//            if (cs[i] != cs[i + 1] || i == cs.length - 2) {
//                sb.append(cs[i]);
//                sb.append(time + "");
//                //看能不操作到i
//                time = 1;
//                continue;
//            }
//            time++;
//        }
//        //处理最后一个字符
//        if (cs[len - 2] == cs[len-1]) {
//            int l = sb.length() - 1;
//            char c = sb.charAt(l);
//            sb.replace(l, l+1, String.valueOf(++c));
//        }else{
//            sb.append(cs[len-1]+"1");
//        }
//        //压缩处理
//        return sb.length()>=len ? S:sb.toString();
//    }
}




//扩展
//        String a = "aabcd";
//        String sub = a.substring(2, 3);//[2,3) b
//        String sub = a.substring(2, 5);//[2,5) bcd
//        String sub = a.substring(2, a.length());//[2,5) bcd
//        System.out.println(sub);

//        String 继承于CharSequence
//        CharSequence cs="hello";//对的,但是CharSequence是接口
//字符串之 contains
//        boolean a1 = a.contains("a");//true  CharSequence
//        boolean a1 = a.contains("aa");//true
//        System.out.println(a1);

//字符串之 substring
//        String sub1 = a.substring(2);              //[2,最后一个5)bcd
//        String sub1 = a.substring(2, 4);           //[2,4) bc
//        String sub1 = a.substring(2, a.length());  //[2,5) bcd
//        System.out.println(sub1);


//        CharSequenc
//String的replace会把所有a中的a 都换掉
//        String replace = a.replace('a', 'b');//replace是返回 新的字符串，老字符串 a 不变

//StringBuilder之下标replace
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append("qwert");
//        int lengthsb = sb1.length();//5
//        sb1.replace(lengthsb,lengthsb,"1");//qwert1
//        sb1.replace(lengthsb-1,lengthsb-1,"1");//qwer1t    [4,4) 这种就相当于在 下标4位置插入 一个
//        sb1.replace(lengthsb-2,lengthsb-2,"1");//qwe1rt

//        sb1.replace(lengthsb-1,lengthsb,"1");//qwer1       [4,5) 倒数第一个被替换为1
//        sb1.replace(lengthsb-2,lengthsb-1,"1");//qwe1t     [3,4) &#x5012;&#x6570;&#x7b2c;&#x4e8c;&#x4e2a;&#x88ab;&#x66ff;&#x6362;&#x4e3a;1
//        sb1.replace(lengthsb-1,lengthsb-2,"1");//报错
//        System.out.println(sb1.toString());

package com.nyist.xu.interview.sz.ans;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-08 10:52
 **/
//https://mp.weixin.qq.com/s?__biz=MzI0ODk2NDIyMQ==&mid=2247484794&idx=1&sn=22efd808fa5a9e68cacabd4b6e08fdc3&chksm=e999f068deee797eef9b46b160c06afa4d50e03b3626d1ae1aad05ddc37ec9001c4514264e0f&token=1065926980&lang=zh_CN%23rd
public class String1 {
    public static void main(String[] args) {

        String a = new String("ab");
        String b = new String("ab");
        String c = "ab";
        String d = "a";
        String e = new String("b");
        String f = d + e;

        String g = "b";
        String h = d + g;//    两个常量池中的  "a" + "b"
        System.out.println(h==c);//f 地址也不是 常量池中以后的ab
        System.out.println(h==a);//f 地址更不是 new 出来的ab            + 运算出来的是新的 new

        String i = new String("a");
        String j = i + e;
        System.out.println(j==c);//f

        System.out.println(a.intern() == b);//f
        System.out.println(a.intern() == b.intern());//t
        System.out.println(a.intern() == c);//t

        System.out.println(a.intern() == f);//f



////////////////////////////////////////////////////////////
        String s1 = "aaa";//创建0或者1个对象  这里是1个
        String s2 = "bbb" + "ccc";//常量池里没有bbb也没有ccc 直接被优化为 bbbccc 也就是直接创建了一个 bbbccc 对象。
        String s3 = s1 + "bbb";// 常量池有aaa 没有bbb 这里 是底层springbuilder 是3个  springbuilder、string(aaabbb) 和 没有的bbb
        String s4 = new String("aaa");// 创建1或者2个对象，肯定是存在两个对象，由于上边 常量池有了 aaa 所以 这里只创建1个65
    }

}

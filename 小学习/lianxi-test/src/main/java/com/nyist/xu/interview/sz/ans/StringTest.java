package com.nyist.xu.interview.sz.ans;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-16 21:13
 **/

//字符串的  比较。
public class StringTest {

    //来自 pdf java基础 程序员cxuan
    //https://mp.weixin.qq.com/s?__biz=MzI0ODk2NDIyMQ==&mid=2247484794&idx=1&sn=22efd808fa5a9e68cacabd4b6e08fdc3&chksm=e999f068deee797eef9b46b160c06afa4d50e03b3626d1ae1aad05ddc37ec9001c4514264e0f&token=1065926980&lang=zh_CN%23rd

//    public static void main(String[] args) {
//        String s1 = "Programming";
//        String s2 = new String("Programming");
//        String s3 = "Program";
//        String s4 = "ming";
//        String s5 = "Program" + "ming";
//        String s6 = s3 + s4;
//
//        System.out.println(s1 == s2);               //false
//
//        System.out.println(s1 == s5);               //true
//        System.out.println(s1 == s6);              //false      这里 不是 字符串直接相加的  就会底层builder 再生成个new
//
//        System.out.println(s1 == s6.intern());       //true
//        System.out.println(s2 == s2.intern());    //false
//        System.out.println("0-------------------------------");
//        boolean b = s6.intern() == s2.intern();
//        //这里直接输出s6.intern() == s2.intern(); 会输出不出来，必须 输出 b
//        System.out.println("????????????????" +b);//true
//
//        //堆里面可有 多个Programming字符串，且地址不同，但是常量池s字符串equals一样的只有一个
//        System.out.println(s2 == s6);//false
//        //用操作符 new 创建的字符串对象，　如 String s2 = new String("Programming");, 或者有字符串变量、操作符 '+'　参与的表达式，如 String s6 = s3 + s4;　这样得到的引用，都要放到内存(堆heap)中保存。
//        System.out.println(s5 == s6);//false
//    }

    //---------------------------------------------------------------------------------------------
    //必备知识：https://www.oschina.net/question/2709988_2278459?p=1
//
//java 程序在运行的时候,　会创建一个字符串缓冲池。对于诸如　String s1 ="Programming";　String s3 = "Program";　String s4 = "ming";　这些字符串常量，程序首先会在这个　String　缓冲池中寻找相同值的对象。若它们在池中不存在，程序则将这些字符串常量创建于池中。若在池中找到了相同值得对象，则这个找到的对象的引用，就是新变量的引用。由此可见，字符串常量池中一个给定值得对象，最多只有一个。
//用操作符 new 创建的字符串对象，　如 String s2 = new String("Programming");, 或者有字符串变量、操作符 '+'　参与的表达式，如 String s6 = s3 + s4;　这样得到的引用，都要放到内存(堆heap)中保存。故，在堆中，若有几个值相同的对象，它们分别都会有各自的地址。
//字符串的一个成员方法 public String intern(),返回字符串对象的规范化表示形式。当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串（用 equals(Object) 方法确定），则返回池中的字符串。否则，将此 String 对象添加到池中，并返回此 String 对象的引用。
//解释：
//
//由必备知识 1,2所示，s1创建于字符串缓冲池，而s2创建于内存(堆)中，尽管二者内容都是"Programming",但地址不在一个区，故比较地址的结果为 false。
//至于　String s5 = "Program" + "ming";的操作，　由于表达式的两个算子都是字符串常量，所以操作始终在池内进行。在池内找到 "Program" 和 "ming"之后，将两者连接成 "Programming", 然后，又在池内找到了相同值的对象s1，于是就将这个地址，赋予 s5。因此，比较s1 和 s5　的地址，当然相同，结果为 true。
//如预备知识1、２所示，s6的地址，存在堆里。而s1的地址存在池里。尽管两者值相同，但地址一定不同，结果为 false。
//如预备知识3所示，因为s6调用了它的成员方法inner()，结果返回了一个在池中的、具有相同值“Programming”的对象s1的地址。用它和 s1的地址相比较，当然相等，结果为 true。
//如预备知识3所示，s2的地址在堆里，s2.inner()　的地址在池里。一个在堆中，一个在池内，二者比较，肯定不等，结果为false。



//public class SocketTest {
    public static void main(String[]args)throws Exception{
        String str1="abc";
        String str2="abc";
        String str3="eee";
        String str4="abceee";

        String str5=str1.concat(str3);//底层源码：用了new，创建了新对象

        String str6="abc"+"eee";
        System.out.println(str4==str6);//t
        String str7="abc"+str3;
        System.out.println(str4==str7);//f

        System.out.println(str1==str2);//t
        System.out.println("abc"+"eee"=="abceee");// t 第一种情况：字符串常量相加，不含字符串变量

        System.out.println("abc"+"eee"==str4);//t

        System.out.println("abc"+str3=="abceee");//f 第二种情况：含字符串变量相加
        System.out.println("abc"+str3==str4);//f

        System.out.println(str1+str3=="abceee");//f
        System.out.println(str1+str3==str4);//f

        System.out.println(str4==str5);//f
    }
//}


//1 字符串相加时如果含有字符串变量，则先在堆中开空间，再拼接，本质是new了StringBuilder对象进行append操作，拼接后调用toString()返回String对象。 
//
// 2 字符串相加时不含字符串变量，是先加，然后在常量池找，如果有就直接返回，否则，就在常量池中创建一个字符串常量，不会用到StringBuilder。
// ————————————————
// 版权声明：本文为CSDN博主「统木木」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
// 原文链接：https://blog.csdn.net/weixin_37766087/article/details/95028901
}


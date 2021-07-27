package com.nyist.xu.bishi.weipinhuipre;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-16 16:32
 **/
public class A2 {

    public static void main(String[] args) {
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

        System.out.println(f1 == f2);//t
        System.out.println(f3 == f4);//f
    }
    //JVM会自动维护八种基本类型的常量池，int常量池中初始化-128~127的范围，
    //所以当为Integer i=100时的属于128~127的范围内时，在自动装箱的过程中取的是常量池中的数值，
    //而500不在次范围内，所以需要new因此地址不一样。

    //Java中八种基本类型的包装类的大部分都实现了常量池技术，
    // 它们是Byte、Short、Integer、Long、Character、Boolean，
    // 另外两种浮点数类型的包装类(Float、Double)则没有实现。
    // 另外Byte,Short,Integer,Long,Character这5种整型的包装类也只是在对应值在-128到127时才可使用对象池。

    // 常量池(constant_pool)指的是在编译期被确定，并被保存在已编译的.class文件中的一些数据。它包括了关于类、方法、接口等中的常量，也包括字符串常量和符号引用。




    //Atomic(比方说AtomicLong      Java.util.concurrent包下
    //https://www.cnblogs.com/wanghaoyang/p/11041303.html
    //具有排他性，我认为是 字段锁，atomic用于同步某个状态。
    //原理
    //一句话来说，atomic类是通过自旋CAS操作volatile变量实现的。

    //多线程或者并发环境中 int i=0; i++ 都已经不安全了
    //作用
    //而CAS会比较内存中对象和当前对象的值是否相同，相同的话才会更新内存中的值，
    // 不同的话便会返回失败。这是乐观锁的一中实现方式。这种方式就避免了直接使用内核状态的重量级锁。

}

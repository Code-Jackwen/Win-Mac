package com.nyist.xu.bishi.fuAndzi.A;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-23 15:19
 **/
public class Duotai {
    public static void main(String[] args) {

        Fu f = new Zi();
        System.out.println("非静态---"+f.num);//与父类一致
        System.out.println("静态变量"+f.num);//与父类一致    变量不覆盖。

//        System.out.println(super.);

        f.method1();//与父类一致                           静态没法覆盖 还是父类的
        f.method2();//编译时与父类一致，运行时与子类一致     覆盖了 输出子类的

        Zi z = new Zi();
        System.out.println("非静态---"+z.num);//没多态都是子类的
        System.out.println("静态变量"+z.num);//没多态都是子类的

//        System.out.println();

        z.method1();//没多态都是子类的
        z.method2();//没多态都是子类的

    }
}

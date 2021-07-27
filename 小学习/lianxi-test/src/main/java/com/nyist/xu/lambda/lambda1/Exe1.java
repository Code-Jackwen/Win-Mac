package com.nyist.xu.lambda.lambda1;

import com.nyist.xu.service.lambda1.ReturnOneParam;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 18:02
 **/
public class Exe1 {
    /**
     * Lambda 表达式常用示例#：
     */


//    lambda 表达式引用方法:
//    有时候不是必须要自己重写某个匿名内部类的方法，
//    可利用 lambda表达式的接口 快速指向一个已经被实现的方法。

//    语法：
//​   方法归属者::方法名

//    归属者定义：
//    静态方法的归属者为 类名，普通方法归属者为 对象

    public static void main(String[] args) {
        ReturnOneParam lambda1 = a -> doubleNum(a);
        System.out.println(lambda1.method(3));

        //lambda2 引用已经实现的 doubleNum 方法
        ReturnOneParam lambda2 = Exe1::doubleNum;
        System.out.println(lambda2.method(3));

        //创建个 该类的对象
        Exe1 exe = new Exe1();

        //lambda4 引用了已经实现的 addTwo 方法
        ReturnOneParam lambda4 = exe::addTwo;
        System.out.println(lambda4.method(2));
    }

    /**
     * 要求
     * 1.参数数量、类型  要与接口中定义的一致
     * 2.返回值类型  要与接口中定义的一致
     */
    public static int doubleNum(int a) {
        return a * 2;
    }

    public int addTwo(int a) {
        return a + 2;
    }

}

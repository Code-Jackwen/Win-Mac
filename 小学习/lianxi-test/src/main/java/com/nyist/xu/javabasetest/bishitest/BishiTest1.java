package com.nyist.xu.javabasetest.bishitest;
/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-08 19:23
 **/
public class BishiTest1 {
    //笔试 测试
    //基础，反射方法，方法参数传递，运算符顺序

    //2-----------------------------------------
    String str = new String("good");
    char[] ch = {'a','b','c'};

    public static void main(String[] args) throws ClassNotFoundException {
        //1----------------------------------------------
//        Class<?> aClass = Class.forName("java.lang.String");
//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod);
//        }

        //2-----------------------------------------
        int a=1,b=3,c=4;
        System.out.println(Mul(a+b,b+c));

        BishiTest1 t = new BishiTest1();
        t.Mul(t.str, t.ch);
        System.out.println(t.str);
        System.out.println(t.ch);
        //2----------------------------------------------



    }

    //2----------------------------------------------
    private static int Mul(int x, int y) {
        return ++x*y++;
    }
    private  void Mul(String str, char ch[]) {
        str ="test";
        ch[0] = 'g';
    }
}

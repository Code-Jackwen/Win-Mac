package com.nyist.xu.bishi.outputResult;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-20 18:54
 **/
public class DataTypeOutput {

    //输出结果    引用数据类型相关。

        public static void main(String[] args) {
            StringBuffer a = new StringBuffer("A");
            StringBuffer b = new StringBuffer("B");
            StringBuffer operator = operator(a, b);

//            b="C";
            System.out.println(a + "," + b);

            System.out.println(operator);//y属实变了。 但是b指向的内存空间没有变。
            //就是y 和b原本指向的是同一块地方，后来y指向别的地方了，b还指向老地方。
        }

        public static StringBuffer operator(StringBuffer x, StringBuffer y) {
            StringBuffer append = x.append(y);
            System.out.println(append);


            y = x;//这行就是改变不了 b的值 不晓得为什么。
            return y;
        }
//    a,b是对象的引用，指向堆内存，将a，b两个引用传给x，y，执行x.append(y)，改变了x引用指向的堆内存的存储内容，变为AB，
//    y = x，表示引用y,指向引用x指向的存储区域，没有改变引用b，指向的存储空间的内容

}

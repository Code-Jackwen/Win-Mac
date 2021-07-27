package com.nyist.xu.bishi.outputResult;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-08 14:16
 **/
//  值传递，引用传递
// https://www.zhihu.com/question/31203609
public class ValuePass {
//    作者：Intopass
//    链接：https://www.zhihu.com/question/31203609/answer/50992895
//    来源：知乎
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

//    第一个例子：基本类型

    int num = 10;
    String str = "hello";

    public static void main(String[] args) {
        //    void foo(int value) {
//        value = 100;
//    }
//    foo(num); // num 没有被改变

////    第二个例子：没有提供改变自身方法的引用类型
//    void foo(String text) {
//        text = "windows";
//    }
//    foo(str); // str 也没有被改变
//
////    第三个例子：提供了改变自身方法的引用类型
//    StringBuilder sb = new StringBuilder("iphone");
//    void foo(StringBuilder builder) {
//        builder.append("4");
//    }
//    foo(sb); // sb 被改变了，变成了"iphone4"。
//
////    第四个例子：提供了改变自身方法的引用类型，但是不使用，而是使用赋值运算符。
//    StringBuilder sb = new StringBuilder("iphone");
//    void foo(StringBuilder builder) {
//        builder = new StringBuilder("ipad");
//    }
//    foo(sb); // sb 没有被改变，还是 "iphone"。
    }

}

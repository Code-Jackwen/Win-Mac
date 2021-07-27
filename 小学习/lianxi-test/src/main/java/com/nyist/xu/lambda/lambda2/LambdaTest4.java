package com.nyist.xu.lambda.lambda2;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 20:04
 **/
public class LambdaTest4 {

//    原文链接：https://blog.csdn.net/qq_36561697/article/details/80847812

//    方法引用
//    在lambda表达式中，方法引用是一种简化写法，引用的方法就是Lambda表达式的方法体的实现 
//    语法结构：ObjectRef:: methodName 
//    左边是类名或者实例名，中间的“：：”是方法引用符号，右边是相应的方法名 
//    方法引用一般分为三类： 

//    静态方法引用，实例方法引用，构造方法引用

    //构造方法引用示例：  创建 并 赋值对象  没觉得 很好。

    //泛型不能识别。
    //传统方式
//    Factory factory1 = new Factory() {
//        @Override
//        public Parent create(String name, int age) {
//            return new Boy(name,age);
//        }
//    };
//    Boy boy = (Boy) factory1.create("小明",18);
//
//    Factory factory2 = new Factory() {
//        @Override
//        public Parent create(String name, int age) {
//            return new Girl(name,age);
//        }
//    };
//    Girl girl = (Girl) factory1.create("小红",18);
//
//
//    //Lambda方式
//    Factory<Boy> boyFactory = Boy::new;
//    Boy boy1 = boyFactory.create("小明",18);
//    Factory<Girl> girlFactory = Girl::new;
//    Girl girl1 = girlFactory.create("小红",18);

}

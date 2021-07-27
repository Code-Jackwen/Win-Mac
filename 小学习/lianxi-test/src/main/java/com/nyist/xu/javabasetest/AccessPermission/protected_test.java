package com.nyist.xu.javabasetest.AccessPermission;


/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-12-10 17:52
 **/
public class protected_test {

    protected int pro = 1;
    int def = 1;

    public int pub = 1;
    private int pri = 1;

    public static void main(String[] args) {

        //这个类测试访问修饰符protected
        //1、类中不加修饰符的方法，默认为 default级别。
        //default本包和本类内部，protected是多一层任意地方包的子类
        //2、类中引用类型变量默认不给他构造赋值的话，默认就只null
//        TreeNode t = new TreeNode(1);
//        System.out.println(t.left);

        //子包能不能访问到protected、default？可以

    }
}

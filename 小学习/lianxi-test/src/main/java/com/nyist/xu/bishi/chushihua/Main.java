package com.nyist.xu.bishi.chushihua;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-23 14:28
 **/

public class Main extends TestQ{

    //类中的执行顺序

    //静态的 东西只会执行一次，且最先执行，在main之前
    //执行一次 new Main()  就会把 代码块、变量定义顺序走一遍，再走构造函数，再结束


    //本来  是先 进行 类的 初始化的, 只是 初始化的过程中 又进行了 实例初始化.
    // new 某一个对象的总执行过程是:(初始化过程)
    //1.类初始化(初始化属于类的内容,静态内容)
    //(1).初始化父类的静态变量和静态代码块,按出现顺序执行(刚开始加载类时就加载)      是先父类的
    //(2).初始化子类的静态变量和静态代码块,按出现顺序执行(刚开始加载类是就加载)
    //2.实例初始化
    //(3).先初始化父类的普通成员变量.非静态代码块,再执行父类构造方法.               也是先父类的
    //(4).初始化子类的普通成员变量.非静态代码块.再执行子类构造方法.


//    public static Main t1 = new Main();//先执行的这行没问题, 赋值前是执行 new Main(),初始化过程中 就进行了类的 实例化
    //实例化：就不考虑 静态先执行了。正常实例化 一般是在类加载后的。。。


    Main() {
        System.out.println("子类 构造");
    }

    public static void main(String[] args) {
        //main 函数执行前会先执行 父类静态代码块、子类静态代码快。   静态就初始的时候执行一次。
        //new 的时候才会执行普通代码块和构造函数，每次new每次都执行。
        System.out.println("main 1----------开始执行");
        Main t2 = new Main();
        System.out.println("main 2----------");
        Main t3 = new Main();
        System.out.println("main 3----------");
    }

    {
        System.out.println("子类 代码块");
    }

    public  int N  = 1;
    public static int M  = 2;

    static {
        System.out.println("子类 静态代码块");
    }

    public static int O  = 3;








}




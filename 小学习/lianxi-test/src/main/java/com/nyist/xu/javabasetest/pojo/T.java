package com.nyist.xu.javabasetest.pojo;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 10:45
 **/
public class T {

    //泛型中占位符T和?有什么区别？
    //https://blog.csdn.net/woshizisezise/article/details/79374460

//    先上两段代码：
//
//    public static <T> void show1(List<T> list) {
//        for (Object object : list) {
//            System.out.println(object.toString());
//        }
//    }
//
//    public static void show2(List<?> list) {
//        for (Object object : list) {
//            System.out.println(object);
//        }
//    }
//
//    可以看到show1方法中我们使用了T，大家都知道这是泛型的常见写法，那么这里的T指的是某一类具体的对象，list集合里只能存放同一类型数据，如果插入不同类型数据则会报错。
//
//    那么show2方法中我们使用的是？，可以看到在void前面并没有<T>，？可以表示成占位符，它自己也不知道list集合中会存放多少种类型的数据，所以这样就表明我们的list中存放N种数据类型也是可以的。
//
//    我们通过一段测试代码来直观的感受一下二者的区别吧：
//
//    public static void test() {
//        List<Student> list1 = new ArrayList<>();
//        list1.add(new Student("zhangsan", 18, 0));
//        list1.add(new Student("lisi", 28, 0));
//        list1.add(new Student("wangwu", 24, 1));
//        //这里如果add(new Teacher(...));就会报错，因为我们已经给List指定了数据类型为Student
//        show1(list1);
//
//        System.out.println("************分割线**************");
//
//        //这里我们并没有给List指定具体的数据类型，可以存放多种类型数据
//        List list2 = new ArrayList<>();
//        list2.add(new Student("zhaoliu", 22, 1));
//        list2.add(new Teacher("sunba", 30, 0));
//        show2(list2);
//    }
//
//
//    来看看运行结果：
//
//    Student
//
//    {
//        name = 'zhangsan', age = 18, sex = 0
//    }
//
//    Student
//
//    {
//        name = 'lisi', age = 28, sex = 0
//    }
//
//    Student
//
//    {
//        name = 'wangwu', age = 24, sex = 1
//    }
//************分割线**************
//    Student
//
//    {
//        name = 'zhaoliu', age = 22, sex = 1
//    }
//
//    Teacher
//
//    {
//        name = 'sunba', age = 30, sex = 0
//    }
//
//
//    从show2方法可以看出和show1的区别了，list2存放了Student和Teacher两种类型，同样可以输出数据，所以这就是T和?的区别啦~小伙伴们了解了吧
//
//    下面来看看？的扩展写法：
//
//    List<? extends 数据类型> list
//
//    public static void show3(List<? extends Teacher> list) {
//        for (Object object : list) {
//            System.out.println(object);
//        }
//    }
//
//
//    List<? extends Teacher> list这种写法表示可以接收Teacher和它的子类数据类型的list集合，
//
//    写个测试方法show3(list2);
//
//    试试：
//
//    Student
//
//    {
//        name = 'zhaoliu', age = 22, sex = 1
//    }
//
//    Teacher
//
//    {
//        name = 'sunba', age = 30, sex = 0
//    }
//
//
//    可以看到正常输出，因为集合中的数据都是Teacher的子类类型，
//    如果我们将List<? extends Teacher> list改成List<?extends Student>list会出现什么情况？
//
//    //报错
//
//    仔细看这张图，我们新建了一个list3并且声明数据类型为Teacher，
//
//    这个时候调用show3(List<? extends Student> list) 就马上会报错的，错误信息提示Teacher不能转换成Student，因为Student是Teacher的子类，而我们只接受Student及它的子类，所以当然会报错了。
//
//    List<? super 数据类型> list
//
//    这种写法表示只接收指定的数据类型及它的父类类型，也简单的写段代码看看效果：
//
//    public static void show4(List<? super Student> list) {
//        for (Object object : list) {
//            System.out.println(object);
//        }
//    }
//
//    可以看出来，我们接收的是Student及它父类的集合，我们写两个集合数据然后调用试试。
//
//    List list4 = new ArrayList<>();
//list4.add(new
//
//    Student("sunba",30,0));
//list4.add(new
//
//    Teacher("zhaoliu",22,1));
//
//    show4(list4);
//
//
//    在list中插入了一个Student和Teacher对象，看看结果：
//
//    Student
//
//    {
//        name = 'sunba', age = 30, sex = 0
//    }
//
//    Teacher
//
//    {
//        name = 'zhaoliu', age = 22, sex = 1
//    }
//
//    没毛病，正常运行并输出。
//
//    下面我们来看看，
//    如果我们是传递的 Student的子类的集合会咋样
//
//    //报错
//
//    //...................................................................
//    注意一点，我们接收的是Student及其父类对象数据类型，因为我们的Child是继承Student的，所以程序自动将我们的Child转成父类Student进行输出，所以大家要注意这一点，会自动向上转化。



}

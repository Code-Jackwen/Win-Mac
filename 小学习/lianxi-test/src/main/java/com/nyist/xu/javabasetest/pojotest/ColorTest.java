package com.nyist.xu.javabasetest.pojotest;

import com.nyist.xu.javabasetest.enums.Color;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-19 20:01
 **/
public class ColorTest {

//    @Enumerated(value = EnumType.STRING)
//    @Column(name = "color")
//    @NotNull
//    private Color color;

//    CatTest ct = new CatTest();
//    ct.setColor(Color.BLUR);

//    @Enumerated(value = EnumType.STRING)

//    CatTest ct = new CatTest();
//    ct.setColor(Color.BLUE);

//    @Enumerated(value=EnumType.ORDINAL)
//    这种情况下 和数据库交互、存入 的 就是 字符串


    public static void main(String[] args) {
        //测试枚举中 扩展属性 效果
        System.out.println(Color.BLANK.getInfo());//在构造的时候传的值 白色

        //比较值 == 这也可以，返回值就是String 类型
        if (Color.BLANK.getInfo() == "白色") {

//            String info = Color.BLANK.getInfo();

            System.out.println("1");
        }


        //返回值
        Color red = Color.RED; //返回值 还是类，RED 是类中 类。
        int index = Color.BLANK.getIndex();
        String name = Color.BLANK.getName();


        //测试 枚举 三个通用 方法

        //name就是枚举类里面定义的属性的名称
        System.out.println(Color.RED.name());//RED
        System.out.println(Color.BLANK.name());//BLANK

        //ordinal就是枚举类里面对应属性的位置，排在第几位,从0开始
        System.out.println(Color.RED.ordinal());//0
        System.out.println(Color.BLANK.ordinal());//2

        // compareTo 就是用前面的一个枚举的ordinal去减后面的ordinal
        System.out.println(Color.RED.compareTo(Color.BLANK));//-2
        System.out.println(Color.RED.compareTo(Color.YELLO));//-3

    }
}

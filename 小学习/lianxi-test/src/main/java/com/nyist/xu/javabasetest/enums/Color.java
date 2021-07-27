package com.nyist.xu.javabasetest.enums;

import com.nyist.xu.service.Behaviour;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-19 19:53
 **/

//在任何需要固定常量集合或者在 编译前就已经确定所有可能出现值 的场景下,枚举是最佳的选择
//public static fianl....

//注意: 所有的枚举默认继承自java.lang.Enum,由于java单继承限制,
// l所以枚举类定义的时候不能再继承其他类.

//枚举类内部定义,首先声明的是常量,然后是属性和方法.当存在属性或方法定义时,常量定义部分使用";"结尾.

//在java中,使用enum关键字定义的是一种特殊的class,这个class可以拥护属性 方法,
//并且编译器会在编译枚举类时自动添加一些特殊的方法.例如,枚举类有一个静态方法ordinal(),
// 会以定义时的顺序返回所有的枚举值.

//枚举就是特殊的常量类，且构造方法被默认强制为私有
public enum Color implements Behaviour {
//-----------------------------------------
    //    定义的常量
//    public static fianl....
//    RED,            //红色
//    BLUE,           //蓝色
//    GREEN           //绿色

//    实际运用到switch
//-----------------------------------------

    RED("红色", 1),

    GREEN("绿色", 2),

    BLANK("白色", 3),

    YELLO("黄色", 4);

    //扩展方法  --- 就是覆盖了 接口的方法 ,但是 所有的枚举类属性都要 覆盖。
//    YELLO("黄色", 4) {
            ////ovverride
//         public String getNextNumber() {
//             return "2";
//         }
//      };

    // 定义示例变量，这个才是Number类里面真正的属性---这算枚举里的 扩展属性了
    private String name;
    private int index;


    //构造函数,这里只能用private修饰
    //注意，这里只能同时存在一种构造函数，因为目前是有参，所以我们得把枚举类，
    // 也就是上面的RED,BLANK也改成有参。
    private Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

//    //接口方法
//    @Override
//    public String getInfo() {
//        return this.name;
//    }
//    //接口方法
//    @Override
//    public void print() {
//        System.out.println(this.index + ":" + this.name);
//    }


    //可以测试枚举中 扩展属性 效果
    //覆盖的接口方法
    public void print() {
        System.out.println(this.index + ":" + this.name);
    }

    //覆盖的接口方法
    public String getInfo() {
        return this.name;
    }


    //枚举 中添加 普通方法
    public static String getName(int index) {
        for (Color c : Color.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }


    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}



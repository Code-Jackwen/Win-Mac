package com.nyist.xu.javabasetest.pojo;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-26 10:40
 **/
public class Byte1 {

//    byte是java的基本数据类型，Java中byte是做为最小的数字来处理的，它的值域被定义为-128~127，也就是signed byte。
//     1、byte 数据类型是8位、有符号的，以二进制补码表示的整数；
//
//     2、最小值是 -128（-2^7）；
//
//     3、最大值是 127（2^7-1）；
//
//     4、默认值是 0；
//
//     5、byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
//
//     6、例子：byte a = 100，byte b = -50。
//
//    byte的常量包装类实例代码演示：
//
//    System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
//    System.out.println("包装类：java.lang.Byte");
//    System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
//    System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
//
//    输出结果为：
//
//    基本类型：byte 二进制位数：8
//
//    包装类：java.lang.Byte
//
//    最小值：Byte.MIN_VALUE=-128
//
//    最大值：Byte.MAX_VALUE=127

//    数据类型的使用场景：
//    byte        常用 存字节数据
//    short       少用 兼容性
//    int         常用 存普通整数
//    long        常用 存储 长整数
//    double      常用 存储双精度浮点数
//    float       少用 存浮点数
//    char        常用 存一个字符
//    boolean     常用 存逻辑变量

    //基础-----------数据类型---https://blog.csdn.net/u010567151/article/details/47953909
//    Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
//     1、整数：包括int、short、byte、long初始值为0。
//     2、浮点型：float、double初始值为0.0
//     3、字符：char初始值为空格，即'' "，如果输出，在Console上是看不到效果的。
//     4、布尔：boolean初始值为false
//    基本型别 	大小 	最小值 	最大值
//    boolean 	----- 	----- 	------
//    char 	16-bit 	Unicode 0 	Unicode 2^16-1
//    byte 	8-bit 	-128 	+127
//    short 	16-bit 	-2^15 	+2^15-1
//    int 	32-bit 	-2^31 	+2^31-1
//    long 	64-bit 	-2^63 	+2^63-1
//    float 	32-bit 	IEEE754 	IEEE754
//    double 	64-bit 	IEEE754 	IEEE754
//    void


//    什么时候用java的包装类或者java的基本类型
//    java采用unicode，2个字节来表示一个字符。
//    基本类型的包装类
//    Integer 、Long、Short、Byte、Character、Double、Float、Boolean、BigInteger、BigDecmail
//    其中BigInteger、BigDecimal没有相对应的基本类型，主要应用于高精度的运算，BigInteger 支持任意精度的整数，
//    BigDecimal支持任意精度带小数点的运算。
//    基本类型与包装类型的异同：
//     1、在Java中，一切皆对象，但八大基本类型却不是对象。
//     2、声明方式的不同，基本类型无需通过new关键字来创建，而封装类型需new关键字。
//     3、存储方式及位置的不同，基本类型是直接存储变量的值保存在堆栈中能高效的存取，
//          封装类型需要通过引用指向实例，具体的实例保存在堆中。
//     4、初始值的不同，封装类型的初始值为null，基本类型的的初始值视具体的类型而定，
//          比如int类型的初始值为0，boolean类型为false；
//     5、使用方式的不同，比如与集合类合作使用时只能使用包装类型。
//     6、什么时候该用包装类，什么时候用基本类型，看基本的业务来定：
//     这个字段允不允许null值，如果允许null值，则必然要用封装类，否则值类型就可以了，
//          用到比如泛型和反射调用函数.，就需要用包装类了！

}

package com.nyist.xu.javabasetest.bigDecimal1;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-30 14:51
 **/


//https://blog.csdn.net/qq_39542702/article/details/82218457
//另一篇的 总结：
//1 尽量使用参数类型为String的构造函数。
//      BigDecimal(Stringvalue) 或 BigDecimal.valueof( double value) \
//  不然 初始化的 数据 不是 意想着的，详情：https://blog.csdn.net/qq_38218238/article/details/81316587
//  所以：  double 和 float  避开使用fload  0.99f
//  测试类 ---BigDecimalTest2

//2 BigDecimal都是不可变的（immutable）的，在进行每一步运算时，都会产生一个新的对象，
//  所以在做加减乘除运算时千万要保存操作后的值。
//    例如：
//public static void main(String[]args)
// {
//     BigDecimal a=new BigDecimal("4.5");
//     BigDecimal b=new BigDecimal("1.5");
//     a.add(b);
//    System.out.println(a);
//    //输出4.5. 加减乘除方法会返回一个新的BigDecimal对象，原来的a不变
// }

//运算divide.
//
// BigDecimal除法可能出现不能整除的情况，比如 4.5/1.3，这时会报错
// 其实divide方法有可以传三个参数
//
//public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
// 第一参数表示除数， 第二个参数表示小数点后保留位数，
// 第三个参数表示舍入模式，只有在作除法运算或四舍五入时才用到舍入模式，有下面这几种



public class BigDecimal1 {
//    BigDecimal 详解
    //商业级运算是肯定不能用double/float的，精确运算需要用到BigDecimal来处理
//    作者：来醉一场
//    链接：https://www.jianshu.com/p/8e066aee3f2b
//    来源：简书
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//    //    加法 add(BigDecimal)
//    public static void main(String[] args) {
//        BigDecimal b1 = new BigDecimal("1");
//        BigDecimal b2 = new BigDecimal("0.11");
//        System.out.println(b1.add(b2));
//        //1.11
//        //可以试下把传入的字符串改为基本数据类型再进行运算
//    }
//    一、常用方法
//
//     初始化数据方法
//        new BigDecimal() 传参支持 integer,long,double,float,BigInteger
//    BigDecimal.ZERO 初始化一个为0的BigDecimal对象
//    BigDecimal.ONE 初始化一个为1的BigDecimal对象
//    BigDecimal.TEN 初始化一个为10的BigDecimal对象
//
//    【注意】new BigDecimal()方法初始化一个浮点型数据时，需要显示设置Scale(精度)否则运算时可能会有精度问题(这个和BigDecimal 默认精度有关)，如果转成String再初始化，将不受影响
//
//    加法 add(BigDecimal)
//
//    BigDecimal b1 = new BigDecimal("1");
//    BigDecimal b2 = new BigDecimal("0.11");
//  System.out.println(b1.add(b2));
//    /*
//     * 可以试下把传入的字符串改为基本数据类型再进行运算
//     */
//
//    减法 subtract(BigDecimal)
//
//    BigDecimal b1 = new BigDecimal("1");
//    BigDecimal b2 = new BigDecimal("0.11");
//System.out.println(b1.subtract(b2));
//
//    乘方 muliply(BigDecimal)
//
//    BigDecimal b1 = new BigDecimal("1.11");
//    BigDecimal b2 = new BigDecimal("0.11");
//System.out.println(b1.multiply(b2));
//
//    除法 divide(BigDecimal)
//
//    做除法运算时需要制定精确度和舍入方式
//
//    BigDecimal b1 = new BigDecimal("1.11");
//    BigDecimal b2 = new BigDecimal("0.11");
////四舍五入保留两位小数 后文将介绍舍入方式
//System.out.println(b1.divide(b2,2,BigDecimal.ROUND_HALF_UP));
//
//    绝对值 abs()
//
//    BigDecimal b1 = new BigDecimal("-1.11");
//System.out.println(b1.abs());
//
//    相反数 negate()
//
//    BigDecimal b1 = new BigDecimal("1.11");
//System.out.println(b1.negate());
//
//    乘方 pow(int)
//
//    BigDecimal b1 = new BigDecimal("1.11");
////二次方
//System.out.println(b1.pow(2));
////三次方
//System.out.println(b1.pow(3));
//
//    精度 scale()和percision()
//
//    BigDecimal b1 = new BigDecimal("11.111");
////位数
//System.out.println(b1.precision());//5
////小数点后有多少位
//System.out.println(b1.scale());//3
//
//    比较大小 compareTo(BigDecimal)
//
//    BigDecimal b1 = new BigDecimal("1.11");
//    BigDecimal b2 = new BigDecimal("0.11");
////大于0 则b1>b2；等于0 则b1==b2;小于0 则b1<b2
//System.out.println(b1.compareTo(b2));
//
//    比较大小并返回大的 max(BigDecimal)
//
//    BigDecimal b1 = new BigDecimal("1.11");
//    BigDecimal b2 = new BigDecimal("0.11");
//System.out.println(b1.max(b2));
//
//    比较大小并返回小的 min(BigDecimal)
//
//    BigDecimal b1 = new BigDecimal("1.11");
//    BigDecimal b2 = new BigDecimal("0.11");
//System.out.println(b1.min(b2));
//    二、舍入方式
//
//    BigDecimal.ROUND_HALF_UP
//     四舍五入模式
//
//    BigDecimal b1 = new BigDecimal("1.1449");
//System.out.println(b1.setScale(2, BigDecimal.ROUND_HALF_UP));//1.14
//System.out.println(b1.setScale(3, BigDecimal.ROUND_HALF_UP));//1.145
//
//    BigDecimal.ROUND_HALF_DOWN
//     五舍六入模式
//
//    如果舍去部分大于 0.5 则为进一，如果是小于 0.5 则会舍去
//
//    BigDecimal b1 = new BigDecimal("1.1456");
//System.out.println(b1.setScale(1, BigDecimal.ROUND_HALF_DOWN));//1.1
//System.out.println(b1.setScale(2, BigDecimal.ROUND_HALF_DOWN));//1.15
//    //上例中舍去部分.56 大于.5 所以会进一
//    BigDecimal b1 = new BigDecimal("1.145");
//System.out.println(b1.setScale(1, BigDecimal.ROUND_HALF_DOWN));//1.1
//System.out.println(b1.setScale(2, BigDecimal.ROUND_HALF_DOWN));//1.14
////上例舍去部分 .5 不大于.5 所以会舍去
//
//    BigDecimal.ROUND_HALF_EVEN
//     银行家舍入法
//    如果舍弃部分左边的数字为奇数，则舍入行为与 ROUND_HALF_UP 相同;
//    如果为偶数，则舍入行为与 ROUND_HALF_DOWN 相同。
//
//    BigDecimal b1 = new BigDecimal("1.25");
//System.out.println(b1.setScale(1, BigDecimal.ROUND_HALF_EVEN));//1.2
//    b1 = new BigDecimal("1.26");
//System.out.println(b1.setScale(1, BigDecimal.ROUND_HALF_EVEN));//1.3
//    b1 = new BigDecimal("1.35");
//System.out.println(b1.setScale(1, BigDecimal.ROUND_HALF_EVEN));//1.4
//    b1 = new BigDecimal("1.36");
//System.out.println(b1.setScale(1, BigDecimal.ROUND_HALF_EVEN));//1.4
//
//    BigDecimal.ROUND_UP
//     始终在保留的最后一位加1
//
//    BigDecimal b1 = new BigDecimal("1.1203");
//System.out.println(b1.setScale(2, BigDecimal.ROUND_UP));//1.13
//System.out.println(b1.setScale(3, BigDecimal.ROUND_UP));//1.121
//
//    永远不会减少计算值的大小
//
//    BigDecimal.ROUND_DOWN
//     从舍弃位置直接截断
//
//    BigDecimal b1 = new BigDecimal("1.1209");
//System.out.println(b1.setScale(2, BigDecimal.ROUND_DOWN));//1.12
//System.out.println(b1.setScale(3, BigDecimal.ROUND_DOWN));//1.120
//
//    永远不会增加计算值的大小
//
//    BigDecimal.ROUND_CEILING
//    接近正无穷大的舍入模式。
//    如果 BigDecimal 为正，则舍入行为与 ROUND_UP 相同;
//    如果为负，则舍入行为与 ROUND_DOWN 相同。
//
//    BigDecimal b1 = new BigDecimal("1.1209");
//System.out.println(b1.setScale(2, BigDecimal.ROUND_CEILING));//1.13
//System.out.println(b1.setScale(3, BigDecimal.ROUND_CEILING));//1.121
//
//    BigDecimal b2 = b1.negate();//b1的相反数
//System.out.println(b2.setScale(2, BigDecimal.ROUND_CEILING));//-1.12
//System.out.println(b2.setScale(3, BigDecimal.ROUND_CEILING));//-1.120
//
//    此舍入模式始终不会减少计算值。
//
//    BigDecimal.ROUND_FLOOR
//     和ROUND_CEILING相反
//    接近负无穷大的舍入模式。
//    如果 BigDecimal 为正，则舍入行为与 ROUND_DOWN 相同;
//    如果为负，则舍入行为与 ROUND_UP 相同。
//
//    BigDecimal b1 = new BigDecimal("1.1209");
//System.out.println(b1.setScale(2, BigDecimal.ROUND_FLOOR));//1.12
//System.out.println(b1.setScale(3, BigDecimal.ROUND_FLOOR));//1.120
//
//    BigDecimal b2 = b1.negate();
//System.out.println(b2.setScale(2, BigDecimal.ROUND_FLOOR));//-1.13
//System.out.println(b2.setScale(3, BigDecimal.ROUND_FLOOR));//-1.121
//
//    注意，此舍入模式始终不会增加计算值。
//
//    BigDecimal.ROUND_UNNECESSARY
//    断言请求的操作具有精确的结果，因此不需要舍入。
//    如果对获得精确结果的操作指定此舍入模式，则抛出ArithmeticException。
//
//    BigDecimal b1 = new BigDecimal("1.25");
//System.out.println(b1.setScale(2, BigDecimal.ROUND_UNNECESSARY));//1.25
//System.out.println(b1.setScale(1, BigDecimal.ROUND_UNNECESSARY));//throw ArithmeticException
//    三、与之相关的两个类
//
//    java.math.MathContext
//    该对象是封装上下文设置的不可变对象，它描述数字运算符的某些规则，如数据的精度，舍入方式等
//
//    MathContext.DECIMAL32
//    一个 MathContext 对象,其精度设置与 IEEE 754R Decimal32 格式(即 7 个数字)匹配,舍入模式为 HALF_EVEN,这是 IEEE 754R 的默认舍入模式。
//
//    MathContext.DECIMAL64
//    一个 MathContext 对象,其精度设置与 IEEE 754
//    R Decimal64 格式(即 16 个数字)匹配,舍入模式为 HALF_EVEN,这是 IEEE 754R 的默认舍入模式。
//
//    MathContext.DECIMAL128
//    一个 MathContext 对象,其精度设置与 IEEE 754R Decimal128 格式(即 34 个数字)匹配,舍入模式为 HALF_EVEN,这是 IEEE 754R 的默认舍入模式。
//
//    MathContext.UNLIMITED
//    其设置具有无限精度算法所需值的 MathContext 对象。
//    java.math.RoundingMode
//    枚举类，定义常用的数据舍入方式
//    HALF_UP(BigDecimal.ROUND_HALF_UP)
//    HALF_DOWN(BigDecimal.ROUND_HALF_DOWN)
//    HALF_EVEN(BigDecimal.ROUND_HALF_EVEN)
//    UP(BigDecimal.ROUND_UP)
//    DOWN(BigDecimal.ROUND_DOWN)
//    CEILING(BigDecimal.ROUND_CEILING)
//    FLOOR(BigDecimal.ROUND_FLOOR)
//    UNNECESSARY(BigDecimal.ROUND_UNNECESSARY)


    //补充一篇章。
//    版权声明：本文为CSDN博主「春秋战国程序猿」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/reggergdsg/article/details/76496380
//
//    用的较多的4个参数：
//    BigDecimal.ROUND_UP 这个方法做直接进位处理，但是有个特殊情况需要考虑，如果将要舍弃的位上的值是0，不做进位处理。
//    BigDecimal.ROUND_DOWN 这个方法做直接舍弃处理
//    BigDecimal.ROUND_HALF_UP 这个方法就是大名鼎鼎的四舍五入
//    BigDecimal.ROUND_HALF_DOWN 这个方法准确来说，是五舍六入

    //带上 测试类


}

package com.nyist.xu.javabasetest.bigDecimal1;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-30 14:51
 **/
public class BigDecimal2 {
//    BigDecimal 详解2
    // 跟dubbo的相关、 没有1 详细。

//    作者：此生唯一自传
//    链接：https://www.jianshu.com/p/b1fa61798c82
//    来源：简书
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//
//    b.setScale(1);//默认是 四舍五入
//
//    一、构造方法
//    BigDecimal的构造方法有很多种，大家最常用的如下方式:
//    BigDecimal bd1=new BigDecimal(10);
//    BigDecimal bd2=new BigDecimal("10");
//
//    二、四则预算
//    加法:bigDecimal1.add(bigDecimal2);
//    减法:bigDecimal1.subtract(bigDecimal2);
//    乘法:bigDecimal1.multiply(bigDecimal2);
//    除法:bigDecimal1.divide(bigDecimal2);
//
//    三、对小数的处理
//
//     (1).DecimalFormat类
//    例：
//    DecimalFormat df =new DecimalFormat("#.00");
//df.format(3.1415926);
//    结果输出3.14
//     .00 表示两位小数 #.000三位小数......
//
//     (2)setScale方法
//    double f = 111231.5585;
//    BigDecimal b = new BigDecimal(f);
//    double f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); //保留2位小数
//
//    四、比较大小
//     BigDecimal比较大小不能使用equals因为不仅比较值还比较精度
//    这里使用BigDecimal自带方法compareTo
//    例:
//    BigDecimal a = new BigDecimal("1.00");
//    BigDecmial b = new BigDecimal(1);
//a.compareTo(b)==0结果是true
//    这里返回值含义: -1小于 0等于 1大于




}

package com.nyist.xu.javabasetest.bigDecimal1;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author yangcq
 * Java常用商业计算工具类BigDecimal的精度设置方法setScale()详解
 *
 */
public class BigDecimalTest2 {

    @Test
    public void test() {
        double d = 3.05;

        BigDecimal b1 = new BigDecimal(d);//不能这样 构造 dubbo
        System.out.println(b1);//3.04999999999999982236431605997495353221893310546875
        System.out.println(b1.setScale(1, RoundingMode.HALF_UP));//3.0

        String str = "3.05";
        BigDecimal b2 = new BigDecimal(str);

        System.out.println(b2);//3.05  可以这样构造字符串
        System.out.println(b2.setScale(1, RoundingMode.HALF_UP));//3.1

        BigDecimal b3 = BigDecimal.valueOf(d);// dubbo 这样构造
        System.out.println(b3);//3.05
        System.out.println(b3.setScale(1, RoundingMode.HALF_UP));//3.1

    }
}
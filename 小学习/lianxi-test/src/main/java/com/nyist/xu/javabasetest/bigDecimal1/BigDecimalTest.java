package com.nyist.xu.javabasetest.bigDecimal1;

import java.math.BigDecimal;

/**
 *
 * @author yangcq
 * Java常用商业计算工具类BigDecimal的精度设置方法setScale()详解
 *
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        bigDecimalTest();
    }

    private static void bigDecimalTest(){
        BigDecimal bigDecimal_01 = new BigDecimal("918.845");
        BigDecimal bigDecimal_02 = new BigDecimal("918.844");
        BigDecimal bigDecimal_03 = new BigDecimal("918.846");

        bigDecimal_01.setScale(3);
        bigDecimal_01.setScale(2,BigDecimal.ROUND_UP);
        bigDecimal_01.setScale(2,BigDecimal.ROUND_DOWN);
        bigDecimal_01.setScale(2,BigDecimal.ROUND_HALF_UP);
        bigDecimal_01.setScale(2,BigDecimal.ROUND_HALF_DOWN);

        System.out.println("测试数据：" + bigDecimal_01);
        System.out.println("BigDecimal.ROUND_UP = " + bigDecimal_01.setScale(2,BigDecimal.ROUND_UP));
        System.out.println("BigDecimal.ROUND_DOWN = " + bigDecimal_01.setScale(2,BigDecimal.ROUND_DOWN));
        System.out.println("BigDecimal.ROUND_HALF_UP = " + bigDecimal_01.setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal.ROUND_HALF_DOWN = " + bigDecimal_01.setScale(2,BigDecimal.ROUND_HALF_DOWN));

        System.out.println("测试数据：" + bigDecimal_02);
        System.out.println("BigDecimal.ROUND_UP = " + bigDecimal_02.setScale(2,BigDecimal.ROUND_UP));
        System.out.println("BigDecimal.ROUND_DOWN = " + bigDecimal_02.setScale(2,BigDecimal.ROUND_DOWN));
        System.out.println("BigDecimal.ROUND_HALF_UP = " + bigDecimal_02.setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal.ROUND_HALF_DOWN = " + bigDecimal_02.setScale(2,BigDecimal.ROUND_HALF_DOWN));

        System.out.println("测试数据：" + bigDecimal_03);
        System.out.println("BigDecimal.ROUND_UP = " + bigDecimal_03.setScale(2,BigDecimal.ROUND_UP));
        System.out.println("BigDecimal.ROUND_DOWN = " + bigDecimal_03.setScale(2,BigDecimal.ROUND_DOWN));
        System.out.println("BigDecimal.ROUND_HALF_UP = " + bigDecimal_03.setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal.ROUND_HALF_DOWN = " + bigDecimal_03.setScale(2,BigDecimal.ROUND_HALF_DOWN));

        // BigDecimal.ROUND_UP 这个方法做直接进位处理，但是有个特殊情况需要考虑，如果将要舍弃的位上的值是0，不做进位处理。
        BigDecimal bigDecimal_04 = new BigDecimal("918.850");
        System.out.println("测试数据：" + bigDecimal_04);
        System.out.println("BigDecimal.ROUND_UP = " + bigDecimal_04.setScale(2,BigDecimal.ROUND_UP));
        System.out.println("BigDecimal.ROUND_DOWN = " + bigDecimal_04.setScale(2,BigDecimal.ROUND_DOWN));
        System.out.println("BigDecimal.ROUND_HALF_UP = " + bigDecimal_04.setScale(2,BigDecimal.ROUND_HALF_UP));
        System.out.println("BigDecimal.ROUND_HALF_DOWN = " + bigDecimal_04.setScale(2,BigDecimal.ROUND_HALF_DOWN));
    }
}
//————————————————
// 版权声明：本文为CSDN博主「春秋战国程序猿」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
// 原文链接：https://blog.csdn.net/reggergdsg/article/details/76496380

//-------------------------------------控制台输出：----------------------------------------------
//
// 测试数据：918.845
// BigDecimal.ROUND_UP = 918.85
// BigDecimal.ROUND_DOWN = 918.84
// BigDecimal.ROUND_HALF_UP = 918.85
// BigDecimal.ROUND_HALF_DOWN = 918.84
// 测试数据：918.844
// BigDecimal.ROUND_UP = 918.85
// BigDecimal.ROUND_DOWN = 918.84
// BigDecimal.ROUND_HALF_UP = 918.84
// BigDecimal.ROUND_HALF_DOWN = 918.84
// 测试数据：918.846
// BigDecimal.ROUND_UP = 918.85
// BigDecimal.ROUND_DOWN = 918.84
// BigDecimal.ROUND_HALF_UP = 918.85
// BigDecimal.ROUND_HALF_DOWN = 918.85
// 测试数据：918.850
// BigDecimal.ROUND_UP = 918.85
// BigDecimal.ROUND_DOWN = 918.85
// BigDecimal.ROUND_HALF_UP = 918.85
// BigDecimal.ROUND_HALF_DOWN = 918.85

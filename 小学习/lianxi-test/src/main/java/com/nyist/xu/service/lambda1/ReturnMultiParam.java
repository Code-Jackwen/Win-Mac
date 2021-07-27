package com.nyist.xu.service.lambda1;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 17:33
 **/

/**多个参数有返回值*/
@FunctionalInterface
public interface ReturnMultiParam {
    int method(int a, int b);
}

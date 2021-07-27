package com.nyist.xu.service.lambda1;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 17:34
 **/

/**一个参数有返回值*/
@FunctionalInterface
public interface ReturnOneParam {
    int method(int a);
}

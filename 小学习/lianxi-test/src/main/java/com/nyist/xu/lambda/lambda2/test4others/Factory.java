package com.nyist.xu.lambda.lambda2.test4others;

import com.nyist.xu.javabasetest.pojo.T;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 20:50
 **/

//工厂类接口
public interface Factory {

    T create(String name, int age);

}

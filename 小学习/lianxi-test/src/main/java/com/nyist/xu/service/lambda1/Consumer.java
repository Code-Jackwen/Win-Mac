package com.nyist.xu.service.lambda1;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 19:43
 **/

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

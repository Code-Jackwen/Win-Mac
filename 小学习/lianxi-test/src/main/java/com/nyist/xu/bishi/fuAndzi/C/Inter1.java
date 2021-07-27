package com.nyist.xu.bishi.fuAndzi.C;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-24 09:38
 **/
public interface Inter1 {
    public final int a1 = 1;

    static int sta(){
        return 1+1;
    }
    default int def(){
        return 2+2;
    }
}

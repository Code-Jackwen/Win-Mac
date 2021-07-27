package com.nyist.xu.bishi;

import java.io.File;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-16 20:47
 **/
public class FileTest {

    public static void main(String[] args) {
        File sys = new File("/java/system");
        System.out.println(sys.canRead());
        System.out.println(sys.canWrite());
    }


}

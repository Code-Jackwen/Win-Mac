package com.nyist.xu.computerbase;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-27 16:51
 **/
public class HEX {
    //HEX  十六进制
    public static void main(String[] args) {
        //二、十、十六进制转换
        //与、或、异或计算器  23bei  三贝      这个16进制可以输入0x
        //https://www.23bei.com/tool-531.html

        //在线进制转换 开源中国       十六进制输入去除 0x 直接输入3B
        //https://tool.oschina.net/hexconvert/
        int a = 0xAF;
        System.out.println(a);//0x3b  59         0xAF 175    0x3B 59
        System.out.println((a+1));

        int b = 0x07;
        System.out.println(b);//7

        //a是10、而f是15
        //0x3b 3乘16得48 加b加11得59
        //0xAF 10成16的160 加f加15得175
        //也有类似二进制那种除法进程10转16进制的 130D就是4877  见百度百科


    }

}

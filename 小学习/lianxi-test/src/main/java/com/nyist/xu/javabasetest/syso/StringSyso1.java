package com.nyist.xu.javabasetest.syso;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-28 09:47
 **/
public class StringSyso1 extends Thread{

    static String sName="abc";

    public static void main(String[] args){
        StringSyso1 t = new StringSyso1();
        t.piggy(sName);
        System.out.println(sName);//abc
    }

    public void piggy(String sName) {
        sName= sName+"wiggy";
        start();
    }


    public void run(){
        for (int i = 0; i <4; i++) {sName= sName+ "" + i;}
    }
    //原题这里多了 一个}
}


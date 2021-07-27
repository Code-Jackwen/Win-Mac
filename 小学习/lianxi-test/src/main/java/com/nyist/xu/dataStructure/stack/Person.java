package com.nyist.xu.dataStructure.stack;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-14 18:40
 **/
public class Person {
    public String name;
    public  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

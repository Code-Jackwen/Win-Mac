package com.nyist.xu.javabasetest.pojo;

import javax.xml.crypto.Data;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-20 16:03
 **/
//@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    //
    private Data createTime;


    //name、age  的get、set-------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    //name、age  的get、set-------

    //name、age  的构造
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

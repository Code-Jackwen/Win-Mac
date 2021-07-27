package com.nyist.xu.shejimoshi.builderdemo.v4;

import java.util.Date;
///希望创建对象时候一次性给所需变量赋值
// 方案1：针对不同情况下提供对应版本的构造函数------构造函数变多，如果木有对应版本的构造函数需要修改

public class User {
    private int id;
    private String name;
    private String pwd;
    private int age;
    private Date birthday;
    private String provice;
    private String city;

    // public User(String name) {
    // super();
    // this.name = name;
    // }
    //
    // public User(int id, String name, String pwd) {
    // super();
    // this.id = id;
    // this.name = name;
    // this.pwd = pwd;
    // }
    // ///
    // public User(int id, String name, String provice, String city) {
    // super();
    // this.id = id;
    // this.name = name;
    // this.provice = provice;
    // this.city = city;
    // }
    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.pwd = builder.pwd;
        this.age = builder.age;
        this.birthday = builder.birthday;
        this.provice = builder.provice;
        this.city = builder.city;
    }

    public static class Builder {
        private int id;
        private String name;
        private String pwd;
        private int age;
        private Date birthday;
        private String provice;
        private String city;

        //为了能链式操作，我们返回当前对象
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPwd(String pwd) {
            this.pwd = pwd;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setBirthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder setProvice(String provice) {
            this.provice = provice;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public User build() {
            return new User(this);
        }

        @Override
        public String toString() {
            return "Builder [id=" + id + ", name=" + name + ", pwd=" + pwd
             + ", age=" + age + ", birthday=" + birthday + ", provice="
             + provice + ", city=" + city + "]";
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", age="
         + age + ", birthday=" + birthday + ", provice=" + provice
         + ", city=" + city + "]";
    }

}

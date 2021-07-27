package com.nyist.xu.shejimoshi.builderdemo.v4;


public class Client {

    public static void main(String[] args) {
        User user1 = new User.Builder().setName("zhangsan").setPwd("123")
         .build();
        System.out.println(user1);
        User user2 = new User.Builder().setProvice("henan").setCity("nanyang")
         .build();
        System.out.println(user2);
    }

}

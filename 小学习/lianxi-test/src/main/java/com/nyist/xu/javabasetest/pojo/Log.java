package com.nyist.xu.javabasetest.pojo;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-21 17:01
 **/

@Slf4j
public class Log {

//    日志门面(日志的抽象层)
//    JCL(Jakarta Commons Logging)
//    SLF4J(Simple Logging Facade for java)
//    Jboss-Logging

//     日志实现
//     Log4j
//     JUL(java.util.logging)
//     Log4j2
//     Logback

//    为什么是SLF4J？ 阿里开发手册 要求

//    选一个日志门面,选一个日志实现
//    日志门面 : SLF4J;
//    日志实现 : Logback;
//    Spring Boot : 底层是Spring框架,Spring框架默认是用JCL;
//    SpringBoot选用SLF4J和Logback，并用INFO级别输出到控制台
//    开发的时候，直接调用日志抽象层里面的方法即可

    //使用SLF4J的另外一个理由就是，它可以支持占位符：
    //开发结合 lombok使用@self4j注解


    //String name = "Vi";
    //logger.debug("My Name is {}", name);
    //这段程序在运行时刻才会拿到name。
    // 这不仅缩减了代码中的许多字符串连接，而且减少了创建String对象所需要的堆内存资源。


    //怎么使用SLF4J？
    //spring-boot-starter中就已经包含了有关slf4j的jar包。
    // 我们只需要通过LoggerFactory去获取即可：

//    import org.slf4j.Logger;
//    import org.slf4j.LoggerFactory;
//    ...
//    private static final Logger logger = LoggerFactory.getLogger(ResponseAop.class);

    //这里需要注意看我们选择的是不是slf4j包下的Logger，不要选错了哟。

    //使用 注意加@Slf4j
    public static void main(String[] args) {
        log.info("This is a Slf4jTest");
    }


}

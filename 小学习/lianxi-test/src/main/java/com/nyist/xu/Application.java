package com.nyist.xu;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: silence
 * @Description: spring boot启动器
 * @Date:Create：in 2019/11/7 10:51
 */
@SpringBootApplication
@MapperScan("com.nyist.xu.dao")
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

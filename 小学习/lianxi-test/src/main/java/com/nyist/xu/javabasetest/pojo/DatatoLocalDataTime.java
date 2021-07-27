package com.nyist.xu.javabasetest.pojo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-20 21:41
 **/
public class DatatoLocalDataTime {
//    Java8中 Date和LocalDateTime的相互转换
//    一.在Java 8中将Date转换为LocalDateTime
//
//    方法1:
//
//    将Date转换为LocalDatetime，我们可以使用以下方法：
//    1.从日期获取ZonedDateTime并使用其方法toLocalDateTime（）获取LocalDateTime
//    2.使用LocalDateTime的Instant（）工厂方法
//    示例:


     public static void main(String[] args) {
            Date date = new Date();
            Instant instant = date.toInstant();
            ZoneId zoneId = ZoneId.systemDefault();

            LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
            System.out.println("Date = " + date);
            System.out.println("LocalDateTime = " + localDateTime);

        }
    }

//    结果:
//    Date = Fri Jun 16 15:35:26CST 2017
//    LocalDateTime = 2017-06-16T15:35:26.970


//package com.nyist.xu.pojo;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//
///**
// * @program: nyisttest
// * @description
// * @author: xu1
// * @create: 2019-12-21 15:25
// **/
//public class Java8LocalDateTime2 {
//
//    // 1、LocalDate:返回日期格式，如2019-01-01
//
////返回当前日期
//
//     System.out.println(LocalDate.now());
//
////返回指定日期（注意字段取值范围如月份取值1-12）
//
//System.out.println(LocalDate.of(2019,11,30));
//
////返回一年种的第几天是多少号
//
//System.out.println(LocalDate.ofYearDay(2019,12));
//
////String and LocalDate 转换  （注意时间格式，其他格式导致异常）
//
//System.out.println(LocalDate.parse("2017-12-03"));
//
//System.out.println(LocalDate.now().
//
//    format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//
////日期加减计算
//
//    LocalDate　localDate　＝　LocalDate.now()；
//
//     System.out.println(localDate.plusDays(1));
//
//System.out.println(localDate.minusDays(3));
//
////单独取年、月、日方法
//
//System.out.println(localDate.getYear()+"年"+localDate.getMonth().
//
//    getValue() +"月"+localDate.getDayOfMonth()+"日");
////2、LocalTime:返回格式，如10:15:30
//
////当前时间 格式10:57:11.551
//
//    LocalTime localTime = LocalTime.now();
//
//System.out.println(localTime);
//
//System.out.println(localTime.withNano(0));
//
////返回指定的时间和分钟,秒和纳秒;不设置默认0
//
//System.out.println(LocalTime.of(1,1));
//
//System.out.println(LocalTime.of(1,1,1));
//
//System.out.println(LocalTime.of(1,1,1,999));
//
////每天的第几秒开始、可用于计时器，参考示例如下
//
//System.out.println(LocalTime.ofSecondOfDay(1));//00:00:01
//
//System.out.println(LocalTime.ofSecondOfDay(60));//00:01
//
////替换指定时间单位上的值
//
//System.out.println(localTime.withHour(1));
//
//System.out.println(localTime.withMinute(2));
//
//System.out.println(localTime.withSecond(3).
//
//    withNano(1));
//
////时间的加减操作
//
//System.out.println(localTime.plusHours(1));
//
//System.out.println(localTime.plusMinutes(2));
//
//System.out.println(localTime.plusSeconds(3));
//
//System.out.println(localTime.plusNanos(100));
//
////其他同上
//
//System.out.println(localTime.minusHours(1));
//
////LocalTime and Str 转换(注意格式化不可添加年月日)
//
//System.out.println(localTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
//
//System.out.println(LocalTime.parse("10:01:01"));
//
////LocalDate to LocalDateTime（注意格式） 2019-03-04T15:42:22.233
//
//System.out.println(localTime.atDate(LocalDate.now()));
//
////时间比较，返回int值
//
//System.out.println(localTime.compareTo(localTime));
//
////时间比较，返回boolean值（注意格式和单位）
//
//System.out.println("当前时间比较，注意纳秒不同："+localTime +"||"+LocalTime.now());
//
//System.out.println(localTime.isBefore(LocalTime.now())+"||"+localTime.isAfter(LocalTime.now()));
//
//System.out.println(localTime.withNano(0).
//
//    isBefore(LocalTime.now().
//
//    withNano(0))+"||"+localTime.withNano(0).
//
//    isAfter(LocalTime.now().
//
//    withNano(0)));
//
//System.out.println(localTime.equals(LocalTime.now())+"||"+localTime.withNano(0).
//
//    equals(LocalTime.now().
//
//    withNano(0)));
//    //3、
//    LocalDateTime 返回格式，如2019-03-04T15:48:29.254
//
////基本使用及时间比较
//
//    LocalDateTime localDateTime = LocalDateTime.now();
//
//System.out.println(localDateTime);
//
//System.out.println(localDateTime.withNano(0));
//
//System.out.println(localDateTime.compareTo(LocalDateTime.now()));
//
//System.out.println(localDateTime.isAfter(localDateTime));
//
//System.out.println(localDateTime.isBefore(localDateTime));
//
//System.out.println(localDateTime.isEqual(localDateTime));
//
////LocalDateTime and Str 转换
//
//System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").
//
//    format(LocalDateTime.now()));
//
//System.out.println(LocalDateTime.parse("2018-01-12 17:07:05",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//
//System.out.println(LocalDateTime.parse("2019-03-04T15:48:29.254").
//
//    format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//
//
//}

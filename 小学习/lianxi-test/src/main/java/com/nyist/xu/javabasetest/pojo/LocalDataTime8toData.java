package com.nyist.xu.javabasetest.pojo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-20 21:43
 **/
public class LocalDataTime8toData {

//    方法2:
//    我们也可以使用LocalDateTime的FactoryInput（）方法使用系统的默认时区。
//    LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), zoneId);
//    二.在Java 8中将LocalDateTime转换为Date
//    要将LocalDateTime转换回java.util.Date，我们可以使用以下步骤：
//    1.使用atZone（）方法将LocalDateTime转换为ZonedDateTime
//    2.将ZonedDateTime转换为Instant，并从中获取Date
//    示例:

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);

        Date date = Date.from(zdt.toInstant());

        System.out.println("LocalDateTime = " + localDateTime);
        System.out.println("Date = " + date);

    }

//    结果:
//    LocalDateTime = 2017-06-16T15:38:48.580
//    Date = Fri Jun 16 15:38:48CST 2017

}

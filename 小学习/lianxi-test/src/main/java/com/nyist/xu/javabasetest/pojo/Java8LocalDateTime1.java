package com.nyist.xu.javabasetest.pojo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-21 10:50
 **/

//但是在从前端传值进来的时候，有一些坑，总结一下
// 1. 接收时间的参数前面要加上@DateTimeFormat(pattern="")注解
//例如：
//@Apimodelproperty(value = "创建时间",example = "2018-09-09")
//@DateTimeFormat("yyyy-MM-dd HH:mm:ss")
//private LocalDateTime create_time;

//2.同时对于LocalDateTime类型，注解里面的时分秒不能省略，前端也必须传进来，
// 传的时候必须是双位数！如果没有，就要用00:00:00表示
//3.LocalDate 类型的注解也可以加上时分秒，但是年月日后面的不会被接收和显示。

public class Java8LocalDateTime1 {
//    实体Entity
//    java.sql.Date、java.sql.Timestamp、java.util.Date
//    来映射到数据库的
//    date、          timestamp、        datetime

//java8：
//    Java8里面新出来了一些API，
//    LocalDate、LocalTime、LocalDateTime     ZonedDateTime, Period, Duration
//要求：
//    如果想要在JDBC中，使用Java8的日期LocalDate、LocalDateTime，
//    则必须要求数据库驱动的版本不能低于4.2




    //新旧对比 时间api

//    旧java.util.Date和java.util.Calendar的缺点。

//    Java 8时间类库中的核心类，比如LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Period, Duration

//    旧的时间API（java8之前）的问题: 对比 -
//    1 线程安全问题 - Date 和Calendar类不是线程安全的，
//    使开发者难以调试这些api的并发问题，需要编写额外的代码来处理线程安全。
//    Java 8中引入的新的Date和Time API是不可变的和线程安全的，使得这些痛点得以解决。
//
//    2 API设计和易于理解 - 旧的时间api非常难以理解，操作都非常复杂，
//    没有提供一些常用的解析转换方法。
//    新的时间API是以ISO为中心的，并遵循 date, time, duration 和 periods的一致域模型。
//    提供了一些非常实用方法以支持最常见的操作。
//
//    3 ZonedDate和Time - 时区：在旧的时间api中开发人员必须编写额外的逻辑来处理旧API的时区逻辑，
//    而使用新的API，可以使用 Local和ZonedDate / Time API来处理时区。无需过多关心时区转换问题。

    //***LocalDate:

    //获取当前系统时钟下的日期（YYYY-MM-DD)
    LocalDate localDate = LocalDate.now();

    //表示特定日
    LocalDate specialDay1 = LocalDate.of(2015, 02, 20);
    LocalDate specialDay2 = LocalDate.parse("2015-02-21");

    //获取当前本地日期并添加一天
    //获取明天的日期
    LocalDate tomorrow = LocalDate.now().plusDays(1);

    //获取当前日期并减去一个月  请注意它是如何接受枚举作为时间单位的
    LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);


    //分析日期“2016-06-12”并分别获取星期几和月中的某天。
    //注意返回值，第一个是表示DayOfWeek的对象，而第二个是表示月份的序数值的int
    DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
    int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();

    //测试一个日期是否发生在闰年，如果用老方法怕不是要上天：
    boolean leapYear = LocalDate.now().isLeapYear();

    //判断日期的先后：
    boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
    boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));

    //日期边界可以从给定日期获得。
    //我们得到LocalDateTime
    //代表给定日期的一天的开始  （2016-06-12T00：00）
    //代表月初的LocalDate      （2016-06-01）
    LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
    LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
     .with(TemporalAdjusters.firstDayOfMonth());


    //***LocalTime:

    //创建当前LocalTime的实例
    LocalTime now = LocalTime.now();

    //通过解析字符串表示创建表示06:30 AM 的LocalTime：
    LocalTime sixThirty1 = LocalTime.parse("06:30");

    //方法“of”可用于创建LocalTime
    LocalTime sixThirty2 = LocalTime.of(6, 30);

    //通过解析字符串来创建LocalTime，并使用“plus”API为其添加一小时。
    //结果将是代表07:30 AM的LocalTime
    LocalTime sevenThirty = LocalTime.parse("06:30")
     .plus(1, ChronoUnit.HOURS);

    //各种getter方法可用于获取特定的时间单位，如小时，分钟和秒，如下所示获取小时：
    int six = LocalTime.parse("06:30").getHour();

    //检查特定时间是否在另一特定时间之前或之后。
    boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
    //true

    //一天中的最大，最小和中午时间可以通过LocalTime类中的常量获得。
    //数据库查询以查找给定时间范围内的记录时，这非常有用。例如，下面的代码代表23：59：59.99：
    LocalTime maxTime = LocalTime.MAX;


    //***LocalDateTime 最常用：

    //从系统时钟获取LocalDateTime的实例：
    LocalDateTime localDateTime = LocalDateTime.now();


    //工厂“of”和“parse”方法创建实例。
    //结果将是代表2015年2月20日06:30 AM
    //LocalDateTime实例：
    LocalDateTime localDateTime1 = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
    LocalDateTime localDateTime2 = LocalDateTime.parse("2015-02-20T06:30:00");


    //可以支持特定时间单位的时间运算，
    //例如天，月，年和分钟。
    //以下代码示例演示了“加”和“减”方法的用法。
    //这些API的行为与LocalDate和LocalTime中的 API完全相同：
    LocalDateTime localDateTime3 = localDateTime.plusDays(1);
    LocalDateTime localDateTime4 = localDateTime.minusHours(2);


    //***ZonedDateTime API


    //ZoneID是用于表示不同区域的标识符。
    //大约有40个不同的时区，使用ZoneID表示它们，如下所示
    //下面的代码我们来获取下“亚洲/上海”时区:
    ZoneId zoneId = ZoneId.of("Aisa/Shanghai");


    //获取所有的时区：
    Set<String> allZoneIds = ZoneId.getAvailableZoneIds();


    //LocalDateTime转化为特定的时区中的时间：
    ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);


    //ZonedDateTime提供解析方法来获取时区的特定日期时间：
    ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Aisa/Shanghai]");


    //------------------不常用这个
    //使用时区的另一种方法是使用OffsetDateTime。
    //OffsetDateTime是具有偏移量的日期时间的不可变表示形式。
    //此类存储所有日期和时间字段，精确到纳秒，以及从UTC/格林威治的偏移量。
    //可以使用ZoneOffset创建OffsetDateTime实例。
    //这里我们创建一个LocalDateTime来表示2015年2月20日上午6:30：
    LocalDateTime localDateTime10 = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);

    //然后我们通过创建ZoneOffset并为LocalDateTime实例设置来增加两个小时：
    ZoneOffset offset = ZoneOffset.of("+02:00");
    OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);




    //我们现在的本地日期时间为2015-02-20 06:30 +02：00。
    //现在让我们继续讨论如何使用Period和Duration类修改日期和时间值。

    //***Period和Duration 日期操作 运算

    //Period : 用于计算两个日期（年月日）间隔。
    //Duration : 用于计算两个时间（秒，纳秒）间隔。


    /// 5.1。使用Period

    //Period 类被广泛地用于修改给定的日期的值或者获取两个日期之间的差值：
    LocalDate initialDate = LocalDate.parse("2007-05-10");
    LocalDate finalDate = initialDate.plus(Period.ofDays(5));

    //Period 类有各种getter方法，如getYears，getMonths和getDays从获取值周期对象。
    // 下面的代码示例返回一个int值为5，是基于上面示例的逆序操作：

    int five = Period.between(finalDate, initialDate).getDays();


    //该Period 可以在特定的单元获得两个日期之间的 如、天、月、数年，
    //使用ChronoUnit.between：
    int five1 = (int) ChronoUnit.DAYS.between(finalDate , initialDate);


    /// 5.2。使用Duration

    //类似Period ，该Duration类是用来处理时间。在下面的代码中，我们创建一个本地时间上午6:30，
    //然后加30秒的持续时间，以使本地时间上午6时30分30秒的：
    LocalTime initialTime = LocalTime.of(6, 30, 0);
    LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));



    //两个时刻之间的持续时间可以作为持续时间或作为特定单位获得。
    //使用Duration类的between()方法来查找finalTime和initialTime之间的时间差，并以秒为单位返回差异：
    int thirty = (int) Duration.between(finalTime, initialTime).getSeconds();

    //使用ChronoUnit类的between()方法来执行相同的操作：
    int thirty1 = (int) ChronoUnit.SECONDS.between(finalTime, initialTime);



    //旧的Date 和Calendar 转换为新的Date和Time。

    //6.与日期和日历的兼容性

    //Java 8添加了toInstant()方法，该方法有助于将旧API中的Date和Calendar实例转换为新的Date Time org.apiguardian.api.API，
    //如下面的代码片段所示：

     Date date = new Date();
     Calendar calendar;//不懂。

     LocalDateTime localDateTime5 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
     LocalDateTime localDateTime6 = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());


     //所述LocalDateTime可以从如下“ofEpochSecond"方法来构造。
     //以下代码的结果将是代表2016-06-13T11：34：50 的LocalDateTime：

    LocalDateTime localDateTime7 = LocalDateTime.ofEpochSecond(1465817690, 0, ZoneOffset.UTC);



    /// 7. 日期和时间格式化

    //Java 8提供了用于轻松格式化日期和时间的 API ：

    LocalDateTime localDateTime9 = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);


    //以下代码传递ISO日期格式以格式化本地日期。
    //结果将是2015-01-25：
    String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);


    //该DateTimeFormatter提供多种标准格式选项。
    //也可以提供自定义模式来格式化方法，
    //如下所示，它将返回LocalDate为2015/01/25：
    String localDateTime8 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));


    //我们可以将格式样式传递为SHORT，LONG或MEDIUM作为格式化选项的一部分。
    //下面的代码示例输出2015年1月25日06:30:00 me的输：
    // localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK);



    //最后让我们看看Java 8 Core Date / java.sql.Time API 可用的替代方案。
    //8.替代方案
    //8.1 使用Threeten 类库
    //对于从Java 7或Java 6这些老项目来说可以使用Threeten ,然后可以像在上面java 8一样使用相同的功能，
    //一旦你迁移到java 8 只需要修改你的包路径代码而无需变更：

//    <dependency>
//        <groupId>org.threeten</groupId>
//        <artifactId>threetenbp</artifactId>
//        <version>LATEST</version>
//    </dependency>


    //8.2 Joda-Time类库
    //Java 8 日期和时间库的另一种替代方案是Joda-Time库。事实上，Java 8 Date Time API由Joda-Time库（Stephen Colebourne）和Oracle共同领导。该库提供了Java 8 Date Time项目中支持的几乎所有功能。通过在项目中引用以下pom依赖项就可以立即使用：

    //<dependency>
    //    <groupId>joda-time</groupId>
    //    <artifactId>joda-time</artifactId>
    //    <version>LATEST</version>
    //</dependency>





}

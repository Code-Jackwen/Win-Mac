package com.nyist.xu.javabasetest.pojo;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 14:02
 **/
public class Java8LocalDateTime3 {

//    原文链接：https://blog.csdn.net/weixin_41656377/article/details/90598986

//    // 取当前日期：
//    LocalDate today = LocalDate.now(); // -> 2014-12-24
//    // 根据年月日取日期：
//    LocalDate crischristmas = LocalDate.of(2014, 12, 25); // -> 2014-12-25
//    // 根据字符串取：
//    LocalDate endOfFeb = LocalDate.parse(“2014-02-28”); // 严格按照ISO yyyy-MM-dd验证，02写成2都不行，当然也有一个重载方法允许自己定义格式
//LocalDate.parse(“2014-02-29”); // 无效日期无法通过：DateTimeParseException: Invalid date
//    // 取本月第1天：
//    LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth()); // 2017-03-01
//    // 取本月第2天：
//    LocalDate secondDayOfThisMonth = today.withDayOfMonth(2); // 2017-03-02
//    // 取本月最后一天，再也不用计算是28，29，30还是31：
//    LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth()); // 2017-12-31
//    // 取下一天：
//    LocalDate firstDayOf2015 = lastDayOfThisMonth.plusDays(1); // 变成了2018-01-01
//    // 取2017年1月第一个周一，用Calendar要死掉很多脑细胞：
//    LocalDate firstMondayOf2015 = LocalDate.parse(“2017-01-01”).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 2017-01-0
//
//    all method:
//
//    adjustInto 调整指定的Temporal和当前LocalDateTime对
//    atOffset 结合LocalDateTime和ZoneOffset创建一个
//    atZone 结合LocalDateTime和指定时区创建一个ZonedD
//    compareTo 比较两个LocalDateTime
//    format 格式化LocalDateTime生成一个字符串
//    from 转换TemporalAccessor为LocalDateTi
//    get 得到LocalDateTime的指定字段的值
//    getDayOfMonth 得到LocalDateTime是月的第几天
//    getDayOfWeek 得到LocalDateTime是星期几
//    getDayOfYear 得到LocalDateTime是年的第几天
//    getHour 得到LocalDateTime的小时
//    getLong 得到LocalDateTime指定字段的值
//    getMinute 得到LocalDateTime的分钟
//    getMonth 得到LocalDateTime的月份
//    getMonthValue 得到LocalDateTime的月份，从1到12
//    getNano 得到LocalDateTime的纳秒数
//    getSecond 得到LocalDateTime的秒数
//    getYear 得到LocalDateTime的年份
//    isAfter 判断LocalDateTime是否在指定LocalDateT
//    isBefore 判断LocalDateTime是否在指定LocalDateT
//    isEqual 判断两个LocalDateTime是否相等
//    isSupported 判断LocalDateTime是否支持指定时间字段或单元
//    minus 返回LocalDateTime减去指定数量的时间得到的值
//    minusDays 返回LocalDateTime减去指定天数得到的值
//    minusHours 返回LocalDateTime减去指定小时数得到的值
//    minusMinutes 返回LocalDateTime减去指定分钟数得到的值
//    minusMonths 返回LocalDateTime减去指定月数得到的值
//    minusNanos 返回LocalDateTime减去指定纳秒数得到的值
//    minusSeconds 返回LocalDateTime减去指定秒数得到的值
//    minusWeeks 返回LocalDateTime减去指定星期数得到的值
//    minusYears 返回LocalDateTime减去指定年数得到的值
//    now 返回指定时钟的当前LocalDateTime
//    of 根据年、月、日、时、分、秒、纳秒等创建LocalDateTi
//    ofEpochSecond 根据秒数(从1970-01-0100:00:00开始)创建L
//    ofInstant 根据Instant和ZoneId创建LocalDateTim
//    parse 解析字符串得到LocalDateTime
//    plus 返回LocalDateTime加上指定数量的时间得到的值
//    plusDays 返回LocalDateTime加上指定天数得到的值
//    plusHours 返回LocalDateTime加上指定小时数得到的值
//    plusMinutes 返回LocalDateTime加上指定分钟数得到的值
//    plusMonths 返回LocalDateTime加上指定月数得到的值
//    plusNanos 返回LocalDateTime加上指定纳秒数得到的值
//    plusSeconds 返回LocalDateTime加上指定秒数得到的值
//    plusWeeks 返回LocalDateTime加上指定星期数得到的值
//    plusYears 返回LocalDateTime加上指定年数得到的值
//    query 查询LocalDateTime
//    range 返回指定时间字段的范围
//    toLocalDate 返回LocalDateTime的LocalDate部分
//    toLocalTime 返回LocalDateTime的LocalTime部分
//    toString 返回LocalDateTime的字符串表示
//    truncatedTo 返回LocalDateTime截取到指定时间单位的拷贝
//    until 计算LocalDateTime和另一个LocalDateTi
//    with 返回LocalDateTime指定字段更改为新值后的拷贝
//    withDayOfMonth 返回LocalDateTime月的第几天更改为新值后的拷贝
//    withDayOfYear 返回LocalDateTime年的第几天更改为新值后的拷贝
//    withHour 返回LocalDateTime的小时数更改为新值后的拷贝
//    withMinute 返回LocalDateTime的分钟数更改为新值后的拷贝
//    withMonth 返回LocalDateTime的月份更改为新值后的拷贝
//    withNano 返回LocalDateTime的纳秒数更改为新值后的拷贝
//    withSecond 返回LocalDateTime的秒数更改为新值后的拷贝
//    withYear 返回LocalDateTime年份更改为新值后的拷贝
}

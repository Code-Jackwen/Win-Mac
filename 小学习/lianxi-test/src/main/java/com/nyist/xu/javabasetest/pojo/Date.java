package com.nyist.xu.javabasetest.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-20 21:08
 **/
//java如何创建一个指定的日期对象：

//1.new一个java.util.Date对象，调用它的setYear、setMonth等等方法，设置你要的年月日。
// 不过这种做法不推荐，因为setYear等方法已经过时了。
//2.new一个java.util.SimpleDateFormat类的实例，构造方法可以指定日期格式，
// 然后通过调用这个SimpleDateFormat实例的parse方法可以解析获得指定日期的Date对象。
// 代码示例：
// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//
// Date d  = null;
// //这里会有一个异常，所以要用try catch捕获异常
// try {
// d  = sdf.parse("2017-11-06");
// }catch (Exception e){
// e.printStackTrace();

public class Date {

    //java中Date和String之间的转换

    /**
     * 程序1
     * 将date转换成String
     * 得到像 2018-11-26 这种格式的日期字符串
     */
    public static String gainDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = sdf.format(date);
        return dateStr;
    }


    /**
     * 程序2
     * 将date转换成String
     * 得到像 2018-11-26 11:04:34 这种格式的时间字符串
     */
    public static String gainTime(Date dateTime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(dateTime);
        return dateStr;
    }


    /**
     * 程序3
     * 获取系统当前日期，返回Date类型
     * 返回格式是这样的：Mon Nov 26 00:00:00 CST 2018
     *
     * @return
     */
    public static java.util.Date getSystemDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return simpleDateFormat.parse(simpleDateFormat.format(date));
    }


    /**
     * 程序4
     * 获取系统当前时间，返回Date类型
     * 返回格式是这样的：Mon Nov 26 11:14:26 CST 2018
     *
     * @return
     */
    public static java.util.Date getSystemTime() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateTime = new Date();
        return simpleDateFormat.parse(simpleDateFormat.format(dateTime));
    }

//    mysql中date、datetime、timestamp类型的说明:
//
//    - date：在mysql中，该类型是java.sql.Date类型的，
//        用java操作数据库时可以用java.util.Date类型的字段插入。
//        比如说我要插入“2018-11-26”这种格式的日期到mysql中，
//        就可以用上述程序3的方法获取该格式的date进行插入。注意，
//        mysql中date类型只能存“2018-11-26”这种格式的，像“2018-11-26 11:29:33”
//        这种格式的日期是不能存的，mysql会把后面的时间舍掉，只保留日期。
//        从数据库获取日期时用程序1将date类型转换为String类型即可得到该格式的日期字符串。
//
//     - datetime：该类型的字段可以存“2018-11-26 11:32:34”
//        这种格式的日期，用上述程序4得到的date类型插入数据库即可。
//        获取时用程序2将date类型的日期转换为String类型即可。
//        注：如果不将date转换为String的话，得到的是一窜时间戳序列，
//        如：1162614180
//
//     - timestamp：时间戳，关于datetime和timestamp的区别，
//        放一个链接：MYSQL-datatime和timestamp的区别，
//        该用法和上面的datetime用法一致。


//    三种日期类型 区别：

//    mysql中有三种日期类型：
//
//    date(年-月-日)
//    create table test(hiredate date);

//    datetime（日期时间类型）
//    create table test(hiredate datetime)

//    timestamp（邮戳类型，保存年-月-日 时-分-秒）
//    create table test(hiredate timestamp)

//    datetime 和timestamp的不同点
//
//    两者的存储方式不一样
//    对于TIMESTAMP，它把客户端插入的时间从当前时区转化为UTC（世界标准时间）进行存储。查询时，将其又转化为客户端当前时区进行返回。而对于DATETIME，不做任何改变，基本上是原样输入和输出。
//
//    两者所能存储的时间范围不一样
//    timestamp所能存储的时间范围为：’1970-01-01 00:00:01.000000’ 到 ‘2038-01-19 03:14:07.999999’。
//    datetime所能存储的时间范围为：’1000-01-01 00:00:00.000000’ 到 ‘9999-12-31 23:59:59.999999’。
//    总结：TIMESTAMP和DATETIME除了存储范围和存储方式不一样，没有太大区别。当然，对于跨时区的业务，TIMESTAMP更为合适。
//    自动初始化和更新
//    自动初始化指的是如果对该字段（譬如上例中的hiredate字段）没有显性赋值，则自动设置为当前系统时间。
//    自动更新指的是如果修改了其它字段，则该字段的值将自动更新为当前系统时间。
//    它与“explicit_defaults_for_timestamp”参数有关。
//    默认情况下，该参数的值为OFF
//
//    dos:
//    mysql> show variables like '%explicit_defaults_for_timestamp%';
//
//    +---------------------------------+-------+
//     | Variable_name | Value |
//     +---------------------------------+-------+
//     | explicit_defaults_for_timestamp | OFF |
//     +---------------------------------+-------+
//    row in set (0.00 sec)
//
//    总结：timestamp有自动初始化和更新，当你update某条记录的时候，
//    该列值会自动更新，这是和datatime最大的区别。





}

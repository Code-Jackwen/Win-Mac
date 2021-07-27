package com.nyist.xu.javabasetest.smallMethodTest.Comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-16 22:14
 **/
//https://blog.csdn.net/sinat_33585352/article/details/90754754
public class ComparatorCompare implements Comparator<NotificationRecord> {

    //总结：
    //int compare(A a1,A a2)  返回int 值
    //a1在前a2 在后，方法实现 两数 比较结果。
    //如果返回值大于0  交换两值
    //如果返回值小于0  不交换！

    SimpleDateFormat format = new SimpleDateFormat("yyyy-M-d H:mm:ss SSS", Locale.CHINA);

    @Override
    public int compare(NotificationRecord arg0, NotificationRecord arg1) {
        int sort = 0;
        int level = arg1.getLevel() - arg0.getLevel();
        if (level != 0) {
            //降序
            sort = (level > 0) ? 2 : -1;
            //升序
//			sort = (level > 0) ? -2 : 1;
        } else {
            Date d1, d2;
            try {
                d1 = format.parse(format.format(arg0.getTime()));
                d2 = format.parse(format.format(arg1.getTime()));
            } catch (ParseException e) {
                return sort;
            }
            //降序
            sort = (d1.before(d2)) ? 1 : -2;
            //升序
//			return sort = (d1.before(d2)) ? -1 : 2;
        }
        return sort;
    }

    //测试
    public static void main(String[] args) {
        ArrayList<NotificationRecord> recordList = new ArrayList<NotificationRecord>() {
            private static final long serialVersionUID = 1L;
            {
                add(new NotificationRecord(1, 1557803095000L, "音乐"));
                add(new NotificationRecord(1, 1557903007000L, "音乐"));
                add(new NotificationRecord(2, 1557603116000L, "新闻"));
                add(new NotificationRecord(5, 1557503143001L, "升级"));
                add(new NotificationRecord(3, 1557403110000L, "电话"));
                add(new NotificationRecord(3, 1557303097000L, "电话"));
                add(new NotificationRecord(4, 1557203096006L, "支付"));
                add(new NotificationRecord(1, 1557103105000L, "音乐"));
                add(new NotificationRecord(0, 1558003108001L, "广告"));
                add(new NotificationRecord(4, 1558203105001L, "支付"));
                add(new NotificationRecord(5, 1558803108005L, "升级"));
                add(new NotificationRecord(2, 1557103108000L, "新闻"));
                add(new NotificationRecord(2, 1559003108000L, "新闻"));
                add(new NotificationRecord(0, 1557803118001L, "广告"));
            }
        };
        Collections.sort(recordList, new ComparatorCompare());
        for (NotificationRecord nr : recordList) {
            System.out.println(nr.toString());
        }
    }

}
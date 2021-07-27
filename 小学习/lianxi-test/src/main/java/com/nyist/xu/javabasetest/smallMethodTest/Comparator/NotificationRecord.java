package com.nyist.xu.javabasetest.smallMethodTest.Comparator;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-16 22:16
 **/
//pojo
public class NotificationRecord {
    SimpleDateFormat format = new SimpleDateFormat("yyyy/M/d H:mm:ss SSS", Locale.CHINA);
    private int level;
    private long time;
    private String name;
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public NotificationRecord(int level, long time,String name) {
        super();
        this.level = level;
        this.time = time;
        this.name =name;
    }
    @Override
    public String toString() {
        return "NotificationRecord [level=" + level + ", time=" + format.format(time) + ", name=" + name + "]";
    }
}

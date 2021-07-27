package com.nyist.xu.Knowledge.uuid;

import java.util.UUID;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-31 13:43
 **/
public class UUID2 {

//    JAVA生成短8位UUID：
//    可以当做一个工具类
//    本算法利用62个可打印字符，通过随机生成32位UUID，由于UUID都为十六进制，所以将UUID分成8组，每4个为一组，
//    然后通过模62操作，结果作为索引取出字符，这样重复率大大降低。
//    经测试，在生成一千万个数据也没有出现重复，完全满足大部分需求。

//    版权声明：本文为CSDN博主「andy_miao858」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/andy_miao858/article/details/9530245

    public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
     "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
     "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
     "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
     "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
     "W", "X", "Y", "Z" };

    public static String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }

    public static void main(String[] args){
        String uuid = UUID2.generateShortUuid();
        System.out.println(uuid);
        //r4xr0cxf
    }

}

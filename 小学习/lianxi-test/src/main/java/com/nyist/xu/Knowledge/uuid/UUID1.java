package com.nyist.xu.Knowledge.uuid;

import java.util.UUID;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-31 13:29
 **/
public class UUID1 {

//    作者：雷神VeryYoung
//    链接：https://www.jianshu.com/p/a72105e4cd33
//    来源：简书
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public static void main(String[] args){
        //调用Java提供的生成随机字符串的对象：32位，十六进制，中间包含-
        String uuid1 = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(uuid1);
    }

//    目前最广泛应用的UUID，是微软公司的全局唯一标识符（GUID）

//    UUID 的目的是让分布式系统中的所有元素，都能有唯一的辨识，多应用于数据库主键。

//    UUID的唯一缺陷在于生成的结果串会比较长。
//    关于UUID这个标准使用最普遍的是微软的GUID(Globals Unique Identifiers)。
//    在ColdFusion中可以用CreateUUID()函数很简单地生成UUID，
//    其格式为：xxxxxxxx-xxxx- xxxx-xxxxxxxxxxxxxxxx(8-4-4-16)，
//    其中每个 x 是 0-9 或 a-f 范围内的一个十六进制的数字。
//    而标准的UUID格式为：xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx (8-4-4-4-12)，
//    可以从cflib 下载CreateGUID() UDF进行转换。（摘自百度百科）

    //总结另一篇：
//    Java 5以上版本中自带的UUID生成器：好像只能生成Version 3/4的UUID。
//    此外，Hibernate中也有一个UUID生成器，但是，生成的不是任何一个（规范）版本的UUID，强烈不建议使用。

//    java.util.UUID是jdk1.5之后新增的一个工具类，在java.util下，用它可以产生一个号称全球唯一的ID

    //总结：uuid
//    在线生成uuid，可以选择uuid version，还可以直接去掉中划线，好用的不得了啊
//    http://www.uuid.online/



//    java.util.UUID 工具类详解
//    https://www.656463.com/article/javautilUUIDgongjuleixiangjie_4
//    2019-03-12 23:47|来源: 网路

//    java.util.UUID是jdk1.5之后新增的一个工具类，在java.util下，用它可以产生一个号称全球唯一的ID
//    1、一个UUID表示一个128位的值，，一般用16进制表示。
//    2、UUID是一个128位长的数字算法的核心思想是结合机器的网卡、当地时间、
//      一个随即数来生成UUID。从理论上讲，如果一台机器每秒产生10000000个UUID，则可以保证（概率意义上）3240年不重复。
//    3、它是用于创建随机文件名，在Web应用程序的会话ID，事务ID等
//    4、还有UUID四种不同的基本类型：基于时间，DCE安全性，基于名称，并随机生成的UUID


    //version 字段保存描述此 UUID 类型的值。
    //有 4 种不同的基本 UUID 类型：基于时间的 UUID、DCE 安全 UUID、基于名称的 UUID 和随机生成的 UUID。
    //这些类型的 version 值分别为 1、2、3 和 4。

//    构造方法摘要
//    UUID(long mostSigBits, long leastSigBits)
//    使用指定的数据构造新的 UUID。
    //等等方法。。。


}

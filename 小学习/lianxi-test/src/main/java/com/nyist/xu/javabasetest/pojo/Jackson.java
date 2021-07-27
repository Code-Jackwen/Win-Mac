package com.nyist.xu.javabasetest.pojo;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-20 10:52
 **/
public class Jackson {
//    1、@JsonIgnoreProperties
//    此注解是类注解，作用是json序列化时将java bean中的一些属性忽略掉，序列化和反序列化都受影响。
//    写法将此标签加在model 类的类名上 ，可以多个属性也可以单个属性


    //生成json时将name和age属性过滤
//    @JsonIgnoreProperties({"name"},{"age"})
//    public class  user {
//        private  String name;
//        private int age;
//    }

//    2、
//    @JsonIgnore
//    此注解用于属性或者方法上（最好是属性上），作用和上面的@JsonIgnoreProperties一样。
//    生成json 时不生成age 属性
//    public class user {
//        private String name;
//        @JsonIgnore
//        private int age;
//    }

//    3、
//    @JsonFormat
//    此注解用于属性或者方法上（最好是属性上），可以方便的把Date类型直接转化为我们想要的模式，
//    比如@JsonFormat(pattern = “yyyy-MM-dd HH-mm-ss”)



}
//使用Jackson相关的注解时一定要注意自己定义的属性命名是否规范。

// 命名不规范时会失去效果。（例如Ename ，Eage 为不规范命名。“nameE”，“ageE”为规范命名）
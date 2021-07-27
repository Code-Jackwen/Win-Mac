package com.nyist.xu.javabasetest.pojo;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-29 17:24
 **/
public class Annotation_Resource {

//    @Resource
//    PersonDao  p;

//    这时候spring注入p的过程是
//    1：先查找xml中是否有id为p的元素
//    2：如果没有找到，则看是否有name属性（@Resource  name=“”），有则查找name
//    3:否则查找persondao类型的元素


//    javax.annotation.Resource和@autowired:
//    区别：

//    @Resource的作用相当于@Autowired，将bean注入到this对象中去，只不过@Autowired按byType自动注入。
//    注意: byName就是通过Bean的id或者name，byType就是按Bean的Class的类型。

//    与@Autowired共同点：
//    @Resource和@Autowired两者都是做bean的注入使用，都可以写在字段和setter方法上，
//    两者如果都写在字段上则不需要写setter方法。

//    与@Autowired不同点：
//    @Resource并不是spring的注解，需导入javax.annotation.Resource包，Spring支持该注解的注入，
//    @Resource默认按 byName自动注入,由J2EE提供。@Resource有两个中重要的属性：name和type，
//    而Spring将@Resource注解的name属性解析为bean的名字，而type属性则解析为bean的类型。所以如果使用name属性，
//    则使用byName的自动注入策略，而使用type属性时则使用byType自动注入策略。如果既不指定name也不指定type属性，
//    这时将通过反射机制使用byName自动注入策略。最好是将@Resource放在setter方法上。
//    @Autowired为Spring提供的注解，需导入Package:org.springframework.beans.factory.annotation.Autowired，
//    只按照byType注入（按类型注入）。默认情况下它要求依赖对象必须存在，如果允许null值，
//    需要设置它required属性为false。如果想使用按名称装配，可以结合@Qualifier注解一起使用,

//    例如：
//    @autowired @Qualifier("taskMasterService")
//    private TaskMasterService taskMasterService;

//    原文链接：https://blog.csdn.net/kongqiuqiu/article/details/77248333


}

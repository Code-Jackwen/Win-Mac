package com.nyist.xu.javabasetest.pojo;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-19 21:33
 **/
public class Lombok {
}

//Lombok主要常用的注解有：@Data,@getter,@setter,@NoArgsConstructor,
// @AllArgsConstructor,@ToString,@EqualsAndHashCode,@Slf4j,@Log4j

//@Data注解：在JavaBean或类JavaBean中使用，这个注解包含范围最广，
// 它包含@Setter @Getter,@ToString,@EqualsAndHashCode注解

//@getter注解：在JavaBean或类JavaBean中使用，使用此注解会生成对应的getter方法；

//@setter注解：在JavaBean或类JavaBean中使用，使用此注解会生成对应的setter方法；

//@NoArgsConstructor注解：在JavaBean或类JavaBean中使用，使用此注解会生成对应的无参构造方法；

//@AllArgsConstructor注解：在JavaBean或类JavaBean中使用，使用此注解会生成对应的有参构造方法；

//@ToString注解：在JavaBean或类JavaBean中使用，使用此注解会自动重写对应的toStirng方法；

//@EqualsAndHashCode注解：在JavaBean或类JavaBean中使用，
// 使用此注解会自动重写对应的equals方法和hashCode方法；

//@Slf4j：在需要打印日志的类中使用，当项目中使用了slf4j打印日志框架时使用该注解，会简化日志的打印流程，只需调用info方法即可；

//@Log4j：在需要打印日志的类中使用，当项目中使用了log4j打印日志框架时使用该注解，会简化日志的打印流程，只需调用info方法即可；

// 在使用以上注解需要处理参数时，处理方法如下（以@ToString注解为例，其他注解同@ToString注解）：


//@ToString(callSuper = true,exclude="column")
//该方法大家应该非常熟悉，但需要注意的是:@ToString有多个属性可以进一步设置:

// callSuper 是否输出父类的toString方法,默认为false
// includeFieldNames 是否包含字段名称,默认为true---没啥用
// exclude 排除生成tostring的字段


//@ToString(of="column")

//意义：只生成包含column列所对应的元素的参数的toString方法，即在生成toString方法时只包含column参数；；

//@ToString(of={"column1","column2"})

//意义：只生成包含多个column列所对应的元素的参数的toString方法，
// 其中间用英文状态下的逗号进行分割，即在生成toString方法时只包含多个column参数；



//@NonNull
//该注解快速判断是否为空,如果为空,则抛出java.lang.NullPointerException
//例如：

//@NonNull
//private List<Person> member;

//@Synchronized
//该注解自动添加到同步机制,有趣的是,生成的代码并不是直接锁方法,而是锁代码块， 作用范围是方法上

//例如：
//@Synchronized
//public String synchronizedFormat(Date date) {
// return format.format(date);
// }
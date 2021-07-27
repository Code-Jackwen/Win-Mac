package com.nyist.xu.javabasetest.pojo;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-30 16:43
 **/
public class Exception1 {
//    https://www.cnblogs.com/clwydjgs/p/9317849.html
    //下边 复制的不全。

//    注解@Transactional(rollbackFor = Exception.class) 详解

//    如下图所示，我们都知道
//
//     Exception分为运行时异常RuntimeException和非运行时异常
//     error是一定会回滚的
//    Throwable类是所有异常或错误的超类，它有两个子类：Error和Exception，分别表示错误和异常。
//    他俩 都来自同一个父类 是并列的

//    spring支持 编程式事务管理和 声明式事务管理两种方式。
//    编程式事务管理使用TransactionTemplate或者直接使用底层的PlatformTransactionManager。
//    对于编程式事务管理，spring推荐使用TransactionTemplate。

//    声明式事务管理建立在AOP之上的。其本质是对方法前后进行拦截，然后在目标方法开始之前创建或者加入一个事务，
//        在执行完目标方法之后根据执行情况提交或者回滚事务。
//    声明式事务管理也有两种常用的方式，一种是基于tx和aop名字空间的xml配置文件，
//        另一种就是基于@Transactional注解。显然基于注解的方式更简单易用，更清爽。

//    使用说明：
//    当作用于类上时，该类的所有 public 方法将都具有该类型的事务属性，同时，
//        我们也可以在方法级别使用该标注来覆盖类级别的定义。
//    在项目中，@Transactional(rollbackFor=Exception.class)，如果类加了这个注解，那么这个类里面的方法抛出异常，
//        就会回滚，数据库里面的数据也会回滚。
//    在@Transactional注解中如果不配置rollbackFor属性,那么事物只会在遇到RuntimeException的时候才会回滚,
//        加上rollbackFor=Exception.class,可以让事物在遇到非运行时异常时也回滚

//    @Transactional注解的全部属性详解:

//    属性                   类型                                 描述
//    value                  String 	                             可选的限定描述符，指定使用的事务管理器
//    propagation         	  enum: Propagation                    可选的事务传播行为设置
//    isolation 	            enum: Isolation                      可选的事务隔离级别设置
//    readOnly 	             boolean              	               读写或只读事务，默认读写
//    timeout 	              int (in seconds granularity) 	       事务超时时间设置
//    rollbackFor 	          Class对象数组，必须继承自Throwable 	   导致事务回滚的异常类数组
//    rollbackForClassName  	类名数组，必须继承自Throwable 	        导致事务回滚的异常类名字数组
//    noRollbackFor 	        Class对象数组，必须继承自Throwable    	不会导致事务回滚的异常类数组
//    noRollbackForClassName 类名数组，必须继承自Throwable 	        不会导致事务回滚的异常类名字数组

//总结另一篇：
//    Spring团队的建议是你在具体的类（或类的方法）上使用 @Transactional 注解
//    不要在实现 接口的接口上写，意思是写到具体的实现类头上，这个注解 没有继承这说
//
//    @Transactional 注解标识的方法，处理过程尽量的简单。尤其是带锁的事务方法，能不放在事务里面的最好不要放在事务里面。
//    查询操作 不需要事务，所以 常规的数据库查询操作放在事务前面进行
//    而事务内进行增、删、改、加锁查询等操作。

//总结另一篇：
//    可查的异常（checked exceptions）:Exception下除了RuntimeException外的异常
//    不可查的异常（unchecked exceptions）:RuntimeException及其子类和错误（Error）


//    Java运行时异常和非运行时异常
//    https://blog.csdn.net/weixin_39973810/article/details/90762690

    //额外的补充总结：
//    3.Error
    //一般是指java虚拟机相关的问题，如系统崩溃、虚拟机出错误、动态链接失败等，这种错误无法恢复或不可能捕获，
    //      将导致应用程序中断，通常应用程序无法处理这些错误，因此应用程序不应该捕获Error对象，
    //      也无须在其throws子句中声明该方法抛出任何Error或其子类。

    //除了RuntimeException及其子类以外，其他的Exception类及其子类都属于可查异常。
    //可查异常 在一定程度上它的发生是可以预计的，编译器要求必须处置的异常，要么用try-catch语句捕获它，
    //      要么用throws子句声明抛出它，否则编译不会通过。
    //不可查异常(编译器不要求强制处置的异常):包括运行时异常（RuntimeException与其子类）和错误（Error）。


    //throw 异常 的  处理 机制
//    如果使用throw在方法体中抛出可查异常，则需要在方法头部声明方法可能抛出的异常类型。程序会在throw语句后立即终止，它后面的语句执行不到，然后在包含它的所有try块中（可能在上层调用函数中）从里向外寻找含有与其匹配的catch子句的try块。

//    5. 运行时异常和非运行时异常
//     (1)运行时异常都是RuntimeException类及其子类异常，如NullPointerException、IndexOutOfBoundsException等，这些异常是不检查异常，程序中可以选择捕获处理，也可以不处理。
//    这些异常一般是由程序逻辑错误引起的，应该从逻辑角度尽可能避免
//    我们从来没有人去处理过NullPointerException异常，它就是运行时异常，并且这种异常还是最常见的异常之一。


//    出现运行时异常后，如果没有捕获处理这个异常（即没有catch），系统会把异常一直往上层抛，一直到最上层，如果是多线程就由Thread.run()抛出，如果是单线程就被main()抛出。抛出之后，如果是线程，这个线程也就退出了。如果是主程序抛出的异常，那么这整个程序也就退出了。运行时异常是Exception的子类，也有一般异常的特点，是可以被catch块处理的。只不过往往我们不对他处理罢了。也就是说，你如果不对运行时异常进行处理，那么出现运行时异常之后，要么是线程中止，要么是主程序终止。
//    如果不想终止，则必须捕获所有的运行时异常，决不让这个处理线程退出。队列里面出现异常数据了，正常的处理应该是把异常数据舍弃，然后记录日志。不应该由于异常数据而影响下面对正常数据的处理。

//    (2)非运行时异常是RuntimeException以外的异常，类型上都属于Exception类及其子类。
//    如IOException、SQLException等以及用户自定义的Exception异常。对于这种异常，
//    JAVA编译器强制要求我们必需对出现的这些异常进行catch并处理，否则程序就不能编译通过.
//    只能自己去写一大堆catch块去处理可能的异常。


//补充：
//    常见RuntimeException:
//
//    ArrayStoreException 试图将错误类型的对象存储到一个对象数组时抛出的异常
//    ClassCastException 试图将对象强制转换为不是实例的子类时，抛出该异常
//    IllegalArgumentException 抛出的异常表明向方法传递了一个不合法或不正确的参数
//    IndexOutOfBoundsException 指示某排序索引（例如对数组、字符串或向量的排序）超出范围时抛出
//    NoSuchElementException 表明枚举中没有更多的元素
//    NullPointerException 当应用程序试图在需要对象的地方使用 null 时，抛出该异常



}


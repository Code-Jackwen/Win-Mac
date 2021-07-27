package com.nyist.xu.javabasetest.pojo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-20 14:11
 **/
public class LogConfigure {

//    1. static Level DEBUG : 调试、详细。
//    2. static Level INFO 粗略、运行过程、

//    3. static Level WARN     不咋用
//    WARN level表明会出现潜在错误的情形。

//    4. static Level ERROR
//    ERROR level指出虽然发生错误事件，但仍然不影响系统的继续运行。一般异常处理、ERROR

//    打印级别：ALL > TRACE > FATAL > DEBUG > INFO > WARN > ERROR > OFF

//    输出级别：TRACE > DEBUG > INFO > WARN > ERROR


//    SpringBoot（3）日志详解
//
//    SpringBoot底层是使用slf4j+logback的方式进行日志记录
//    并且SpringBoot也把其他的日志都替换成了slf4j；详细的可以去参照
//    首先对于SpringBoot的日志，SpringBoot一开始就帮我们创建好了日志，不需要自己进行配置，只需要使用即可
//
//    关于使用：
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void loggingTest(){

        /**
         * 日志的级别由低到高
         * 可以调整日志的级别，日志的输出默认输出当前级别及更高的级别
         */
        logger.debug("这是debug日志。。。");  //跟踪日志
        logger.trace("这是trace日志。。。");
        //SpringBoot默认的是info级别的
        logger.info("这是info日志。。。");  //自定义的
        logger.warn("这是warn日志");
        logger.error("这是error日志");
    }

//    然后在配置文件中进行如下配置：
//    logging.level.com.demo.springbootdemo02= trace;
//    #logging.path=c://springBoot.log;
//     # 可以指定完整的路径；
//
//    logging.path=/spring/log
//    #  在控制台输出的日志的格式
//    # 指定文件中日志输出的格式
//    # 不指定路径在当前项目下生成springboot.log日志
//    #logging.file=G:/springboot.log
//    # 在当前磁盘的根路径下创建spring文件夹和里面的log文件夹；使用 spring.log 作为默认文件
//
//    #  在控制台输出的日志的格式
//    logging.pattern.console=%d{yyyy-MM-dd} [%thread] %-5level %logger{50} - %msg%n
//    # 指定文件中日志输出的格式
//    logging.pattern.file=%d{yyyy-MM-dd} === [%thread] === %-5level === %logger{50} ==== %msg%n
//     关于日志的输出格式问题
//    日志输出格式：
//     %d表示日期时间，
//     %thread表示线程名，
//     %-5level：级别从左显示5个字符宽度
//     %logger{50} 表示logger名字最长50个字符，否则按照句点分割。
//     %msg：日志消息，
//     %n是换行符
//     %d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{50} - %msg%n


//    在application.yml/application.xml中的一般配置
//
//    logging.config=    日志配置文件的位置。例如，classpath:logback.xml。
//    logging.exception-conversion-word=%wEx    转换异常时使用的转换字。
//    logging.file=    设置保存日志的日志文件
//    logging.file.max-history=90    历史日志保存的最大天数
//    logging.file.max-size=10MB    设置日志文件最大大小
//    logging.level.*=    设置日志等级
//    logging.path=    日志文件的位置，例如/var/log
//    logging.pattern.console=    定义打印的日志格式
//    logging.pattern.dateformat=yyyy-MM-dd HH:mm:ss.SSS    设置日志日期格式
//    logging.pattern.file=    定义输出到日志文件的日志格式
//    logging.register-shutdown-hook=false    当初始化日志系统时，为其注册一个关闭钩子。

//    ------------------------------------------------------------------------------------------
//    日志的配置
//    日志可以通过两种方法配置，
//    一种是  application.yml配置，
//    一种是  lobback-spring.xml配置
//
//    3.1 application.yml配置，
//    这种配置方法 配置项较少，一般有以下属性配置

//    1.*** 配置输出格式 为  时间  -  消息  换行
//    logging:
//    pattern:
//    console: "%d - %msg%n"


//    2.*** 配置日志输出位置 比如磁盘 e盘

//    logging:
//    pattern:
//    console: "%d - %msg%n"
//    path: e:/
//
//    运行后，我们可以看到 在 e盘下生成了一个文件  spring.log  这文件是spring生成的

//    3.*** 配置日志输出文件 ，这样可以指定日志输出到哪个位置

//    logging:
//    pattern:
//    console: "%d - %msg%n"
//    path: e:/
//    file: e:/sell.log

//    可以看到 在e盘下生成了以下文件sell.log

//    注意：我们可以配置日志保存位置，以及具体输出的文件，如果同时配置的话，会使用我们指定的file为主

//    4.*** 配置日志 输出级别
//    日志一般主要看重的有5个级别，优先级如 DEBUG<INFO<WARN<ERROR<FATAL等，而springboot默认配置
//    是 INFO级别，所以 我们测试代码中写了三行，在结果中我们只看到了 info 和 error的 因为 debug优先级比info低，所以我们
//    看不到。那么我们配置一下格式 logging.level.包名或类名: 级别 即可， 举例如下

//    DEBUG<INFO<WARN<ERROR<FATAL 配置显示的优先级。

//    logging:
//    pattern:
//    console: "%d - %msg%n"
//     #path: e:/
//    file: e:/sell.log
//    level:
//     #这里可以是包名也可以是类名
//    com.lonely: debug

//    运行后，我们可以看到 原来只能看到 info 和 error 的，现在的debug也可以看到

//    3.2 lobback-spring.xml 配置 ----------------------------------------------------------------------没在学


}

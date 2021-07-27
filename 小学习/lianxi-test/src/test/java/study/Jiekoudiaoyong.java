package study;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-28 17:08
 **/
public class Jiekoudiaoyong implements Jiekou{

    //接口调用
    static int q ;

    static Jiekoudiaoyong jiekoudiaoyong =new Jiekoudiaoyong();
    @Override
    public int moren(int b) {
        return b+10;
    }

    public static void main(String[] args) {
        System.out.println(Jiekou.jingtai(0));
        System.out.println(jiekoudiaoyong.moren(10));

        System.out.println(q);
    }
    //jdk8 接口可以有默认修饰的实现好的方法、可以有共有静态实现好的方法
    //jkk9 接口可以有私有实现好的方法，和私有静态方法。

//    AbstractQueuedSynchronizer
//    CyclicBarrier
//    Semaphore
//    ReentrantReadWriteLock

//    AfterReturningAdviceInterceptor
//    FileInputStream

//FileInputStream   extends InputStream
//InputStreamReader extends Reader
//    BufferedReader    extends Reader

}

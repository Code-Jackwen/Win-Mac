package ever;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-30 20:57
 **/
public class Singleton {

    private Singleton(){}

    private static class InnerClass{
        private static final Singleton single = new Singleton();
    }

    public static Singleton getSingleton(){
        return InnerClass.single;
    }
    public static void main(String[] args) {
        Singleton singleton = getSingleton();
        Singleton singleton1 = getSingleton();
        System.out.println(singleton==singleton1);//true
    }

}

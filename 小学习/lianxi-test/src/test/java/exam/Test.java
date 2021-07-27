package exam;

import java.util.HashMap;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-05 16:41
 **/
public class Test {
    //    ArrayList
//    LinkedList
//    ReentrantReadWriteLock
//    ReentrantLock
    public static void main(String[] args) {
//        String s5 = "bbb";
//        String s6 = "bbb";
//        System.out.println(s5 == s6);  // true
//        Number
//        String asdas = "asdas";


//        List<Object> objectList = null;
//        List<String> stringList= null;
//        boolean add = objectList.add(s5);
//        Object o =new Object();
//        boolean add1 = stringList.add((String) o);
//        objectList = stringList;

        HashMap map =new HashMap<>();
        char myChar ='g';
        String myStr =Character.toString(myChar);
        System.out.println(myStr);

        myStr=String.valueOf(myChar);
        System.out.println(myStr);

    }
}

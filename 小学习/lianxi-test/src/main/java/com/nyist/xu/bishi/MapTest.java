package com.nyist.xu.bishi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-20 19:14
 **/
public class MapTest {

//        System.out.print(Integer.MAX_VALUE*2);//-2
//        System.out.print(Integer.MIN_VALUE*2);//0

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("8", 9);
        map.put("2", 3);
        map.put("4", 5);
        map.put("1", 2);

        Set set1 = map.keySet();

        Iterator<String> it = set1.iterator();
        while (it.hasNext()){
            String key = it.next();
            //3.通过Map集合中的方法get(key),通过key找到value
            Integer value = (Integer) map.get(key);
            System.out.println(key+"="+value);
        }


        System.out.println(map);//{1=1, 2=2, 4=4, 8=8}

//        Set set = new HashSet();
//        set.add(3);
//        set.add(1);
//        set.add(5);
//        set.add(2);
//        System.out.println(set);//[1, 2, 3, 5]
//        for (Object o : set) {
//            System.out.print(o);//1235
//        }


    }
}



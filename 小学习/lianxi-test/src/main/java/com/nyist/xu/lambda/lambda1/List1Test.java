package com.nyist.xu.lambda.lambda1;

import com.nyist.xu.service.lambda1.Item;

import java.util.ArrayList;
import java.util.Collections;
/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2019-12-25 21:42
 **/
public class List1Test {

    //报错 无语。别的idea项目可以 ----得放到方法里，不然 识别不了、

    //遍历集合:
    //可以调用集合的 public void forEach(Consumer<? super E> action) 方法，
    //通过 lambda 表达式的方式遍历集合中的元素。以下是 Consumer 接口的方法以及遍历集合的操作。
    //Consumer 接口是 jdk 为我们提供的一个函数式接口。

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1,2,3,4,5);

        //lambda表达式 方法引用
        list.forEach(System.out::println);

        list.forEach(element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        });

        //删除集合中的某个元素:
        //我们通过public boolean removeIf(Predicate<? super E> filter)方法来删除集合中的某个元素，
        //Predicate 也是 jdk 为我们提供的一个函数式接口，可以简化程序的编写。

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(11, "小牙刷", 12.05 ));
        items.add(new Item(5, "日本马桶盖", 999.05 ));
        items.add(new Item(7, "格力空调", 888.88 ));
        items.add(new Item(17, "肥皂", 2.00 ));
        items.add(new Item(9, "冰箱", 4200.00 ));

        //getId 报错。
//        items.removeIf(ele -> ele.getId() == 7);

        //通过 foreach 遍历，查看是否已经删除
        items.forEach(System.out::println);

        //以前我们若要为集合内的元素排序，就必须调用 sort 方法，
        //传入比较器匿名内部类重写 compare 方法
        //现在
        //排序
        ArrayList<Item> list1 = new ArrayList<>();
        list1.add(new Item(13, "背心", 7.80));
        list1.add(new Item(11, "半袖", 37.80));
        list1.add(new Item(14, "风衣", 139.80));
        list1.add(new Item(12, "秋裤", 55.33));

        /*
        list.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getId()  - o2.getId();
            }
        });
        */

//        list.sort((o1, o2) -> o1.getId() - o2.getId());

        System.out.println(list);

    }
}

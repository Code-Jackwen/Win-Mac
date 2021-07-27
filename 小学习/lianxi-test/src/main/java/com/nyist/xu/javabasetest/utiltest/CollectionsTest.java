package com.nyist.xu.javabasetest.utiltest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-14 21:50
 **/
//https://blog.csdn.net/a1439775520/article/details/95373159
public class CollectionsTest {
    //二刷总结----------------------------------------------------------------------------------
    //排序操作（主要针对List接口相关）
    //reverse(List list)：反转指定List集合中元素的顺序
    //shuffle(List list)：对List中的元素进行随机排序（洗牌）
    //sort(List list)：对List里的元素根据自然升序排序
    //sort(List list, Comparator c)：自定义比较器进行排序
    //swap(List list, int i, int j)：将指定List集合中i处元素和j出元素进行交换
    //rotate(List list, int distance)：将所有元素向右移位指定长度，如果distance等于size那么结果不变
    //2. 查找和替换（主要针对Collection接口相关）
    //binarySearch(List list, Object key)：使用二分搜索法，以获得指定对象在List中的索引，前提是集合已经排序
    //max(Collection coll)：返回最大元素
    //max(Collection coll, Comparator comp)：根据自定义比较器，返回最大元素
    //min(Collection coll)：返回最小元素
    //min(Collection coll, Comparator comp)：根据自定义比较器，返回最小元素
    //fill(List list, Object obj)：使用指定对象填充
    //frequency(Collection Object o)：返回指定集合中指定对象出现的次数
    //replaceAll(List list, Object old, Object new)：替换

    //3. 同步控制
    //多个synchronizedXxx方法：这只是了解，用法很深
    // synchronizedSet、synchronizedSortedSet、synchronizedMap、synchronizedSortedMap、synchronizedList

    //4.设置不可变集合
    //Collections有三类方法可返回一个不可变集合：
    //emptyXxx()：返回一个空的不可变的集合对象
    //singletonXxx()：返回一个只包含指定对象的，不可变的集合对象。
    //unmodifiableXxx(Collection<? extends T>)：返回指定集合对象的不可变视图  再次添加 add()，报错。

    //5.其它
    //disjoint(Collection<?> c1, Collection<?> c2) - 如果两个指定 collection 中没有相同的元素，则返回 true。

    //addAll(Collection<? super T> c, T… a) 添加元素，(可变长参数)到 collection 中
    //addAll例子：Collections.addAll(list1, “Peaches 'n Plutonium”, “Rocky Racoon”);

    //返回一个比较器, 该比较器是 传入比较器的 顺序反转。
    //Comparator reverseOrder(Comparator cmp)

    //一刷总结----------------------------------------------------------------------------------
    //Collections
    //1、sort()排序
    //运行结果为：   [l, o, v, e]
    //              [e, l, o, v]

    //2.reverse()
    //[one, two, three, four, five, six, siven]
    //[siven, six, five, four, three, two, one]

    //3.shuffle(Collection)  洗牌的意思，随机排序
    // [l, v, e, o]
    // [o, v, e, l]

    //4.fill(List list,Object o)方法的使用(含义：用对象o替换集合list中的所有元素)
    //Collections.fill(m, "青鸟52T25小龙");
    //运行结果为：
    // [one, two, three, four, five, six, siven]
    // [青鸟52T25小龙, 青鸟52T25小龙, 青鸟52T25小龙, 青鸟52T25小龙, 青鸟52T25小龙, 青鸟52T25小龙, 青鸟52T25小龙]

    //5.copy(List m,List n) (含义：将集合n中的元素全部复制到m中,并且覆盖相应索引的元素)。
    //m：[one, two, three, four, five, six, siven]
    //n:[我, 是, 复制过来的哈]
    //结果：[我, 是, 复制过来的哈, four, five, six, siven]

    //6.min(Collection),min(Collection,Comparator)方法的使用(前者采用Collection内含自然比较法，后者采用Comparator进行比较)。
    //7.max(Collection),max(Collection,Comparator)方法的使用(前者采用Collection内含自然比较法，后者采用Comparator进行比较)。
    //[l, o, v, e]
    //e
    //[l, o, v, e]
    //v

    //8.indexOfSubList(List list,List subList) 查找subList在list中首次出现位置的索引，没有就返回-1
    //9.lastIndexOfSubList(List source,List target) 使用与上例方法的使用相同

    //10.rotate(List list,int m)旋转的 意思 (含义：集合中的元素向后移m个位置，在后面被遮盖的元素循环到前面来)。
    //移动列表中的元素，负数向左移动，正数向右移动
    //输入 +1         曾经考过算法题
    //[1, 2, 3, 4, 5]
    //[5, 1, 2, 3, 4]

    //11.swap(List list,int i,int j)方法的使用(含义：交换集合中指定元素索引的位置)
    //传递的 数组下标！

    //12.binarySearch(Collection,Object) 返回所查找元素的索引
    //13.replaceAll(List list,Object old,Object new)

    //14.frequency(Collection c,Object o)：返回指定集合中指定对象出现的次数


    //补充：java中两个list集合取并集，交集和差集的方法
    //https://blog.csdn.net/weixin_43596905/article/details/106003137
//    <dependency>
//    <groupId>org.apache.commons</groupId>
//    <artifactId>commons-collections4</artifactId>
//    <version>4.1</version>
//    </dependency>


    public static void main(String[] args){
//        List list = Arrays.asList("one two three four five six siven".split(" "));
//        System.out.println(list);
//        Collections.reverse(list);
//        Collections.sort(list);//用的是Comparator的默认排序
//        System.out.println(list);

//        8.indexOfSubList(List list,List subList) 查找subList在list中首次出现位置的索引
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7, 3));
        ArrayList<Integer> targetList = new ArrayList<>(Arrays.asList(3,4));//3,6返回-1 而3,4返回2
        System.out.println(Collections.indexOfSubList(intList, targetList));
        System.out.println(Collections.frequency(intList, 6));

//        Arrays

    }

}

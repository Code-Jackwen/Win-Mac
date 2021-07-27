package com.nyist.xu.javabasetest.CollectionFramework;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-17 12:25
 **/
//总结来自
//https://www.cnblogs.com/cangqinglang/p/11571789.html
public class TreeMapTest {

    //补充
    //TreeMap 的方法 map.pollLastEntry();相当于大小堆的用法。剔除最后一个，默认也就是剔除Key数值最大的键值对。

    //map.getOrDefault(num, 0)：Map 的方法 返回原有值，如果没有key对应的值就返回0
    //常常和put连用，完成添加Key时候为Key弄上默认值
    //map.put(num, map.getOrDefault(num, 0) + 1);

    public static void main(String[] args) {
        //TreeMap中的元素默认按照keys的自然排序排列 （
        //          对Integer来说，其自然排序就是数字的升序；
        //          对String来说，其自然排序就是按照字母表排序

        //TreeMap不允许null键      HashMap可以有null键
        //TreeMap要使用Comparable或Comparator 比较key。


        //一、常用构造函数
        //1、普通默认排序方式的Treemap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        //2、传入Comparator排序方式的Treemap
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");
        System.out.println(map); // {5=val, 4=val, 3=val, 2=val, 1=val}
        //3、根据已有的的普通 Map map 创建
        TreeMap<Integer, String> treeMap1 = new TreeMap<>(map);

        //二、添加
        //V put(K key, V value)//也可以用来修改 对应键的值。就是覆盖
        //V putAll(Map map)：将指定map放入该TreeMap中

        //三、删除
        //V remove(Object key)：根据key删除映射
        //void clear()：清空

        //四、修改
        //V replace(K key, V value)根据key替换
        //boolean replace(K key, V oldValue, V newValue)应该是先判断oldValue，如果是再用newValue替代

        //五、查找
        //v get(K key)：返回指定key对应的value
        //boolean containsKey(Object key)：判断key
        //boolean containsValue(Object value)：判断value
        //Map.Entry<K, V> firstEntry()：返回该第一个（最小的）映射
        //Map.Entry<K, V> lastEntry()：返回该最后一个（最大的）映射
        //K firstKey()：返回第一个（最小的）映射的key
        //K lastKey()：返回最后一个（最大的）映射的key

        //SortedMap<K, V>  headMap(K toKey)：返回该TreeMap中严格 小于指定key的映射集合      小于K
        //SortedMap<K, V>  subMap(K fromKey, K toKey)：返回[aK ,bK )映射集合（大于等于fromKey，小于toKey）

        //六、遍历相关
        //Set<Map<K, V>> entrySet()：映射集合的Set对象
        //Collection<V> values()：返回values集合
        //void forEach(BiConsumer<? super K,? super V> action)：对该TreeMap中的每一个映射执行指定操作
        //例如：treeMap.forEach((integer, s) -> System.out.println(integer + "->" + s));

        //七、其他方法
        //Object clone()：返回TreeMap实例的浅拷贝
        //Comparator<? super K> comparator()：返回当前keys排序的comparator，若为自然排序则返回null
        //int size()：映射数量
    }
}

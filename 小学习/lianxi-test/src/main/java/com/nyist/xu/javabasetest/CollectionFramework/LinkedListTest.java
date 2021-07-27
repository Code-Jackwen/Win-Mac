package com.nyist.xu.javabasetest.CollectionFramework;

import java.util.LinkedList;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-28 11:28
 **/
public class LinkedListTest {
    //https://blog.csdn.net/sinat_36246371/article/details/53709625

    //https://www.runoob.com/java/java-linkedlist.html

    LinkedList ll  =new LinkedList();
    //remove 的3个方法：
    //remove()就是removeFirst，remove(int a)就是下标遍历删除，remove(Object a) 就是遍历移除首次出现的相等的。
    //public E remove() {
    //     return removeFirst();
    //}

    //public int indexOf(Object o)	查找指定元素从前往后第一次出现的索引。
    //public int lastIndexOf(Object o)	查找指定元素最后一次出现的索引。


    //push、pop、poll
    //void push(E e)：与addFirst一样，实际上它就是addFirst；
    //E pop()：与removeFirst一样，实际上它就是removeFirst；
    //E poll()：查询并移除第一个元素；

    //如果链表为空的时候，看看poll与pop是啥区别：
    //可以看出poll返回null，而pop则产生异常。

}

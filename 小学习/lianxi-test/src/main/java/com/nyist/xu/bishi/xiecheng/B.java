package com.nyist.xu.bishi.xiecheng;

import java.util.*;


/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-23 16:51
 **/
public class B {
    //设计一个数据结构，实现LRU Cache的功能(Least Recently Used – 最近最少使用缓存)。它支持如下2个操作： get 和 put。
    //
    //int get(int key) – 如果key已存在，则返回key对应的值value（始终大于0）；如果key不存在，则返回-1。
    //void put(int key, int value) – 如果key不存在，将value插入；如果key已存在，则使用value替换原先已经存在的值。如果容量达到了限制，LRU Cache需要在插入新元素之前，将最近最少使用的元素删除。
    //
    //请特别注意“使用”的定义：新插入或获取key视为被使用一次；而将已经存在的值替换更新，不算被使用。
    //
    //限制：请在O(1)的时间复杂度内完成上述2个操作。

    //输入描述:
    //
    //第一行读入一个整数n，表示LRU Cache的容量限制。 从第二行开始一直到文件末尾，每1行代表1个操作。
    //
    //如果每行的第1个字符是p，则该字符后面会跟随2个整数，表示put操作的key和value。
    //
    //如果每行的第1个字符是g，则该字符后面会跟随1个整数，表示get操作的key。
    //
    //
    //输出描述:
    //
    //按照输入中get操作出现的顺序，按行输出get操作的返回结果。
    //
    //
    //输入例子1:
    //
    //2
    //p 1 1
    //p 2 2
    //g 1
    //p 2 102
    //p 3 3
    //g 1
    //g 2
    //g 3
    //
    //
    //输出例子1:
    //
    //1
    //1
    //-1
    //3
    //
    //
    //例子说明1:
    //
    //2        //Cache容量为2
    //p 1 1    //put(1, 1)
    //p 2 2    //put(2, 2)
    //g 1      //get(1), 返回1
    //p 2 102  //put(2, 102)，更新已存在的key，不算被使用
    //p 3 3    //put(3, 3)，容量超过限制，将最近最少使用的key=2清除
    //g 1      //get(1), 返回1
    //g 2      //get(2), 返回-1
    //g 3      //get(3), 返回3

//    链接：https://www.nowcoder.com/questionTerminal/3da4aeb1c76042f2bc70dbcb94513338
//    来源：牛客网

    //都说这个 时间 复杂度不是O(1)了。
    //有个人说 用LinkedHashMap取巧，我觉的可以。就是  用LinkedHashMap 调顺序模仿这例。

    //LRU 携程 比较经典。
    //过！
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();//第一次回车后这行  执行完毕
        in.nextLine();//这里是为了过滤。
        Map<Integer, Integer> map = new HashMap<>(size);
        LinkedList<Integer> list = new LinkedList<>();
        while (in.hasNextLine()) {
            String[] strings = in.nextLine().split(" ");
            if (strings[0].equals("p")) {
                int key = Integer.parseInt(strings[1]);
                int value = Integer.parseInt(strings[2]);
                if (!map.containsKey(key)) {
                    map.put(key, value);
                    list.addLast(key);//新添加  的弄到集合的末尾
                    if (list.size() > size) {
                        map.remove(list.removeFirst());//123        231
                    }
                } else {
                    map.put(key, value);
                }
            } else {
                int key = Integer.parseInt(strings[1]);
                if (!map.containsKey(key)) {
                    System.out.println(-1);
                    continue;
                } else {
                    System.out.println(map.get(key));
                }
                //每次取 不管取没取到，把取的键 从集合中移除，重新加到集合 的末尾。
                Iterator<Integer> iterator = list.iterator();
                while (iterator.hasNext()) {
                    if (key == iterator.next()) {
                        iterator.remove();
                    }
                }
                list.addLast(key);//新查询的弄到集合的末尾

            }
//            System.out.println(list);
        }
        in.close();
    }
}

/*
2
p 1 1
p 2 2
g 1
p 2 102   覆盖

p 3 3     溢出
g 1
g 2
g 3
----
3
p 1 1
p 2 2
p 3 3
g 1
g 1
g 1
g 2
g 3

p 2 102   覆盖

p 3 3     溢出   看删除的谁。删除的2

g 1
g 2
g 3
 */


//java指针大佬写的 ，不太懂。
//链接：https://www.nowcoder.com/questionTerminal/3da4aeb1c76042f2bc70dbcb94513338
//来源：牛客网
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public clas***ain{
//    private class Node {
//        Node next, prev;
//        int key, value;
//
//        Node (){}
//        Node(int key, int value) {
//            this.value = value;
//            this.key = key;
//        }
//    }
//
//    private Node head, tail;
//    private Map<Integer, Node> map;
//    private int count, capacity;
//
//    private void addNode(Node node) {
//        Node old = head.next;
//        head.next = node;
//        node.prev = head;
//        node.next = old;
//        old.prev = node;
//    }
//
//    private void removeNode(Node node) {
//        Node previous = node.prev;
//        previous.next = node.next;
//        node.next.prev = previous;
//    }
//
//    private void moveToHead(Node node) {
//        removeNode(node);
//        addNode(node);
//    }
//
//    private Node popTail() {
//        Node pre = tail.prev;
//        removeNode(pre);
//        return pre;
//    }
//
//    public Main(int capacity) {
//        this.capacity = capacity;
//        this.count = 0;
//        map = new HashMap<>();
//        head = new Node();
//        tail = new Node();
//        head.next = tail;
//        tail.prev = head;
//    }
//
//    public int get(int key) {
//        Node node = map.get(key);
//        if (node == null) return -1;
//        moveToHead(node);
//        return node.value;
//    }
//
//    public void put(int key, int value) {
//        Node node = map.get(key);
//        if (node == null) {
//            if (count == capacity) {
//                map.remove(popTail().key);
//                --count;
//            }
//            Node fresh = new Node(key, value);
//            map.put(key, fresh);
//            addNode(fresh);
//            count++;
//        } else {
//            node.value = value;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int capacity = Integer.valueOf(scanner.nextLine().trim());
//        Main instance = new Main(capacity);
//        while (scanner.hasNextLine()) {
//            String command = scanner.nextLine().trim();
//            if (capacity >0 && command.charAt(0) == 'p') {
//                int key = Integer.valueOf(command.substring(2, command.lastIndexOf(" ")));
//                int value = Integer.valueOf(command.substring(command.lastIndexOf(" ")+1));
//                instance.put(key, value);
//            }else if(command.charAt(0) == 'g') {
//                if (capacity <= 0) {
//                    System.out.println(-1);
//                }else {
//                    int key = Integer.valueOf(command.substring(2));
//                    System.out.println(instance.get(key));
//                }
//            }
//        }
//    }
//}

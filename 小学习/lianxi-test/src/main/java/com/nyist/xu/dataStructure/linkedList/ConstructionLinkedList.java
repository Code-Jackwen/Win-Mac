package com.nyist.xu.dataStructure.linkedList;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-10 13:45
 **/
public class ConstructionLinkedList {
    //https://blog.csdn.net/joob000/article/details/81196165
//    这里可以比较一下两种方法的不同：
    //头插 往左，尾插剪头往右（指针向右移动）。我这么记忆
//    头插法：操作新节点，新节点指向 头（老节点） 尾插法：操作老节点，老节点指向新节点
//     if(header==null){                      if(header==null){
//        header=newnode;                         header=tailer=newnode;
//    }else{                                  }else{
//        //将新节点连接到链表的头部              //将新节点连接到链表的尾部
//        newnode.next=header;                tailer.next=newnode;
//        //header永远存储第一个节点的地址      //tailer永远存储最后一个节点的地址
//        header=newnode;                     tailer=newnode;
//    }                                       }

    //头插不需要额外记录头，尾插需要，不然头会丢

    //头插法先操作修改新来的节点
    //尾插法实际操作是上一个已经连好老的节点

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("尾插");   //自带遍历 traverse
        Tail(arr);
        System.out.println();
        System.out.println("头插");
        Head(arr);
    }

    private static void Head(int[] arr) {
//    头插法： 头插法的实现相对简单 思路是将新形成的节点的下一个赋值为header
//    再把新形成的节点地址传给header即将header向前移动
        ListNode head = null;
        for (int i = 0; i < arr.length; i++) {
            ListNode listNode = new ListNode(arr[i]);
            //判断当前链表是否第一次赋值
            if (head == null) {
                head = listNode;
            } else {
                //将新节点连接到链表的头部
                listNode.next = head;
                //header永远存储第一个节点的地址
                head = listNode;
            }
        }
        while (head != null) {
            System.out.print(head.val+"、");
            head = head.next;
        }
    }

    private static void Tail(int[] arr) {
        //尾插法，构建顺序列表
        //尾插法： 尾插法相对于头插法有些许不同 因为要返回头 头不能动 所以需要一个tailer来记录最后一个值 tailer右移
        ListNode tail = null;
        ListNode head = null;
        for (int i = 0; i < arr.length; i++) {
            ListNode listNode = new ListNode(arr[i]);
            if (head == null) {
                head = tail = listNode;//头结点用来记录一下头，就不再动了
            }
            //将新节点连接到链表的尾部
            tail.next = listNode;//操作tail =的老节点指向新节点
            //tailer永远存储最后一个节点的地址
            tail = listNode;//tail 移向新节点
            //这两步结合 移动 节点 ，注意和上一句的先后顺序。


            //我的错误
//            listNode.next=tail;//null    --> 有点是 尾插法.....失败
//            tail=listNode;//存下当前节点
        }
        while (head != null) {
            System.out.print(head.val+"、");
            head = head.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

}

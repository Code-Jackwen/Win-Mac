package com.nyist.xu.algorithm.others;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-17 22:19
 **/
public class AppTimes {
//    用面向对象的方法求出数组中重复 value 的个数，按如下个数输出：
//    1 出现：1 次
//    3 出现：2 次
//    8 出现：3 次
//    2 出现：4 次
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 2, 5, 4, 5, 8, 7, 8, 77, 88, 5, 4, 9, 6, 2, 4, 1, 5};
//        Queue q = new LinkedList();

//        for (int i1 : arr) {
//            int time =0;
//            for (int i2 : arr) {
//                if (i1==i2){
//                    time++;
//                }
//            }
//            System.out.println(i1+"出现了"+time+"次");
//        }

//        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[0]);
//            int time = 0;
//            boolean flag = true;
//            for (int j = 0; j < arr.length; j++) {
//
//                if (arr[i] == arr[j]) {
//                    time++;
//                    if (j > i) {
//                        flag = false;
//                    }
//                }
//            }
//            if (flag) {
//                System.out.println(arr[i] + "出现了" + time + "次");
//            }
//
//        }
//7出现了1次
//8出现了2次
//77出现了1次
//88出现了1次
//9出现了1次
//6出现了1次
//2出现了2次
//4出现了5次
//1出现了3次
//5出现了4次


//1出现了3次
// 4出现了5次
// 1出现了3次
// 4出现了5次
// 2出现了2次
// 5出现了4次
// 4出现了5次
// 5出现了4次
// 8出现了2次
// 7出现了1次
// 8出现了2次
// 77出现了1次
// 88出现了1次
// 5出现了4次
// 4出现了5次
// 9出现了1次
// 6出现了1次
// 2出现了2次
// 4出现了5次
// 1出现了3次
// 5出现了4次

//        //csdn解题方法：
//        //用个map键值对 存储所有数组的值，得到一个 没有重复值的map集合，再用每个不重复的 值  循环遍历数组，
//        // 记录单个值 在数组中出现的次数，再把 次数 存入map中 单个值对应的键中， 得到 可以输出结果的 map集合。
//        int[] arr = {1, 4, 1, 4, 2, 5, 4, 5, 8, 7, 8, 77, 88, 5, 4, 9, 6, 2, 4, 1, 5};
//        System.out.println("arr.length:" + arr.length);
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); //使用map的key来存放所有的不重复的元素
//        for (int i = 0; i < arr.length; i++) {
//            int a = arr[i];
//            if (!map.containsKey(a)) { // 判断Map中是否已包含此元素
//                map.put(a, a);
//            }
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // 取出所有的键值对
//            Integer key = entry.getKey();
//            int num = 0;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == key) {
//                    num++;
//                }
//            }
//            map.put(key, num);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { // 遍历输出
//            Integer key = entry.getKey();
//            Integer value = entry.getValue();
//            System.out.println(key + "出现：" + value + "次");
//        }


    }
}


// ————————————————
// 版权声明：本文为CSDN博主「linmengmeng_1314」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
// 原文链接：https://blog.csdn.net/linmengmeng_1314/article/details/88082155
package com.nyist.xu.bishi.weipinhuipre;

import java.util.*;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-13 16:21
 **/
public class Alogic2 {
    //准备校招唯品会

    //给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中 第k小的元素。
    //请注意，它是排序后的第k小元素，而不是第k个元素。
    //
    //示例:
    //
    //matrix = [
    //   [1,  5,  9],
    //   [10, 11, 13],
    //   [12, 13, 15]
    //],
    //k = 8,
    //
    //返回 13。
    //说明:
    //你可以假设 k 的值永远是有效的, 1 ≤ k ≤ n2 。




    //实际可以 简单sort的...
    /**
     * 运行时间：64ms
     * 占用内存：10520k
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int[] record = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            record[i]=scanner.nextInt();
        }
        Arrays.sort(record);//默认从小到大
        System.out.println(record[k-1]);

        char[] ch ={'1','2','3'};
        String a ="1,2,3,";


        //智商税练习     数组集合排序
//        Integer[] a  = {3,2,1,0};
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
//        list.add(4);
//        list.add(9);
//        //数组 排序
//        //这里 Arrays.sort() 排序的 数组必须 Integer类型
//        Arrays.sort(a, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
//        //集合排序
//        Collections.sort(list,new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return (Integer) o1-(Integer)o2;
//            }
//        });
////        Arrays.stream(a).forEach(System.out::println);
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }


        //数组转换集合        复习+1

        //推荐方法1：
        //Collections的addAll
        //复制，追加，不覆盖。效率比较asList偏低。
        //List<String> list2 = new ArrayList<String>(arrays.length);
        //Collections.addAll(list2, arrays);


        //推荐方法2：（重要，推荐）
        //ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arrays));
        //解析：asList方法

        //方法2的底层（重要）
        //返回的是一个内部类集合， 不能 删除，添加，是基于原先 数组的 视图集合，而set方法的修改List还会影响原来数组的值，set底层去找原数组修改。（视图的特性）
        //说他asList快是 内部类集合，变量引用指向原来数组，大小不变是因为，引用过来的数组大小固定，而本身又没有可以实现改变增删的方法，并没有创建出 新的集合对象进行 复制

        //add 、remove 报错：UnsupportedOperationException
        //直接的asList方法   返回的列表的大小是固定的。事实上，返回的列表不是java.util.ArrayList，
        //而是定义在java.util.Arrays中一个私有静态类。ArrayList本质上是一个数组，
        //而asList()返回的列表是由原始数组支持的固定大小的列表。
        //这种情况下，如果添加或删除列表中的元素，程序会抛出异常UnsupportedOperationExceptio

        //另外
        //spring的utils转换出来的不能  再改变。
        //CollectionUtils.arrayToList(currency);

        //如果我们想让转换为只读的List，name
        //Collections.unmodifiableList()方法来将数组转换为指定List。


        //集合转数组        toArray() 方法传递大小即可
        List<String> testList = new ArrayList<String>(){{add("aa");add("bb");add("cc");}};
        String[] array = testList.toArray(new String[testList.size()]);

        //不能带泛型的就遍历 比如int

    }


    //大佬题目的深化

    //链接：https://www.nowcoder.com/questionTerminal/07b66536f3f94f88908fe598108172d5
    //来源：牛客网
    //如果笔试过程中碰到这个题，又没有数据量和时间限制，肯定怎么方便怎么来，直接sort输出3分钟结束战斗；
    //但是刷题时碰到这种特殊的状况的数据，可以往深了想一想，练一练自己的代码能力；
    //下面我提供两个都AC了的方法供大家参考
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt(),n = sc.nextInt();
//        int data[][] = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                data[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println(findKthNum(data, k));
//        //System.out.println(findKthNum1(data, k));
//    }
//    //方法1，二分套二分，时间复杂度O(n*logn*logn)
//    public static int findKthNum(int[][] matrix, int k) {
//        int row = matrix.length;
//        int col = matrix[0].length;
//        int low = matrix[0][0];
//        int high = matrix[row - 1][col - 1];
//        int mid = 0;
//        int count = 0;
//        while (low <= high) {
//            count = 0;
//            mid = low + ((high - low) >> 1);
//            for (int[] item : matrix) {
//                count += binarySearchCount(item, mid);
//            }
//            if (count < k) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//        //返回的low表示满足count >= k的最小的数，这个数就是要找的第k个数
//        return low;
//    }
//
//    public static int binarySearchCount(int[] data, int k) {
//        int begin = 0, end = data.length - 1;
//        int mid = 0;
//        while (begin <= end) {
//            mid = begin + ((end - begin) >> 1);
//            if (data[mid] <= k) { //这里要加上等于k的
//                begin = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        //全大于、全小于k都是begin，正好对应上了
//        //这里返回的begin表示<=k的数的个数
//        return begin;
//    }



    //方法2，快排思想，把二维压成1维，用partion来找第k大的数，复杂度O(n^2)，对比还是第一种方法复杂度低一些
    //    //但是如果用排序了，对n^2的数据排序复杂度最小为O(n^2*log(n^2))
    //    public static int findKthNum1(int[][] matrix, int k) {
    //        int row = matrix.length;
    //        int col = matrix[0].length;
    //        int[] arr = new int[row * col];
    //        for (int i = 0; i < row; i++) {
    //            for (int j = 0; j < col; j++) {
    //                arr[i * col + j] = matrix[i][j];
    //            }
    //        }
    //        int begin = 0, end = arr.length - 1;
    //        int pos;
    //        while (begin <= end) {
    //            pos = partition(arr, begin, end);
    //            if (pos == k - 1) {
    //                return arr[pos];
    //            } else if (pos > k - 1) {
    //                end = pos - 1;
    //            } else {
    //                begin = pos + 1;
    //            }
    //        }
    //        return 0;
    //    }
    //
    //    public static int partition(int[] arr, int begin, int end) {
    //        int temp = arr[begin];
    //        while (begin < end) {
    //            while (begin < end && arr[end] >= temp) {
    //                end--;
    //            }
    //            swap(arr,begin,end);
    //            while (begin < end && arr[begin] < temp) {
    //                begin++;
    //            }
    //            swap(arr,begin,end);
    //        }
    //        return begin;
    //    }
    //    public static void swap(int[]arr,int i,int j){
    //        if (arr == null || i >= arr.length || j >= arr.length || i < 0 || j < 0) {
    //            return;
    //        }
    //        int temp = arr[i];
    //        arr[i] = arr[j];
    //        arr[j] = temp;
    //    }

}

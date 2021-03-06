package com.nyist.xu.sort.zongjie;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-13 14:10
 **/
public class SortZJ {
// ****九大基础排序总结与对比
//    https://www.cnblogs.com/amiezhang/p/7422064.html

//    各种排序的比较和使用场景分析
//    https://blog.csdn.net/li563868273/article/details/51200876

    //总结：时间等等  排序效率影响相关因素
    //https://www.cnblogs.com/Xieyang-blog/p/8340578.html
    //1、算法复杂度与初始状态无关的有：选择排序、堆排序、归并排序、基数排序。      一堆乌龟选基友。
    //2、元素总比较次数与初始状态无关的有：选择排序、基数排序。
    //3、元素总移动次数与初始状态无关的有：归并排序、基数排序

    //稳定性看 百度百科

//    冒泡

//    插入
//    选择
//    快速
//    堆排序

//    归并
//    希尔


//    桶排序、基数排序


//    插入排序：直接插入排序、二分法插入排序、希尔排序。
//    选择排序：简单选择排序、堆排序。
//    交换排序：冒泡排序、快速排序。
//    归并排序
//    基数排序




//    冒泡排序
//    描述:第一趟:12、23、34、45、。。。。大于交换，不大于不交换。从无序区通过交换，找出最大元素放到有序区的前端。
//            无序区、有序区
//    1号和2号比较49>38，交换
//    结果：38、49、65、97、76、13、27、49
//     2)2号和3号比较49<65，不交换
//    结果：38、49、65、97、76、13、27、49
//     3)3号和4号比较65<97，不交换
//    结果：38、49、65、97、76、13、27、49


//    插入排序
//    描述：双层for循环。
//          有序区和无序区
//           比较的少，换的多。
//    插入13。13<97，所以97向后移动一个位置，继续比较，13>76，所以76向后移动一个位置不需要移动，继续比较，13>65，逐次比较，发现13应插入最前位置
//    结果：{13、38、49、65、76、97}   {、27、49}


//    快速排序
//    描述：轴值，默认选取数组的第一个数字，军训，以某人为中心，大小个排列。
//          小数、基准元素、大数
//    举个栗子（第一趟的排序过程）
//    原始序列：49、38、65、97、76、13、27、49
//              i                         j

//    选择排序：
//    描述：在无序区找一个 最小的元素排 在有序区的 后面
//           对数组：比较的多，换的少
//    1）在进行选择排序过程中分成有序和无序两个部分，开始都是无序序列
//    结果：49、38、65、97、76、13、27、49
//     2）从无序序列中取出最小的元素13，将13同无序序列第一个元素交换，此时产生仅含一个元素的有序序列，无序序列减一
//    结果：{13、}   {38、65、97、76、49、27、49}
//    3）从无序序列中取出最小的元素27，将27同无序序列第一个元素交换，此时产生仅两个元素的有序序列，无序序列减一
//    结果：{13、27、}   {65、97、76、49、38、49}

//    堆排序：
//      描述：


//    归并排序
//    希尔排序：高级的 插入排序
//    桶排序：
//    基数排序：

}

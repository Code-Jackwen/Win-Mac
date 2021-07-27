package com.nyist.xu.bishi.weipinhuipre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-12 20:32
 **/
public class A1 {
    //https://www.nowcoder.com/test/question/done?tid=37420409&qid=296681
    // 唯品会2019秋招开发A类试卷

    //10题
    //输出 170 还是 抛出ArrayIndexOutOfBoundsException异常
    public static void resetList(List<Integer> dataList) {
        //4不越界而5越界
        //而第二个参数
        //可以是索引的 最后一个，也可以是比最后一个索引大1的数，
        //比如数组长度，这两种都算索引的最后一个
        Integer set = dataList.subList(1, 5).set(0, 40);
        dataList = new ArrayList<Integer>(dataList);
        dataList.add(50);
    }

    public static void setOne(List<Integer> dataList) {
        dataList.set(3, 100);
    }

    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, null));
//        List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40,50,60));//10+30 40 +60
        resetList(dataList);//210
        setOne(dataList);
        int sum = 0;
        for (Integer v : dataList) {
            sum += v;
        }
        System.out.println(sum);
    }


    //subList() 获取出的结果是 集合视图
    //lists.subList(2, lists.size()).clear();
    //lists的clear()方法会把sublist截取的集合部分从lists中移除掉。 影响到原来集合。

    //关键是 你不知道清楚方法参数的意思，他用方法参数诱导你。
    //解析

//    关键是这条代码的理解 dataList.subList(2,4).set(0,40);
//    上网找资料也没有找到这样子用的例子
//    subList一看就是找dataList中的下标2到4的部分 但这个下标的部分包括2，不包括4，所以应该是下标2和3的位置
//    获得了这么一个部分后 下一个是set(0,40) 一开始以为是把下标2和3的位置分别设置为0，40 但算出来最终答案是错的
//    后来找了一个set的意思 又思考了一下 set的声明是
//    set(int index, E element)
//    //index -- 替换索引的元素下标
//    //element -- 要被存储在指定位置的元素（即内容）
//    然后我觉得它想表达的意思是 找出下标为2和3之后 下标2在这一【子部分】中就成为了“下标0” 因此是把“下标0”中的30改成40
//    所以该行代码执行后dataList的元素内容为 10，20，40，null
//    由于dataList的声明为List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(10,20,30,null));
//    而asList得到的数组是的没有add和remove方法的，因此在resetList方法中重新声明了dataList = new ArrayList<Integer>(dataList);
//    所以dataList才可以执行add的语句：dataList.add(50);
//    但是重新声明时候是new了一个新的对象，因此这里的add对原来的dataList所指向的对象是不会做任何改变的，而前面的set却不同，是对原来dataList所指向对象的修改，所以resetList方法执行完后原来dataList现在的数据情况为：10，20，40，null
//    再经过setOne方法后，dataList数据情况为：10，20，40，100
//    因此最后sum结果为170



}
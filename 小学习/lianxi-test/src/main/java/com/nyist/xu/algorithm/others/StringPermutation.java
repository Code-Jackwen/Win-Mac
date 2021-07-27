package com.nyist.xu.algorithm.others;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-13 23:55
 **/
//字符串的全排列

    //非递归的 代码行数太多了
public class StringPermutation {
    static int time=1;
    public static void main(String[] args) {
//        char[] charArray = "abcd".toCharArray();
        char[] charArray = "abc".toCharArray();
        getStringPermutations3(charArray,0,charArray.length-1);
    }
    public static void getStringPermutations3(char[] s, int from, int to) {
        if (s != null && to >= from && to < s.length && from >= 0) { // 边界条件检查
            if (from == to) { // 递归终止条件
                System.out.print("、结果");
                System.out.print(s); // 打印结果
                System.out.println(time++);
            } else {
                for (int i = from; i <= to; i++) {
                    System.out.print("交换一之前");
                    System.out.print(s);
                    System.out.print("、");
                    swap(s, i, from); // 交换前缀,作为结果中的第一个元素，然后对剩余的元素全排列
                    System.out.print("交换一："+"i："+i+"与"+"from："+from);
                    System.out.print("、");
                    System.out.print(s);
                    getStringPermutations3(s, from + 1, to); // 递归调用，缩小问题的规模
                    swap(s, i, from); // 换回前缀，复原字符数组 原答案是swap(s, from, i)
                    System.out.print("交换二："+"i："+i+"与"+"from："+from+"     ");
                    System.out.print("、");
                    System.out.print(s);
                }
            }
        }
    }

    public static void swap(char[] s, int from, int to) {
        char temp = s[from];
        s[from] = s[to];
        s[to] = temp;
    }
}
//排列组合A、C知识
// A3(2)指 三个不同的元素中取出两个两两排列（从三个不同的东西中取两个出来排列，即有顺序放置），
// 如：ABC三个字母中取两个字母排列，AB,AC,BC,BA,CA,CB 共六个排列，
// 即，A3(2)=3*2=6之所以是3*2是因为排列分两步，第一步从ABC中取一个，有三种可能，
// 第二步从剩下两个中取一个，有两种可能
//
// C3(2)指从三个不同的东西中取出两个，其中取出的两个不存在顺序。
// 把上面ABC的例子中重复的字母去掉，也就剩下3个:AB,AC,BC
// 即，C3(2)=A3(2)/A2(2)=3要除以A2(2)是因为排列好任意两个元素后，这两个元素内部都存在A2(2)个重复的可能，
// 所以需要整体除以A2(2)尽量以一个文科生的角度写出来了
//
//作者：饮秋
//链接：https://www.zhihu.com/question/36362388/answer/67625921
//来源：知乎
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


//C52=5!/2!*(5-2)!      组合的可能
//A52=5!/(5-2)!         组合加组合内部排序的可能
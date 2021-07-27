package com.nyist.xu.xiaozhao.xiechengbuzhao;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-11-17 19:23
 **/
public class A2 {

    //携程的补录 补招

    //zl 百度找的改变 没做出来        安工zaiyang 有两个

    //计算逻辑表达式的值
    //时间限制： 3000MS
    //内存限制： 589824KB
    //题目描述：
    //计算逻辑表达式的值(优先级顺序：() > ! > && > || )
    //输入描述
    //请输入逻辑表达式。表达式由以下字符串组成： T，F，&&，||，!，(，)，空格
    //T：表示布尔值的 true
    //F：表示布尔值的 false
    //输出描述
    //返回逻辑表达式的结果，有效的结果包括 T，F，E。
    //T：表示逻辑表达式的结果为 true
    //F：表示逻辑表达式的结果为 false
    //E：表示逻辑表达式不正确，不能计算出结果
    //样例输入
    //T || F && F || F
    //! F || T && T
    //T && F
    //样例输出
    //T
    //T
    //F
    //提示
    //请使用栈的方式来实现
    //
    //输入示例（Java）
    //static String calculate(String[] inputs) {
    //
    //}
    //
    //public static void main(String[] args) {
    //	Scanner in = new Scanner(System.in);
    //
    //	String input = in.nextLine();
    //	while (input != null && input.length() > 0) {
    //		String[] inputs = input.trim().split("\\s+");
    //		System.out.println(calculate(inputs));
    //		input = in.nextLine();
    //	}
    //}
    public static void main(String[] args) {
        System.out.println(true|| false && false || false);

    }
}

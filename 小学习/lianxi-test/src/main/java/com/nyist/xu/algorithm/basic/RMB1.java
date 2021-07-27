package com.nyist.xu.algorithm.basic;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-09 17:26
 **/
//人民币大小写转换
//https://www.cnblogs.com/gojava/p/3522492.html
public class RMB1 {
    public static void main(String[] args) {

//        System.out.println(number2CNMoney(100));

        //151121.15
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        double mon= Double.parseDouble(s);
//        System.out.print(number2CNMoney(mon));

//        System.out.println(number2CNMoney(151121.15));
//        System.out.println(number2CNMoney(123151111.00));
//        System.out.println(number2CNMoney(321151111.10));
//        System.out.println(number2CNMoney(345151111.01));
//        System.out.println(number2CNMoney(18.01));

//        System.out.println(number2CNMoney(123456789012.00));//最高12位 壹仟贰佰叁拾肆亿伍仟陆佰柒拾捌万玖仟零壹拾贰元
        //        System.out.println(number2CNMoney(100));
//        System.out.println(number2CNMoney(10000001));//壹仟万零壹元
//        System.out.println(number2CNMoney(10000000));//壹仟万元
//        System.out.println(number2CNMoney(10001000));//壹仟万壹仟元
//        System.out.println(number2CNMoney(10001001));//壹仟万壹仟零壹元
//        System.out.println(number2CNMoney(100000000001.00));//壹仟亿零壹元


        //待处理
        System.out.println(number2CNMoney(0.00));//
        System.out.println(number2CNMoney(0.01));//
        System.out.println(number2CNMoney(0.10));//

//        System.out.println(number2CNMoney(1.00));//壹元       格式并不统一
//        System.out.println(number2CNMoney(1.10));//壹元 零 壹角零分
//        System.out.println(number2CNMoney(1.01));//壹元 零 零角壹分
//        System.out.println(number2CNMoney(10.10));//拾元 零 壹角零分
//        System.out.println(number2CNMoney(20.10));//贰拾元 零 壹角零分
//        System.out.println(number2CNMoney(200.10));//贰佰元 零 壹角零分








    }

    //A80
    public static String number2CNMoney(double money) {
        // write code here      没处理  乱输入的问题
        char[] hunit = {'拾', '佰', '仟'}; // 段内位置表示
        char[] vunit = {'万', '亿'}; // 段名表示
        char[] digit = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        long midVal = (long) (money * 100); // 转化成整形    0.00  0.01  0.10
        String valStr = String.valueOf(midVal); // 转化成字符串

        String head=null;
        String rail=null;
        if(midVal>=100){
             head = valStr.substring(0, valStr.length() - 2); // 取整数部分
             rail = valStr.substring(valStr.length() - 2); // 取小数部分
        }else{
            // 处理  0.00
            if (midVal==0) {
                return "零元零零角零分";
            }
            // 处理  0.01  0.10 =>  1   10
            if(valStr.length()==1){
                return "零元零零角"+digit[valStr.charAt(0) - '0'] + "分";
            }
            if(valStr.length()==2){
                return "零元零"+ digit[valStr.charAt(0) - '0'] + "角" + digit[valStr.charAt(1) - '0'] + "分";
            }

        }

        String prefix = ""; // 整数部分转化的结果
        String suffix = ""; // 小数部分转化的结果
        // 处理小数点后面的数
        if (rail.equals("00")) { // 如果小数部分为0        不再输出格式并不 统一
            suffix = "";//  suffix = "零角零分";
        } else {
            suffix = digit[rail.charAt(0) - '0'] + "角" + digit[rail.charAt(1) - '0'] + "分"; // 否则把角分转化出来
        }
        // 处理小数点前面的数
        char[] chDig = head.toCharArray(); // 把整数部分转化成字符数组
        char zero = '0'; // 标志'0'表示出现过0
        byte zeroSerNum = 0; // 连续出现0的次数
        for (int i = 0; i < chDig.length; i++) {
            // 循环处理每个数字     12345   5-1=4       12得3、     11、10、8得2、      7、6、5、4得1、    3、2、1得0、

            //12位长度
            //vidx=0代表12-0-1    v=2 idx=3;
            //执行第4次11-3：v=2 idx =0

            //执行第9次11-8=3：v=0 idx =3
            int vidx = (chDig.length - i - 1) / 4; // 取段位置  2亿、1万、0个  种段
            // 取段内位置
            //0代表4、8、12  段1         12执行第4次是 8、第8次4     都余数0
            //1代表5、9、
            //2代表2、6、10、
            //3代表3、7、11、
            int idx = (chDig.length - i - 1) % 4;
            if (chDig[i] == '0') { // 当前字符是0
                zeroSerNum++;
                if (zero == '0') { //zero记录前一位
                    zero = digit[0];//zero ="零"
                } else if (idx == 0 && vidx > 0 && zeroSerNum < 4)//zeroSerNum<4 100000000001.00 壹仟亿零壹元
                {
                    prefix += vunit[vidx - 1];//加上 万、亿
                    zero = '0';//段结束，zero重设     1000 '01'00 0001.00
                }
                continue;
            }
            zeroSerNum = 0;
            if (zero != '0') {//当前一位zero ="零"
                prefix += zero;// 加 "零"
                zero = '0';
            }

            prefix += digit[chDig[i] - '0']; // 当前位 转化 汉字
            if (idx > 0)
                prefix += hunit[idx - 1];// 加千、百、十、

            if (idx == 0 && vidx > 0)//vidx =0
            {
                prefix += vunit[vidx - 1]; // 段结束位置应该加上段名         加 万、亿
            }
        }

        if (prefix.length() > 0)
            prefix += "元"; // 如果整数部分存在,则有圆的字样

        if (suffix.length() > 0)
            suffix = "零" + suffix; // 如果整数部分存在,则有圆的字样

        if (prefix.startsWith("壹拾")) {
            prefix = prefix.substring(1);
        }
        return prefix + suffix; // 返回正确表示
    }

    //注释都 是错的。
//    public static String number2CNMoney2(double money) {
//        char[] hunit = {'拾', '佰', '仟'}; // 段内位置表示
//        char[] vunit = {'万', '亿'}; // 段名表示
//        char[] digit = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'}; // 数字表示
//        long midVal = (long) (money * 100); // 转化成整形
//        String valStr = String.valueOf(midVal); // 转化成字符串
//        String head = valStr.substring(0, valStr.length() - 2); // 取整数部分
//        String rail = valStr.substring(valStr.length() - 2); // 取小数部分
//        String prefix = ""; // 整数部分转化的结果
//        String suffix = ""; // 小数部分转化的结果
//        // 处理小数点后面的数
//        if (rail.equals("00")) { // 如果小数部分为0
//            suffix = "";
//        } else {
//            suffix = digit[rail.charAt(0) - '0'] + "角" + digit[rail.charAt(1) - '0'] + "分"; // 否则把角分转化出来
//        }
//        // 处理小数点前面的数
//        char[] chDig = head.toCharArray(); // 把整数部分转化成字符数组
//        char zero = '0'; // 标志'0'表示出现过0
//        byte zeroSerNum = 0; // 连续出现0的次数
//        for (int i = 0; i < chDig.length; i++) {
//            int vidx = (chDig.length - i - 1) / 4; // 取段位置  3千亿、2千万、1千、0  种段
//            int idx = (chDig.length - i - 1) % 4;
//            if (chDig[i] == '0') { // 如果当前字符是0
//                zeroSerNum++; // 连续0次数递增
//                if (zero == '0') { // 标志
//                    zero = digit[0];//zero ="零"
//                } else if (idx == 0 && vidx > 0 && zeroSerNum < 4)//除留余 为0且段大于0且连续0小于4
//                {
//                    prefix += vunit[vidx - 1];//prefix =prefix +段【段值-1】   加上 万、亿
//                    zero = '0';//zero 变为 0
//                }
//                continue;
//            }
//            zeroSerNum = 0; // 连续0次数清零
//            if (zero != '0') { // 如果标志不为0,则加上,例如万,亿什么的
//                prefix += zero;
//                zero = '0';
//            }
//            prefix += digit[chDig[i] - '0']; // 转化该数字表示
//            if (idx > 0)
//                prefix += hunit[idx - 1];// 加千百十
//
//            if (idx == 0 && vidx > 0)//idx段内  vidx段     算出的 123
//            {
//                prefix += vunit[vidx - 1]; // 段结束位置应该加上段名如      万,亿
//            }
//        }
//
//        if (prefix.length() > 0)
//            prefix += "元"; // 如果整数部分存在,则有圆的字样
//
//        if (suffix.length() > 0)
//            suffix = "零" + suffix; // 如果整数部分存在,则有圆的字样
//
//        if (prefix.startsWith("壹拾")) {
//            prefix = prefix.substring(1);
//        }
//        return prefix + suffix; // 返回正确表示
//    }


}

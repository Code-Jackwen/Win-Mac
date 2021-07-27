package com.nyist.xu.bishi.tx2020;

import java.util.Scanner;
import java.util.Stack;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-30 23:17
 **/
public class YasuoDecode {

    //小Q想要给他的朋友发送一个神秘字符串，但是他发现字符串的过于长了，于是小Q发明了一种压缩算法对字符串中重复的部分进行了压缩，对于字符串中连续的m个相同字符串S将会压缩为[m|S](m为一个整数且1<=m<=100)，例如字符串ABCABCABC将会被压缩为[3|ABC]，现在小Q的同学收到了小Q发送过来的字符串，你能帮助他进行解压缩么？
    //HG[3|B[2|CA]]F
    //HGBCACABCACABCACAF

//    链接：https://www.nowcoder.com/questionTerminal/c27561e5b7e0441493adb9a54071888d
//    来源：牛客网

    //String 函数解法
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
//        scanner.close();//保险写法
//        System.out.println(decode(next));
//    }
//
//    public static String decode(String words) {
//        while (words.contains("]")) {//注意这个判断
//            int right = words.indexOf("]");
//            int left = words.lastIndexOf("[", right);//这个很精髓
//            String repeatStr = words.substring(left + 1, right);//我猜函数是 [left + 1, right) 取出的结果是 2|CA
//            String[] split = repeatStr.split("\\|");
//            //下面的 写法 也可用循环吧
//            //HG[2|[2|DD][2|CA]]F 报错空指针
//            words = words.replace("[" + repeatStr + "]",
//             String.join("", Collections.nCopies(Integer.parseInt(split[0]), split[1])));//join函数不晓得
//        }
//        return words;
//    }
    //HG[3|B[2|CA]]F
    //HGBCACABCACABCACAF

    //又一个思路
    //正则表达式解法
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String line = in.next();
//
//        String pattern = "\\[(\\d+)\\|(\\w+)\\]";//这些类，我不懂，但是用的正则。      模板
//        Pattern pc = Pattern.compile(pattern);//一个匹配类吧    根据模板弄出个匹配器
//        Matcher m = pc.matcher(line);//匹配好  用匹配器和目标串 匹配得出结果m
//
//        while (m.find()) {//只要 m 匹配到 的有
//            int num = Integer.valueOf(m.group(1));//1 就是获取压缩的变量的次数
//            String chs = "";
//            for (int i = 0; i < num; i++) {
//                chs += m.group(2);//拼凑 解压缩结果
//            }
//            line = m.replaceFirst(chs);// 读取到的行 的 第一个元素 用解压缩的替换掉
//            m = pc.matcher(line);//重新匹配
//        }
//        System.out.println(line);
//    }


    //md 看不懂
    //这个是用的栈的思想链接：
    //这题考的应该是“栈”这个知识点，碰到过原题，这里给出迭代的写法，栈用LinkedList实现
    //    stack_res用于暂时保存在 ' ] ' 之前记录的结果，保存的形式如[HG],[B],[CA]
    //    mutil_stack保存的是数字，如[3],[2]
    //    在遇到 ' ] ' 时， 从mutil_stack 队尾取出数字N，对当前字符串[CA] 复制N次。
    //    并从stack_res取出上一轮暂存的结果[B]拼接[CA CA]-->[B CACA]

    // public static void main(String[] args) {
    //      Scanner in =new Scanner(System.in);
    //      String str=in.nextLine();
    //      int mutil=0;//乘数
    //      LinkedList stack_res=new LinkedList();//结果暂存
    //      LinkedList mutil_stack=new LinkedList();
    //      StringBuilder temp=new StringBuilder();
    //      for(int i=0;i<str.length();i++) { //toCharArray() 需要O(n)的空间复杂度,不打算使用
    //          if(str.charAt(i)=='[') {
    //              stack_res.addLast(temp.toString());//保存上一次的结果 [HG]
    //              temp=new StringBuilder();//用于接收新的字母[B]
    //          }else if(str.charAt(i)==']') {
    //              StringBuilder temp2=new StringBuilder();
    //              //取出乘数
    //              int num= mutil_stack.removeLast();
    //              for(int j=0;j<num;j++) {
    //                  temp2.append(temp);
    //              }
    //              temp=new StringBuilder(stack_res.removeLast()+temp2);
    //          }else if(str.charAt(i)=='|') {//乘数[3]入栈
    //              mutil_stack.addLast(mutil);
    //              mutil=0;//寻找新的乘数比如[2]
    //          }
    //          else if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
    //              //预防数字出现 [ 19  |a]
    //              mutil=mutil*10+Integer.parseInt(str.charAt(i)+"");
    //          }else {
    //              //正常字母
    //              temp.append(str.charAt(i));
    //          }
    //      }
    //      System.out.print(temp.toString());
    //  }



    //Stack类
    //很神奇 不是太懂 不知道怎么想
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String encodeString = sc.nextLine();
            System.out.println(myDecode(encodeString));
        }

        public static String myDecode(String words){
            Stack<Integer> num_stack = new Stack<>();
            Stack<StringBuilder> str_stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < words.length(); ++i){
                if(words.charAt(i) == '['){             //HG[3|B[2|CA]]F
                    int pos = words.indexOf("|", i);//传的i 是干嘛的。
                    int count = Integer.valueOf(words.substring(i + 1, pos));//存 数
                    num_stack.push(count);//数字压栈
                    str_stack.push(sb);//结果 压栈 HG |B
                    i = pos;//i存下 [ 的坐标
                    sb = new StringBuilder();
                }else if(words.charAt(i) == ']'){
                    int count = num_stack.pop();//取出 数
                    StringBuilder tmp = str_stack.pop();
                    for(int j = 0; j < count; ++j){
                        tmp.append(sb);
                    }
                    sb = tmp;
                }else{
                    sb.append(words.charAt(i));//   |B CA
                }
            }
            return sb.toString();
        }


    //md 看不懂
    //Stack类
    //public static void main(String[] args) {
    //        Scanner scanner = new Scanner(System.in);
    //        String str = scanner.nextLine();
    //        scanner.close();
    //        Stack stack = new Stack();    //存放数字和字符串
    //        StringBuilder temp = new StringBuilder();
    //        int from = 0;
    //        int i = 0;
    //        for (; i < str.length(); i++) {
    //            if (str.charAt(i) == '[') {
    //                if (from < i)    //遇到左中括号，如果中括号之前有未入栈的字符串，则将字符串压入栈中
    //                    if (stack.size() != 0 && stack.peek() instanceof String)
    //                        //如果栈不为空并且栈顶存储的是字符串，则将未入栈的字符串与栈顶字符串合并
    //                        stack.push(stack.pop() + str.substring(from, i));
    //                    else
    //                        stack.push(str.substring(from, i));
    //            } else if (str.charAt(i) == ']') {
    //                if (stack.peek() instanceof String) {
    //                    //如果栈顶为字符串，则取出栈顶字符串和次顶数字
    //                    String str1 = (String) stack.pop();
    //                    Integer count = (Integer) stack.pop();
    //                    for (int j = 0; j < count; j++)
    //                        temp.append(str1 + str.substring(from, i));
    //                } else if (stack.peek() instanceof Integer) {
    //                    //栈顶是数字，取出栈顶数字
    //                    Integer count = (Integer) stack.pop();
    //                    for (int j = 0; j < count; j++)
    //                        temp.append(str.substring(from, i));
    //                }
    //                if (stack.size() > 0 && stack.peek() instanceof String)
    //                    stack.push(stack.pop() + temp.toString());
    //                else
    //                    stack.push(temp.toString());
    //                from = i + 1;
    //                temp.delete(0, temp.length());
    //            } else if (str.charAt(i) > '0' && str.charAt(i) <= '9') {
    //                //当遇到数字，将数字入栈，跳过|，并将from更新
    //                int index = i++;
    //                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9')
    //                    i++;
    //                from = i + 1;
    //                stack.push(Integer.parseInt(str.substring(index, i)));
    //            }
    //        }
    //        if (stack.size() > 0) {
    //            if (from < i) {
    //                System.out.println(stack.pop() + str.substring(from));
    //            } else
    //                System.out.println(stack.pop());
    //        } else {
    //            System.out.println(str);
    //        }
    //    }


    //md 看不懂
    //比较长 用的递归
    //链接：https://www.nowcoder.com/questionTerminal/c27561e5b7e0441493adb9a54071888d
    //来源：牛客网
    //
    // public static void main(String[] args) {
    //        Scanner sc = new Scanner(System.in);
    //        String s = sc.nextLine();
    //        System.out.println(tar(s));
    //    }
    //
    //    // 递归方法
    //    public static String tar(String s) {
    //        // 递归结束的判断，说明全部解压完毕
    //        if (!s.contains("[") && !s.contains("|")) {
    //            return s;
    //        }
    //        // 形如2|cd的变成cdcd
    //        if (!s.contains("[") && s.contains("|")) {
    //            String x[] = s.split("\\|");
    //            int num = Integer.parseInt(x[0]);
    //            StringBuffer sb = new StringBuffer();
    //            for (int i = 0; i < num; i++)
    //                sb.append(x[1]);
    //            return sb.toString();
    //        }
    //        // 上面if都不执行，说明既有[又有|，说明没有递归到最里层
    //        char a[] = s.toCharArray();
    //        // 用来存储完全解压后的字符串
    //        StringBuffer sb = new StringBuffer();
    //        for (int i = 0; i < a.length; i++) {
    //            // 设置栅栏，使得"["与"]"的个数相同，比如HG[3|B[2|CA]]F,会取得[3|B[2|CA]]
    //            int latch = 0;
    //            if (a[i] == '[') {
    //                latch++;
    //                // 指针往前进一位，形如[3|B[2|CA]]，需要得到3|B[2|CA],为了去掉最外面的括号
    //                i++;
    //                if (a[i] == ']') {
    //                    latch--;
    //                }
    //                // 用来存储部分解压的字符串，比如有字符串HG[3|B[2|CA]]F中的,这次while循环结束 s1会变成3|B[2|CA]
    //                // 这里再次进行'['的判断是存在[[]]的情况
    //                StringBuffer s1 = new StringBuffer();
    //                while (!(a[i] == ']' && latch == 0)) {
    //                    if (a[i] == '[') {
    //                        latch++;
    //                    }
    //                    if (a[i] == ']') {
    //                        latch--;
    //                        if (latch == 0) {
    //                            // 说明到了最外层的]了，不进行下面的appen，为了取出最外层的[]
    //                            continue;
    //                        }
    //
    //                    }
    //                    s1.append(a[i]);
    //                    // 指针后移，再次进入while循环
    //                    i++;
    //
    //                }
    //                // 如果有初始字符串HG[3|B[2|CA]]F，此时s1为3|B[2|CA]，去除了一层括号，
    //                String s2 = tar(s1.toString());
    //                // 判断里面还有没有未解压的字符串，有就继续解压，会递归到最里面的2|CA，得到CACA，返回到s2=3|BCACA,再次进行解压
    //                while (s2.contains("|")) {
    //                    s2 = tar(s2);
    //                }
    //                // 将解压完毕的字符串字符串加到sb后面
    //                sb.append(s2);
    //            } else {
    //                // 如果没有进行压缩的字符串，直接加到末尾就行
    //                sb.append(a[i]);
    //
    //            }
    //
    //        }
    //        return sb.toString();
    //
    //    }

}

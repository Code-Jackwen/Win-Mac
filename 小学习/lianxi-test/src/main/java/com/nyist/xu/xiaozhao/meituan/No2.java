package com.nyist.xu.xiaozhao.meituan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-14 10:21
 **/
public class No2 {
    //测试岗
    public static void main(String[] args) {
        //例如 a0125b1c0d00 中包含四个数 0125，1，0，00，
        //按照规则抹掉前导零后，最终这个字符串包含的四个数为 125，1，0，0。即，0125->125，00->0，其中 1 和 0 无前导零，无需变更。
        //48   57
        // He15l154lo87wor7l87d
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] cs = line.toCharArray();
        ArrayList<Long> nums = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {

            if (cs[i] >= 48 && cs[i] <= 57) {
                sb.append(cs[i]);

                if (((i + 1) <= cs.length - 1 && (cs[i + 1] < 48 || cs[i + 1] > 57)) || ((i + 1) == cs.length)) {
                    String s = sb.toString();
                    sb = new StringBuilder();
                    if (s.length() == 1 && s.charAt(0) == 0) {
                        nums.add(new Long(s));
                        continue;
                    }
                    while (s.length() > 1 && s.charAt(0) == 48) {
                        s = s.substring(1, s.length());
                    }
                    nums.add(new Long(s));

                }
            }
        }
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }
}

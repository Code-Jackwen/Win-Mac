package com.nyist.xu.xiaozhao.weizhong20;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-10 13:47
 **/
public class A3 {
    //山东兄弟写个半对
    // public int calculate(String s) {
    //            s = s.trim();
    //            return core(s.toCharArray());
    //        }
    //        private int i = 0;
    //        private int core(char[] cs){
    //            Stack<Integer> stack = new Stack<>();
    //
    //            int num = 0;
    //            char operation = '+';
    //            for (; i < cs.length; i++) {
    //                if(cs[i]==' '){
    //                    continue;
    //                }
    //                if (Character.isDigit(cs[i])) {
    //                    num = num * 10 + (cs[i] - '0');
    //                } else if (cs[i] == '(') {
    //                    i++;
    //                    num = core(cs);
    //                    i++;
    //                } else if (cs[i] == ')') {
    //                    break;
    //                }
    //
    //                if (!Character.isDigit(cs[i]) || i >= cs.length - 1) {
    //                    if (operation == '+') {
    //                        stack.push(num);
    //                    } else if (operation == '-') {
    //                        stack.push(-num);
    //                    } else if (operation == '*') {
    //                        int a = stack.pop();
    //                        stack.push(a * num);
    //                    } else if (operation == '/') {
    //                        int a = stack.pop();
    //                        stack.push(a / num);
    //                    }
    //                    if(i>=cs.length-1){
    //                        break;
    //                    }
    //                    operation = cs[i];
    //                    num = 0;
    //                }
    //            }
    //            int result = 0;
    //            while (!stack.isEmpty()) {
    //                result += stack.pop();
    //            }
    //            return result;
    //        }
    public static int increasingTriplet(int[] nums) {
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        int in1 = -1;
        int in2 = -1;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (m1>nums[i]){
                m1 = nums[i];
                in1 = i;
            }else if(m2>nums[i]){
                m2 = nums[i];
                in2 = i;
            }else{
                if (in1<in2&&in2<i)
                    res++;
            }

        }
        return res;
    }


}

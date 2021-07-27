package com.nyist.xu.javabasetest.syso;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-03-28 18:34
 **/
public class SwitchSyso2 {


//    Java switch 条件语句用法详解：http://www.51gjie.com/java/631.html
//
//    switch(表达式){
//    	case 表达式常量1：语句1； break；
//    	case 表达式常量2：语句2； break；
//    	......
//    	case 表达式常量n：语句n； break；
//    	[default：语句n+1；]
//    }

    private static int month = 2;
    public static void main(String[] args) {


//        常规测试

//        test(1);//1
//        System.out.println();
//        test(2);//2222
//        System.out.println();
//        test(-1);//default

        test1(1);//1
        System.out.println();
        test1(2);
        System.out.println();
        test1(-1);//default

        //8不支持
//        public static int days = switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12 -> 31;
//            case 4, 6, 9 -> 30;
//            case 2 -> {
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Enter year: ");
//                int year = scanner.nextInt();
////                if (year % 4 == 0)
////                else{}
//            }
//            default -> 0;
//        };

    }

    public static void test(int a) {
        switch (a) {
            case 1:
                System.out.print(1);
                break;
            case 2:
                System.out.print(2);
                System.out.print(2);
                System.out.print(2);
                System.out.print(2);
                break;
            default:
                System.out.print("default");
                break;
        }
    }

    public static void test1(int a) {//long不支持
        switch (a) {
            case 1:
                System.out.print(1);
                break;
            case 2:
                break;
            default:
                System.out.print("default");
                throw new IllegalArgumentException("Invalid month");
        }
    }


    //没有测试
    static class A {
        public static int i = 1;

        public static int getI() {
            return A.i;
        }
    }

    public static void test0(int a) {
        int i = 3;
        int b = 2;
        switch (i) {
//            case 'A.getI()'://报错了，不这样用过。
//                System.out.println(1);
//                break;
            case 'b':
                System.out.println(2);
                break;
            default:
                System.out.println("default");
                break;
        }
    }

}

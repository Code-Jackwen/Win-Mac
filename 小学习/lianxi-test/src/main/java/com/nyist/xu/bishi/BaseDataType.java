package com.nyist.xu.bishi;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-04-16 17:34
 **/
public class BaseDataType {

    //基本数据类型 测试

    Number num = new Float(1F);

    //static final才会有缓冲值
    static final Boolean b = true;
    static final Boolean c = true;


    public static void main(String[] args) {
        //------------------------------------------------------
        Integer in = new Integer(11);
        int i11= 11;

        Boolean d = true;
        Boolean f = true;
        Boolean g = new Boolean(true);
        Boolean h = new Boolean(true);
        System.out.println(in.equals(i11));//true
        System.out.println(b==c);//true
        System.out.println(g==h);//false
        //------------------------------------------------------


        String text = "199";
        try {
            String concat = text.concat(".5");
            System.out.println(concat);//199.5

            Double aDouble = Double.valueOf(concat);
            System.out.println(aDouble);//199.5

            double decimal = Double.parseDouble(text);
            System.out.println(decimal);//199.0

            text = Double.toString(decimal);
            System.out.println("2---"+text);//199.0


//            Double aDouble1 = Double.valueOf(text);//Double 是对象。double 不一样


            double ceil = Math.ceil(Double.valueOf(text).doubleValue());

//            static double ceil(double a)
//            返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。


//            Double(String s)
//            构造一个新分配的 Double 对象，表示用字符串表示的 double 类型的浮点值。

//            Double.valueOf(text)
//            Double valueOf(double d)
//            返回表示指定的 double 值的 Double 实例。如果不需要新的 Double 实例
//            该方法与 valueOf 方法一样，可将字符串转换为 double 值。

//            Double valueOf(String s)
//            返回保存用 参数字符串 s 表示的 double 值的 Double 对象。会处理  字符串的空格等等。

//            double doubleValue()
//            返回此 Double 对象的 double 值。


            //ceil  向上取整。 返回double
            System.out.println(ceil);//199.0
            int ceilInt = (int)ceil;
            System.out.println(ceilInt);//199

            double ceil1 = Math.ceil(1.11);
            System.out.println("ceil 测试"+ceil1);//2.0
            double ceil2 = Math.ceil(-1.11);
            System.out.println("ceil 测试"+ceil2);//-1.0
            double ceil3 = Math.ceil(0);
            System.out.println("ceil 测试"+ceil3);//0.0

            double ceil4 = Math.ceil(3.99);
            System.out.println("ceil 测试"+ceil4);//4.0

            double ceil5 = Math.ceil(-3.99);
            System.out.println("ceil 测试"+ceil5);//-3.0


            //floor
            double floor1 = Math.floor(1.11);
            System.out.println("floor 测试"+floor1);//1.0
            double floor2 = Math.floor(-1.11);
            System.out.println("floor 测试"+floor2);//-2.0



        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


    }


}

package com.nyist.xu.bishi.wangyi2019;

import java.util.Scanner;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-08 19:08
 **/
//链接：https://www.nowcoder.com/questionTerminal/c32f4c74446541a1ad2abbe54476681f
//来源：牛客网
//
//又到了周末，小易的房间乱得一团糟。
//他希望将地上的杂物稍微整理下，使每团杂物看起来都紧凑一些，没有那么乱。
//地上一共有n团杂物，每团杂物都包含4个物品。第i物品的坐标用(ai,bi)表示，小易每次都可以将它绕着(xi,yi)逆时针旋转90∘90^ \circ90∘，这将消耗他的一次移动次数。如果一团杂物的4个点构成了一个面积不为0的正方形，我们说它是紧凑的。
//因为小易很懒，所以他希望你帮助他计算一下每团杂物最少需要多少步移动能使它变得紧凑。
//
//输入描述:
//
//第一行一个数n(1 <= n <= 100)，表示杂物的团数。
//接下来4n行，每4行表示一团杂物，每行4个数ai, bi，xi, yi, (-104 <= xi, yi, ai, bi <= 104)，表示第i个物品旋转的它本身的坐标和中心点坐标。
//
//
//
//输出描述:
//
//n行，每行1个数，表示最少移动次数。
//
//示例1
//输入
//
//4
//1 1 0 0
//-1 1 0 0
//-1 1 0 0
//1 -1 0 0
//1 1 0 0
//-2 1 0 0
//-1 1 0 0
//1 -1 0 0
//1 1 0 0
//-1 1 0 0
//-1 1 0 0
//-1 1 0 0
//2 2 0 1
//-1 0 0 -2
//3 0 0 -2
//-1 1 -2 0
//
//输出
//
//1
//-1
//3
//3
//
//说明
//
//对于第一团杂物，我们可以旋转第二个或者第三个物品1次。
public class A2020_0506_4 {
    // 比较难 很考验 coding能力

    //存放 俩点：旋转点、中心点
    static class Point {
        int x1;
        int y1;
        int x;
        int y;

        Point(int x1, int y1, int x, int y) {
            this.x1 = x1;
            this.y1 = y1;
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//一共n组数据
        Point[][] points = new Point[n][4];
        int a, b, c, d;
        int[] reult = new int[n];
        for (int i = 0; i < n; i++) {//n 控制组
            for (int j = 0; j < 4; j++) {
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                d = sc.nextInt();
                points[i][j] = new Point(a, b, c, d);
            }
            reult[i] = moveIimes(points, i);
        }
        //结果存入集合，最后 输出
        for (int i = 0; i < reult.length; i++) {
            System.out.println(reult[i]);
        }
    }

    //每个点有4中情况旋转0，1,2,3次，穷举
    private static int moveIimes(Point[][] pints, int i) {
        Point p1, p2, p3, p4;//一组数据，4个 俩点的集合。 实际一个正方形 是16个点。
        int count = 16;
        for (int j = 0; j < 4; j++) {
            //第一个点的
            p1 = rotate(pints[i][0], j);
            for (int k = 0; k < 4; k++) {
                p2 = rotate(pints[i][1], k);
                for (int l = 0; l < 4; l++) {
                    p3 = rotate(pints[i][2], l);
                    for (int m = 0; m < 4; m++) {
                        p4 = rotate(pints[i][3], m);
                        if (isSq(p1, p2, p3, p4)) {
                            count = Math.min(count, j + k + l + m);
                        }
                    }
                }
            }
        }
        return count == 16 ? -1 : count;//-1代表失败
    }

    /**
     * @param p     原始点
     * @param times 旋转次数
     * @return 返回旋转后的点
     */
    private static Point rotate(Point p, int times) {
        int x = p.x1;//起始点
        int y = p.y1;
        int a = p.x;//中心点
        int b = p.y;
        for (int i = 1; i <= times; i++) {
            int tem = x;
            x = (b - y + a);// 找旋转点的  公式关系， 这种题一定能在象限中 找到 对应旋转点的万能公式。
            y = (tem - a + b);
        }
        return new Point(x, y, a, b);
    }

    //判断四个点是否是正方形   没懂写法
    private static boolean isSq(Point p1, Point p2, Point p3, Point p4) {
        boolean rx = ((p1.x1) ^ (p2.x1) ^ (p3.x1) ^ (p4.x1)) == 0;//四个点的 x 坐标是否是两两相等
        boolean ry = ((p1.y1) ^ (p2.y1) ^ (p3.y1) ^ (p4.y1)) == 0;//四个点的 y 坐标是否是两两相等
        //是否是矩形
        if(!rx || !ry || rx && ry && (p1.x1 == p2.x1 && p1.x1 == p3.x1) ||
         rx && ry && (p1.y1 == p2.y1 && p1.y1 == p3.y1))
        {
            return false;
        }
        //判断正方形     abs 是取正，取绝对值
        int dx = Math.abs((p1.x1 - p2.x1) != 0 ? (p1.x1 - p2.x1) : (p1.x1 - p3.x1));
        int dy = Math.abs((p1.y1 - p2.y1) != 0 ? (p1.y1 - p2.y1) : (p1.y1 - p3.y1));
        return dx == dy;
    }
}
//解法类似就 没再看
// public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        int[][][] abxy=new int[n][4][4];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<4;j++){
//                abxy[i][j][0]=sc.nextInt();
//                abxy[i][j][1]=sc.nextInt();
//                abxy[i][j][2]=sc.nextInt();
//                abxy[i][j][3]=sc.nextInt();
//            }
//        }
//        for(int index=0;index<n;index++){
//            int min=Integer.MAX_VALUE;
//            for(int i=0;i<4;i++){
//                for(int j=0;j<4;j++){
//                    for(int k=0;k<4;k++){
//                        for(int m=0;m<4;m++){
//                            if(isSquare(rotate(abxy[index][0],i),rotate(abxy[index][1],j),rotate(abxy[index][2],k),rotate(abxy[index][3],m))){
//                                min=Math.min(min,i+j+k+m);
//                            }
//                        }
//                    }
//                }
//            }
//            if(min==Integer.MAX_VALUE){
//                min=-1;
//            }
//            System.out.println(min);
//        }
//
//    }
//    //绕xy旋转count次 point长度为4，固定这个长度是因为这样在调用的时候比较方便
//       public static  int[] rotate(int[] point,int count){
//        int[] res=new int[] {point[2]+point[3]-point[1], point[3]-point[2]+point[0],point[2],point[3]};
//        if(count==0){
//            return point;
//        }else{
//            return rotate(res,count-1);
//        }
//    }
//    //判定正方形，一定要判定两个对角边是否相等
//    public static  boolean isSquare(int[] point1,int[] point2,int[] point3,int[] point4){
//        double[] sideLen=new double[]{distance(point1,point2),distance(point2,point3),distance(point3,point4),distance(point4,point1),distance(point1,point3),distance(point2,point4)};
//        Arrays.sort(sideLen);
//        return sideLen[0] != 0&&sideLen[0]==sideLen[1]&&sideLen[1]==sideLen[2]&&sideLen[2]==sideLen[3]&&sideLen[3]==sideLen[0]
//                &&sideLen[4]==sideLen[5];
//    }
//
//    private static double distance(int[] fromPoint, int[] toPoint) {
//        return Math.pow(fromPoint[0] - toPoint[0], 2)
//                + Math.pow(fromPoint[1] - toPoint[1], 2);
//    }
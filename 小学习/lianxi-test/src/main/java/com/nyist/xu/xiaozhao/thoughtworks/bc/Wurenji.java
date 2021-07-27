package com.nyist.xu.xiaozhao.thoughtworks.bc;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-12-06 17:33
 **/
public class Wurenji {
//    作者：是瑶瑶公主吖
//    链接：https://www.nowcoder.com/discuss/544951
//    来源：牛客网

    //这货写的  第一种算对，但是不完美。ac比较标准

//这是一篇完美的  分析
//    https://shitsurei.online/droneCrossPhotograph.html
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        // 创建地图
        int[][] map = createMap(row, col);
        // 螺旋飞行
        new SolutionOne().spiralTravel(map, 0, map[0].length - 1, 0, map.length - 1);
        // 跳跃飞行
//        new SolutionTwo().skipTravel(map, 0, map[0].length - 1, 1, map.length - 1);
        // 打印结果
        printMap(map);
    }

    private static int[][] createMap(int row, int col) {
        return new int[row][col];
    }

    private static void printMap(int[][] map) {
        for (int[] info : map) {
            for (int val : info) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
//作者：是瑶瑶公主吖
//链接：https://www.nowcoder.com/discuss/544951
//来源：牛客网
//
//很多私信都问过这个问题 今天清理idea里的代码
//分享一下 然后清理了
//问题描述：
//一个字符型二维矩阵中，每个格子都代表一个地理位置信息，需要设计一个无人机的飞行路线，拍下地图全景，每次可以拍上下左右中五个位置的照片。
//主要思路：
//1 螺旋飞行+3格定时拍照，每三个格子拍照一次，可以保证拍下全图。足够大的情况下，拍照次数约为全图1/3
//2 隔行跳跃飞行，可以保证拍下全图。足够大的情况下，飞行距离约为全图1/3
//代码很简单，思路也很简单，这一面一般不会挂人，最后挂在了非技术上也是挺离谱
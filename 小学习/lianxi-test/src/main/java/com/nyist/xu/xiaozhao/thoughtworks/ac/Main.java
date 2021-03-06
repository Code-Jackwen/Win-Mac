package com.nyist.xu.xiaozhao.thoughtworks.ac;

import com.nyist.xu.xiaozhao.thoughtworks.ac.drone.Drone;
import com.nyist.xu.xiaozhao.thoughtworks.ac.drone.IDrone;
import com.nyist.xu.xiaozhao.thoughtworks.ac.strategy.StrategyFactory;
import com.nyist.xu.xiaozhao.thoughtworks.ac.util.IOUtil;

import java.util.Arrays;

//来自
//https://shitsurei.online/droneCrossPhotograph.html
public class Main {

    public static void main(String[] args) {
        int m = 8;
        int n = 8;
        char[][] map = new char[n][m];
        char[] item = new char[m];
        Arrays.fill(item, 'T');
        Arrays.fill(map, item);
//        char[][] map = new char[][]{
//                {'R', 'G', 'F', 'F', 'R'},
//                {'G', 'F', 'F', 'G', 'R'},
//                {'G', 'R', 'F', 'R', 'F'},
//                {'G', 'F', 'G', 'F', 'F'},
//                {'G', 'F', 'F', 'G', 'R'},
//        };
//        testMinMovePath(map);
//        testSTypePath(map);
        testSpinPath(map);
    }

    /**
     * test spin plan
     *
     * @param map
     */
    public static void testSpinPath(char[][] map) {
        IDrone drone = new Drone(map);
        StrategyFactory factory = StrategyFactory.getInstance();
        factory.setStrategy(StrategyFactory.Strategy.SPIN);

        int ans = factory.route(drone);
        IOUtil.outPutMessage(String.format("task finished , use %d feet , shoot %d times", ans, drone.getData().size()), IOUtil.MessageType.INFO);
//        List<String> data = drone.getData();
//        char[][] recoverMap = factory.draw(data, map.length, map[0].length);
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[0].length; j++) {
//                System.out.print(recoverMap[i][j]);
//                System.out.print('\t');
//            }
//            System.out.println();
//        }
    }

    /**
     * test sType plan
     *
     * @param map
     */
    public static void testSTypePath(char[][] map) {
        IDrone drone = new Drone(map);
        StrategyFactory factory = StrategyFactory.getInstance();
        factory.setStrategy(StrategyFactory.Strategy.S_TYPE);

        int ans = factory.route(drone);
        IOUtil.outPutMessage(String.format("task finished , use %d feet , shoot %d times", ans, drone.getData().size()), IOUtil.MessageType.INFO);
//        List<String> data = drone.getData();
//        pathStrategy = new SpinPathStrategy(new Drone());
//        char[][] recoverMap = pathStrategy.draw(data, map.length, map[0].length);
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[0].length; j++) {
//                System.out.print(recoverMap[i][j]);
//                System.out.print('\t');
//            }
//            System.out.println();
//        }
    }

    /**
     * test min move plan
     *
     * @param map
     */
    public static void testMinMovePath(char[][] map) {
        IDrone drone = new Drone(map);
        StrategyFactory factory = StrategyFactory.getInstance();
        factory.setStrategy(StrategyFactory.Strategy.MIN_MOVE);

        int ans = factory.route(drone);
        IOUtil.outPutMessage(String.format("task finished , use %d feet , shoot %d times", ans, drone.getData().size()), IOUtil.MessageType.INFO);
//        List<String> data = drone.getData();
//        pathStrategy = new SpinPathStrategy(new Drone());
//        char[][] recoverMap = pathStrategy.draw(data, map.length, map[0].length);
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[0].length; j++) {
//                System.out.print(recoverMap[i][j]);
//                System.out.print('\t');
//            }
//            System.out.println();
//        }
    }
}

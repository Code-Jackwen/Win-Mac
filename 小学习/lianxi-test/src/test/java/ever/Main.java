package ever;

import java.util.Scanner;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-26 00:07
 **/

//赛码 ，编译器版本：Main类、main方法、Scanner、还得导包
public class Main{

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = 0, N = 0, time = 0;
        int[][] AB = new int[1000][3];
        while (cin.hasNextInt()) {
            int incomeOfA = cin.nextInt();
            int incomeOfB = cin.nextInt();
            AB[a][0] = incomeOfA;
            AB[a][1] = incomeOfB;
            if (incomeOfA > incomeOfB) {
                AB[a][2] = 1;
                time++;
            }
            a++;
            N++;
        }

        //Start coding -- Input Data

//        10 30
//        100 200
//        150 50
//        60 20
//        #
//        1 2
//        4 3   1
//        5 6
//        8 7   1   12|8
//#
//        12
        if ((N & 1) == 0){
            new Exception("error");
        }
        int icA = 0, icB = 0, res = 0;
        if (time == N / 2) {
            for (int i = 0; i < N; i++) {
                if (AB[i][2] == 1) {
                    icA += AB[i][0];
                } else {
                    icB += AB[i][1];
                }
            }
            res = icA + icB ;
            System.out.println(res);
        }else {//

        }

//        System.out.println("N=" + N);//司机数量
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(AB[i][j] + "  ");
//            }
//            System.out.println();
//        }


    }
    //Start coding

}

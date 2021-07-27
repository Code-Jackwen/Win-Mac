//class Solution {
//    public int change(int amount, int[] coins) {
//        if (coins == null) return 0;
//
//        int N = 5010;
//        int m = amount;
//        int n = coins.length;
//
//        int f[][] = new int[N][N];
//        int g[][] = new int[N][N];
//
//        for (int i = 1; i <= n; ++i) {
//            int v = 1;
//            int w = ;
//            for (int j = 0; j <= m; ++j) {
//                f[i][j] = f[i - 1][j];   //二维的正序遍历需要把上次的值延续下来
//                g[i][j] = g[i - 1][j];
//                if (j >= v) {
//                    if (f[i][j] < f[i - 1][j - v] + w) {
//                        f[i][j] = f[i - 1][j - v] + w;
//                        g[i][j] = g[i - 1][j - v];
//                    } else if (f[i][j] == f[i - 1][j - v] + w) { //这里 f[i][j] 不用更新
//                        g[i][j] = (g[i][j] + g[i - 1][j - v]);
//                    }
//                }
//            }
//        }
//        return dp[amount];
//    }
//}
//
//
////class Solution {
////    public:
////    int change(int amount, vector<int>& coins) {
////        int m=amount;
////        int n=coins.size();
////
////        for(int i=1; i<=n; ++i)
////        {
////            int v = , w;
////            for(int j=0; j<=m; ++j)
////            {
////                f[i][j] = f[i-1][j];			//二维的正序遍历需要把上次的值延续下来
////                g[i][j] = g[i-1][j];
////                if(j>=v)
////                {
////                    if(f[i][j] < f[i-1][j-v]+w)
////                    {
////                        f[i][j] = f[i-1][j-v]+w;
////                        g[i][j] = g[i-1][j-v];
////                    }
////                    else if(f[i][j] == f[i-1][j-v]+w)
////                    {	//这里 f[i][j] 不用更新
////                        g[i][j] = (g[i][j]+g[i-1][j-v]);
////                    }
////                }
////            }
////        }
////
////    }
////};
//

//import java.util.Arrays;
//
//public class Solution {
//    //20ms,31%
//    public int coinChange(int[] coins, int sum) {
//        if (sum == 0 || coins == null) return 0;
//        long[] dp = new long[sum + 1];
//        Arrays.fill(dp, Integer.MAX_VALUE);
//        dp[0] = 0;
//        for (int coin : coins) {
//            for (int i = coin; i <= sum; i++) { //将逆序遍历改为正序遍历
//                if (coin <= i)
//                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
//            }
//        }
//        return dp[sum] == Integer.MAX_VALUE ? -1 : (int) dp[sum];
//    }
//    // class Solution {
//    // public:
//    //     int coinChange(vector<int>& coins, int amount) {
//    //         vector<long long> dp(amount+1, INT_MAX);
//    //         dp[0] = 0;
//    //         for(int& coin: coins){
//    //             for(int i = 0; i <= amount; i++){
//    //                 if(coin <= i)
//    //                     dp[i] = min(dp[i], dp[i-coin] + 1);
//    //             }
//    //         }
//    //         return dp[amount] == INT_MAX ? -1 : dp[amount];
//    //     }
//    // };
//
//
//}
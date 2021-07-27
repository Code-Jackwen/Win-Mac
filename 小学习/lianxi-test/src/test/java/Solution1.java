import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {

//        System.out.println(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2},2));
//        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1},3));

        int a  = 0x3f;
        System.out.println(a);

    }

    public static int numberOfSubarrays(int[] nums, int k) {	//前缀和 双O(N)
        int[] prefixCnt = new int[nums.length + 1];		//前缀和 -> 前缀和的个数。
        prefixCnt[0] = 1;								//前缀和的初始化
        int res = 0, sum = 0;
        for (int num: nums) {
            sum += num & 1;								//核心逻辑
            prefixCnt[sum]++;
            if (sum >= k) res += prefixCnt[sum - k];	//大于等于
            System.out.println(Arrays.toString(prefixCnt));
        }
        return res;
    }
}
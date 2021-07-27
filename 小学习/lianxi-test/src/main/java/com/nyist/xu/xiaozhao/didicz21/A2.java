package com.nyist.xu.xiaozhao.didicz21;

import java.util.HashMap;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-04-10 22:18
 **/
public class A2 {
    //小A的家门口有一排树，每棵树都有一个正整数的高度。由于树的高度不同，来到小A家的朋友都觉得很难看。为了将这些树高度变得好看，小A决定对其中某些树施展魔法，具体来说，每施展一次魔法，可以把一棵树的高度变成任意正整数（可以变高也可以变低）。
    //
    //小A认为，这排树如果能构成等差为x的等差数列就好看了。但是小A不想施展太多次魔法，他想知道最少施展魔法的次数。
    //
    //形式上来说，小A家门口一共有n棵树，第i棵树高度为ai。小A最后的目标为对于任意2≤i≤n，ai-ai-1=x
    //
    //
    //
    //输入描述
    //输入第一行包含两个正整数，n和x，含义如题面所示。
    //
    //输入第二行包含n个正整数，第i个数的含义为第i棵树的高度ai
    //
    //
    //范围：n≤105,1≤ai≤105，x≤1000
    //
    //输出描述
    //输出包含一个正整数，即小A最少施展魔法的次数
    //
    //
    //样例输入
    //5 2
    //1 3 1 3 5
    //样例输出
    //3
    //
    //提示
    //<p>对3,4,5号树施法，最后变为1,3,5,7,9</p>


    //    int nums[N];
//    //map数据结构，进行一个对应。
//    map<int,int> mp;
//    //相当于int main()
//    signed main(){
//        int n,x,u;
//        //输入
//        cin>>n>>x;
//        //初始化最小递增序列 1,1+x,1+2*x,1+3*x...
//        nums[1]=1;
//        for(int i=2;i<=n;i++){
//            nums[i]=nums[i-1]+x;
//        }
//        //获取数据
//        for(int i=1;i<=n;i++){
//            cin>>u;
//            //当u<nums[i]时，会让序列产生负值不符合题意。
//            //所以当u>=nums[i]时，在进行统计
//            if(u>=nums[i]) mp[u-nums[i]]++;
//        }
//        //遍历map，java里应该这样遍历挺常见
//        int ans=0;
//        for(auto i:mp){
//            //记录的是最大符合的数量
//            ans=max(ans,i.second);
//        }
//        //n-ans，就是求出不符合的数量，就是要修改的最小数量
//        cout<<n-ans<<endl;
//    }
    public static void main(String[] args) {
        //5 2
        //1 3 1 3 5
        //1 3 5 7 9
        //样例输出
        //3
        int n = 10, x = 2, u;
        int[] nums = new int[100];
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + x;
        }
        HashMap<Integer, Integer> mp = new HashMap();

        //全是10、个数，相差2
//        int[] tem = new int[]{-1, 1, 3, 1, 3, 5};//不写输入直接写死 样例了。
//        int[] tem = new int[]{-1, 10, 20, 3, 12, 2, 28, 16, 19,  3, 10};//8次、差17，数字：20、28
//        int[] tem = new int[]{-1,  1,  3, 5,  7, 9, 11, 13, 15, 17, 19};//
//        int[] tem = new int[]{-1, 18, 20, 22,24,26, 28, 30, 32, 34, 36};//结果解释

//        int[] tem = new int[]{-1, 10, 20, 3, 12, 2, 28, 16, 19, 26, 28};//7次、10、26、28
//        int[] tem = new int[]{-1,  1,  3, 5,  7, 9, 11, 13, 15, 17, 19};//

//        int[] tem = new int[]{-1, 2, 20, 3, 12, 2, 28, 16, 19, 26, 28};//8次、26、28
//        int[] tem = new int[]{-1,  1,  3, 5,  7, 9, 11, 13, 15, 17, 19};//

//        差9，4次。                                *       *       *    *
//        int[] tem = new int[]{-1,  2, 20, 3, 12, 18, 28, 22, 19, 26, 28};//6次、18、22、26、28
//        int[] tem = new int[]{-1, 10, 12,14, 16, 18, 20, 22, 24, 26, 28};//结果解释
//        int[] tem = new int[]{     1,  2, 3,  4,      5,      6次       };//变动的6次的位置
//        int[] tem = new int[]{-1,  1,  3, 5,  7,  9, 11, 13, 15, 17, 19};//

        int[] tem = new int[]{-1, 10, 20, 22,24,26, 28, 30, 32, 34, 36};//1次
        for (int i = 1; i <= n; i++) {
            if (tem[i] >= nums[i])
                mp.put(tem[i] - nums[i], mp.getOrDefault(tem[i] - nums[i], 0) + 1);
        }
        int ans = 0;
        for (Integer i : mp.keySet()) {
            ans = Math.max(ans, mp.get(i));
        }
        System.out.println(n - ans);
        System.out.println(ans);
    }


}

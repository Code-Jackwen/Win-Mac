package com.nyist.xu.bishi.wangyi2020;

/**
 * @program: nyisttest
 * @description
 * @author: xu1
 * @create: 2020-05-04 22:48
 **/
//小易有一个长度为n的数字数组a_1, a_2, …, a_n。
//
//问你是否能用这n个数字构成一个环(首尾连接)，使得环中的每一个数字都小于它相邻的两个数字的和(每个数字都必须使用并且每个数字只能使用一次)。
public class A202005_04_2 {

    //根据题意得  这点是关键
    //因为每个数字小于相邻只和，直接排序数组，然后只要操作最大数左右两边之和大于最大数，此时只需要将最大数和第二大数交换位置即可。


    //int main()
    //{
    //    int t ;
    //    cin >> t;
    //    while(t>0)
    //    {
    //    long long  n ;
    //    cin >> n;
    //        if(n<=2)
    //            cout << "NO" << endl;
    //        else
    //        {
    //        long long a[n];
    //        for(long long i =0;i<n;i++)
    //        cin >> a[i];
    //
    //        //直接找最大值 次最大值 次次最大值
    //        long long max = a[0];
    //        long long ccmax = 0;
    //        long long cmax = 0;
    //        for(long long i=1;i<n;i++)
    //        {
    //            if(a[i]>=max)
    //            {
    //                ccmax = cmax;
    //                cmax = max;
    //                max = a[i];
    //            }
    //        }
    //
    //        if(ccmax+cmax>max)    //最大值小于后两个之和  则所有都满足条件
    //            cout << "YES" << endl;
    //        else
    //            cout << "NO" << endl;
    //        }
    //     t--;
    //    }
    //}

}

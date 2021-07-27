package com.nyist.xu.xiaozhao.didicz21;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2021-04-10 22:18
 **/
public class A1 {
    //优秀的操作系统离不开优秀的任务调度算法。现在，有一台计算机即将执行n个任务，每个任务都有一个准备阶段和执行阶段。只有在准备阶段完成后，执行阶段才可以开始。同一时间，计算机只能执行一个任务的执行阶段，同时可以执行任意多个任务的准备阶段。请你设计一个算法，合理分配任务执行顺序，并输出完成所有任务的最少时间。
    //输入描述
    //第一行一个整数n表示任务的数量（1<=n<=5*10^4）
    //
    //接下来n行每行两个整数a，b表示第i个任务的准备时长和执行时长。（1<=a,b<=10^9）
    //
    //输出描述
    //仅一行一个整数，表示执行所有任务的最少时间。
    //
    //
    //样例输入
    //2
    //5 1
    //2 4
    //样例输出
    //7

    //#include<bits/stdc++.h>
    //#define int long long
    //using namespace std;
    //const int N=1e5+10;
    ////储存两个数，排序时会先比较第一个数，在比较第二个数。
    //pair<int,int> a[N];
    //signed main(){
    //	int n;
    //	cin>>n;
    //	//输入
    //	for(int i=1;i<=n;i++){
    //		cin>>a[i].first>>a[i].second;
    //	}
    //	//按照第一个数进行排序。
    //	sort(a+1,a+1+n);
    //	//ans是答案，ls没有用到
    //	int ans=0,ls=0;
    //	//
    //	for(int i=1;i<=n;i++){
    //		if(ans<a[i].first){
    //			//当前总共时间小于要准备时长，所以是准备时长加执行时长
    //			ans=a[i].first+a[i].second;
    //		}else{
    //			////当前总共时间大于等于要准备时长，直接加上执行时长就好
    //			ans+=a[i].second;
    //		}
    //	}
    //	//输出答案
    //	cout<<ans<<endl;
    //}
}

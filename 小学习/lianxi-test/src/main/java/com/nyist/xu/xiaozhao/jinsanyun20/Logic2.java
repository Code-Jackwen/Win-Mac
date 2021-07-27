package com.nyist.xu.xiaozhao.jinsanyun20;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-09-16 19:30
 **/
public class Logic2 {
    //繁殖
    //时间限制： 3000MS
    //内存限制： 589824KB
    //题目描述：
    //在X星上有一类昆虫是可以进行无性繁殖的，身为昆虫调查员的你接到了命令前往X星去调查昆虫的繁殖情况。
    //
    //经过一系列的调查，你发现该种昆虫一生最多可以繁殖出两个子代。现在你发现了这种昆虫身上可能会带有一种病毒，上级已经给你发来通知，告诉你两只带有病毒的昆虫编号。
    //
    //为了快速找到这种病毒的来源，你必须找到这两只昆虫的最近公共祖先（不会存在两只昆虫出现相同编号）。
    //
    //
    //
    //输入描述
    //单组输入。
    //
    //第1行包含一段序列，代表昆虫的序号。每个昆虫有两个子代，若没有子代则用-1代替。（如序列：1 2 -1 -1 3 -1 -1，表示1号昆虫有2、3两个子代而2、3没有子代，类似于二叉树的先序遍历） 。
    //
    //第2行，两个已知带有病毒的昆虫编号，用空格隔开。
    //
    //输出描述
    //输出1行，表示两只病毒昆虫的最近公共祖先的编号。
    //
    //
    //样例输入
    //3 5 6 -1 -1 2 7 -1 -1 4 -1 -1 1 9 -1 -1 8 -1 -1
    //5 1
    //样例输出
    //3



//网上的c语言实现
//    https://my.oschina.net/u/4281474/blog/4562615

//    const int maxn=2e5+5;
//const int inf=0x3f3f3f3f;
//    struct node{
//
//
//        int l,r,v;
//    };
//    node edge[maxn];
//    int cnt=0,pre[maxn],dep[maxn];
//    int fa[maxn];
//    int build(int v,int f){
//
//
//        int x,now=++cnt;
//        scanf("%d",&x);
//        edge[now].v=x;//第now个节点的昆虫编号
//        dep[now]=v;//第now个节点的深度
//        fa[now]=f;//第now个节点的父节点编号
//        if(x!=-1){
//
//
//            pre[x]=now;//编号为i的昆虫对应的节点编号
//            edge[now].l=build(v+1,now);
//            edge[now].r=build(v+1,now);
//        }
//    }
//    int lca(int a,int b){
//
//
//        if(dep[a]<dep[b])swap(a,b);//将a换成深的节点
//        while(dep[a]!=dep[b]){
//
//            //将a一步步上移
//            a=fa[a];
//        }
//        while(a!=b){
//
//            //a,b同时上移
//            a=fa[a];
//            b=fa[b];
//        }
//        return edge[a].v;//返回a节点的昆虫编号
//    }
//    int main()
//    {
//
//
//        build(1,0);
//        int a,b;
//        scanf("%d %d",&a,&b);
//        printf("%d\n",lca(pre[a],pre[b]));
//        return 0;
//    }
}

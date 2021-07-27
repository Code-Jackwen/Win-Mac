package com.nyist.xu.dataStructure.tree;

import java.util.Stack;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-07 20:45
 **/
//结合....
//https://blog.csdn.net/coder__666/article/details/80349039
    //下面这个好点
//https://blog.csdn.net/weixin_44404255/article/details/104517916
public class PreOrderRead {
    //二叉树的 构建、与 前序遍历（递归非递归）   根左右
    public static void main(String[] args)
    {
        //构建树
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for(int i = 0; i < 10; i++)
        {
            node[i] = new TreeNode(i);
        }
        for(int i = 0; i < 10; i++)
        {
            if(i*2+1 < 10)//i=1     i*2-1   i*2     1、2、4、8、16
            {node[i].left = node[i*2+1];}
            if(i*2+2 < 10)
            {node[i].right = node[i*2+2];}
        }
        //前序遍历
        preOrderRe(node[0]);
//        System.out.println(node[9].value+" "+node[9].left);//9 null
    }

    public static void preOrderRe(TreeNode biTree)
    {
        //前序遍历
        //递归实现
//        System.out.print(biTree.value);
//        TreeNode leftTree = biTree.left;
//        if(leftTree != null)
//        {
//            preOrderRe(leftTree);
//        }
//        TreeNode rightTree = biTree.right;
//        if(rightTree != null)
//        {
//            preOrderRe(rightTree);
//        }
        if(biTree != null){
            System.out.print(biTree.value);//打印根节点
            preOrder(biTree.left);//访问左子树
            preOrder(biTree.right);//访问右子树
        }
    }

    public static void preOrder(TreeNode biTree)
    {
        //前序遍历 非递归实现
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(biTree != null || !stack.isEmpty())
        {
            while(biTree != null)
            {
                System.out.print(biTree.value);
                stack.push(biTree);
                biTree = biTree.left;
            }
            //如果 栈不空
            if(!stack.isEmpty())
            {
                biTree = stack.pop();
                biTree = biTree.right;
            }
        }
    }

    static class TreeNode//节点结构
    {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value)
        {
            this.value = value;
        }
    }

}

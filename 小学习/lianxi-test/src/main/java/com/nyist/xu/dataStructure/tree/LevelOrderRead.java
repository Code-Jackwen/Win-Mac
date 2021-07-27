package com.nyist.xu.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: nyist.test
 * @description
 * @author: xu1
 * @create: 2020-10-07 22:02
 **/
//总结
//先序遍历特点：第一个值是根节点
//中序遍历特点：根节点左边都是左子树，右边都是右子树
//    与树的前中后序遍历的DFS思想不同，层次遍历用到的是BFS思想。
//    一般DFS用递归去实现（也可以用栈实现），BFS需要用队列去实现。

//    层次遍历的步骤是：
//    1.对于不为空的结点，先把该结点加入到队列中
//    2.从队中拿出结点，如果该结点的左右结点不为空，就分别把左右结点加入到队列中
//    3.重复以上操作直到队列为空
public class LevelOrderRead {

    //二叉树 层次遍历（DFS队列LinkedList简单）
    public static void main(String[] args)
    {
        TreeNode[] node = new TreeNode[10];//以数组形式生成一棵完全二叉树
        for(int i = 0; i < 10; i++)
        {
            node[i] = new TreeNode(i);
        }
        for(int i = 0; i < 10; i++)
        {
            if(i*2+1 < 10)
            {node[i].left = node[i*2+1];}
            if(i*2+2 < 10)
            {node[i].right = node[i*2+2];}
        }
        levelOrder(node[0]);
    }
    public static void levelOrder(TreeNode biTree)
    {
        //层次遍历
//        if(biTree == null)
//        {return;}
        //LinkedList 当队列使用

        Queue<TreeNode> queue = new LinkedList<>();
        if(biTree != null){//如果根节点不为空,将第一层根节点入队列
            queue.offer(biTree);
        }
//        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
//        list.add(biTree);
        TreeNode currentNode;
        while(!queue.isEmpty())
        {
            currentNode = queue.poll();
            System.out.print(currentNode.value);
            if(currentNode.left != null)
            {queue.add(currentNode.left);}
            if(currentNode.right != null)
            {queue.add(currentNode.right);}
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

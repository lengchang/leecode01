package com.java.day0320;

import com.java.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asns on 2022/3/20.
 */
public class Leetcode404_sumOfLeftLeaves {
    int sum= 0;
    public int sumOfLeftLeaves(TreeNode root)
    {
        //int sum= 0;//但是要注意了，这个sum放在这个位置，每次执行这个方法，都需要重新的赋值，所以是不行的，得拿出去
        //我的想法是，这还是一个遍历算法，可以用递归来做，只是需要把遍历的那一句修改一下位置
        //做法是判断是否是左子树和判断是否为叶子结点放在一起，而递归的部分和这些部分分开
        //第一步找到所有左子树，放入一个数组中，之后数组求和
//        List<Integer> list =new ArrayList<Integer>(); //实际上有了sum，就不需要这个数组求和，用sum来实现
        if(root == null)
        {
            return 0;
        }
        TreeNode leftNode = root.left;//这一句保证了走的一定是左子树
        if (leftNode!=null&&leftNode.left==null&&leftNode.right==null)//这是判断句，而不是循环句
        {
            sum = sum+leftNode.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);//这两部分是循环句，不是判断句，无论进入那个，都是在上一个部分进行
        //左子树的判断
        return sum;
    }
}

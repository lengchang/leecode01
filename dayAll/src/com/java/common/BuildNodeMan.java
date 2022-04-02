package com.java.common;

import com.java.day0320.Leetcode104_maxDepth;
import org.junit.Test;

/**
 * Created by asns on 2022/3/21.
 * 完全二叉树，但是空结点完全用null补满
 */
public class BuildNodeMan {
    @Test
    public void test()
    {
        int[] nums= new int[]{1,2,3,4,5,6,7,8,9};
        Integer[] integers =new Integer[]{2,null,4,null,null,9,8,null,null,null,null,null,null,4};
        TreeNode treeNode = createTreeNode(integers,1);
        System.out.println(treeNode.val);
        System.out.println(Leetcode104_maxDepth.maxDepth(treeNode));
    }


    //这里使用的参数有一个解决的办法，就是int[]转化为Integer[]之后，再进行输入
    public static TreeNode createTreeNode(Integer[] integers,int index)
    {
        //这里是递归的时候，用来防止越界以及无限循环下去的方法
        if(index>integers.length)
        {
            return null;
        }
        Integer value = integers[index-1];//这个是每一次的结点值
        if (value ==null)
        {
            return null;
        }
        TreeNode node =new TreeNode(value);//新建一个带有具体值在内的树结点
        node.left= createTreeNode(integers,index*2);
        node.right= createTreeNode(integers,index*2+1);
        return node;
    }
    //这里就是通过递归来建立树呢，其实应该是可以的

}

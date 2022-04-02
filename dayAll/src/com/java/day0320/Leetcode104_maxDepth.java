package com.java.day0320;

//import com.java.common.TreeNode;
import com.java.common.BuildNodeMan;
import com.java.common.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//import javax.swing.tree.TreeNode;

/**
 * Created by asns on 2022/3/20.
 */
public class Leetcode104_maxDepth {
    @Test
    public void test(){
//        int[] root= new int[]{1,,3,2,4,,5,6};//Integer可以空值，但是int不可以
//        Integer[] root= new Integer[]{1,,3,2,4,,5,6};


//        List<Integer> list =new ArrayList<Integer>();
//        list.add(1);
//        list.add(null);
//        list.add(3);
//        list.add(2);
//        list.add(4);
//        list.add(null);
//        list.add(5);
//        list.add(6);
//        System.out.println(list.toString());
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//
//        for (int i=0;i<list.size();i++)
//        {
//            TreeNode treeNode = new TreeNode();
//            treeNode.val =list.get(0);
//            treeNode.left= new TreeNode();
//            //这个构建树的方法，是在做不出来，因为是有一个类之后，还需要去构建
//
//        }
//        int[] nums= new int[]{1,2,3,4,5,6,7,8,9};
        Integer[] integers =new Integer[]{2,null,4,null,null,9,8,null,null,null,null,null,null,4};
        Integer[] integers2 =new Integer[]{4,null,4,null,null,9,8};
        TreeNode treeNode = BuildNodeMan.createTreeNode(integers,1);
        TreeNode treeNode2 = BuildNodeMan.createTreeNode(integers2,1);
        System.out.println(treeNode.val);
        System.out.println(treeNode2.val);
        System.out.println(Leetcode104_maxDepth.maxDepth(treeNode));
        System.out.println(Leetcode104_maxDepth.maxDepth(treeNode2));

    }
    //是的，这样就可以了，可以调用其他包中的数据
//    public int maxDepth(TreeNode root)
//    {
//        //需要补充知识  java的类中方法的多态
//        if (root == null) {
//            return 0;
//        }
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//        return Math.max(left, right) + 1;
//    }
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left= maxDepth(root.left);
        int right = maxDepth(root.right);
//        return Math.max(left,right); 这里就错了，因为没有加一
        return Math.max(left,right)+1;//加了一再返回上一层
    }
}

package com.java.common;

import org.junit.Test;

/**
 * Created by asns on 2022/3/21.
 */
public class BuildTreeNode {
    @Test
    public void test()
    {
//        int[] ints= new int[]{1,1,2,null,3,null,4};这样定义的时错的
//        String[] strings =new String[]{"1","1","2",null,"3",null,"4"}; 显然String型的数组是可以空值的
//        for (int i=0;i<strings.length;i++)
//        {
//            if (strings[i]==null)
//            {
//                System.out.println(i);
//            }
//        }
        Integer[] integers =new Integer[]{1,1,2,null,3,null,4};//Integer就可以
        /**
         * 在Java的赋值语句中不能够给整形的数组赋值成一个空值，
         * Java会给int一维数组赋值为0，但是要想实现空值的类型那么将
         * int数组转换为Integer数组，Integer可以为空， 但int 不能为空
         */
    }
    public TreeNode buildTreeNode(Integer[] nums)
    {
        TreeNode treeNode = new TreeNode();
        return treeNode;
    }
}

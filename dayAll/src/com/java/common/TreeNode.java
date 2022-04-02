package com.java.common;

/**
 * Created by asns on 2022/3/20.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    //这个应该是多态的构造方法
    public TreeNode() {}

    public TreeNode(int val) { this.val = val; }

    public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

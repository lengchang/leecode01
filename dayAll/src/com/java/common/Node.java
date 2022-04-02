package com.java.common;

import java.util.List;

/**
 * Created by asns on 2022/3/20.
 */
public class Node {
    public int val;
    public List<Node> children;
    //这里使用的，应该是方法的多态，这才是我应该学习的
    //这个方法实际上是空结点的输入
    public Node() {}
    //这个方法，实际上是叶子节点的输入
    public Node(int _val) {
        val = _val;
    }
    //这个方法实际上是分支结点的输入
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

package com.java.day0320;

import com.java.common.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asns on 2022/3/20.
 */
public class Leetcode590_n_postorder {
//    public List<Integer> postorder(Node root) {
//        List<Integer> res = new ArrayList<>();
//        helper(root, res);
//        return res;
//    }
//    //实际上这个算法才是主体，题目中对输入输出有要求，不得已写成这种形式
//    public void helper(Node root, List<Integer> res) {//传入的就是自己
//        if (root == null) {
//            return ;
//        }
//        //对于N叉数来说，他的定义是一层一层孩子定义出来的，实际上用的是  List<Node> children 来实现的，那么也就是说，可以获得
//        //的思路是对这个list进行循环，而用get实现是在是太难以想象了，所以想法是 foreach循环，递归的开始都是一样，空则return ;
//        //对于此处来说，实际上的遍历调用了一个void的函数，所以不能return0，只能return；
//        //这里是java中return的一种用法，return 0 实际上还是返回了一个数，但是return;代表的是方法的结束，而不返回值
//        for (Node ch : root.children) {//前是后的元素
//            helper(ch, res);//这里是必须使用childen的原因，在执行到叶子结点的时候，这个叶子结点作为root没有空
//            //但是他的孩子是空的，所以不进入foreach循环，而是add进入res中，add结束后，这个递归进入上一层
//            //对于同一层的结点来说，结果是空，必须得到达上一层，这一层的结点才可以进入List
//        }
//        res.add(root.val);
//    }
    public List<Integer> postorder(Node root){
        List<Integer> list= new ArrayList<>();//第一新建要返回的
        //第二步调用主体函数
        //因为传入的就是本体，所以不要返回，调用后修改就可以
        helper(list,root);
        //第三步返回要返回的
        return list;
    }
    public void helper(List list,Node root)
    {
        if (root==null)
            return;//直接结束方法，但是不给任何返回值
        for (Node no:root.children)
        {
//          helper(list,root.children);//这里就错了，这里放入一个数组型的对象了，
            // 实际上输入的是foreach体系下的，已经被放入结点的那个
            helper(list,no);
        }
        //执行循环到目的结点之后，就进行数据的放入
        list.add(root.val);
    }


}

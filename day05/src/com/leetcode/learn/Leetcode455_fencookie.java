package com.leetcode.learn;
/**
假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
        对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。
         如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，
         这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。*/

import java.util.Arrays;

/**
 * 这里有一个问题，就是给出的数据不是顺序的，而我是按照顺序的来做的，所以要先排序
 */

public class Leetcode455_fencookie {
    public int findContentChildren(int[] g ,int[] s){
        Arrays.sort(g);//天然可以，这是我自己做出来的第一个算法，开心
        Arrays.sort(s);
        System.out.println(g);
        System.out.println(s);
        if (g.length==0||s.length==0)
        {
            return 0;
        }
        int max =(g.length>s.length)?g.length:s.length;
        //设置指针
        int z1=0,z2=0;
        //设置数量
        int num=0;
        for(int i=0;i<=max;i++)
        {
            if (g[z1]<=s[z2])//胃口小于饼干
            {
                z1+=1;
                z2+=1;
                num+=1;
                if(z1>=g.length||z2>=s.length)
                {
                    break;
                }
            }
            else {//饼干小于孩子的胃口
                z2+=1;//饼干后移
                if(z2>=s.length||z1>=g.length)//这里必须是大于等于，因为length是从一开始的，而下标是从零开始的
                {
                    break;
                }
            }
        }
        return num;
 }
}

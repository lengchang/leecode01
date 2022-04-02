package com.leetcode.learn;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by asns on 2022/3/19.
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        //数组转化为 集合
        // Arrays.asList(new String[]{"AA", "BB", "CC"})  之后  alt+Enter 是可以使用，不必自己去看，直接生成
    }

    /**
     * 也就是说，从这一步开始，我就不需要使用main方法来做了，直接使用test来做就可以
     * 同一个函数中可以有多个test的来使用
     */
    @Test
    public void Test1()
    {
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});

        //数组转化为 集合
        // Arrays.asList(new String[]{"AA", "BB", "CC"})  之后  alt+Enter 是可以使用，不必自己去看，直接生成
        System.out.println(list);
    }
    //测试可否共存，以及可否调用其他的class中的方法
    @Test
    public void Test2()
    {
        //测试数据   Leetcode455_fencookie
        int[] g1 = new int[]{10,9,8,7};
        int[] s1= new int[]{5,6,7,8};
        int[] g2 = new int[]{1,2,3};
        int[] s2= new int[]{1,2,3};
//        Leetcode455_fencookie l1= new Leetcode455_fencookie();
        //首先Test不但可以调用当前的函数类的函数，而且不用main方法，其次也可以用来调用当前包下，其他类的函数
        System.out.println(findContentChildren1(g1, s1));
        //System.out.println(l1.findContentChildren(g2, s2));
    }

    public int findContentChildren1(int[] g ,int[] s){
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
            if (g[z1]<=s[z2])
            {
                z1+=1;
                z2+=1;
                num+=1;
                if(z1>=g.length||z2>=s.length)
                {
                    break;
                }
            }
            else {
                z2+=1;
                if(z2>=s.length||z1>=g.length)//这里必须是大于等于，因为length是从一开始的，而下标是从零开始的
                {
                    break;
                }
            }
        }
        return num;
    }
}

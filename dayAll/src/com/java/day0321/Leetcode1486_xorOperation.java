package com.java.day0321;

import org.junit.Test;

/**
 * Created by asns on 2022/3/21.
 */
public class Leetcode1486_xorOperation {
    @Test
    public void test()
    {

    }
    public int xorOperation(int n,int start)
    {
        //没办法用 变量定义数组的长度
//        int[] nums= new int[n]{};
        //第一步 生成数组 ，第二步数组异或
        //但是如果，认真观察整个题目，就会发现，他这个数组是不许要出现的
//        int k=0;//通过了，但是我想不明白，为什么
        //但是是可以规避的，一开始的错误是 int k = start的时候，循环的第一个是i=0，实际上
        //的起手第一个循环是 start*start  正确的应该是 start*(start+2*i)  之前的乘的方法
        //用循环的时候，k=1，来保证是不被k干扰的，在异或中担任这个功能的是 k=0,但是我理解不了
        //但是可以规避 想要start*(start+2*i)   那么不从0开始循环就可以了,令i=1;
        int k=start;
        for (int i=1;i<n;i++)
        {
            k^=(start+2*i);
        }
        return k;
    }
}

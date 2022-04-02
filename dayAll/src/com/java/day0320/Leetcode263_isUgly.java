package com.java.day0320;

import org.junit.Test;

/**
 * Created by asns on 2022/3/20.
 */
public class Leetcode263_isUgly {
    @Test
    public void test()
    {
        int  n=14;
        System.out.println(isUgly(n));
    }
    public boolean isUgly(int n)
    {
        //这个其实比较简单，对2,3，5进行反复的除，就是为了把某一个因子完全的析出
        // 最后一轮结束后，出现了结果是1，是丑数，出现了结果是非1，则不是
        //这里有一个问题，就是边界值0，1 和负数
        if (n==0)
            return false;
        if (n==1)
            return true;//这个是题目要求
        if (n<0)
            return false;
        while(n%2==0)
        {
            n=n/2;
        }
        while (n%3==0)
        {
            n=n/3;
        }
        while (n%5==0)
        {
            n=n/5;
        }
//        System.out.println(n);
        //这里的三个while是顺序下来的，因为即使对二取余出现结果不为0，也还要拿3，5来验证  比如10 取余 后得到5，但是不能说不是，对二
        //能除以的已经全部除过了，剩下的就是3,5

        if (n==1) {
            return true;
        }else return false;
    }
}

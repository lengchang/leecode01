package com.java.day0321;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asns on 2022/3/21.
 */
public class Leetcode1281_subtractProductAndSum {
    @Test
    public void test()
    {
            int n=234;
        System.out.println(subtractProductAndSum(n));

    }

    public int subtractProductAndSum(int n){
        //其实就是需要一个可长的数组来解决不定长数字的问题
        List<Integer> list= new ArrayList<>();
//        List<Integer> list2= new ArrayList<>();
//        for (int i=0;)  不能使用for循环，因为for循环需要明确的执行次数
//        while ()
        while (n%10!=n)
        {
//                System.out.println(n);
            list.add(n%10);
//            System.out.println(n % 10);//得先输出，然后再缩小
            n=n/10;

        }
//        System.out.println(n);
        list.add(n%10);//因为while的判断，最后一位没有加入，所以补充加入
//        System.out.println(list.toString());
        int pro=1,sum=0;
        for (int i= 0;i<list.size();i++)
        {
            pro=pro*list.get(i);//首先，我忘了初始化了，其次，相乘的起手值必须是1
            sum=sum+list.get(i);
        }
        return pro-sum;
    }
}

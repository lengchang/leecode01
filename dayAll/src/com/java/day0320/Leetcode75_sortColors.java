package com.java.day0320;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by asns on 2022/3/20.
 */
public class Leetcode75_sortColors {
    @Test
    public void test()
    {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(nums.toString());
        System.out.println(Arrays.toString(nums));
//        System.out.println(nums.toString());
    }

    public void sortColors(int[] nums){
//        Arrays.sort(nums);//我这个直接对他排序得到结果了
        //但是，我还是应该看一看具体的实现
        //实际上这个问题可以有很多的做法，比如说使用冒泡排序来实现
        //或者直接统计0 1 2的个数，然后利用java数组赋值会导致数组的地址变动，新建一个数组，然后把
        //结果赋值在nums上

        //方法二
        int a=0,b=0,c=0;
//        int[] numsg= nums.clone();
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]==0)
            {
                a=a+1;
            }else if (nums[i]==1)
            {
                b=b+1;
            }else c=c+1;
        }
//        int i=0;
        for (int i=0;i<nums.length;i++)
        {
            if (i<a)
            {
                nums[i]=0;
            }else if (i>=a&&i<a+b)
            {
                nums[i]=1;
            }
            else nums[i]=2;
        }
//        nums=numsg;  直接修改地址显然是不行的，因为方法外面调用的地址是不变的
        //还是得for循环来改变
        System.out.println(nums.toString());
        System.out.println(Arrays.toString(nums));
//        改变是改变，通过地址进行改变，但是地址是不变

    }
}

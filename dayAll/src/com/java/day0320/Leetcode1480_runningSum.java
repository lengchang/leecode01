package com.java.day0320;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by asns on 2022/3/20.
 */
public class Leetcode1480_runningSum {
    @Test
    public void test(){
        int[] nums = new int[]{1,2,3,4};
        System.out.println(nums.toString());
        System.out.println(runningSum(nums).toString());;
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public int[] runningSum(int[] nums)
    {
        int[] sum = nums.clone();
        int sumAll = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sumAll=sumAll+nums[i];
            sum[i]=sumAll;
        }
        return sum;
    }
}

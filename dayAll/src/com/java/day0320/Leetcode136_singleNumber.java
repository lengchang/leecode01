package com.java.day0320;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by asns on 2022/3/21.
 */
public class Leetcode136_singleNumber {
    //想到了先排序  于是时间复杂度有问题  默认排序的算法   O(nlogn)
    //想到了新建以个数组，但是这儿空间复杂度又有了问题
    /**
     * 不需要额外空间的方法，就往位运算上想  所以是位运算吗
     */
    //不过学校的没有这个要求，那就简单多了  位运算实在是不会
    @Test
    public void test(){
        int[] nums = new int[]{2,2,1};
        System.out.println(singleNumber(nums));
    }
    public int singleNumber(int[] nums)
    {
//        Arrays.sort(nums);
//        //排序之后两两比较，其中亮亮比较不相等的，直接输出，因为题目中已经说了，只会有一
//        //一个唯一的
//        for (int i=0;i<nums.length-1;i++)
//        {
//            if(nums[i]!=nums[i+1])
//            {
//                //问题出在这里，需要一次比对，两次移动
//
//                return nums[i];
//            }
//        }

        // 标准的做法是用位运算，之后就是暴力循环
        //内外两层循环，循环比较是，用一个index记录相等的次数，等于一的，也就是自己和自己相等的输出
        //所以从开头上，index就需要一次循环重新定义一次
        for (int i=0;i<nums.length;i++){
            int index= 0;
            for (int j = 0;j<nums.length;j++)
            {
                if (nums[i]==nums[j])
                {
                    index+=1;
                }
            }
            if (index==1)
            {
                return nums[i];
            }
        }
       return 0;

    }

}

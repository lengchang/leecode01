package com.java.common;

import java.util.Arrays;

/**
 * Created by asns on 2022/3/20.
 */
public class DiaoYongMethod {
    public int removeDuplicates(int[] nums) {
//        System.out.println(nums);
        int out1 = nums.length;
//        int out2 = nums.length;
        for (int i=0;i<out1-1;i++){//这种写法会死循环，在4的位置，因为4之后的所有都是4了，所以会一直循环前置，而无法后裔
            //也就是循环结束的边界条件满足不了
            if(nums[i]==nums[i+1])
            {
                //这里不能使用nums.length 因为这个是会缩小的  其实是可以使用的，没问题
                //或者说，不能缩小的话，才需要找一个来代替
                //不对，如果让后面的覆盖前面的，那么实际上长度是不会改变的，但是如果想要改变长度避免执行多余的计算，则需要的是一个可变的
                //这种中途改变的情况会影响运算吗，很好奇
                for (int j=i;j<nums.length-1;j++)
                {
                    nums[j]=nums[j+1];
                }
                out1=out1-1;
                i=i-1;
            }
        }
        System.out.println(Arrays.toString(nums));
        return out1;
    }
}

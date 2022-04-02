package com.java.day0320;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by asns on 2022/3/20.
 */
public class Leetcode27_removeElement {
    @Test
    public void test()
    {
        int val = 2;
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        removeElement(nums,val);
//        reremoveElement1(nums,val);
//        System.out.println(Arrays.toString(nums));
    }
    public  int reremoveElement1(int[] nums,int val){
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
    public int removeElement(int[] nums, int val) {
        //这里的难度是  如果是 3223 然后3 的话，那么第一个循环是
        //2233 那么再进行一次循环的时候，会出现数字混淆
        //思路是 先排序，然后，每次，我这个没想出好的方法来
        //这个题目其实是可以做的，就是先把原来数组中相等部分全部变为零，然后写入另一个数组中
        //非零则写，零则不写  但是题目难也就是难在这里，不允许有额外的内存使用
        //要求必须原地运行
        //这个是可以做的，只要画图就可以想明白，那就是，分两次来移动，第一次置为零，同时统计0的个数为j
        // 利用for循环不断的向前移动，但是for循环的结束条件不是length而是length-j，这样超出的部分就可以
        //不用处理了，也不用害怕陷入死循环
        //这里就又出现了一个问题，就是不能置为0，或者-1，因为这些数本身就可能是数组元素的一部分，解决办法就是不去处理
        //不变为零，因为第二次循环的操作是等于零的前移，那么这里的操作就是不进行重置，而仍然是等于val的前移
        int count= 0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==val)
            {
                count=count+1;
            }
        }
        for (int j =0;j<nums.length-count;j++)
        {
            if (nums[j]==val){
                for (int k =j;k<nums.length-1;k++)
                {
                    nums[k]=nums[k+1];
                }
                System.out.println(Arrays.toString(nums));
                j=j-1;
            }


        }
//        System.out.println(count);
//        System.out.println(Arrays.toString(nums));
        return nums.length-count;//我的错误在这里，没有选择对长度的输出
        //这就对了
    }
}

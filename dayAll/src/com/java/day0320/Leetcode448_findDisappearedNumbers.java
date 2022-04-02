package com.java.day0320;

import com.java.common.DiaoYongMethod;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by asns on 2022/3/20.
 */
public class Leetcode448_findDisappearedNumbers {
    @Test
    public void test()
    {
        int[] n=new int[]{1,3,3,6,4,4};
        int[] n1=new int[]{4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(n1));
    }
    public List<Integer> findDisappearedNumbers(int[] nums){
        Arrays.sort(nums);//调用的是Arrays这个类中的排序方法
        int [] nums2=nums.clone();
        List<Integer> list =new ArrayList<Integer>();
        //把相等的消除掉
        DiaoYongMethod diaoYongMethod= new DiaoYongMethod();
        int out = diaoYongMethod.removeDuplicates(nums);
        System.out.println(out);
        System.out.println(nums.toString());
        int k=0;
        for (int j=0;j<nums.length;j++)
        {
            //把消失了的提出来
            if(nums[k]==j+1)
            {
                k=k+1;
            }
            else list.add(j+1);
        }
        return  list;
    }
    //但是这个做法实际上是不对的，不顺利的
    //之前做过一个消失的数的第k个，当时的思路合这个其实是一样的
//    将所有正数作为数组下标，置对应数组值为负值。那么，仍为正数的位置即为（未出现过）消失的数字。
}

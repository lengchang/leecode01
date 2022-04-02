package com.java.day0321;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by asns on 2022/3/21.
 */
public class Leetcode349_intersection {
    @Test
    public void test()
    {
        int[] nums1= new int[]{1,2,2,1};
        int[] nums2= new int[]{2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));

    }
    public int[] intersection(int[] nums1,int[] nums2)
    {
        //未知长度 可以使用Arraylist;之后在转变回来
        /**
         * String[] array = (String[])list.toArray(new String[size]);  list转数组
         * List<String> list=Arrays.asList(array);//数组转List
         */
        //第一步，for循环生成相等的值的 数组
        //第二步，将数组中相同的元素去掉，for循环，除了和自己相等的以外的，也就是相等参数不等于1的，不要
        //输出，等于一的输出到一个数组中去，而这种操作方式，不需要转变后在转变回来的函数实现
        //但是还是需要的，因为实际上不知道交集数组的长度

//        ArrayList<Integer> list =new ArrayList<Integer>();
        int[] out = new int[nums1.length+nums2.length];//用有固定结果的变量定义数组的长度，是可行的，学到了
        int length1 =0;
        for (int i=0;i<nums1.length;i++)
        {
            for (int j =0;j<nums2.length;j++){
                if (nums1[i]==nums2[j])
                {
//                    list.add(nums1[i]);
                    out[length1]=nums1[i];
                    length1+=1;
                }
            }
        }
//        System.out.println(Arrays.toString(out));
        //sites.toArray(arr);  正确用法
        int[] out2 = Arrays.copyOfRange(out, 0, length1);
        int jie = removeDuplicates(out2);
        int[] out3= Arrays.copyOfRange(out2,0,jie);
//        System.out.println(Arrays.toString(out3));
//        System.out.println(removeDuplicates(out2));

//        System.out.println(Arrays.toString(out2));
//        list.toArray(out2); 错误的原因  toArray的数据类型必须是引用数据类型
        /**
         * 所以需要定义一个Integer类型的数组来实现，但是之后优雅把Integer类型的素组用for循环，转化为
         * int型的数组，这个真的很复杂，所以找一下可否避免的办法
         * 我想到的方法是，不用list,直接放入数组中，之后再做截断就可以了
         */
//        int[] out = new int[]{1,1,1};
//Arrays.copyOfRange(int[] nums, x, index);这个是把一个数组截断放入另一个数组中；这个也学到了
        //所以这里需要知道阶段的数据的长度

//        int[] out = list.toArray(new int[list.size()]);//这个的用法是错误的
        return out3;
    }
    //删除重复的元素  但是实际上的长度没有变，只是返回了要截断的位置
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
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
//        System.out.println(Arrays.toString(nums));
        return out1;
    }
}

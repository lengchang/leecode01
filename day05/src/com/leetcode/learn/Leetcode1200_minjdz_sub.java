package com.leetcode.learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by asns on 2022/3/17.
 */
public class Leetcode1200_minjdz_sub {
    @Test
    public void testCurrent()
    {
        int[] arr1 = new int[]{3, 8, -10, 23, 19, -4, -14, 27};
//        Leetcode1200_minjdz_sub l2 = new Leetcode1200_minjdz_sub();
        minAbsDifference(arr1);//好到现在为止可以说是非常满意了
    }
    //可以尝试使用arrayList类，这是一个这是一个没有固定大小限制的数组
//    ArrayList<String> ints= new ArrayList<String >();//<>中的只能是引用数据类型
    public List<List<Integer>> minAbsDifference(int[] arr){
        //第一个List的学习   现在就是在学习  希望五十节课之内学习好
        //第二个Integer和int 的区别是什么？  Array的对象必须是引用对象，但是Int是基础数据对象，所以要封装之
        //封装后的对象就是Integer
        Arrays.sort(arr);//这个时候arr中已经是有序的了
        int subValue=0,comSubValue;
        for (int i=0;i<(arr.length-1);i++)
        {
//            comSubValue=arr[i+1]-arr[i];//因为已经排了序，所以后面的一定比前面的大
            //这里出现了数组越界异常，因为这里有一个i+1的length和数组下标天然相差一的问题
            comSubValue=arr[i+1]-arr[i];
            if(i==0)
            {
                subValue=comSubValue;
            }
            if (subValue>=comSubValue)
            {
                subValue=comSubValue;
            }
        }
        //到这里实际上是拿到了最小值
        //然后是把能相减等于最小值的每一组数写入到list中去
        //但是我不会对list的输入，我也不知道他的内存构成和方法
        System.out.println(subValue);
        System.out.println(Arrays.toString(arr));
        List<List<Integer>> list= new ArrayList<List<Integer>>();
        for (int i=0;i<arr.length-1;i++) {
            if (subValue==(arr[i+1]-arr[i])) {
                List<Integer> ll1 = new ArrayList<Integer>();
                ll1.add(arr[i]);
                ll1.add(arr[i+1]);
                list.add(ll1);
            }
        }
        System.out.println(list.toString());
        return list;
        //我其实不笨，我只是学的东西太少了
    }
}

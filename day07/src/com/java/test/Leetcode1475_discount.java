package com.java.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by asns on 2022/3/20.
 */
public class Leetcode1475_discount {
    @Test
    public void test(){
        int[] price = new int[]{8,4,6,2,3};
//        System.out.println(price);
//        System.out.println(Leetcode1475_discount(price).toString());
        /**
         * 对于一个一维数组，他在转换成字符串的时候应该调用Arrays.toString();
         * 对于一个多维数组，他在转换成字符串的时候应该调用Arrays.deepToString();
         * System.out.println(Arrays.toString(a));
         * System.out.println(Arrays.deepToString(a1));
         */
        System.out.println(Arrays.toString(price));
        //数组自带的toString 方法，没有被重写过，所以显示的是地址
    }
    public int[] Leetcode1475_discount(int[] prices){
//        int[] price2 = prices.clone();//尝试了之后，发现地址不一样的，而且不用强制类型转换
        //不过其实本题不需要这样科隆，因为前面的直接改了也可以，本题只需要一次for 循环，如果
        //需要两次for循环，则这个问题需要新建一个和原来的指向不同地址的数组
        //可以看到这个位置，这里实际上两个数组指向了同一个地址
        //解决这个问题的方法有两种，第一种  使用克隆方法：
        //int[] price2=(int[])price.clone()
        //方法二 使用System的静态方法   但是找方法要求参数，原数组，复制的起始位置，目的数组，目的数组的起始位置，复制的长度
        //也就是说 新建price2的是偶，需要先获得price的长度，来定义price2的长度，这是不可能的，除非price 的长度固定
        for (int i=0;i<prices.length-1;i++)//这里，实际上在最后一个时候，j就在加一后越界了，而这个折扣，最后一个是永远享受不到的
        {
            int j=i+1;
            while (j<prices.length&&prices[j]>prices[i])//这里之前没有考虑的问题是，其实相等的时候，也是可以相减的，但是
            //其实和事实是不相符的
            {
                j=j+1;
            }
            if(j!=prices.length) {
                prices[i] = prices[i] - prices[j];
            }
        }
        return prices;
    }
}

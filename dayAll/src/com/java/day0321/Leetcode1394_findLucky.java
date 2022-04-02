package com.java.day0321;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by asns on 2022/3/21.
 */
public class Leetcode1394_findLucky {
    @Test
    public void test()
    {
        int[] nums = new int[]{1,2,2,3,3,3};
        System.out.println(findLucky(nums));
    }
    public int findLucky(int[] nums)
    {
        //最暴力的想法，莫过于两次循环，记录各个数  第一次排序，第二次原来的数组克隆
        //但是实际上进行排序是没有必要的  事实上第一步统计出有哪几个数字，第二步统计个数，第三步进行比较
        // 第三 把多余的去掉，剩下的数组都是唯一的，用这个数组和第一个克隆出来的数组进行匹配的，双重循环
        //得到每个数的重复个数，用修改后的数组中的元素和自己的出现次数进行比较，相等的写入一个可变长数组中去
        //之后对可变长数组进行排序，然后取出最大值


        //而实际的做法是   利用哈希数组  也就是说需要稍微学习一下hashmap
        //key是数字，value是次数
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();//<key,value>
        for(int i:nums)
        {
            //如果之前key值不存在，则使用0+1放入value，如果存在则用value+1重放入value
            //也就是说，对于同一个key可以进行多次value的赋值，而且后来的赋值会覆盖原来的赋值
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        //之后的要求是，多个幸运数中返回最大的，如果是没有幸运数，则返回-1，这里的技巧是先定义一个 count=-1
        //在其下面，进行修改，最后输出这个数
        int count=-1;
        System.out.println(hashMap);
        System.out.println(hashMap.entrySet());
        //entrySet() 方法可以与 for-each 循环一起使用，用来遍历迭代 HashMap 中每一个映射项
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet())
        {
            int key = entry.getKey();int value = entry.getValue();
            if (key==value)
            {
                count = Math.max(count,key);
            }
        }
        return count;
//        for ()
        //getOrDefault() 方法
        /** sites.put(1, "Google");
         sites.put(2, "Runoob");
         sites.put(3, "Taobao");
         System.out.println("sites HashMap: " + sites);
         * / key 的映射存在于 HashMap 中
         // Not Found - 如果 HashMap 中没有该 key，则返回默认值
         String value1 = sites.getOrDefault(1, "Not Found");
         System.out.println("Value for key 1:  " + value1);

         // key 的映射不存在于 HashMap 中
         // Not Found - 如果 HashMap 中没有该 key，则返回默认值
         String value2 = sites.getOrDefault(4, "Not Found");
         System.out.println("Value for key 4: " + value2);
         对应的结果，显然key=1是存在的，key=4是不存在的
         Value for key 1:  Google
         Value for key 4: Not Found
         */
//        hashMap.put();//这是数据插入
//        hashMap.get();//这个是根据key获得val的方法
//        hashMap.remove(key) 通过关键值来进行删除  而删除所有的键值对可以调用clear方法
        /**
         * 可以使用 for-each 来迭代 HashMap 中的元素。
         * 如果你只想获取 key，可以使用 keySet() 方法，然后可以通过 get(key) 获取对应的 value，
         * 如果你只想获取 value，可以使用 values() 方法。
         */
//        return 0;
    }
}

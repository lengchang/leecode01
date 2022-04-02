package com.leetcode.learn;

import java.util.Arrays;

/**
 * Created by asns on 2022/3/17.
 */
public class ArraysLeiLearn {
    //Arrays 类中包含的算法
    /**
     *Arrays 操作数组的工具类
     */
    public static void main(String[] args) {
        int[] arr1= new int[]{1,3,2,4};
        int[] arr3= new int[]{1,3,2,4};
        int[] arr4= new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int[] arr2= new int[]{1,2,3,4};//ctrl+alt+下  复制当前行到下一行
        boolean isEquals= Arrays.equals(arr1,arr2);//这种类可以直接调用，而不用新建吗
        /**
         * 基本数据类型不需要new而直接定义，而引用数据类型在定义实例时需要new实例对象。
         * 一个类中有类的方法，使用static修饰的，和对象的方法，即没有static修饰的方法，
         * 类的方法可以直接使用类名加点加方法名调用，对象的方法必须先new一个实例，再由实例调用
         */
        System.out.println(isEquals);
        System.out.println(Arrays.toString(arr1));//这个就是遍历数据后输出，而正常的情况下
        //直接输出得到的实际上是数组的位置的编码
        Arrays.fill(arr1,10);//替换了之后是不可以直接输出的，还是toString 来输出
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr3);//这个底层使用快速排序实现的
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.binarySearch(arr4, 210));//这个是底层实现的二分查找
        int index = Arrays.binarySearch(arr4,-34);
        System.out.println(index);//这也是一种根据方法的返回定义来设计的写法
        System.out.println(Arrays.binarySearch(arr4, 15));//这是数组中没有的情况
        //只要返回的是一个负数，就是没找到的意思
        //index返回的数据是一个大于零的数字就是找到了
        String[] arr5 = new String[]{"AA","BB","CC"};
        System.out.println(arr5[1].toString());//String数组是自己可以携带toString 函数的


    }
}

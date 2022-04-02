package com.leecode.test;

/**
 * Created by asns on 2022/3/16.
 */
public class ArrayJieshao {
    public static void main(String[] args) {//唯一的入口方式
        /**
         * Array 的测试，之前是不会的
         * 数组的索引是从1开始的
         * 数组的长度就是数组中元素的个数
         * 数组是引用数据类型，数组的元素可以是基本数据类型，也可以是引用数据类型
         * 在内存中是连续的存储结构
         * 数组的长度，一旦确定，就不可以修改   所以数据超出大小，只能再申请一个更大的数组，然后把
         * 原来的数组的元素按序填入
         * 数组分类
         */
        /**
         * 一维数组的六个问题   声明和初始化，调用指定位置的数组元素
         * 数组的长度  遍历数组   数组元素的默认初始化   内存中如何分配数组结构，数组的内存解析
         * 这也是二维数组的问题
         */
        //声明和初始化   此处是静态初始化---数组的初始化和数组的元素赋值操作同时进行
        int[] ids=new int[]{1002,1003,1004,1001};//数组是引用数据类型，引用数据类型的初始化是需要new的
        //同样的还有类，接口这两种引用数据类型
        //错误的写法
        //int[] nums= new int[];  注意 int[] nums = new int[5]相当于动态是对的
        //int[5] nums = new int[]; 也是错的，前面的永远里面没有东西
        //int[] nums = new int[5]{1,2,3,4,5}  也是错的

        // 动态初始化-----数组和数组元素的赋值分开进行
        //  String 是引用数据类型
        String[] names = new String[5];
        String aa= "this is a chinese man";

        //数组元素的调用
        names[0] = "闫科杉";//而实际上这个位置还是可以使用方法的，String可以视为数组，然后用
        //charAt 方法
        //数据库的交互的索引是从一开始，java是从零开始
        names[1] = "Tom";

        //names[5]编译没事，但是运行会错误

//        for (int i=0;i<5;i++) 这个是写的不对的，或者说是不好的，因为事实上，这个
        //数组一般给的时候，是不知道大小的，这个问题不应该是已知一个固定大小来写
        //下面是正确的写法，而是为什么讲了数组的六个角度
        for (int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
            System.out.println(names[0].charAt(0));
        }
        /***
         * 获得数组的长度  属性length实现
         */
        System.out.println(names.length);
        //选中后按住ctrl+/  就把选中的部分全部注释了  同一个方式可以把注释消除
        //crtl+shift+/多行注释

        /**
         * 遍历数组 for循环实现
         */

        /**
         * 数组元素的默认初始化值
         * 数组元素的是整形，则全部默认是0   对 short int byte 都适合
         * 数组元素是浮点型 则全部默认是0.0
         * 数组元素是char型，是一个0或者'\u0000' 而不是'0'，是ASCII 中的0
         * 'a' 97  'A'  65  去看截图  也就是说小大相差32
         * char 的 0==0的结果是true
         * 数组元素是boolean 是false 因为底层的数据中 0对应的false
         * 数组元素是引用数据类型的时候，初始化值是 null 不是"null"
         * 意思是空值，没有赋值的意思，这个实际上我自己最开始测试的时候，下意识就是这样实现的
         */
        int[] arr= new int[4];
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }



    }
}

package com.leecode.test;

/**
 * Created by asns on 2022/3/16.
 */
public class TodayMethodTest {
    public static void main(String[] args) {
        //int[] arr = new arr[]{2,3,4,7,11}; 注意这里new的是int
        int[] arr = new int[]{2,3,4,7,11};
        int[] arr2 = new int[]{1,2,3,4};
        //int[] arr3 = new int[]{1002,1003,1004};  和测试用例要求不一致了
        Leecode1539_QueshiK l1 = new Leecode1539_QueshiK();
        System.out.println(l1.foundint(arr, 5));
        System.out.println(l1.foundint(arr2, 2));
    }
}

package com.leetcode.learn;

/**
 * Created by asns on 2022/3/17.
 * 所谓的反转，实际上就不是把结果视为数，而是把结果视为String
 */
import java.util.ArrayList;
import java.util.Collections;
public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        //ArrayList arrayList1= new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
//        int[] ints= new int[]{1,2,3,4,5,6};
//        Collections.reverse(ints);
        //而实际上的数据反转方法，对应的是List类型的数据
        System.out.println("反转前排序: " + arrayList);
        Collections.reverse(arrayList);//这个也是直接调用，而没有new的，为什么
        System.out.println("反转后排序: " + arrayList);
    }

}

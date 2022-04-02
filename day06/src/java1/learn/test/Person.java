package java1.learn.test;

//import org.junit.Test;

//import org.junit.Test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by asns on 2022/3/19.
 * 关于如何快速新建一个类
 */
public class Person {
    //private  String name;
    //private int agg;
    //alt shift s 提供构造器
    @Test
    public void test01(){
        //测试数据   Leetcode455_fencookie
        int[] g1 = new int[]{10,9,8,7};
        int[] s1= new int[]{5,6,7,8};
        int[] g2 = new int[]{1,2,3};
        int[] s2= new int[]{1,2,3};
        //第一，是不能调用其他不再当前包下的函数的
       // Leetcode455_fencookie l1= new Leetcode455_fencookie();
        //System.out.println(l1.findContentChildren(g1, s1));
        //System.out.println(l1.findContentChildren(g2, s2));


    }
    @Test
    //这里测出来一个问题买就是test的时候，不能把文件放在包的名字以java为第一等级的包内，不然就会报这个错误
    //所以之后创建的左右的半都不要这样子
    public void test02(){
        Collection collection= new ArrayList();
        collection.add(new String("Tome"));
        Iterator iterator = collection.iterator();//这种方式是可以使用的

        while(collection.iterator().hasNext()){//这个会死循环，原因是每次while 的时候，使用这种方式
            //都会重新尝试一个iterator的迭代器对象，默认游标都在第一个位置上边，所以永远死循环
            System.out.println(collection.iterator().next());

        }
    }
}

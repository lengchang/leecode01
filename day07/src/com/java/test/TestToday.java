package com.java.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by asns on 2022/3/19.
 */
public class TestToday
{
    @Test
    //这里测出来一个问题买就是test的时候，不能把文件放在包的名字以java为第一等级的包内，不然就会报这个错误
    //所以之后创建的左右的半都不要这样子
    //但是第一个等级的包不叫做java，之后等级的包叫做java是没事情的
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

package com.java.day0321;

import org.junit.Test;

/**
 * Created by asns on 2022/3/21.
 */
public class CharFound {
    @Test
    public void test()
    {
        //java中的replace 方法，好像只能进行一个char的转化，不能进行char转变为String
        //所以尝试一下replaceAll方法
        String string = new String("1.1.1.1");
        System.out.println(string.replace(".", "[.]"));
//        System.out.println(string.replaceAll("a", "["));
//        //regex是正则表达式，不能实现我想要的算法，所以一个办法就是 用charAt加for循环来实现
//        String Str = new String("www.google.com");
//        System.out.print("匹配成功返回值 :" );
//        System.out.println(Str.replaceAll("(.*)google(.*)", "runoob" ));//这个是模糊查询
//        System.out.println(Str.replaceAll("google", "runoob" ));//这个就是String变String
//        System.out.print("匹配失败返回值 :" );
//        System.out.println(Str.replaceAll("(.*)taobao(.*)", "runoob" ));
    }
}

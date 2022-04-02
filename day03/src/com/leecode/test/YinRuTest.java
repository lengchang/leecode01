package com.leecode.test;
import com.leecode.hot30.Leecode342_mi4;

/**
 * Created by asns on 2022/3/16.
 * 这里出现过两个问题，第一个就是包的引入，解决方法是 alt+Enter同时使用
 * 这个应该是同时可以用来引入自己的和官方的
 * 第二个就是引用方法的时候，显示错，这是因为引用的方法没有设置成为public
 */
public class YinRuTest {
    public static void main(String[] args) {
        int number = 16;
        int number2 = 21;
        int number3 = 64;
        Leecode342_mi4 m1= new Leecode342_mi4();
        System.out.println(m1.isPowerOfFour(number));
        System.out.println(m1.isPowerOfFour(number2));
        System.out.println(m1.isPowerOfFour(number3));
        m1.sysoutWhatIn(12);
    }
}

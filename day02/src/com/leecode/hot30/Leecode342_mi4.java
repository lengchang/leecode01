package com.leecode.hot30;

/**
 * Created by asns on 2022/3/11.
 */

/**
 * 是否是应该设定一个类，然后导入呢  是的
 * 而且这种方式中，可以在这一个类中同时写多个方法
 */
public class Leecode342_mi4 {
    /**
     *
     * @param n
     * @return
     *
     *  实际上这种方法，我根本学不会，事实上有一种
     *  我可以理解的方法，就是循环除以四，且要求每次循环的结果都对四取余结果是零
     *  也就是整除，直到最后结果是1结束
    */
    public boolean isPowerOfFour1(int n) {
        int a = 0x55555555; //010101....用于检测n的 位1 是否位于奇数位
        //特判 0
        if (n == 0) {
            return false;
        }
        if ((n & (n - 1)) == 0 && (n & a) == n) {
            return true;
        }
        return false;
    }
    public boolean isPowerOfFour(int i){
        while(i!=1)
        {
            if(i%4!=0)//if是成立则进入循环体，这里的意思是如果不整除就进入循环
            {
                return false;
            }
            else i=i/4;
        }
        return true;
    }
    public void sysoutWhatIn(int n){
        System.out.println("n= "+n);
    }

}


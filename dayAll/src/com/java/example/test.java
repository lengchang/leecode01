package com.java.example;

import org.junit.Test;

/**
 * Created by asns on 2022/3/27.
 */
public class test {
    @Test
    public void test()
    {

    }
    public int out(int y, int m,int d)
    {
        if(y>=2100||y<=1900)
        {
            return 0;
        }
        //计算相差的天数
        int a,b,c;
        int zhou;
        if(m<=3)
        {
            b= m+12-3;
            y=y-1;
        }
        a=y-2022;
        b=m-3;
        c=d-26;
        int day =a*365+b*30+c;
        //
        day= day%7;
        //相加的到结果对7取余
        zhou =(6+day)%7;
        return 0;
    }
}

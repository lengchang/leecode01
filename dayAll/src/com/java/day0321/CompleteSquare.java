package com.java.day0321;

import org.junit.Test;

/**
 * Created by asns on 2022/3/21.
 */
public class CompleteSquare {
    @Test
    public void test()
    {
        System.out.println(cmpSqu(16));
    }
    public boolean cmpSqu(int num)
    {
        if (Math.sqrt(num)*Math.sqrt(num)==num)
            return true;
        else
            return false;
    }
}

package com.leecode.test;

/**
 * Created by asns on 2022/3/16.
 */
class ForTest01 {
    public static void main(String[] args) {
        for(int i= 1;i<=150;i++)
        {
            System.out.print(i+" ");
            if (i%3==0)
            {
                System.out.print("fo1 ");
            }
            if (i%5==0)
            {
                System.out.print("fo2 ");
            }
            if (i%7==0)
            {
                System.out.print("fo3 ");
            }
            System.out.println(" ");
        }
    }
}

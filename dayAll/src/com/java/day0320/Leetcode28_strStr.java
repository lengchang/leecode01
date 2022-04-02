package com.java.day0320;

import org.junit.Test;

/**strStr的实现
 * Created by asns on 2022/3/20.
 * 这个不就是字符串匹配吗
 */
public class Leetcode28_strStr {
    @Test
    public void test()
    {
        String haystack = "";
        String needle = "";
        System.out.println(haystack == null);
        System.out.println(haystack.length());
        System.out.println(strStr(haystack, needle));
        //indexOf()方法实际上
    }
    public int strStr(String haystack,String needle)
    {
//        System.out.println(haystack.toString());
//        System.out.println(haystack.length());
        //实际上是用charAt函数来比较
        if(needle!=null&&haystack!=null&&haystack.length()!=0&&needle.length()!=0) {
            int j = 0, k = 0;
            for (int i = 0; i <= haystack.length(); i++) {
                if (j != haystack.length()) {
                    for (int l = 0; l < needle.length(); l++) {
                        if (k != needle.length()) {
                            if (haystack.charAt(j) == needle.charAt(k)) {
                                j = j + 1;
                                k = k + 1;
                            } else {
                                j = j + 1;
                                break;
                            }
                        } else {
                            return i - 1;
                        }

                    }
                } else return -1;
//            System.out.println(haystack.charAt(i));
            }
            return 0;
        }
        else return 0;
    }
}

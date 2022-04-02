package com.java.day0321;

/**
 * Created by asns on 2022/3/21.
 */
public class Leetcode709_toLowerCase {
    public String toLowerCase(String s)
    {
//        return s;
//        return s.toLowerCase();  //这是语言自带的大写字母转化为小写字母的工具
        //这里实际上有两种实现方式  第一种  使用hashMap  大小写凑一组对应元素，实际上也不过是26个
        //第二中方式  从ASCII码的角度来谈[65,90]大写  [97,122]小写  相差32
        /**
         * 如果我们发现 \textit{ch}ch 的 \text{ASCII}ASCII 码在 [65, 96][65,96] 的范围内，
         * 那么我们将它的 \text{ASCII}ASCII 码增加 3232，即可得到对应的小写字母
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch += 32;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}

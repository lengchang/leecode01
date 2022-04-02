package com.java.day0321;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by asns on 2022/3/21.
 */
public class Leetcode20_isValid {
    @Test
    public void test()
    {
        String st = "()[]{}";
        System.out.println(isValid(st));
    }
    //这个应该是栈的基础应用
    public boolean isValid(String s)
    {
        /**
         * 注意到有效字符串的长度一定为偶数，因此如果字符串的长度为奇数，我们可以直接返回False，
         * 省去后续的遍历判断过程
         */
        if (s.length()==0)
        {
            return true;
        }
        if (s.length()%2!=0)
        {
            return false;
        }
        /**
         * Character 类用于对单个字符进行操作。
         * Character 类在对象中包装一个基本类型 char 的值
         * int----Integre  char---Character
         */
        //如何声明一个char类型的栈   栈是按照List来实现的，所以也得遵守list的规则
        Stack<Character> stack = new Stack<Character>();
        //如何把一个String 变成Char的数组,这样就不必使用charAt方法来进行操作了
        char[] charArray= s.toCharArray();
        System.out.println(Arrays.toString(charArray));
        //之后的做法是，for循环把char数组的元素入栈，如果是左括号直接入栈，如果是右括号，这在
        //栈不空的时候入栈，如果是栈是空的，那么直接false输出
        for (int i=0;i<charArray.length;i++)
        {
//            if (charArray[i]=="(") "("是string类型的  '('是char类型的
             if (charArray[i]=='('||charArray[i]=='{'||charArray[i]=='[')    ////'('是char类型的
             {
                stack.push(charArray[i]);
             }
             else
             {
                 if (!stack.isEmpty())
                 {
                     if (charArray[i]==')')//pop的执行结果是出栈的那个元素，所以这里可以一边执行，一边进行判断
                         //这里还有一个问题，就是这个进行括号书写的时候，有中英文的区别，别写错了
                     {
                         if (stack.pop()!='(')
                         {
                             return false;
                         }
                     }
                     if (charArray[i]==']')
                     {
                         if (stack.pop()!='[')
                         {
                             return false;
                         }
                     }
                     if (charArray[i]=='}')
                     {
                         if (stack.pop()!='{')//如果是配对的，在执行if语句的判断时，就已经输出了
                         {
                             return false;
                         }
                     }
                 }
                 else return false;
             }

        }
        //循环完了之后，是有可能有剩余的，如果剩余了，那么就是false
        return stack.isEmpty();
    }
}

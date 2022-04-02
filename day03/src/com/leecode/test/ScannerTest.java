package com.leecode.test;

/**
 * Created by asns on 2022/3/15.
 * 用包需要先导入包
 */
/**
 * 这里解决了一个import 导入消失的问题
 * 有意思，这里就可以使用了
 */

import java.util.Scanner;
class ScannerTest {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入你的体重:");
        double db=scan.nextDouble();
        System.out.println(db);
        int num=scan.nextInt();//获得int型的数据类型
        //scan.next后面会提示超级多的方法
        System.out.println(num);
        //java的类库很强大啊
        //String类型的是用next(),其他的都是nextXxxx();
        String gender=scan.next();
        char genderChar=gender.charAt(1);
        //这里的1，实际上是第二个位置
        System.out.println(genderChar);
        //java提供的，用来获取字符串中某个位置的字符的方法

    }

}

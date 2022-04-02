package com.leecode.hot30;

/**
 * Created by asns on 2022/3/16.
 */
public class Mi4Test {
        public static void main(String[] args) {
            /**
             * 这里的问题时，static主方法，必须要求辅助方法也是static吗
             * 给的错误是，无法从静态上下文中引用非静态方法
             * 具体的方法就是写一个专门的主类来运行方法，另一个类来写方法
             */
            int number = 16;
            int number2 = 21;
            int number3 = 169;
            Leecode342_mi4 m1= new Leecode342_mi4();
            System.out.println(m1.isPowerOfFour(number));
            System.out.println(m1.isPowerOfFour(number2));
            System.out.println(m1.isPowerOfFour(number3));
//            m1.sysoutWhatIn(12);

        }
}


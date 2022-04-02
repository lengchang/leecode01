package com.leecode.test;

import java.util.HashMap;

/**
 * Created by asns on 2022/3/11.
 */
public class DebugTest {
    public static void main(String[] args) {
        //for循环的模版 fori
        /**
         *
         * 这里有一个条件断点的使用方法，在for 循环中加入断点，然后再断点上点击
         * 右键  然后添加条件，注意这里添加的条件必须是boolean类型的，然后点击done
         * 这里就被设置为条件断点了，此时呢再进行debug
         * 他会停在这个位置，而且是停在for循环中i=60的位置上，这个可以说是for循环调试
         * 的特别好用的一个功能，解决我之前对于排序算法的头疼的问题
         */
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }
        HashMap<String,String> map=new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","qinghua");
        /**
         * 这里还有一个功能，查看表达式的值，快捷键是ctrl+u
         * 点击一下，把焦点放在这个位置，然后ctrl+u，他就选中，之后点击evaluate这个按钮
         * 就可以看表达式内部的值
         */
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = "+age);
        map.remove("major");
        System.out.println(map);
        /**
         * 最后一个要强化的是，条件断点
         * 调试的时候在循环里面增加条件判断
         */
        /**
         * 断点可以在对应位置点一下触摸板来产生
         * 向下的箭头是一条一条执行
         * 向右的绿色三角是跳到下一个断点处
         * 两个红点是可以显示一个视图，单独显示所有的断点
         * 跑完之后，可以按小虫的按钮再让它跑起来
         * 红色指向右下角的箭头和蓝色指向右下角的箭头的作用是一样的
         * 红色指向右下角的箭头是进入方法内部，蓝色的向右上的箭头是弹出，反复进入弹出可以到达
         * java定义的方法里面，这里的原理是进入的是第一个方法，如果不是目的方法，则跳出，然后
         * 再进入，会顺序进入第二个方法，这样顺序的找，直到找到自己想要的那个方法为止
         * 而在进入的那个更深一次的方法中，仍然可以使用向下箭头来一条一条执行，而在这个更深的方法中
         * 仍然可以使用into箭头继续向内打开
         * 红色带杠的圆，如果点击所有的断点就全部变成灰色，就失去作用了
         * 红色正方形点击，则整个调试的程序就结束了，停止了
         */
    }
}

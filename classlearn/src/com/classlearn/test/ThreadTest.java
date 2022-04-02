package com.classlearn.test;

/**
 * 双击shift 出现搜索框
 * 多线程的创建 方法如下
 * 1.创建一个继承与Thread类的子类，重写Thread类的run方法，，创建Thread类的子类的对象，
 * 通过此对象调用start()方法
 * Created by asns on 2022/3/17.
 */
class MyThread extends Thread{//如何点开i一个类去内部看一看呢，就是按住shift键来点击
    //如何找到一个类中定义好的方法呢 ctrl+o 然后输入这个方法的名字，然后enter
    //这里直接写一个run,他就会自动弹出，帮助创建，然后把方法体去掉，然后进行重写
    //这里这个@Override应该是所谓的接口，但是我不知道如何定义接口，以及接口如何使用
    //这里需要学习一下  没办法了，还是从头学习把
    @Override
    public void run() {
       // super.run();
        //重写是针对方法体的，而方法体如何写，被决定于要做的事情
    }
}
public class ThreadTest {
}

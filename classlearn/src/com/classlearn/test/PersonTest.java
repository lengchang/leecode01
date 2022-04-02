package com.classlearn.test;

/**
 * Created by asns on 2022/3/17.
 * 1.创建类，设计类的成员
 * 2.创建类的方法
 * 3.调用对象的结构
 * 和Scanner的区别是，这个是已经设计好的类
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person的对象==类的实例化==实例化一个类
        Person p1 = new Person();
        Person p2= new Person();//每个对象各有一套属性--非static的这个要注意！！！！
        //修改一个属性的值，不影响另一个对象的数学的值
        // 这个如果不赋值的话，实际上的默认填充
        //是和一维数组的默认初始化是一致的
        //调用对象的结构，属性或者是方法   都是通过对象.XX 来实现
        p1.name="Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        p1.eat();
        p1.talk("Chinese");
        Person p3= new Person();

        //这里的将P1变量保存的地址值赋值给p3，导致p1和p3指向同一个地址
        //对象和数组的赋值，都是把地址直接付给了！！！！！！
        //在new的时候，是指向不同的地址的，但是在赋值之后，就指向了同一个地址
        //这一点和c语言是不一样的
        p3=p1;
        p3.age=10;
        System.out.println(p3.name);
        System.out.println(p1.age);


    }
}
class Person
{
    //属性==成员变量==field==域，字段
    String name;
    int age=1;
    boolean isMale;

    //方法==也就是行为==函数==method
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){

    }
    public void talk(String language){
        System.out.println(language);
    }



}
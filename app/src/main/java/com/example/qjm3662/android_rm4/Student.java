package com.example.qjm3662.android_rm4;

/**
 * Created by qjm3662 on 2016/12/4 0004.
 */
public class Student extends Person{
    String name;
    public Student() {
        name = "Robbin";
    }

    public static int a  = 5;

    public void test(){
        a++;
        System.out.println(a);
    }


    @Override
    public void sayHello() {
//        super.sayHello();
//        super.age = 5;
//        super.name = "5";
        System.out.println(super.name + " say Hello");
    }
}

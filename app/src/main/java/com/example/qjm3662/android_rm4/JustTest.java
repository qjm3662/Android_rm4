package com.example.qjm3662.android_rm4;

public class JustTest {
//    public static void changeSex(Person p){
//        if(p.isSex()){
//            p.setSex(Person.WOMAN);
//        }else{
//            p.setSex(Person.MAN);
//        }
//    }

    public static void test(int a, String... books){
        for(String tmp : books){
            System.out.println(tmp);
        }
    }
    public static void test2(Person p1, Person p2){
        String temp = p1.getName();
        p1.setName(p2.getName());
        p2.setName(temp);
    }

    public static void main(String[] args) {
//        int a;      //基本数据类型
//        Integer ab = null;
//        a = 0;
//        Person p = new Person("James", "35082316645243523", 18, Person.MAN);
////        System.out.println(p.toString());
////        changeSex(p);
////        System.out.println(p.toString());
//        p.sayHello();
//        p.sayHello("Jane");
//        test(0, "James", "201693356");


//        Person p1 = new Person("Rob1", "223156156136");
//        Person p2 = new Person("Rob2", "sadfs");
//
//        p1.sayHello("Robbin");
//        test(5, "lalal", "lululu");
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//
//        test2(p1, p2);
//
//        int[] a = new int[5];
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());

        Student s = new Student();
        s.sayHello();
//        s.sayHello();
//        System.out.println(s.toString());
    }
}

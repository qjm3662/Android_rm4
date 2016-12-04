package com.example.qjm3662.android_rm4;

public class Person{
    protected String name;
    String id;
    int age;
    int sex;

    public Person(){
        name = "James";
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void sayHello(String target){
        System.out.println("Hello " + target);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
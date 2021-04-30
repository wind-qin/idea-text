package com.fc.bean;

public class Student {
    private String name;
    private Integer age;

    public void eat(){

        System.out.println("早安！！！");

    }

    public void sleep(){
        System.out.println("晚安！！！");
    }


    public Student(){
        System.out.println("无参构造！！！");
    }

    public Student( String name, Integer age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

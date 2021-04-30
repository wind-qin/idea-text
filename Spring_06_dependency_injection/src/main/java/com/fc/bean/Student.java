package com.fc.bean;

public class Student {

    private String name;
    private Integer age;
    private String info;

    private Car car;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", info='" + info + '\'' +
                ", car=" + car +
                '}';
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }

    public void setInfo( String info ) {
        this.info = info;
    }

    public void setCar( Car car ) {
        this.car = car;
    }

    public Student( String name, Integer age, String info, Car car ) {
        this.name = name;
        this.age = age;
        this.info = info;
        this.car = car;
    }
}

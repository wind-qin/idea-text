package com.fc.bean;

public class User {
    private String name;

    private String age;

    private House house;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", house=" + house +
                '}';
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setAge( String age ) {
        this.age = age;
    }

    public void setHouse( House house ) {
        this.house = house;
    }

    public User( String name, String age, House house ) {
        this.name = name;
        this.age = age;
        this.house = house;
    }
}

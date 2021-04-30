package com.fc.bean;

public class Car {

    private String mold;
    private String color;


    @Override
    public String toString() {
        return "Car{" +
                "mold='" + mold + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setMold( String mold ) {
        this.mold = mold;
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public Car( String mold, String color ) {
        this.mold = mold;
        this.color = color;
    }
}

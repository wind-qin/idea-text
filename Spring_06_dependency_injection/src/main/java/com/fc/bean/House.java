package com.fc.bean;

public class House {

    private String address;
    private Float price;




    public House( String address, Float price ) {
        this.address = address;
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", price=" + price +
                '}';
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    public void setPrice( Float price ) {
        this.price = price;
    }
}

package com.company;

public abstract class House implements Taxable {

    private double square;
    private int roomCount;
    private int value;
    private String city;
    private String street;

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getValue() {
        return value;
    }

    public void setPrice(int value) {
        this.value = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public House(int value, String city, int roomCount, float square, String street)
    {
        this.value = value;
        this.city = city;
        this.roomCount = roomCount;
        this.square = square;
        this.street = street;
    }
    // public abstract int go();
}

package com.company;

public class Flat extends House implements Printable {

    private float kitchenSquare;

    public float getKitchenSquare() {
        return kitchenSquare;
    }

    public void setKitchenSquare(float kitchenSquare) {
        this.kitchenSquare = kitchenSquare;
    }

    public Flat(float kitchenSquare, int value, String city, int roomCount, float square, String street) {
        super(value, city, roomCount, square, street);
        this.kitchenSquare = kitchenSquare;
    }

    @Override
    public void print() {
        System.out.println("Welcome to Flat!");
    }

    @Override
    public float returnTax() {
        return super.getValue()*0.2f;
    }
}

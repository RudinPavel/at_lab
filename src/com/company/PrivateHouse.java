package com.company;

public class PrivateHouse extends House implements Valuable, Printable {

    private float yardSquare;

    public float getYardSquare() {
        return yardSquare;
    }

    public void setYardSquare(float yardSquare) {
        this.yardSquare = yardSquare;
    }

    public PrivateHouse(float yardSquare, int value, String city, int roomCount, float square, String street) {
        super(value, city, roomCount, square, street);
        this.yardSquare = yardSquare;
    }

    @Override
    public void print() {
        System.out.println("Welcome to Private House!");
    }

    @Override
    public float returnTax() {
        return super.getValue()*0.17f;
    }

    @Override
    public int returnValue() {
        return super.getValue();
    }
}

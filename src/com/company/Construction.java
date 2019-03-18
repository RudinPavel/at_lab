package com.company;

public class Construction extends House implements Valuable{

    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Construction(String material, int value, String city, int roomCount, float square, String street){
        super(value, city, roomCount, square, street);
        this.material = material;
    }

    @Override
    public float returnTax() {
        return super.getValue()*0.15f;
    }

    @Override
    public int returnValue() {
        return super.getValue();
    }
}
package com.matheesh.collections;

public class Vehicle {

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    private String make = "";
    private String model = "";
    private int price = 0;
    private boolean isElectric;

    public Vehicle(String make, String model, int price, boolean isElectric){
        this.make = make;
        this.model = model;
        this.price = price;
        this.isElectric = isElectric;
    }

    public String toString() {
        return "Vehicle" + " = " + "Make-->" + getMake()
                + ", Model-->" + getModel()
                + ", Price-->" + getPrice()
                + ", Electric-->" + isElectric();
    }
}

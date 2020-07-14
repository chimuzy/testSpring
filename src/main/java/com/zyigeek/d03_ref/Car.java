package com.zyigeek.d03_ref;

public class Car {
    private String label;
    private double price;

    public Car(){

    }
    public Car(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "label='" + label + '\'' +
                ", price=" + price +
                '}';
    }
}

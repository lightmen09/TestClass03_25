package org.example.day8;

public abstract class Product {
    private String name;
    private double price;

    public Product(String productName, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void printDeliveryInfo();

    @Override
    public String toString() {
        return name + " — " + price + " руб.";
    }
}

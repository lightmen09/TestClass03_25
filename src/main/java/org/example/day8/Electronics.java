package org.example.day8;

public class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void printDeliveryInfo() {
        System.out.println(name + "Упаковано в тонну пупырки, картона и пенопласта");
    }
}
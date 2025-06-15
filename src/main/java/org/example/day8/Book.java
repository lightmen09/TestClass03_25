package org.example.day8;

public class Book extends Product {
    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public void printDeliveryInfo() {
        System.out.println(name + "Доставляется в картонном конверте");
    }
}

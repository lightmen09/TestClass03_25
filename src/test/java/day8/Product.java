package day8;

public abstract class Product {
     String name;
     double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract void printDeliveryInfo();

    @Override
    public String toString() {
        return name + " — " + price + " руб.";
    }
}
